package com.velocity.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.BankAccount;
import com.velocity.model.Bill;
import com.velocity.model.Cart;
import com.velocity.model.Categary;
import com.velocity.model.CurrencyConvert;
import com.velocity.model.Feedback;
import com.velocity.model.LoginDTO;
import com.velocity.model.LoginResponse;
import com.velocity.model.MultipleAddress;
import com.velocity.model.Order;
import com.velocity.model.Payment;
import com.velocity.model.Product;
import com.velocity.model.Provider;
import com.velocity.model.Reimbursement;
import com.velocity.model.Reward;
import com.velocity.model.User;
import com.velocity.model.UserAddress;

import com.velocity.model.UserLogin;
import com.velocity.repository.ProductRepository;
import com.velocity.repository.UserRepository;
import com.velocity.model.UserDetails;
import com.velocity.service.BankAccountService;
import com.velocity.service.BillService;
import com.velocity.service.CartAmountService;
import com.velocity.service.CartService;
import com.velocity.service.CategaryService;
import com.velocity.service.CurrencyConvertService;
import com.velocity.service.FeedbackService;
import com.velocity.service.MultipleAddressService;
import com.velocity.service.OrderService;
import com.velocity.service.PaymentService;
import com.velocity.service.ProductService;
import com.velocity.service.ProviderService;
import com.velocity.service.ReimbursementService;
import com.velocity.service.RewardService;
import com.velocity.service.UserAddressService;

import com.velocity.service.UserDetailsService;

import com.velocity.service.UserLoginService;

import com.velocity.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private RewardService rewardService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private ReimbursementService reimbursementService;
	@Autowired
	private BankAccountService bankAccountService;
	@Autowired
	private CartService cartService;
	@Autowired
	private CurrencyConvertService currencyConvertService;
	@Autowired
	private PaymentService paymentService;

	@Autowired
	private UserAddressService userAddressService;
	@Autowired
	private FeedbackService feedbackService;

	@Autowired
	private MultipleAddressService multipleAddressService;

	@Autowired
	private CartAmountService cartAmountService;
	@Autowired
	private BillService billService;
	@Autowired
	private UserDetailsService userDetailsService;

	@Autowired
	private ProviderService providerService;

	@Autowired
	private UserLoginService userLoginService;

	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategaryService categaryService;

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private UserRepository userRepository;

	// create object of logger
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	// it is a post mettohd
	@PostMapping("/saverewards")
	public ResponseEntity<User> saveUserReward(@RequestBody User user) {

		User user1 = userService.saveUser(user);
		List<Reward> rewards = user.getRewardList();

		for (Reward reward : rewards) {

			reward.setUserId(user.getId());
			rewardService.saveReward(reward);
		}
		
		return ResponseEntity.ok().body(user1);
	}

	// its a controller class with get reward funtion
	@GetMapping("/getreward/{id}")
	public ResponseEntity<User> getUserReward(@PathVariable("id") Integer id) {

		User user = userService.getUserdById(id);
		List<Reward> rewards = user.getRewardList();

		for (Reward reward : rewards) {
			reward.setUserId(user.getId());
			rewardService.getRewardById(id);
		}
		return ResponseEntity.ok().body(user);

	}

	// this method is for delete reward operation
	@DeleteMapping("/delete/{id}")
	public void deleteRewardById(@PathVariable("id") Integer id) {
		rewardService.deleteReward(id);
	}

	@DeleteMapping("/deleteorder/{id}")
	public void deleteOrder(@PathVariable("id") Integer id) {

		orderService.deleteOrder(id);

	}

	@DeleteMapping("/deletereimbursement/{id}")
	public void deletereimbursement(@PathVariable("id") Integer id) {

		reimbursementService.deleteReimbursement(id);

	}

	@PostMapping("/saveReimbursement")
	public ResponseEntity<Reimbursement> saveUserReimbursement(@RequestBody Reimbursement reimbursement) {
		Reimbursement reimbursement1 = reimbursementService.saveReimbursement(reimbursement);
		return ResponseEntity.ok().body(reimbursement1);
	}

	public Reimbursement updateReimbursementDetails(@RequestBody Reimbursement reimbursement) {
		return reimbursementService.updateReimbursementDetails(reimbursement);
	}

	@GetMapping("/getReimbursement/{id}")
	public ResponseEntity<Optional<Reimbursement>> getReimbursementDetails(@PathVariable("id") Integer id) {
		Optional<Reimbursement> reimbursement = reimbursementService.getReimbursementDetails(id);
		return ResponseEntity.ok().body(reimbursement);
	}

	@GetMapping("/getUser/{id}")
	public ResponseEntity<User> getUser(@PathVariable("id") Integer id) {

		User user = userService.getUserdById(id);
		List<Order> orders = user.getOrderList();

		for (Order order : orders) {
			order.setUserid(user.getId());
			orderService.getOrderById(id);
		}
		return ResponseEntity.ok().body(user);

	}

	@PostMapping("/saveUser")
	public ResponseEntity<User> saveUser(@RequestBody User user) {

		User user1 = userService.saveUser(user);
		List<Order> orders = user.getOrderList();

		for (Order order : orders) {
			order.setUserid(user.getId());
			orderService.saveOrderById(order);
		}

		return ResponseEntity.ok().body(user1);
	}

	@PutMapping("/updateUser/{id}")
	public ResponseEntity<User> updateUser(@RequestBody User user) {
		User user1 = userService.updateUser(user);
		List<Order> orders = user.getOrderList();

		for (Order order : orders) {
			order.setPrice(order.getPrice());
			order.setProductName(order.getProductName());
			order.setQuantity(order.getQuantity());
			order.setUserid(order.getUserid());

			orderService.updateOrder(order);
		}

		return ResponseEntity.ok().body(user1);

	}

	@DeleteMapping("/deleteuser/{id}")
	public void deleteUserById(@PathVariable("id") Integer id) {
		userService.deleteUser(id);
	}

	@PostMapping("/saveCart")
	public ResponseEntity<Cart> saveCart(@RequestBody Cart cart) {
		Cart cart1 = cartService.saveCartByCartId(cart);
		return ResponseEntity.ok().body(cart1);
	}

	@GetMapping("/getCart/{id}")
	public ResponseEntity<Cart> getCart(@PathVariable("id") Integer id) {
		Cart cart = cartService.getCardById(id);
		return ResponseEntity.ok().body(cart);
	}

	@PostMapping("/currencyconvert")
	public ResponseEntity<CurrencyConvert> addDetails(@RequestBody CurrencyConvert currencyConvert) {
		CurrencyConvert currencyConvert2 = currencyConvertService.addDetails(currencyConvert);
		return ResponseEntity.ok().body(currencyConvert2);
	}

	// this is save bank account method
	@PostMapping("/saveBankAccount")
	public ResponseEntity<BankAccount> saveBankAccount(@RequestBody BankAccount bankAccount) {
		BankAccount bankAccount1 = bankAccountService.saveBankAccount(bankAccount);
		return ResponseEntity.ok().body(bankAccount1);

	}

	@PutMapping("/updateBankAccount/{id}")
	public BankAccount updateBankAccountDetails(@RequestBody BankAccount bankAccount) {
		return bankAccountService.updateBankAccountDetails(bankAccount);
	}

	@GetMapping("/getBankAccount/{id}")
	public ResponseEntity<Optional<BankAccount>> getBankAccountDetails(@PathVariable("id") Integer id) {
		Optional<BankAccount> bankAccount = bankAccountService.getBankAccountDetails(id);
		return ResponseEntity.ok().body(bankAccount);
	}

	@PutMapping("/updateaddress/{id}")
	public ResponseEntity<UserAddress> updateUserAddress(@RequestBody UserAddress userAddress) {

		UserAddress userAddress2 = userAddressService.updateAddressDetails(userAddress);

		return ResponseEntity.ok().body(userAddress2);
	}

	@DeleteMapping("/deletePayment/{id}")
	public void deletePaymentById(@PathVariable("id") Integer id) {
		paymentService.deletePayment(id);

	}

	@PostMapping("/saveUserAddress")
	public ResponseEntity<UserAddress> saveUserAddress(@RequestBody UserAddress userAddress) {
		UserAddress userAddress1 = userAddressService.saveUser(userAddress);
		return ResponseEntity.ok().body(userAddress1);

	}

	@DeleteMapping("/deleteuserAddress/{id}")
	public void deleteAddressbyid(@PathVariable("id") Integer id) {
		userAddressService.deleteAddress(id);

	}

	@GetMapping("/getPaymentDetails/{id}")
	public Payment getPaymentDetails(@PathVariable("id") Integer id) {
		return paymentService.getPaymentDetails(id);

	}

	@PostMapping("/saveFeedback")
	public ResponseEntity<Feedback> savefeedback(@RequestBody Feedback feedback) {
		Feedback feedback1 = feedbackService.saveFeedback(feedback);
		return ResponseEntity.ok().body(feedback1);
	}

	@GetMapping("/getUserAddress/{id}")
	public ResponseEntity<Optional<UserAddress>> getUserAddress(@PathVariable("id") Integer id) {
		Optional<UserAddress> userAdress = userAddressService.getUserAddressById(id);
		return ResponseEntity.ok().body(userAdress);

	}

	@PutMapping("/updatepayment/{id}")
	public ResponseEntity<Payment> updatepayment(@RequestBody Payment payment) {

		Payment pay = paymentService.updatePaymentDetails(payment);

		return ResponseEntity.ok().body(pay);
	}

	@PostMapping("/saveMultipleAddresses")
	public User saveUserAddress(@RequestBody User user) {
		User user1 = userService.saveUserAddress(user);
		List<MultipleAddress> add = user.getMultipleAddresses();
		for (MultipleAddress address : add) {
			address.setUserid(user1.getId());
			multipleAddressService.saveMultipleAddress(address);
		}

		return user1;
	}

	@GetMapping("/orderamount")
	public double getCartAmount() {
		return cartAmountService.calculateCartAmount();
	}

	@GetMapping("/getAddresses/{id}")
	public ResponseEntity<User> getUserAddresses(@PathVariable("id") Integer id) {

		User user = userService.getUserdById(id);
		List<MultipleAddress> a = user.getMultipleAddresses();

		for (MultipleAddress b : a) {
			b.setUserid(user.getId());
			multipleAddressService.getAddressesByUserId(id);
		}
		return ResponseEntity.ok().body(user);

	}

	@GetMapping("/getBill/{id}")
	public ResponseEntity<Bill> getBill(@PathVariable("id") Integer id) {
		Bill bill = billService.getBillById(id);
		return ResponseEntity.ok().body(bill);

	}

	@PostMapping("/addBillDetails")
	public Bill addBill(@RequestBody Bill bill) {
		return billService.saveBill(bill);

	}

	@PutMapping("/updateBill/{id}")
	public ResponseEntity<Bill> updatepBill(@RequestBody Bill bill) {

		Bill bills = billService.updateBill(bill);

		return ResponseEntity.ok().body(bills);
	}

	@PutMapping("/updateUserDetails/{id}")
	public ResponseEntity<UserDetails> updateUserDetails(@RequestBody UserDetails userDetails) {
		UserDetails userDetails1 = userDetailsService.updateUserDetails(userDetails);
		return ResponseEntity.ok().body(userDetails1);

	}

	@DeleteMapping("/deleteProvider/{id}")
	public void deleteProviderById(@PathVariable("id") Integer id) {
		providerService.deleteProvider(id);
	}

	@PostMapping("/saveProvider")
	public ResponseEntity<Provider> saveProviderDetails(@RequestBody Provider provider) {
		Provider provider2 = providerService.saveProviderDetails(provider);
		return ResponseEntity.ok().body(provider2);
	}

	@PutMapping("/updateProvider/{id}")
	public ResponseEntity<Provider> updateProvider(@RequestBody Provider provider) {
		Provider provider2 = providerService.updateProviderDetails(provider);
		return ResponseEntity.ok().body(provider2);
	}

	@GetMapping("/getProvider/{id}")
	public ResponseEntity<Optional<Provider>> getProviderById(@PathVariable("id") Integer id) {
		Optional<Provider> provider = providerService.getProviderById(id);
		return ResponseEntity.ok().body(provider);
	}

	@PostMapping("/savelogindetails")
	public String saveUserLoginDetails(@RequestBody UserLogin userLogin) {
		String id = userLoginService.addLoginDetails(userLogin);
		return id;
	}

	@PostMapping("/login")
	public ResponseEntity<?> loginUser(@RequestBody LoginDTO loginDTO) {

		LoginResponse loginResponse = userLoginService.loginUser(loginDTO);

		return ResponseEntity.ok(loginResponse);
	}


	@GetMapping("/getAllProductList")
	public List<Product> getAllProduct() {
		return (List<Product>) productRepository.findAll();
	}
	@DeleteMapping("/deleteUserDetails/{id}")
     public void deleteuserDetailsById(@PathVariable("id") Integer id) {
    	 userDetailsService.deleteUserDetails(id);
     }

	
	@GetMapping("/getProduct/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable("id") Integer id){
		Product prod = productService.getProductDetails(id);
		return ResponseEntity.ok().body(prod);
		
	}

	@PostMapping("/saveProduct")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
		Product prod = productService.saveProductDetails(product);
		return ResponseEntity.ok().body(prod);
	}

	@PutMapping("/updateProdect/{id}")
	public ResponseEntity<Product> updateProduct(@RequestBody Product product) {
		Product prod = productService.updateProductDetails(product);
		return ResponseEntity.ok().body(prod);
	}

	@DeleteMapping("/deleteProduct/{id}")
	public ResponseEntity<String> deleteProductById(@PathVariable("id") Integer id) {
		productService.deleteProduct(id);
		return new ResponseEntity<>("Product with ID " + id + " has been cancelled", HttpStatus.OK);
	}

	@GetMapping("/getUserDetails/{id}")
	public ResponseEntity<UserDetails> getUserDetails(@PathVariable("id") Integer id) {
		UserDetails user = userDetailsService.getUserDetails(id);
		return ResponseEntity.ok().body(user);

	}
	
	@GetMapping("/getCategary/{id}")
	public ResponseEntity<Categary> getCategary(@PathVariable("id") Integer id) {

		Categary categary = categaryService.getCategaryById(id);
		List<Product> products = categary.getProductList();		
		for (Product product : products) {
			product.setCategaryId(categary.getId());
			productService.getProductDetails(id);
			
		}
		return ResponseEntity.ok().body(categary);

	}
	
	@PostMapping("/saveCategary")
	public ResponseEntity<Categary> saveCategary(@RequestBody Categary categary) {
		Categary categary1 = categaryService.saveCategary(categary);
		List<Product> products = categary.getProductList();		
		

		for (Product product : products) {
			product.setCategaryId(categary.getId());
			productService.saveProductDetails(product);
		}
		return ResponseEntity.ok().body(categary1);
	}
	
	@DeleteMapping("/deleteCategary/{id}")
	public void deleteCategaryById(@PathVariable("id") Integer id) {
		categaryService.deleteCategary(id);
	}
	
	@PutMapping("/updateCategary/{id}")
	public ResponseEntity<Categary> updateCategary(@RequestBody Categary categary) {
		Categary categary1 = categaryService.updateCategary(categary);
		List<Product> products = categary.getProductList();	

		for (Product product : products) {
			product.setProductName(product.getProductName());
			product.setCategary(product.getCategary());
			product.setDescription(product.getDescription());
			product.setAmonut(product.getAmonut());
			product.setCategaryId(product.getCategaryId());
			productService.updateProductDetails(product);
		}

		return ResponseEntity.ok().body(categary1);

	}
	@PostMapping("/saveUserDetails")
	public ResponseEntity<UserDetails> saveUserDetails(@RequestBody UserDetails userDetails) {
		UserDetails userDetail = userDetailsService.saveUserDetails(userDetails);
		return ResponseEntity.ok().body(userDetail);
	}


	@GetMapping("/getAllUsersList")
	public List<User> getAllUserList() {
		return (List<User>) userRepository.findAll();
	}

	@PostMapping("/addOrderDetails")
	public Order addOrderDetails(@RequestBody Order order) {
		Order order1 = orderService.addOrderDetails(order);
		return order1;
	}

	@PutMapping("/updateOrderDetails/{id}")
	public Order updateOrderDetails(@RequestBody Order order) {
		Order order1 = orderService.updateOrderDetails(order);
		return order1;
	}

	@GetMapping("/getOrderDetails/{id}")
	public Optional<Order> getOrderDetails(@PathVariable("id") Integer id) {
		return orderService.getOrderDetailsById(id);
	}

	@PutMapping("/updateCurrencyConvertor/{id}")
	public CurrencyConvert updateCurrencyConvertor(@RequestBody CurrencyConvert currencyConvert) {
		return currencyConvertService.updateDetails(currencyConvert);
	}

	@GetMapping("/getCurrencyConvertor/{id}")
	public Optional<CurrencyConvert> getCurrencyConvertorById(@PathVariable("id") Long id) {
		return currencyConvertService.getCurrencyConvertorDetails(id);
	}

	@DeleteMapping("/deleteCurrencyConvertor/{id}")
	public void deleteCurrencyConvertorDetails(@PathVariable("id") Long id) {
		currencyConvertService.deleteCurrencyConvertorDetails(id);
	}

}

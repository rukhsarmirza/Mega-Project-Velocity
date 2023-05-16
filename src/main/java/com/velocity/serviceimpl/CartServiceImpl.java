package com.velocity.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Cart;
import com.velocity.repository.CartRepository;
import com.velocity.service.CartService;
@Service
public class CartServiceImpl implements CartService {
	@Autowired
	public CartRepository cartRepository;
	@Override
	public Cart getCardById(Integer id) {
		Cart cart2 =cartRepository.findById(id);
		return cart2;
	}
	@Override
	public Cart saveCartByCartId(Cart cart) {
		Cart cart1 = cartRepository.save(cart);
		return cart1;
	}

}

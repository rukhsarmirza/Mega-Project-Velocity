package com.velocity.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	// user pojo class
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String username;
	private String realName;
	private String password;
	private String gender;
	private String birthday;
	private String userType;

	@OneToMany(mappedBy = "userId")
	private List<Reward> rewardList;

	@OneToMany(mappedBy = "userid")
	private List<Order> orderList;

	@OneToOne(targetEntity = UserAddress.class, cascade = CascadeType.ALL)
	private UserAddress address;

	@OneToMany(mappedBy = "user_id")
	private List<MultipleAddress> multipleAddresses;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public List<Reward> getRewardList() {
		return rewardList;
	}

	public void setRewardList(List<Reward> rewardList) {
		this.rewardList = rewardList;
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}

	public UserAddress getAddressList() {
		return address;
	}

	public void setAddressList(UserAddress address) {
		this.address = address;
	}

	public List<MultipleAddress> getMultipleAddresses() {
		return multipleAddresses;
	}

	public void setMultipleAddresses(List<MultipleAddress> multipleAddresses) {
		this.multipleAddresses = multipleAddresses;
	}
}

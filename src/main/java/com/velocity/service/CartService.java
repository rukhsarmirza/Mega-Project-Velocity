package com.velocity.service;

import com.velocity.model.Cart;

public interface CartService {
	public Cart saveCartByCartId(Cart cart);
	public Cart getCardById(Integer id);
	
}

package com.velocity.service;

import com.velocity.model.Categary;


public interface CategaryService {
	public Categary getCategaryById(Integer id);
	public Categary saveCategary(Categary categary);
	public Categary updateCategary(Categary categary);
	public void deleteCategary(Integer id);

}

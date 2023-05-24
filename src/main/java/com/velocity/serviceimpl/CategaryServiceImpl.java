package com.velocity.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Categary;
import com.velocity.repository.CategaryRepository;
import com.velocity.service.CategaryService;
@Service
public class CategaryServiceImpl implements CategaryService{

	@Autowired
	CategaryRepository categaryRepository;
	@Override
	public Categary getCategaryById(Integer id) {
		Categary categary = categaryRepository.findById(id);
		return categary;
	}

	@Override
	public Categary saveCategary(Categary categary) {
		Categary categary2 = categaryRepository.save(categary);
		return categary2;
	}

	@Override
	public Categary updateCategary(Categary categary) {
		Categary categary2 = categaryRepository.save(categary);
		return categary2;
	}

	@Override
	public void deleteCategary(Integer id) {
	categaryRepository.deleteById(id);
	}

}

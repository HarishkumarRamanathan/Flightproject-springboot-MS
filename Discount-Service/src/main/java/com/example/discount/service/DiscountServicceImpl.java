package com.example.discount.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.discount.entity.DiscountEntity;
import com.example.discount.model.DiscountModel;
import com.example.discount.repository.DiscountRepo;

@Service
public class DiscountServicceImpl implements DiscountService {

	@Autowired
	private DiscountRepo discountRepo;

	@Override
	public void addDiscount(DiscountModel discountModel) {
		// TODO Auto-generated method stub

		DiscountEntity discountEntity = new DiscountEntity();
		discountEntity.setCouponCode(discountModel.getCouponCode());
		discountEntity.setMaxAmount(discountModel.getMaxAmount());
		discountEntity.setPercentage(discountModel.getPercentage());
		discountRepo.save(discountEntity);
		
	}

	@Override
	public List<DiscountEntity> getAllDiscount() {
		// TODO Auto-generated method stub
		return discountRepo.findAll();
	}

	@Override
	public DiscountModel getDiscountById(int id) {
		// TODO Auto-generated method stub
		Optional<DiscountEntity> optional = discountRepo.findById(id);
		DiscountModel discountModel = null;

		if (optional.isPresent()) {
			DiscountEntity discountEntity = optional.get();

			discountModel = new DiscountModel(discountEntity.getId(), discountEntity.getCouponCode(),
					discountEntity.getMaxAmount(), discountEntity.getPercentage());
		}
		return discountModel;
	}

	@Override
	public void deleteDiscountById(int id) {
		// TODO Auto-generated method stub
		discountRepo.deleteById(id);
	}

	@Override
	public void updateDiscount(DiscountModel discountModel, int id) {
		Optional<DiscountEntity> model= discountRepo.findById(id);
		if(model.isPresent()) {
			
			DiscountEntity discountEntity = model.get();
			discountEntity.setCouponCode(discountModel.getCouponCode());
			discountEntity.setMaxAmount(discountModel.getMaxAmount());
			discountEntity.setPercentage(discountModel.getPercentage());
			discountRepo.save(discountEntity);
		}
		
	}

}

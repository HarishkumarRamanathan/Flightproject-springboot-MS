package com.example.discount.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.discount.entity.DiscountEntity;
import com.example.discount.service.DiscountServicceImpl;

@Repository
public interface DiscountRepo extends JpaRepository<DiscountEntity, Integer> {


}

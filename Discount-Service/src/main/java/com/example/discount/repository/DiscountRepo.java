package com.example.discount.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.discount.entity.DiscountEntity;

@Repository
public interface DiscountRepo extends JpaRepository<DiscountEntity, Integer> {

}

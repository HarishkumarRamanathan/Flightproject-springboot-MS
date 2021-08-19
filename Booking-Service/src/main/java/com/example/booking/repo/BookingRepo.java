package com.example.booking.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.booking.entity.BookingEntity;

@Repository
public interface BookingRepo extends JpaRepository<BookingEntity, Integer> {

	List<BookingEntity> findByEmail(String email);

}

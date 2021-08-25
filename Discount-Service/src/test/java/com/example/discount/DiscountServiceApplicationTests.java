package com.example.discount;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.discount.repository.DiscountRepo;
import com.example.discount.service.DiscountServicceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
class DiscountServiceApplicationTests {

	@InjectMocks
	DiscountServicceImpl discountServicceImpl;

	@Mock
	DiscountRepo discountRepo;


}

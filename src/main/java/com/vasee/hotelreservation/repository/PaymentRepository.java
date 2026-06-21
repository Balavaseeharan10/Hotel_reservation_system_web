package com.vasee.hotelreservation.repository;

import com.vasee.hotelreservation.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, String> {

}

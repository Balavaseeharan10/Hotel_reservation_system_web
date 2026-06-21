package com.vasee.hotelreservation.repository;

import com.vasee.hotelreservation.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, String> {

}

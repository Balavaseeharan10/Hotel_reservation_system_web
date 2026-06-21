package com.vasee.hotelreservation.repository;

import com.vasee.hotelreservation.entity.RIResident;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface RIResidentRepository extends JpaRepository<RIResident, String> {

}

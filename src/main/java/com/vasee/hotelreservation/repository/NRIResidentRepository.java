package com.vasee.hotelreservation.repository;

import com.vasee.hotelreservation.entity.NRIResident;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface NRIResidentRepository extends JpaRepository<NRIResident, String> {

}

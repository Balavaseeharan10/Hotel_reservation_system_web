package com.vasee.hotelreservation.repository;

import com.vasee.hotelreservation.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface RoomRepository extends JpaRepository<Room, String> {
    List<Room> findByIsOccupied(String isOccupied);
}

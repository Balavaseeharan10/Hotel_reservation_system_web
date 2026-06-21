package com.vasee.hotelreservation.service;

import com.vasee.hotelreservation.entity.Room;
import com.vasee.hotelreservation.repository.RoomRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RoomService {
    private final RoomRepository repository;

    public RoomService(RoomRepository repository) { this.repository = repository; }
    public Room save(Room room) { return repository.save(room); }
    public List<Room> findAll() { return repository.findAll(); }
    public List<Room> findAvailableRooms() { return repository.findByIsOccupied("NO"); }
    public void deleteById(String id) { repository.deleteById(id); }
}

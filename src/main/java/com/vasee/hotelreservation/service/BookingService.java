package com.vasee.hotelreservation.service;

import com.vasee.hotelreservation.entity.Booking;
import com.vasee.hotelreservation.entity.Room;
import com.vasee.hotelreservation.repository.BookingRepository;
import com.vasee.hotelreservation.repository.RoomRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;
    private final RoomRepository roomRepository;
    private final IdGeneratorService idGeneratorService;

    public BookingService(BookingRepository bookingRepository, RoomRepository roomRepository, IdGeneratorService idGeneratorService) {
        this.bookingRepository = bookingRepository;
        this.roomRepository = roomRepository;
        this.idGeneratorService = idGeneratorService;
    }

    public Booking save(Booking booking) {
        if (booking.getBookingId() == null || booking.getBookingId().isBlank()) {
            booking.setBookingId(idGeneratorService.generateBookingId());
        }
        roomRepository.findById(booking.getRoomNumber()).ifPresent(room -> {
            room.setIsOccupied("YES");
            roomRepository.save(room);
        });
        return bookingRepository.save(booking);
    }

    public List<Booking> findAll() { return bookingRepository.findAll(); }

    public void cancelBooking(String bookingId) {
        bookingRepository.findById(bookingId).ifPresent(booking -> {
            roomRepository.findById(booking.getRoomNumber()).ifPresent(room -> {
                room.setIsOccupied("NO");
                roomRepository.save(room);
            });
            bookingRepository.deleteById(bookingId);
        });
    }
}

package com.vasee.hotelreservation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Booking {
    @Id
    private String bookingId;
    private String residentId;
    private String residentName;
    private int durationOfStay;
    private int numberOfAdults;
    private int numberOfChildrenAbove12;
    private int numberOfChildrenAbove5;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private String floorNumber;
    private String roomNumber;
    private String preferredPackage;
    private String acAccess;
    private String poolAccess;
    private String gymAccess;

    public Booking() {}
    public String getBookingId() { return bookingId; }
    public void setBookingId(String bookingId) { this.bookingId = bookingId; }
    public String getResidentId() { return residentId; }
    public void setResidentId(String residentId) { this.residentId = residentId; }
    public String getResidentName() { return residentName; }
    public void setResidentName(String residentName) { this.residentName = residentName; }
    public int getDurationOfStay() { return durationOfStay; }
    public void setDurationOfStay(int durationOfStay) { this.durationOfStay = durationOfStay; }
    public int getNumberOfAdults() { return numberOfAdults; }
    public void setNumberOfAdults(int numberOfAdults) { this.numberOfAdults = numberOfAdults; }
    public int getNumberOfChildrenAbove12() { return numberOfChildrenAbove12; }
    public void setNumberOfChildrenAbove12(int numberOfChildrenAbove12) { this.numberOfChildrenAbove12 = numberOfChildrenAbove12; }
    public int getNumberOfChildrenAbove5() { return numberOfChildrenAbove5; }
    public void setNumberOfChildrenAbove5(int numberOfChildrenAbove5) { this.numberOfChildrenAbove5 = numberOfChildrenAbove5; }
    public LocalDate getCheckInDate() { return checkInDate; }
    public void setCheckInDate(LocalDate checkInDate) { this.checkInDate = checkInDate; }
    public LocalDate getCheckOutDate() { return checkOutDate; }
    public void setCheckOutDate(LocalDate checkOutDate) { this.checkOutDate = checkOutDate; }
    public String getFloorNumber() { return floorNumber; }
    public void setFloorNumber(String floorNumber) { this.floorNumber = floorNumber; }
    public String getRoomNumber() { return roomNumber; }
    public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }
    public String getPreferredPackage() { return preferredPackage; }
    public void setPreferredPackage(String preferredPackage) { this.preferredPackage = preferredPackage; }
    public String getAcAccess() { return acAccess; }
    public void setAcAccess(String acAccess) { this.acAccess = acAccess; }
    public String getPoolAccess() { return poolAccess; }
    public void setPoolAccess(String poolAccess) { this.poolAccess = poolAccess; }
    public String getGymAccess() { return gymAccess; }
    public void setGymAccess(String gymAccess) { this.gymAccess = gymAccess; }
}

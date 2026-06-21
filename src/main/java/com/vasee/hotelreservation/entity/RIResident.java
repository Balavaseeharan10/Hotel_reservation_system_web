package com.vasee.hotelreservation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class RIResident {
    @Id
    private String residentId;
    private String residentName;
    private int age;
    private String gender;
    private long contactNumber;
    private String email;
    private String address;
    private int numberOfAdults;
    private int numberOfChildrenAbove12;
    private int numberOfChildrenAbove5;
    private int durationOfStay;
    private String residentType = "RI";
    private long idproofAadharno;

    public RIResident() {}
    public String getResidentId() { return residentId; }
    public void setResidentId(String residentId) { this.residentId = residentId; }
    public String getResidentName() { return residentName; }
    public void setResidentName(String residentName) { this.residentName = residentName; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
    public long getContactNumber() { return contactNumber; }
    public void setContactNumber(long contactNumber) { this.contactNumber = contactNumber; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public int getNumberOfAdults() { return numberOfAdults; }
    public void setNumberOfAdults(int numberOfAdults) { this.numberOfAdults = numberOfAdults; }
    public int getNumberOfChildrenAbove12() { return numberOfChildrenAbove12; }
    public void setNumberOfChildrenAbove12(int numberOfChildrenAbove12) { this.numberOfChildrenAbove12 = numberOfChildrenAbove12; }
    public int getNumberOfChildrenAbove5() { return numberOfChildrenAbove5; }
    public void setNumberOfChildrenAbove5(int numberOfChildrenAbove5) { this.numberOfChildrenAbove5 = numberOfChildrenAbove5; }
    public int getDurationOfStay() { return durationOfStay; }
    public void setDurationOfStay(int durationOfStay) { this.durationOfStay = durationOfStay; }
    public String getResidentType() { return residentType; }
    public void setResidentType(String residentType) { this.residentType = residentType; }
    public long getIdproofAadharno() { return idproofAadharno; }
    public void setIdproofAadharno(long idproofAadharno) { this.idproofAadharno = idproofAadharno; }
}

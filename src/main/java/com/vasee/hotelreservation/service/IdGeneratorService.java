package com.vasee.hotelreservation.service;

import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class IdGeneratorService {
    private final Random random = new Random();

    public String generateRIResidentId() { return "RI" + (1000 + random.nextInt(9000)); }
    public String generateNRIResidentId() { return "NRI" + (1000 + random.nextInt(9000)); }
    public String generateBookingId() { return "B" + System.currentTimeMillis(); }
    public String generatePaymentId() { return "P" + System.currentTimeMillis(); }
}

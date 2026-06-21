package com.vasee.hotelreservation.service;

import com.vasee.hotelreservation.entity.Payment;
import com.vasee.hotelreservation.repository.PaymentRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class PaymentService {
    private final PaymentRepository repository;
    private final IdGeneratorService idGeneratorService;

    public PaymentService(PaymentRepository repository, IdGeneratorService idGeneratorService) {
        this.repository = repository;
        this.idGeneratorService = idGeneratorService;
    }

    public Payment save(Payment payment) {
        if (payment.getPaymentId() == null || payment.getPaymentId().isBlank()) {
            payment.setPaymentId(idGeneratorService.generatePaymentId());
        }
        if (payment.getPaymentDate() == null) {
            payment.setPaymentDate(LocalDate.now());
        }
        return repository.save(payment);
    }

    public List<Payment> findAll() { return repository.findAll(); }
}

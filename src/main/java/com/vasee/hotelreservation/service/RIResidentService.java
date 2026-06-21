package com.vasee.hotelreservation.service;

import com.vasee.hotelreservation.entity.RIResident;
import com.vasee.hotelreservation.repository.RIResidentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RIResidentService {
    private final RIResidentRepository repository;
    private final IdGeneratorService idGeneratorService;

    public RIResidentService(RIResidentRepository repository, IdGeneratorService idGeneratorService) {
        this.repository = repository;
        this.idGeneratorService = idGeneratorService;
    }

    public RIResident save(RIResident resident) {
        if (resident.getResidentId() == null || resident.getResidentId().isBlank()) {
            resident.setResidentId(idGeneratorService.generateRIResidentId());
        }
        return repository.save(resident);
    }

    public List<RIResident> findAll() { return repository.findAll(); }
    public void deleteById(String id) { repository.deleteById(id); }
}

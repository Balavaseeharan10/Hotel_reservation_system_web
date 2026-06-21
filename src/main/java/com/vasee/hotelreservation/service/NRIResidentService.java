package com.vasee.hotelreservation.service;

import com.vasee.hotelreservation.entity.NRIResident;
import com.vasee.hotelreservation.repository.NRIResidentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NRIResidentService {
    private final NRIResidentRepository repository;
    private final IdGeneratorService idGeneratorService;

    public NRIResidentService(NRIResidentRepository repository, IdGeneratorService idGeneratorService) {
        this.repository = repository;
        this.idGeneratorService = idGeneratorService;
    }

    public NRIResident save(NRIResident resident) {
        if (resident.getResidentId() == null || resident.getResidentId().isBlank()) {
            resident.setResidentId(idGeneratorService.generateNRIResidentId());
        }
        return repository.save(resident);
    }

    public List<NRIResident> findAll() { return repository.findAll(); }
    public void deleteById(String id) { repository.deleteById(id); }
}

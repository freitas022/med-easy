package br.com.freitas.medEasy.services;

import br.com.freitas.medEasy.domain.Doctor;
import br.com.freitas.medEasy.domain.HealthUnit;
import br.com.freitas.medEasy.domain.HealthUnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HealthUnitService {
    @Autowired
    HealthUnitRepository healthUnitRepository;

    public List<HealthUnit> findAll() {
        return healthUnitRepository.findAll();
    }
    public Optional<HealthUnit> findById(final Long id) {
        return healthUnitRepository.findById(id);
    }

}
package br.com.freitas.medEasy.services;

import br.com.freitas.medEasy.domain.Doctor;
import br.com.freitas.medEasy.domain.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {
    @Autowired
    DoctorRepository doctorRepository;

    public List<Doctor> findAll() {
        return doctorRepository.findAll();
    }

    public Optional<Doctor> findById(final Long id) {
        return doctorRepository.findById(id);
    }
}
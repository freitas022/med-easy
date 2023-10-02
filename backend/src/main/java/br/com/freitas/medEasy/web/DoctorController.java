package br.com.freitas.medEasy.web;

import br.com.freitas.medEasy.domain.Doctor;
import br.com.freitas.medEasy.services.DoctorService;
import br.com.freitas.medEasy.web.exceptions.RecordNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping
    public List<Doctor> findAll() {
        return doctorService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Doctor findById(@PathVariable final Long id) {
        return doctorService.findById(id)
                .orElseThrow(() -> new RecordNotFoundException(id));
    }
}
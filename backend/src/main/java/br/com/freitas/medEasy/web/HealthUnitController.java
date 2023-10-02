package br.com.freitas.medEasy.web;

import br.com.freitas.medEasy.domain.HealthUnit;
import br.com.freitas.medEasy.services.HealthUnitService;
import br.com.freitas.medEasy.web.exceptions.RecordNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/health-units")
public class HealthUnitController {

    @Autowired
    private HealthUnitService healthUnitService;

    @GetMapping
    public List<HealthUnit> findAll() {
        return healthUnitService.findAll();
    }

    @GetMapping(path = "/{id}")
    public HealthUnit findById(@PathVariable final Long id) {
        return healthUnitService.findById(id)
                .orElseThrow(() -> new RecordNotFoundException(id));
    }
}
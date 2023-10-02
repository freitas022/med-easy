package br.com.freitas.medEasy.web;

import br.com.freitas.medEasy.domain.Schedule;
import br.com.freitas.medEasy.services.ScheduleService;
import br.com.freitas.medEasy.web.exceptions.RecordNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.List;

@RestController
@RequestMapping(path = "/schedules")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @GetMapping
    public List<Schedule> findAll() {
        return scheduleService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Schedule findById(@PathVariable final Long id) {
        return scheduleService.findById(id)
                .orElseThrow(() -> new RecordNotFoundException(id));
    }

    @PostMapping
    public Schedule insert(@RequestBody Schedule schedule) {
        return scheduleService.save(schedule);
    }
}
package br.com.freitas.medEasy.web;

import br.com.freitas.medEasy.domain.Doctor;
import br.com.freitas.medEasy.domain.Schedule;
import br.com.freitas.medEasy.services.DoctorService;
import br.com.freitas.medEasy.services.ScheduleService;
import br.com.freitas.medEasy.web.exceptions.RecordNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/schedules")
public class ScheduleController {
    @Autowired
    ScheduleService scheduleService;
    @Autowired
    DoctorService doctorService;

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
    public ResponseEntity<Object> createSchedule(@RequestBody @Valid Schedule scheduleRequest) {
        try {
            if (scheduleService.existsByScheduleMoment(scheduleRequest.getMoment())) {
                return ResponseEntity.status(HttpStatus.CONFLICT)
                        .body("Conflict: User already registered for this date/hour.");
            }
            Optional<Doctor> doctor = doctorService.findById(scheduleRequest.getDoctor().getId());
            if (doctor.isEmpty()) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body("The doctor with the specified ID was not found.");
            }
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(scheduleService.save(scheduleRequest));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An unexpected error occurred.");
        }
    }

    @GetMapping(path = "/doctor/{id}")
    public List<Schedule> findSchedulesByDoctor(@PathVariable final Long id) {
        return scheduleService.findSchedulesByDoctor(id);
    }

    @GetMapping(path = "/patient/{id}")
    public List<Schedule> findSchedulesByPatient(@PathVariable final Long id) {
        return scheduleService.findSchedulesByPatient(id);
    }
}
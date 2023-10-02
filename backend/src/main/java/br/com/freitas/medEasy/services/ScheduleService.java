package br.com.freitas.medEasy.services;

import br.com.freitas.medEasy.domain.Schedule;
import br.com.freitas.medEasy.domain.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Service
public class ScheduleService {
    @Autowired
    ScheduleRepository scheduleRepository;

    public List<Schedule> findAll() {
        return scheduleRepository.findAll();
    }

    public Optional<Schedule> findById(Long id) {
        return scheduleRepository.findById(id);
    }

    public Schedule save(Schedule schedule) {
        return scheduleRepository.save(schedule);
    }

    public boolean existsByScheduleMoment(Instant scheduleMoment) {
        return scheduleRepository.existsByMoment(scheduleMoment);
    }

    public List<Schedule> findSchedulesByDoctor(final Long id) {
        return scheduleRepository.findSchedulesByDoctorId(id);
    }

    public List<Schedule> findSchedulesByPatient(final Long id) {
        return scheduleRepository.findSchedulesByPatientId(id);
    }
}
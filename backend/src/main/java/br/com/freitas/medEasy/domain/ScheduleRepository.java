package br.com.freitas.medEasy.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.Instant;
import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    boolean existsByMoment(Instant scheduleMoment);
    List<Schedule> findSchedulesByDoctorId(final Long id);
    List<Schedule> findSchedulesByPatientId(final Long id);
}
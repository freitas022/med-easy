package br.com.freitas.medEasy.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "TB_SCHEDULES")
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "schedule_id")
    private Long id;

    @Column(unique = true)
    @NotNull
    private Instant moment;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne(optional = false)
    @JoinColumn(name = "doctor_id", nullable = false, updatable = false)
    private Doctor doctor;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", nullable = false, updatable = false)
    private User patient;

    public Schedule() {
    }

    public Schedule(Long id, @NotNull Instant moment) {
        this.id = id;
        this.moment = moment;
        }
}
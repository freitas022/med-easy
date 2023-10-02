package br.com.freitas.medEasy.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "tb_doctors")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctor_id")
    private Long id;

    @Column(length = 70)
    @NotBlank
    @Length(min = 3, max = 70)
    private String name;

    @Column(length = 90)
    @NotBlank
    @Length(min = 3, max = 90)
    private String speciality;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne(optional = false)
    @JoinColumn(name = "health_unit_id", nullable = false, updatable = false)
    private HealthUnit healthUnit;

    @OneToMany(mappedBy = "doctor", fetch = FetchType.EAGER)
    private List<Schedule> schedules = new ArrayList<>();

    public Doctor() {
    }

    public Doctor(Long id, String name, String speciality) {
        this.id = id;
        this.name = name;
        this.speciality = speciality;
    }
}
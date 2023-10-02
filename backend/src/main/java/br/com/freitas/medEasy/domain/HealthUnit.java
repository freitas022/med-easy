package br.com.freitas.medEasy.domain;

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
@Table(name = "tb_health_units")
public class HealthUnit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "health_unit_id")
    private Long id;

    @Column(length = 70)
    @NotBlank
    @Length(min = 3, max = 90)
    private String name;

    @OneToMany(mappedBy = "healthUnit", cascade = CascadeType.ALL)
    private List<Doctor> doctors = new ArrayList<>();

    public HealthUnit() {
    }

    public HealthUnit(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
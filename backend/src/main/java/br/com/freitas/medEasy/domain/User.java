package br.com.freitas.medEasy.domain;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "tb_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
    @Column(nullable = false, length = 30)
    private String firstname;
    @Column(nullable = false, length = 50)
    private String lastname;
    @Column(nullable = false, unique = true, length = 9)
    private String document;
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy = "patient")
    private Set<Schedule> appointments = new HashSet<>();

    public User() {
    }

    public User(Long id, String firstname, String lastname, String document, String username, String password) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.document = document;
        this.username = username;
        this.password = password;
    }
}
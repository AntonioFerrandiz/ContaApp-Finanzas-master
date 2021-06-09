package com.upc.contaapp.model;

import javax.persistence.*;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "user_entity")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="username", nullable = false, length = 50, unique = true)
    private String username;

    @Column(name="password", nullable = false, length = 50, unique = false)
    private String password;

    @Transient
    @Column(name="password", nullable = false, length = 100, unique = false)
    private String passwordConfirm;

    @Column(name="firstname", nullable = false, length = 50)
    private String firstname;

    @Column(name="lastname", nullable = false, length = 50)
    private String lastname;

    @Column(name="dni", nullable = false, unique = true, length = 8)
    private String dni;

    @Column(name="email", nullable = false, unique = true, length = 100)
    private String email;

    @Column(name="socialreasonname", nullable = false, length = 250)
    private String socialreasonname;

    @Column(name="companyruc", nullable = false, length = 11)
    private String company_ruc;

    @ManyToMany
    private Set<Role> roles;


}

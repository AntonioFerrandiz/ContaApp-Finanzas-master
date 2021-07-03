package com.upc.contaapp.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
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

    @NotNull(message = "Name cannot be null")
    @Column(name="username", nullable = false, length = 100, unique = true)
    private String username;

    @NotNull(message = "Name cannot be null")
    @Column(name="password", nullable = false, length = 100, unique = false)
    private String password;

    @Transient
    @NotNull(message = "Name cannot be null")
    @Column(name="password", nullable = false, length = 100, unique = false)
    private String passwordConfirm;

    @NotNull(message = "Name cannot be null")
    @Column(name="firstname", nullable = false, length = 100)
    private String firstname;

    @NotNull(message = "Name cannot be null")
    @Column(name="lastname", nullable = false, length = 100)
    private String lastname;

    @NotNull(message = "Name cannot be null")
    @Column(name="dni", nullable = false, unique = true, length = 8)
    private String dni;

    @NotNull(message = "Name cannot be null")
    @Column(name="email", nullable = false, unique = true, length = 100)
    private String email;

    @NotNull(message = "Name cannot be null")
    @Column(name="socialreasonname", nullable = false, length = 250)
    private String socialreasonname;

    @NotNull(message = "Name cannot be null")
    @Column(name="company_ruc", nullable = false, length = 11)
    private String company_ruc;

    @ManyToMany
    private Set<Role> roles;


}

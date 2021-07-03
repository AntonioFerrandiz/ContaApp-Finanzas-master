package com.upc.contaapp.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "letra")

public class Letra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="tipomoneda", length = 50)
    private String tipomoneda;

    @Column(name="tipoanio", length = 50)
    private String typeOfYear;

    @NotNull
    @Column(name="TEA")
    private Double tea;

    @Column(name="fechadescuento", length = 50)
    @Temporal(TemporalType.DATE)
    private Date fechadscto;

    @NotNull
    @Column(name="GastosCostosIniciales", length = 50)
    private Double gcIniciales;

    @NotNull
    @Column(name="GastosCostosFinales", length = 50)
    private Double gcFinales;


    @Column(name="fechavencimiento", length = 50)
    @Temporal(TemporalType.DATE)
    private Date fechavncto;

    @NotNull
    @Column(name="valornominal", length = 50)
    private Double valorN;

    //Valores a calcular

    @Column(name="numdias")
    private Number numDias;

    @Column(name="TEP")
    private Double tep;

    @Column(name="d")
    private Double d;

    @Column(name="valorneto")
    private Double valorNT;

    @Column(name="valorRecibido")
    private Double valorR;

    @Column(name="valorEntregado")
    private Double valorE;

    @Column(name="TCEA")
    private Double tcea;


}

package com.upc.contaapp.model;

import javax.persistence.*;
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

    @Column(name="tipoaño", nullable = false, length = 50)
    private String typeOfYear;

    @Column(name="TEA", nullable = false)
    private Double tea;

    @Column(name="fechadescuento", nullable = false, length = 50)
    @Temporal(TemporalType.DATE)
    private Date fechadscto;

    //Convertir a arreglo
    @Column(name="GastosCostosIniciales", nullable = false, length = 50)
    private Double gcIniciales;

    @Column(name="GastosCostosFinales", nullable = false, length = 50)
    private Double gcFinales;
    //Lo de arriba tambien

    @Column(name="fechavencimiento", nullable = false, length = 50)
    @Temporal(TemporalType.DATE)
    private Date fechavncto;

    @Column(name="valornominal", nullable = false, length = 50)
    private Double valorN;

    //Valores a calcular

    @Column(name="numdias", nullable = false)
    private Number numDias;

    @Column(name="TEP", nullable = false)
    private Double tep;

    @Column(name="d", nullable = false)
    private Double d;

    @Column(name="valorneto", nullable = false)
    private Double valorNT;

    @Column(name="valorRecibido", nullable = false)
    private Double valorR;

    @Column(name="valorEntregado", nullable = false)
    private Double valorE;

    @Column(name="TCEA", nullable = false)
    private Double tcea;


}

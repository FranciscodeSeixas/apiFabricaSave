
package com.example.fabrica.entity;

import javax.persistence.Column;
import javax.persistence.Table;
import javax .persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="muestras")
public class Muestra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column (name="id")
    private Long Id;
    
    @Column (name="m1")
    private double m1; 
    
    @Column (name="m2")
    private double m2; 
    
    @Column (name="m3")
    private double m3; 
    
    @Column (name="m4")
    private double m4; 
    
    @Column (name="m5")
    private double m5;
    
    @Column (name="m6")
    private double m6;
    
    @Column (name="m7")
    private double m7;
    
    @Column (name="m8")
    private double m8;

    public Muestra() {
    }

    public Muestra(Long Id, double m1, double m2, double m3, double m4, double m5, double m6, double m7, double m8) {
        this.Id = Id;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.m5 = m5;
        this.m6 = m6;
        this.m7 = m7;
        this.m8 = m8;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public void setM1(double m1) {
        this.m1 = m1;
    }

    public void setM2(double m2) {
        this.m2 = m2;
    }

    public void setM3(double m3) {
        this.m3 = m3;
    }

    public void setM4(double m4) {
        this.m4 = m4;
    }

    public void setM5(double m5) {
        this.m5 = m5;
    }

    public void setM6(double m6) {
        this.m6 = m6;
    }

    public void setM7(double m7) {
        this.m7 = m7;
    }

    public void setM8(double m8) {
        this.m8 = m8;
    }

    public Long getId() {
        return Id;
    }

    public double getM1() {
        return m1;
    }

    public double getM2() {
        return m2;
    }

    public double getM3() {
        return m3;
    }

    public double getM4() {
        return m4;
    }

    public double getM5() {
        return m5;
    }

    public double getM6() {
        return m6;
    }

    public double getM7() {
        return m7;
    }

    public double getM8() {
        return m8;
    }
    
    
}

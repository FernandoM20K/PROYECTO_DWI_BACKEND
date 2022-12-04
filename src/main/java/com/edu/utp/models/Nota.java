package com.edu.utp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_notas")
public class Nota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notaId;

    private int na1;
    private int na2;
    private int na3;
    private int na4;

    private int nb1;
    private int nb2;
    private int nb3;
    private int nb4;

    private int nc1;
    private int nc2;
    private int nc3;
    private int nc4;

    public Nota() {

    }

    public Long getNotaId() {
        return notaId;
    }

    public void setNotaId(Long notaId) {
        this.notaId = notaId;
    }

    public int getNa1() {
        return na1;
    }

    public void setNa1(int na1) {
        this.na1 = na1;
    }

    public int getNa2() {
        return na2;
    }

    public void setNa2(int na2) {
        this.na2 = na2;
    }

    public int getNa3() {
        return na3;
    }

    public void setNa3(int na3) {
        this.na3 = na3;
    }

    public int getNa4() {
        return na4;
    }

    public void setNa4(int na4) {
        this.na4 = na4;
    }

    public int getNb1() {
        return nb1;
    }

    public void setNb1(int nb1) {
        this.nb1 = nb1;
    }

    public int getNb2() {
        return nb2;
    }

    public void setNb2(int nb2) {
        this.nb2 = nb2;
    }

    public int getNb3() {
        return nb3;
    }

    public void setNb3(int nb3) {
        this.nb3 = nb3;
    }

    public int getNb4() {
        return nb4;
    }

    public void setNb4(int nb4) {
        this.nb4 = nb4;
    }

    public int getNc1() {
        return nc1;
    }

    public void setNc1(int nc1) {
        this.nc1 = nc1;
    }

    public int getNc2() {
        return nc2;
    }

    public void setNc2(int nc2) {
        this.nc2 = nc2;
    }

    public int getNc3() {
        return nc3;
    }

    public void setNc3(int nc3) {
        this.nc3 = nc3;
    }

    public int getNc4() {
        return nc4;
    }

    public void setNc4(int nc4) {
        this.nc4 = nc4;
    }

    public Double getPromedioNa() {
        return (double)((this.na1 * this.na2 * this.na3 * this.na4)/4);
    }

    public Double getPromedioNb() {
        return (double)((this.nb1 * this.nb2 * this.nb3 * this.nb4)/4);
    }

    public Double getPromedioNc() {
        return (double)((this.nc1 * this.nc2 * this.nc3 * this.nc4)/4);
    }

    public Double getPromedioFinal() {
        return (this.getPromedioNa() * this.getPromedioNb() * this.getPromedioNc()) / 3;
    }
    
}

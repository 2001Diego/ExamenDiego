
package com.verduleria.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;


@Entity
@Table (name = "verduras")
public class Verdura implements Serializable {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private int cant_kilo;
    private int precio_kilo;
    private int ubic_cajon;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaIngreso;
    
    @ManyToOne
    @JoinColumn(name="tienda_id")
    private Tienda tienda;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCant_kilo() {
        return cant_kilo;
    }

    public void setCant_kilo(int cant_kilo) {
        this.cant_kilo = cant_kilo;
    }

    public int getPrecio_kilo() {
        return precio_kilo;
    }

    public void setPrecio_kilo(int precio_kilo) {
        this.precio_kilo = precio_kilo;
    }

    public int getUbic_cajon() {
        return ubic_cajon;
    }

    public void setUbic_cajon(int ubic_cajon) {
        this.ubic_cajon = ubic_cajon;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }
    
    
}

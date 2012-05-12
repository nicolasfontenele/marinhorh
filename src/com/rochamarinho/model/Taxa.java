package com.rochamarinho.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author nicolas
 */
@Entity
public class Taxa implements Serializable {

    public Taxa() {
    }

    public Taxa(double valor) {
        this.valor = valor;
    }
    
    
    
    @Id @GeneratedValue
    private Long id;
    
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}

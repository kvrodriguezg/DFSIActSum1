package com.exp1_s3_katlheen_rodriguez.exp1_s3_katlheen_rodriguez;
import java.sql.Date;

//Clase Envio para aplicacion de seguimiento de envios
public class Envio {
    private Long id;
    private String origen;
    private String destino;
    private Date fechaEnvio;
    private String estado;   
    private String ubicacionActual;
    private Date fechaEstimadaEntrega; 

    // Constructor para crear un nuevo objeto de Envio
    public Envio(Long id, String origen, String destino, Date fechaEnvio, String estado, String ubicacionActual, Date fechaEstimadaEntrega) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.fechaEnvio = fechaEnvio;
        this.estado = estado;
        this.ubicacionActual = ubicacionActual;
        this.fechaEstimadaEntrega = fechaEstimadaEntrega;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getOrigen() { return origen; }
    public void setOrigen(String origen) { this.origen = origen; }

    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }

    public Date getFechaEnvio() { return fechaEnvio; }
    public void setFechaEnvio(Date fechaEnvio) { this.fechaEnvio = fechaEnvio; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getUbicacionActual() { return ubicacionActual; }
    public void setUbicacionActual(String ubicacionActual) { this.ubicacionActual = ubicacionActual; }

    public Date getFechaEstimadaEntrega() { return fechaEstimadaEntrega; } // Getter para fecha estimada de entrega
    public void setFechaEstimadaEntrega(Date fechaEstimadaEntrega) { this.fechaEstimadaEntrega = fechaEstimadaEntrega; } // Setter para fecha estimada de entrega
}
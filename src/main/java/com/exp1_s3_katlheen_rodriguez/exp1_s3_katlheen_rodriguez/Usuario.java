package com.exp1_s3_katlheen_rodriguez.exp1_s3_katlheen_rodriguez;
import java.util.Map;

//Clase Usuario para aplicación de viaje de mascotas
class Usuario {
    private Long id;
    private String nombre;
    private String rut;
    private String email;
    private String telefono;
    private String direccion;
    private Map<Integer, Map<String, String>> mascotas; //Permite almacenar varias mascontas: ID de mascota {nombre, tipo, raza}

    //Constructor para crear nuevo objeto de Usuario
    public Usuario(Long id, String nombre, String email, String rut, String telefono, String direccion, Map<Integer, Map<String, String>> mascotas) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.rut = rut;
        this.telefono = telefono;
        this.direccion = direccion;
        this.mascotas = mascotas;
    }

    //Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public String getRut() { return rut; }
    public void setRut(String rut) { this.rut = rut; }
    
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    
    public Map<Integer, Map<String, String>> getMascotas() { return mascotas; }
    public void setMascotas(Map<Integer, Map<String, String>> mascotas) { this.mascotas = mascotas; }
}
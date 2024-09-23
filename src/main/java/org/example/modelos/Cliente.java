package org.example.modelos;

public class Cliente {

    private String nombres;
    private String identificacion;
    private String direccion;
    private Integer edad;
    private String correo;

    public Cliente() {
    }

    public Cliente(String nombres, String identificacion, String direccion, Integer edad, String correo) {
        this.nombres = nombres;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.edad = edad;
        this.correo = correo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}

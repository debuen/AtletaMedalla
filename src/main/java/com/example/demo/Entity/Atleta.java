package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity

public class Atleta {

    @Id
    @GeneratedValue

    private Long id;
    private String nombre;
    private String apellidos;
    private String nacionalidad;
    private LocalDate nacimiento;

    public Atleta() {
    }

    public Atleta(String nombre, String apellidos, String nacionalidad, LocalDate nacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacionalidad = nacionalidad;
        this.nacimiento = nacimiento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Atleta atleta = (Atleta) o;

        if (id != null ? !id.equals(atleta.id) : atleta.id != null) return false;
        if (nombre != null ? !nombre.equals(atleta.nombre) : atleta.nombre != null) return false;
        if (apellidos != null ? !apellidos.equals(atleta.apellidos) : atleta.apellidos != null) return false;
        if (nacionalidad != null ? !nacionalidad.equals(atleta.nacionalidad) : atleta.nacionalidad != null)
            return false;
        return nacimiento != null ? nacimiento.equals(atleta.nacimiento) : atleta.nacimiento == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (apellidos != null ? apellidos.hashCode() : 0);
        result = 31 * result + (nacionalidad != null ? nacionalidad.hashCode() : 0);
        result = 31 * result + (nacimiento != null ? nacimiento.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", nacimiento=" + nacimiento +
                '}';
    }
}


import java.time.LocalDate;


//import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private String id;
    private Direccion direccion;
    private Empresa empresa;
    private LocalDate fechaVinculacion;

    public Persona(String nombre, String apellido, int edad, String id, Direccion direccion, Empresa empresa, LocalDate fechaVinculacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.id = id;
        this.direccion = direccion;
        this.empresa = empresa;
        this.fechaVinculacion = fechaVinculacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getId() {
        return id;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public LocalDate getFechaVinculacion() {
        return fechaVinculacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public void setFechaVinculacion(LocalDate fechaVinculacion) {
        this.fechaVinculacion = fechaVinculacion;
    }

    
    
}

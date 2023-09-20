
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Empresa {
    
    private String nit;
    private String nombre; 
    private ArrayList<Persona> empleados;
    private ArrayList<Empresa> direcciones;

    public Empresa(String nit, String nombre, ArrayList<Persona> empleados, ArrayList<Empresa> direcciones) {
        this.nit = nit;
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
        this.direcciones = new ArrayList<>();
    }

    public String getNit() {
        return nit;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Persona> getEmpleados() {
        return empleados;
    }

    public ArrayList<Empresa> getDirecciones() {
        return direcciones;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmpleados(ArrayList<Persona> empleados) {
        this.empleados = empleados;
    }

    public void setDirecciones(ArrayList<Empresa> direcciones) {
        this.direcciones = direcciones;
    }
    

}

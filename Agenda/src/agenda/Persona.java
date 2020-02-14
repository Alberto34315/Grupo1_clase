/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author alberto
 */
public class Persona {
    private Nif dni;
    private NombreCompleto nombre;
    private Fecha fecha;

    private Persona() {
    }
 
    public Persona(Nif dni, NombreCompleto nombre, Fecha fecha) {
        this.dni = dni;
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public Nif getDni() {
        return dni;
    }

    public void setDni(Nif dni) {
        this.dni = dni;
    }

    public NombreCompleto getNombre() {
        return nombre;
    }

    public void setNombre(NombreCompleto nombre) {
        this.nombre = nombre;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", fecha=" + fecha + '}';
    }
    
}

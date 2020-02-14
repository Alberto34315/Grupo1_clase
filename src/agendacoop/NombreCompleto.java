/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendacoop;

/**
 *
 * @author Jorge
 */
public class NombreCompleto {
    private String Nombre;
    private String Apellidos;

    public NombreCompleto(String Nombre, String Apellidos) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    @Override
    public String toString() {
        return "NombreCompleto{" + "Nombre=" + Nombre + ", Apellidos=" + Apellidos + '}';
    }
     
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete00;

/**
 *
 * @author jeani
 */
public class Persona {

    private String nombre;
    private String apellido;
    private String identificacion;

    public Persona(String n, String a, String i) {
        nombre = n;
        apellido = a;
        identificacion = i;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String a) {
        apellido = a;
    }

    public void establecerIdentificacion(String i) {
        identificacion = i;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerIdentificacion() {
        return identificacion;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "Identificacion: %s\n",
                nombre,
                apellido,
                identificacion);
    }
}

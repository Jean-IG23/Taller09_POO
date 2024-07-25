/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author jeani
 */
public class InstitucionEducativa {

    private String nombre;
    private String siglas;

    public InstitucionEducativa(String n, String s) {
        nombre = n;
        siglas = s;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerSiglas(String s) {
        siglas = s;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerSiglas() {
        return siglas;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s\n"
                + "Siglas: %s\n", nombre, siglas);
    }

}

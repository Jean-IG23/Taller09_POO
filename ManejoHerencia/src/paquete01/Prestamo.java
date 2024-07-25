/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import paquete00.Persona;

/**
 *
 * @author jeani
 */
public class Prestamo {

    private Persona beneficiario;
    protected double tiempo;
    protected String ciudad;

    public Prestamo(Persona n, double t, String c) {
        beneficiario = n;
        tiempo = t;
        ciudad = c;
    }

    public void establecerBeneficiario(Persona n) {
        beneficiario = n;
    }

    public void establecerApellido(double t) {
        tiempo = t;
    }

    public void establecerCiudad(String c) {
        ciudad = c;
    }

    public Persona obtenerBeneficiario() {
        return beneficiario;
    }

    public double obtenerTiempo() {
        return tiempo;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        return String.format("Beneficiario: %s\n" 
                + "Tiempo a diferir : %.2f meses\n"
                + "Ciudad : %s\n",
                beneficiario,
                tiempo,
                ciudad);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import paquete00.Persona;
import paquete01.Prestamo;

/**
 *
 * @author jeani
 */
public class PrestamoAutomovil extends Prestamo {

    private String tipo;
    private String marca;
    private Persona garante1;
    private double valor;
    private double valormensual;

    public PrestamoAutomovil(Persona n, double t, String c, String ti, String m,
            Persona g, double v) {
        super(n, t, c);
        tipo = ti;
        marca = m;
        garante1 = g;
        valor = v;
    }
    
    public void establecerCiudad(String c) {
        ciudad = c.toLowerCase();
    }

    public void establecerTipo(String n) {
        tipo = n;
    }

    public void establecerMarca(String n) {
        marca = n;
    }

    public void establecerGarante(Persona n) {
        garante1 = n;
    }

    public void establecerValor(double n) {
        valor = n;
    }

    public void establecerValorMensual() {
        valormensual = (valor / tiempo);
    }

    public String obtenerTipo() {
        return tipo;
    }

    public String obtenerMarca() {
        return marca;
    }

    public Persona obtenerGarante() {
        return garante1;
    }

    public double obtenerValor() {
        return valor;
    }

    public double obtenerValorMensual() {
        return valormensual;
    }

    @Override
    public String toString() {
        return String.format("Tipo de automovil: %s\n"
                + "Marca del automovil: %s\n"
                + "Garante: %s\n"
                + "Valor del automovil: %.2f\n"
                + "Valor mensual a pagar: %.2f\n" 
                + super.toString(),
                 tipo, marca, garante1, valor, valormensual);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import paquete00.Persona;
import paquete01.Prestamo;

/**
 *
 * @author jeani
 */
public class PrestamoEducativo extends Prestamo {

    private String nivel;
    private InstitucionEducativa nombre;
    private double valor;
    private double valormensual;

    public PrestamoEducativo(Persona n, double t, String c, String nv, InstitucionEducativa nI,double v) {
        super(n, t, c);
        nivel = nv;
        nombre = nI;
        valor = v;
    }

    public void establecerNivel(String ni) {
        nivel = ni;
    }

    public void establecerMarca(InstitucionEducativa n) {
        nombre = n;
    }

    public void establecerValor(double v) {
        valor = v;
    }

    public void establecerValorMensual() {
        double suma = valor / tiempo;
        valormensual = (valor / tiempo) - (suma * 0.1);
    }

    public String obtenerNivel() {
        return nivel;
    }

    public InstitucionEducativa obtenerCentro() {
        return nombre;
    }

    public double obtenerValor() {
        return valor;
    }

    public double obtenerValorMensual() {
        return valormensual;
    }

    @Override
    public String toString() {
        return String.format("Nivel de estudios: %s\n"
                + "Centro educativo: %s\n"
                + "Valor del prestamo: %.2f\n"
                + "Valor mensual a pagar: %.2f\n"
                + super.toString(),
                 nivel, nombre, valor, valormensual);
    }
}

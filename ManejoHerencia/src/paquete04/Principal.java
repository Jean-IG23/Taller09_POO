/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import paquete00.Persona;
import paquete02.PrestamoAutomovil;
import paquete03.InstitucionEducativa;
import paquete03.PrestamoEducativo;

/**
 *
 * @author jeani
 */
public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int op;
        boolean bandera = true;
        ArrayList<PrestamoAutomovil> pa = new ArrayList<PrestamoAutomovil>();
        ArrayList<PrestamoEducativo> pe = new ArrayList<PrestamoEducativo>();
        do {
            System.out.println("1. Ingresar prestamo de automovil");
            System.out.println("2. Ingresar prestamo educativo");
            op = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese nombre");
            String n = sc.nextLine();
            System.out.println("Ingrese apellido");
            String a = sc.nextLine();
            System.out.println("Ingrese identificación");
            String c = sc.nextLine();
            Persona p = new Persona(n, a, c);
            System.out.println("Ingrese los meses a diferir");
            double t = sc.nextDouble();
            sc.nextLine();
            System.out.println("Ingrese la ciudad de la que proviene");
            String ci = sc.nextLine();
            switch (op) {
                case 1: {
                    System.out.println("Ingrese el tipo de automovil");
                    String ti = sc.nextLine();
                    System.out.println("Ingrese la marca del automovil");
                    String m = sc.nextLine();
                    System.out.println("Ingrese el valor del automovil");
                    double v = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Ingrese datos del garante");
                    System.out.println("Ingrese nombre");
                    String no = sc.nextLine();
                    System.out.println("Ingrese apellido");
                    String ap = sc.nextLine();
                    System.out.println("Ingrese identificación");
                    String ce = sc.nextLine();
                    Persona g = new Persona(no, a, ce);
                    PrestamoAutomovil automovil = new PrestamoAutomovil(p, t, ci,
                            ti, m, g, v);
                    automovil.establecerValorMensual();
                    automovil.establecerCiudad(ci);
                    pa.add(automovil);
                    break;
                }
                case 2: {
                    System.out.println("Ingrese el nombre de la institucion Educativa");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese las siglas de la institucion");
                    String siglas = sc.nextLine().toUpperCase();
                    System.out.println("Ingrese el nivel de estudios");
                    String ni = sc.nextLine();
                    System.out.println("Ingrese el valor del prestamo");
                    double v = sc.nextDouble();
                    InstitucionEducativa in = new InstitucionEducativa(nombre, siglas);
                    PrestamoEducativo estudiante = new PrestamoEducativo(p, t, ci,
                            ni, in, v);
                    estudiante.establecerCiudad(ci);
                    estudiante.establecerValorMensual();
                    pe.add(estudiante);
                    sc.nextLine();
                    break;
                }
            }
            System.out.println("Si desea salir ingrese n:");
            String opc = sc.nextLine();
            if (opc.equals("n")) {
                bandera = false;
            }
        } 
        while (bandera);
        System.out.println("Prestamos de Automoviles\n");
        for (PrestamoAutomovil a : pa) {
            System.out.printf("Datos: %s\n", a);
        }
        System.out.println("Prestamos Educativos\n");
        for (PrestamoEducativo a : pe) {
            System.out.printf("Datos: %s\n", a);
        }
    }
}

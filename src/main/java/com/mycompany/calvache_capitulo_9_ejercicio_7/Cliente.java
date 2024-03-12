/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calvache_capitulo_9_ejercicio_7;

/**
 *
 * @author juanh
 */
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws Exception {
        Registry registro = LocateRegistry.getRegistry("localhost", 1099);
        Encuesta encuesta = (Encuesta) registro.lookup("Encuesta");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Voto (si, no, ns/nc): ");
            String voto = sc.nextLine();
            encuesta.votar(voto);
            System.out.print("Recuento actual:\n" + encuesta.obtenerRecuento());
            System.out.print("¿Finalizar encuesta? (s/n): ");
            String respuesta = sc.nextLine();
            if (respuesta.equals("s")) {
                encuesta.finalizarEncuesta();
                        }
        }
    }
}

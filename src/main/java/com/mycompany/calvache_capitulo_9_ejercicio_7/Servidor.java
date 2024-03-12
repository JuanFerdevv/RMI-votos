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

public class Servidor {
    public static void main(String[] args) throws Exception {
        Encuesta encuesta = new ServidorEncuestas();
        Registry registro = LocateRegistry.createRegistry(1099);
        registro.bind("Encuesta", encuesta);
        System.out.println("Servidor listo...");
    }
}

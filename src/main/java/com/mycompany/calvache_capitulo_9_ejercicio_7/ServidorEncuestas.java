/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calvache_capitulo_9_ejercicio_7;

/**
 *
 * @author juanh
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

public class ServidorEncuestas extends UnicastRemoteObject implements Encuesta {
    private Map<String, Integer> recuento = new HashMap<>();
    private boolean encuestaFinalizada = false;

    public ServidorEncuestas() throws RemoteException {
        super();
    }

    public void votar(String voto) throws RemoteException {
        if (!encuestaFinalizada) {
            Integer cantidad = recuento.getOrDefault(voto, 0);
            recuento.put(voto, cantidad + 1);
        }
    }

    public String obtenerRecuento() throws RemoteException {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : recuento.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }

    public void finalizarEncuesta() throws RemoteException {
        encuestaFinalizada = true;
    }
}

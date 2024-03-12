/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calvache_capitulo_9_ejercicio_7;

/**
 *
 * @author juanh
 */
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Encuesta extends Remote {
    public void votar(String voto) throws RemoteException;
    public String obtenerRecuento() throws RemoteException;
    public void finalizarEncuesta() throws RemoteException;
}
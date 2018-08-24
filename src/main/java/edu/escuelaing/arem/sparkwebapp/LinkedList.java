/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.sparkwebapp;

/**
 *
 * @author 2112712
 * clase de manejo y creacion de lista encadenada

 */
public class LinkedList {
    private Nodo nodo;
    private Nodo cabeza;
    private Nodo cola;
    private int len=0;
    public LinkedList(){
        cabeza=null;
    }
    /**
    * Añade un elemento a la lista
    *@param info info representa los datos que se almacenaran en el nodo que se agregara a la lista
    */
    public void append(double info){
        if (cabeza==null){
            cabeza=new Nodo(info);
        }
        else {
            Nodo x=new Nodo(info);
            Nodo temp=cabeza;
            x.setNext(temp);
            cabeza=x;
        }
    }
        /**
    *@return retorna la longitud de la lista
    */
    public int longitud(){
        return len;
    }
    /** 
    *@return retorna el nodo cabeza de la lista
    */
    public Nodo getCabeza(){
        return cabeza;
    }
}

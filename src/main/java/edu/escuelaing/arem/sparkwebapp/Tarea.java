/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.sparkwebapp;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 2112712
 */
public class Tarea {

    /**
     * @param args the command line arguments
     
     */
    private static double mean,deviation;
    private static LinkedList lista;
    
    
    public Tarea(LinkedList list){
        this.lista=list;
        
    }
    /**
    *@return retorna la media de una lista encadenada
    */
    public static double mean(){
        Nodo temporal=lista.getCabeza();
        int cont=0;
        while (temporal!=null){
            mean+=temporal.getDatos();
            temporal=temporal.getNext();
            cont+=1;
        }
        mean=mean/cont;
        return mean;
    }
    /**
    *@return retorna la desviacion estandar de una lista encadenada
    */
    public static double sdeviation(){
        Nodo temporal=lista.getCabeza();
        int cont=0;
        while (temporal!=null){
            deviation+=(double)Math.pow(temporal.getDatos()-mean, 2);
            temporal=temporal.next;
             cont+=1;
    }
        deviation=Math.sqrt(deviation/(cont-1));
        return  deviation;
    }
    /**
    *@param archivo representa el nombre del archivo que se quiere leer para construir la lista encadenada
    */
    
}

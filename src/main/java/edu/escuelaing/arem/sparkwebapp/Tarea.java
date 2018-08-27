/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.sparkwebapp;
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
    private String [] recibido;
    
    
    public Tarea(String arreglo){
        this.lista=new LinkedList();
        cadena(arreglo);
        
    }
    /**
    *@void convierte una cadena de texto recibida en nodos y los agrega
    * a una lista encadenada
    */
    
    public static void cadena(String recibido){
       String[] temp = recibido.split(",");
        for (int i = 0; i < temp.length; i++) {           
            double nodo = Double.parseDouble(temp[i]);
            lista.append(nodo);
        }
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
    
    
}

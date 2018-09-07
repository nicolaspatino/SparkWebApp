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
public class JsonRequest {

    /**
     * @param args the command line arguments
     
     */
    private static double mean,deviation,maximo,minimo,sumatoria;
    private static LinkedList lista;
    private String [] recibido;
    private String cadena;
    private static String listaa;
    
    
    public JsonRequest(String arreglo){
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
   
    public static double maximo(){
        Nodo temporal=lista.getCabeza();
        int cont=0;
        maximo=temporal.getDatos();
        while (temporal!=null & temporal.getNext()!=null){
            if (maximo<temporal.getNext().getDatos()){
                maximo=temporal.getNext().getDatos();
            }
            temporal=temporal.getNext();
            cont+=1;
        }        
        return maximo;
    }
    public static double minimo(){
        Nodo temporal=lista.getCabeza();
        int cont=0;
        minimo=temporal.getDatos();
        while (temporal!=null & temporal.getNext()!=null){
            if (minimo>temporal.getNext().getDatos()){
                minimo=temporal.getNext().getDatos();
            }
            temporal=temporal.getNext();
            cont+=1;
        }        
        return minimo;
    }
    public static double sumatoria(){
        Nodo temporal=lista.getCabeza();
        int cont=0;
        while (temporal!=null & temporal.getNext()!=null){
            sumatoria+=temporal.getDatos();
            temporal=temporal.getNext();
            cont+=1;
        }        
        return sumatoria;
    }
    public static String listaa(){
        Nodo temporal=lista.getCabeza();
        int cont=0;
        listaa="{";
        while (temporal!=null & temporal.getNext()!=null){  
            listaa+= String.valueOf(temporal.getDatos());
            listaa+=",";
            temporal=temporal.getNext();
            cont+=1;
        }
        listaa+="}";
        return listaa;
    }
}

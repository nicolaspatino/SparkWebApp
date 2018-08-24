/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.sparkwebapp;
import static spark.Spark.*;
/**
 *
 * @author 2112712
 */
public class SparkWebApp {
    public static void main(String[] args) {
        port(getPort());
        
         get("/hello", (req, res) -> ("<!DOCTYPE html>" + 
                                     "<html>"+
                                     "<head>"+
                                        "<title>Tarea 2 AREM</title>"+
                                        "</head>"+
                                        "<body>"+
                                            "<p>Media y Derivada parcial</p>"+
                                            "<p> * Ingrese los datos separados por espacio : </p>"+
                                            "<input type='text' id='tnum' name='numero'>"+
                                            "<button id='boton' class='button'>calcular</button>"+
                                        "</body>"+
                                            "<body>"+
                                            "<p> * Media : </p>"+ 
                                            "<p> * Derivada Parcial : </p>" +
                                        "</body>"+
                                    "</html>"));
     
        
            
 }
    
    static int getPort() {
        if (System.getenv("PORT") != null) {
        return Integer.parseInt(System.getenv("PORT"));
            }
        return 4567; //returns default port if heroku-port isn't set  (i.e. on localhost)
            }
    public static int guardaColumna(String prueba){
        return 1;
    }
   
}

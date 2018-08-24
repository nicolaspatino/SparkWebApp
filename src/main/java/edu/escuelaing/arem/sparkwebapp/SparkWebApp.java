/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.sparkwebapp;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import static spark.Spark.*;
/**
 *
 * @author 2112712
 */
public class SparkWebApp {
    public static void main(String[] args) throws IOException {
        port(getPort());
        
         get("/hello", (req, res) -> ("<!DOCTYPE html>" + 
                                     "<html>"+
                                        "<body>"+
                                            "<table>"+
                                                "<tr>"+
                                                  "<td><strong>EstimateProxySize   </strong></td>"+
                                                  "<td><strong>Horas</strong></td>"+
                                                   "</tr> "+
                                                "<tr>"+
                                                  "<td><strong>160</strong></td>"+
                                                  "<td><strong>15</strong></td>"+
                                                  "</tr> "+ 
                                                "<tr>"+
                                                  "<td><strong>591</strong></td>"+
                                                  "<td><strong>69.9</strong></td>"+
                                                   "</tr> "+
                                                "<tr>"+
                                                  "<td><strong>114</strong></td>"+
                                                  "<td><strong>6.5</strong></td>"+
                                                   "</tr> "+
                                                "<tr>"+
                                                  "<td><strong>229</strong></td>"+
                                                  "<td><strong>22.4</strong></td>"+
                                                   "</tr> "+
                                                "<tr>"+
                                                  "<td><strong>230</strong></td>"+
                                                  "<td><strong>28.4</strong></td>"+
                                                   "</tr> "+
                                                   "<tr>"+
                                                  "<td><strong>270</strong></td>"+
                                                  "<td><strong>65.9</strong></td>"+
                                                   "</tr> "+  
                                                   "<tr>"+
                                                  "<td><strong>128</strong></td>"+
                                                  "<td><strong>19.4</strong></td>"+
                                                   "</tr> "+   
                                                   "<tr>"+
                                                  "<td><strong>1657</strong></td>"+
                                                  "<td><strong>198.7</strong></td>"+
                                                   "</tr> "+   
                                                   "<tr>"+
                                                  "<td><strong>624</strong></td>"+
                                                  "<td><strong>38.8</strong></td>"+
                                                   "</tr> "+   
                                                   "<tr>"+
                                                  "<td><strong>1503</strong></td>"+
                                                  "<td><strong>138.2</strong></td>"+
                                                   "</tr> "+   
                                                   "<tr>"+
                                                  "<td><strong>media: 550.6</strong></td>"+
                                                  "<td><strong>media: 60.32</strong></td>"+
                                                   "</tr> "+   
                                                   "<tr>"+
                                                  "<td><strong>std: 572</strong></td>"+
                                                  "<td><strong>std: 62.26</strong></td>"+
                                                   "</tr> "+   
                 
                                    "</html>"));
        
           
        
    
 }
    
    static int getPort() {
        if (System.getenv("PORT") != null) {
        return Integer.parseInt(System.getenv("PORT"));
            }
        return 4567; //returns default port if heroku-port isn't set  (i.e. on localhost)
            }
    
    public static void prueba() throws MalformedURLException, IOException{
        URL url =new URL("http://localhost:4567/hello");
        
    }
    public static void lectura() {
        try{
            URL url =new URL("http://localhost:4567/hello");
            BufferedReader bf = new BufferedReader(new InputStreamReader(url.openStream()));
            File archivo = new File("descargado.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            String cadena;
            while ((cadena=bf.readLine())!=null){
                bw.write(cadena);
                
                }
                bf.close();
                bw.close();
                
            }catch(Exception ex){
                    ex.printStackTrace();
                    }
        System.out.println("se hizo");
        }
    }
        
            

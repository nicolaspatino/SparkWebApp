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
import spark.Request;
import spark.Response;
import static spark.Spark.*;
/**
 *
 * @author 2112712
 */
public class SparkWebApp {
    public static void main(String[] args) throws IOException {
        port(getPort());     
        get("/inputdata", (req, res) -> inputDataPage(req, res));
        get("/results", (req, res) -> resultsPage(req, res));
    }
    
 
    
    static int getPort() {
        if (System.getenv("PORT") != null) {
        return Integer.parseInt(System.getenv("PORT"));
            }
        return 4567; //returns default port if heroku-port isn't set  (i.e. on localhost)
            }
    
    private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>INGRESE LOS DATOS SEPARADOS POR UNA COMA</h2>"
                + "<form action=\"/results\">"
                + "  lista:<br>"
                + "  <input type=\"text\" name=\"lista\" value=>"
                + "  <br>"
                + "  <br>"
                + "  <input type=\"submit\" value=\"Submit\">"
                + "</form>"
                + "<p>If you click the \"Submit\" button, the form-data will be sent to a page called \"/results\".</p>"
                + "</body>"
                + "</html>";
        return pageContent;
     }
    private static String resultsPage(Request req, Response res) {
        JsonRequest a= new JsonRequest(req.queryParams("lista"));      
        String pageContent
                 = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>RESULTADO</h2>"
                + "<table class =\"egt\">"
                + "<tr>"
                + "<td>{\n" +
                "  \"lista\":"+a.listaa()+"\n" +
		"  \"maximo\":"+a.maximo()+"\n" +
		"  \"minimo\":"+a.minimo()+"\n" +
		"  \"sumatoria\":"+a.sumatoria()+"}</td>"
                + "</tr>"
                + "</table>"
                + "</body>"
                + "</html>"
                ; 
        return pageContent ;
    }
    
}
        

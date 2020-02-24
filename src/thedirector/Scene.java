/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thedirector;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import static thedirector.StoryGenerator.cls;
import static thedirector.StoryGenerator.enter;
import static thedirector.StoryGenerator.msj;

/**
 *
 * @author 80043
 */
public class Scene {
    String vista;
    String titulo;
    String desc;

    public Scene(String vista, String titulo, String desc) {
        this.vista = vista;
        this.titulo = titulo;
        this.desc = desc;
    }
        
    public void put(){
        readtxt(this.vista);
        System.out.println("\t\t\t\t "+titulo);
        System.out.println("========================================================================================");
        System.out.print(" \t>");
    }
    public void play() throws InterruptedException, IOException{
        cls();
        put();
        msj(desc);      
        enter();
    }
    
    public void text(String texto) throws InterruptedException, IOException{
        cls();
        put();
        msj(texto);     
        enter();
    }
    
    public int desicion(String dilema,String opt1, String opt2 ) throws InterruptedException, IOException{
        int  desicion = 0;        
        
        do{
            Scanner d = new Scanner(System.in);
            cls();
            text(dilema);
            msj("¿Qué deseas hacer?");
            msj("1> " +opt1+" 2> "+opt2);
            System.out.print("Decide> ");
            try{                                
                desicion = d.nextInt();
            }catch(Exception e){
                System.out.println("Elige escibriendo 1 o 2");
                
            }
                        
        }while(desicion!=1 && desicion!=2);
        
        return desicion;        
    }
    
    public static void enter() throws IOException{
        System.in.read();
        System.in.read();
    }
    
    public static void readtxt(String ruta){                
       try{
            File archivo = new File("media"+File.separator+ruta+".txt");
            FileReader bf = new FileReader(archivo);
            BufferedReader b = new BufferedReader(bf);
            String cadena = "";
            while((cadena = b.readLine())!= null){
                System.out.println(cadena);
            } 
       }catch(Exception e){  
           System.out.println(e);
       }                         
    }
        
}



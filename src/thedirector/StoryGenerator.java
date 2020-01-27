/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thedirector;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author 80043
 */
public class StoryGenerator {
    Personaje protagonista;
    private static String genero;
    private static String nombre;
    private static String personalidad;
    private static String raza;
    private static String color_cabello;
    private static String color_ojos;    
    private static String altura;
    private static String caracteristica_especial;
    private static String ocupacion;
    private static String pasatiempo;
    private static String estadoCivil;
    private static String habilidad;
    private static String nivelSocial;
    private static Story guion = new Story();
    
    
    public StoryGenerator(Personaje prota) throws IOException {
        this.protagonista = prota;
        this.genero = this.protagonista.getGenero();
        this.nombre = this.protagonista.getNombre();
        this.personalidad = this.protagonista.getPersonalidad();
        this.raza =  this.protagonista.getRaza();
        this.color_cabello = this.protagonista.getColor_cabello();
        this.color_ojos = this.protagonista.getColor_ojos();
        this.altura = this.protagonista.getAltura();
        this.caracteristica_especial = this.protagonista.getCaracteristica_especial();
        this.ocupacion =  this.protagonista.getOcupacion();
        this.pasatiempo =  this.protagonista.getPasatiempo();
        this.estadoCivil = this.protagonista.getEstadoCivil();
        this.habilidad = this.protagonista.getHabilidad();
        this.nivelSocial = this.protagonista.getNivelSocial();
    }
    
    public void runStory() throws IOException, FileNotFoundException, InterruptedException, JavaLayerException{
        readtxt("init"+guion.getGenero()+".txt");     //mainscreen           
        printChara();
    }
            
    public static void printChara() throws InterruptedException, IOException, FileNotFoundException, JavaLayerException{
        Thread  sonidos = new Subproceso("typewriter.mp3");
        sonidos.start();
        msj("Este es tu personaje:",10);             
        msj("Su nombre es " + nombre);
        msj("Obviamente es un/una "+ genero);
        msj("Tiene una personalidad "+ personalidad);
        msj("Es de origen  "+ raza);
        msj("Su cabello es "+ color_cabello);
        msj("Y sus ojos "+ color_ojos);
        msj("Tiene una estatura " + altura);
        msj("Como característica especial "+ caracteristica_especial);
        msj("Trabaja como "+ ocupacion);
        msj("Pasa su tiempo libre en "+ pasatiempo);
        msj("Su estado civil "+ estadoCivil);
        msj("Y es de clase "+ nivelSocial);
        msj("Presione enter para comenzar...",40);        
        enter();
        cls();
    }
    
    public static void readtxt(String ruta) throws FileNotFoundException, IOException, InterruptedException{
        File archivo = new File("media"+File.separator+ruta);
        FileReader bf = new FileReader(archivo);
        BufferedReader b = new BufferedReader(bf);
        String cadena = "";
        while((cadena = b.readLine())!= null){
            msj(cadena,7);
        }        
        msj("Presione enter para comenzar...",40);        
        enter();
        cls();
    }
    
    public static void enter() throws IOException{
        System.in.read();  
        System.in.read();  
    }
    
    public static void cls(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            /*No hacer nada*/
        } 
    }
    
    public static void msj(String  msg, int textSpeed) throws InterruptedException {
        for(char c:msg.toCharArray()){
            Thread.sleep(textSpeed);
            System.out.print(c);            
        }                
        System.out.print("\n");
    }         
    
    public static void msj(String  msg) throws InterruptedException {
        for(char c:msg.toCharArray()){
            Thread.sleep(30);
            System.out.print(c);            
        }                
        System.out.print("\n");
    }    
        
}
    
    
    
    


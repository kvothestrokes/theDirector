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
import java.util.logging.Level;
import java.util.logging.Logger;
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
    private static Story guion;    
    private static Machina DeusEx = new Machina();
    
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
        guion = new Story();         
        readtxt("init"+guion.getGenero()+".txt");     //mainscreen           
        printChara();                  
        DeusEx.ToStory(guion.getGenero());        
        cls();                    
        
    }  
            
    public static void printChara() throws InterruptedException, IOException, FileNotFoundException, JavaLayerException{
        Thread  sonidos = new Subproceso("typewriter.mp3");
        sonidos.start();
        msj("Este es tu personaje:",30);             
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
        //msj("Y es de clase "+ nivelSocial);
        msj("Presione enter para comenzar...",10);        
        enter();
        cls();
    }
    
    public static void readtxt(String ruta) throws FileNotFoundException, IOException, InterruptedException{
        Thread init = new Subproceso(guion.getGenero()+".mp3");
        init.start();
        File archivo = new File("media"+File.separator+ruta);
        FileReader bf = new FileReader(archivo);
        BufferedReader b = new BufferedReader(bf);
        String cadena = "";
        while((cadena = b.readLine())!= null){
            msj(cadena,7);
        }                
        msj("Presione enter para comenzar...",40);                
        enter();
        Subproceso.stap();
        cls();
    }
    
    public static void animate() throws IOException{
        String filedir = guion.getGenero();
        try{
            for(int i=1; i<=8;i++){
                frame(filedir+File.separator+i);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        enter();
        cls();
    }
    
    public static void frame(String file) throws FileNotFoundException{        
            File frame = new File("media"+File.separator+"anim"+File.separator+file+".txt");
            FileReader fr = new FileReader(frame);
            BufferedReader b = new BufferedReader(fr); 
            String linea = "";
            try{
                while((linea=b.readLine())!=null){
                    System.out.println(linea);
                }
                Thread.sleep(200);
                cls();
            }catch(Exception e){
                System.out.println(e);
            }                                                                
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
        int chara=0;
        for(char c:msg.toCharArray()){  
           /* switch(c){
                case 'á':
                    System.out.print('á');
                    break;
                case 'é':
                    System.out.print('é');
                    break;
                case 'í':
                    System.out.print('í');
                    break;
                case 'ó':
                    System.out.print('ó');
                    break;
                case 'ú':
                    System.out.print('ú');
                    break;
                case 'ñ':
                    System.out.print('ñ');
                case'¿':
                    System.out.print('¿');
                    break;
                default:
                    System.out.print(c);  
                    
            }*/
            if(chara==80){
                if(c == ' ' || c==','){
                    System.out.print("\n");
                    System.out.print("\t>");
                    chara=0;
                }else{
                    System.out.print("-");
                    System.out.print("\n");
                    System.out.print("\t>");                                        
                    chara=0;
                }
            }
            Thread.sleep(33);  
            System.out.print(c);  
            chara++;
        }                
        System.out.print("\n");
    }  
        
}
    
    
    
    


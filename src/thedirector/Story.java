/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thedirector;

import java.util.Random;

/**
 *
 * @author 80043
 */
public class Story {
    private static String genero;
    private static String inicio;
    private static String nudo;
    private static String fin;
    private static Random rand = new Random();    
    
    public Story() throws InterruptedException {
        this.genero =  putGenero();
    }
    
    public static String putGenero() throws InterruptedException{        
        String[] generos = {"Ficcion", "Fantasia" , "Misterio", "Terror", "Romance"};
        int r = rand.nextInt(generos.length);
        switch(generos[r]){
            case "Ficcion":              
                cmd("title Like a Neutron Star");
                cmd("color 01");                                        
            break;
            case "Fantasia":              
                cmd("title Pale Seas");
                cmd("color 09");               
            break;
            case "Misterio":                
                cmd("title Rare Monk");                
                cmd("color 06");                
            break;
            case "Terror":
                cmd("color 04");               
                break;
            case "Romance":
                cmd("title Anybody Out There");
                cmd("color 0B");               
        }
        return generos[r];
    }

    public  String getGenero() {
        return genero;
    }
    
    public static void cmd(String cmd){
        try {
            new ProcessBuilder("cmd", "/c", cmd).inheritIO().start().waitFor();
        } catch (Exception e) {
            /*No hacer nada*/
        } 
    }
    
    
}


package thedirector;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;

/**
 *
 * @author AndréCSM 
 */
public class TheDirector {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException, IOException, JavaLayerException {
        cmd();
        run();
    }
    
    public static void run() throws InterruptedException, IOException, JavaLayerException{
        
        Personaje prueba = new Personaje();        
        /**/
        StoryGenerator historia = new StoryGenerator(prueba);
        historia.runStory();
        
        
    }
    
    public static void msj(String  msg, int textSpeed) throws InterruptedException {
        for(char c:msg.toCharArray()){
            Thread.sleep(textSpeed);
            System.out.print(c);            
        }                
        System.out.print("\n");
    }
    
    public static void cmd(){
        try {
           //Runtime.getRuntime().exec("cmd.exe /c start");            
           Runtime.getRuntime().exec("cmd.exe /c start java -jar \"theDirector.jar\" "); 
           new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
           new ProcessBuilder("cmd", "@echo off").inheritIO().start().waitFor();
           new ProcessBuilder("cmd", "echo abrs").inheritIO().start().waitFor();
           new ProcessBuilder("cmd", "java -jar", "\"theDirector.jar\"").inheritIO().start().waitFor();
             
        } catch (IOException ex) {
        }catch (InterruptedException ex) {
                Logger.getLogger(TheDirector.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    
    public static void msj(String  msg) throws InterruptedException {
        for(char c:msg.toCharArray()){
            Thread.sleep(30);
            System.out.print(c);            
        }                
        System.out.print("\n");
    }
    
}

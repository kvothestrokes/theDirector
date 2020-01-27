/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thedirector;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author 80043
 */
public class Subproceso extends Thread{
    String fx;

    public Subproceso(String fx) {
        this.fx = fx;
    }
    
    public void run(){
        Player apl;
        try {
            apl = new Player(new FileInputStream("media/"+fx));
            apl.play();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Subproceso.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JavaLayerException ex) {
            Logger.getLogger(Subproceso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

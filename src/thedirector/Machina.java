/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thedirector;

import java.io.IOException;

/**
 *
 * @author 80043
 */
public class Machina {
    
    public static Scene fs;
    
    public Machina(){        
    }        
    
    public void ToStory(String genero) throws InterruptedException, IOException{                
        switch(genero){
            case "Ficcion":
                fic();
                break;
            case "Fantasia":
                fan();
                break;                                                              
            case "Misterio":
                mist();
                break;
            case "Terror":
                terr();
                break;
            case "Romance" :
                rom();
            default:
                System.out.println("ABER PENDEJO ");
                break;
        }
    }
        
    public void fic() throws InterruptedException, IOException{
        fs = new Scene("fic1","Satelite Titán" , "Una de las lunas más grandes de Saturno y tierra de exploración para minería espacial " );
        fs.play();
        fs.text("Año 30XX La carrera por la minería espacial dejó consigo grandes avances tecnológicos y dispersó a la raza humana a través del cosmos, sin embargo tambien despertó uno de los misterios mas longevos y siniestros del universo");
        fs.desicion("Uno de los mineros perdió contacto con nosotros, ¿deberiamos buscarlo o esperamos?", "Debe ser una interferencia", "Debe estar en peligro ");
        fs.text("ESTA ES UNA VERSION CON PROPOSITOS DEMOSTRATIVOS Y NO REPRESENTA EL PRODUCTO FINAL -  FIN DE LA DEMO");
                
    }
    
    public void rom() throws InterruptedException, IOException{
        fs = new Scene("rom1", "Backer Street 42a", "Nueva ciudad, nueva vida, eso espero.");
        fs.play();
        fs.text("Las calles estan desoladas y la ciudad parece fantasma, acabo de mudarme y ya quiero irme");
        fs.desicion("Son mis primeras horas en la ciudad ¿deberia explorar un poco?", "visitar el restaurant recomendado", "ir directo a tu casa");
        fs.text("ESTA ES UNA VERSION CON PROPOSITOS DEMOSTRATIVOS Y NO REPRESENTA EL PRODUCTO FINAL -  FIN DE LA DEMO");
       
    }
    
    public void fan() throws InterruptedException, IOException{
        fs = new Scene("fan1", "Mar obscuro del sur",  "Muchos mares se volvieron pálidos después del descubrimiento, pero ¿por qué este seguirá obscuro?");
        fs.play();
        fs.text("Después de que se descrubrieran restos de civilizaciones debajo de los océanos sus habitantes no tuvieron más remedio que abrir sus puertas a la civilización de la tierra, los secretos de cada cultura marina aguardan para quienes los busquen en los mares pálidos ");
        fs.desicion("Un remolino atrae tu barco rapidamente", "Intentar salir y bajar el ancla", "Dejarte llevar");
        fs.text("ESTA ES UNA VERSION CON PROPOSITOS DEMOSTRATIVOS Y NO REPRESENTA EL PRODUCTO FINAL -  FIN DE LA DEMO");        
    }
    
    public void mist() throws InterruptedException, IOException{
        fs =new Scene("mis1", "Collar antiguo", "La ultima voluntad de mi padre fue que cuidara del collar y lo pasara a la siguiente generación,  ¿y ahora esta brillando?");
        fs.play();
        fs.text("El collar brilla y eso tiene que significar algo, estoy seguro que mi padre me habló sobre esto");
        fs.desicion("Me dijo que buscara una llave de plata", "Ir a la biblioteca", "Ir a la iglesia local");
        fs.text("ESTA ES UNA VERSION CON PROPOSITOS DEMOSTRATIVOS Y NO REPRESENTA EL PRODUCTO FINAL -  FIN DE LA DEMO");
    }
    
    public void terr() throws InterruptedException, IOException{
        fs= new Scene("ter1", "????", "Sólo sabemos que tenemos que huir de eso, no importa cómo.");
        fs.play();
        fs.text("Maldición, apocalipsis, fin del mundo, sea lo que sea, lo unico que tenemos que hacer huir de las cenizas, las brumas y no mirar atrás");
        fs.text("ESTA ES UNA VERSION CON PROPOSITOS DEMOSTRATIVOS Y NO REPRESENTA EL PRODUCTO FINAL -  FIN DE LA DEMO");        
    }     
}

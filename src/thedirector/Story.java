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
    public static Scene escena1;
    public static String demo1,demo2,s1,s2;
    
    public Story() throws InterruptedException {
        this.genero =  putGenero();
    }
    
    public Scene getScene(){
        return escena1;
    }
    
    
    
    public static String putGenero() throws InterruptedException{        
        String[] generos = {"Ficcion", "Fantasia" , "Misterio", "Terror", "Romance"};
        int r = rand.nextInt(generos.length);
        switch(generos[r]){
            case "Ficcion":              
                cmd("title Like a Neutron Star");
                cmd("color 01");
                escena1 =  new Scene("fic1","Satelite Titan" , "Una de las lunas mas grandes de Saturno y tierra de exploracion para mineria espacial " );
                escena1.play();
                demo1="Año 30XX La carrera por la mineria espacial dejo consigo grandes avances tecnologicos y disperso a la raza humana a traves del cosmos\n sin embargo tambien desperto uno de los misterios mas longevos y siniestros del universo";                
                demo2="Uno de los mineros perdio contacto con nosotros, ¿deberiamos buscarlo o esperamos?";
                s1= "Debe ser una interferencia";
                s2="Debe estar en peligro ";                
                
            break;
            case "Fantasia":              
                cmd("title Pale Seas");
                cmd("color 09");
                escena1 = new Scene("fan1", "Mar obscuro del sur",  "Muchos mares se volvieron palidos después del descubrimiento, pero ¿por que este seguira obscuro?");
                escena1.play();
                escena1.text("Despues de que se descrubrieran restos de civilizaciones debajo de los oceanos muchos mares se hicieron palidos y otros mas obscuros, los secretos de cada cultura marina aguardan para quienes los busquen en los mares palidos ");
                escena1.desicion("Un remolino atrae tu barco rapidamente", "Intentar salir y bajar el ancla", "Dejarte llevar");
            break;
            case "Misterio":                
                cmd("title Rare Monk");                
                cmd("color 06");
                escena1 =  new Scene("mis1", "Collar antiguo", "La ultima voluntad de mi padre fue que cuidara del collar y lo pasara a la siguiente generacion,  ¿y ahora esta brillando?");
                escena1.play();
                escena1.text("El collar brilla y eso tiene que significar algo, estoy seguro que mi padre me hablo sobre esto");
                escena1.desicion("Me dijo que buscara una llave de plata", "Ir a la biblioteca", "Ir a la iglesia local");
                
            break;
            case "Terror":
                cmd("color 04");
                escena1 = new Scene("ter1", "????", "Solo sabemos que tenemos que huir de eso, no importa como.");
                escena1.play();
                escena1.text("Maldicion, apocalipsis, fin del mundo, sea lo que sea, lo unico que tenemos que hacer huir de las cenizas, las brumas y no mirar atras");
                escena1.desicion("Escuchas un grito de ayuda dentro de la nube de cenizas que pide ayuda", "Seguir tu camino", "Entrar a las cenizas para ayudar");
                break;
            case "Romance":
                cmd("title Anybody Out There");
                cmd("color 0B");
                escena1 = new Scene("rom1", "Backer Street 42a", "Nueva ciudad, nueva vida, eso espero.");
                escena1.play();
                escena1.text("Las calles estan desoladas y la ciudad parece fantasma, acabo de mudarme y ya quiero irme");
                escena1.desicion("Acabo de llegar ¿deberia explorar un poco?", "visitar el restaurant recomendado", "ir directo a tu casa");
            
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

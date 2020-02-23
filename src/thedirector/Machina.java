/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thedirector;

/**
 *
 * @author 80043
 */
public class Machina {
    
    public static Scene fs;
    
    public void ToStory(String genero) throws InterruptedException{
        System.out.println("AQUI NO ES SWICTH");
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
        
    public void fic() throws InterruptedException{
        fs = new Scene("fic1","Satelite Titan" , "Una de las lunas mas grandes de Saturno y tierra de exploracion para mineria espacial " );
        fs.play();
        fs.text("Año 30XX La carrera por la mineria espacial dejo consigo grandes avances tecnologicos y disperso a la raza humana a traves del cosmos\n sin embargo tambien desperto uno de los misterios mas longevos y siniestros del universo");
        fs.desicion("Uno de los mineros perdio contacto con nosotros, ¿deberiamos buscarlo o esperamos?", "Debe ser una interferencia", "Debe estar en peligro ");
        fs.text("ESTA ES UNA VERSION CON PROPOSITOS DEMOSTRATIVOS Y NO REPRESENTA EL PRODUCTO FINAL -  FIN DE LA DEMO");
    }
    
    public void rom() throws InterruptedException{
        fs = new Scene("rom1", "Backer Street 42a", "Nueva ciudad, nueva vida, eso espero.");
        fs.play();
        fs.text("Las calles estan desoladas y la ciudad parece fantasma, acabo de mudarme y ya quiero irme");
        fs.desicion("Acabo de llegar ¿deberia explorar un poco?", "visitar el restaurant recomendado", "ir directo a tu casa");
        fs.text("ESTA ES UNA VERSION CON PROPOSITOS DEMOSTRATIVOS Y NO REPRESENTA EL PRODUCTO FINAL -  FIN DE LA DEMO");
    }
    
    public void fan() throws InterruptedException{
        fs = new Scene("fan1", "Mar obscuro del sur",  "Muchos mares se volvieron palidos después del descubrimiento, pero ¿por que este seguira obscuro?");
        fs.play();
        fs.text("Despues de que se descrubrieran restos de civilizaciones debajo de los oceanos muchos mares se hicieron palidos y otros mas obscuros, los secretos de cada cultura marina aguardan para quienes los busquen en los mares palidos ");
        fs.desicion("Un remolino atrae tu barco rapidamente", "Intentar salir y bajar el ancla", "Dejarte llevar");
        fs.text("ESTA ES UNA VERSION CON PROPOSITOS DEMOSTRATIVOS Y NO REPRESENTA EL PRODUCTO FINAL -  FIN DE LA DEMO");
        
    }
    
    public void mist() throws InterruptedException{
        fs =new Scene("mis1", "Collar antiguo", "La ultima voluntad de mi padre fue que cuidara del collar y lo pasara a la siguiente generacion,  ¿y ahora esta brillando?");
        fs.play();
        fs.text("El collar brilla y eso tiene que significar algo, estoy seguro que mi padre me hablo sobre esto");
        fs.desicion("Me dijo que buscara una llave de plata", "Ir a la biblioteca", "Ir a la iglesia local");
        fs.text("ESTA ES UNA VERSION CON PROPOSITOS DEMOSTRATIVOS Y NO REPRESENTA EL PRODUCTO FINAL -  FIN DE LA DEMO");
    }
    
    public void terr() throws InterruptedException{
        fs= new Scene("ter1", "????", "Solo sabemos que tenemos que huir de eso, no importa como.");
        fs.play();
        fs.text("Maldicion, apocalipsis, fin del mundo, sea lo que sea, lo unico que tenemos que hacer huir de las cenizas, las brumas y no mirar atras");
        fs.text("ESTA ES UNA VERSION CON PROPOSITOS DEMOSTRATIVOS Y NO REPRESENTA EL PRODUCTO FINAL -  FIN DE LA DEMO");
    }
}

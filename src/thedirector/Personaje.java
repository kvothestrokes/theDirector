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
import java.util.Random;

/**
 *
 * @author 80043
 */
public class Personaje  {
    private String genero;
    private String nombre;
    private String personalidad;
    private String raza;
    private String color_cabello;
    private String color_ojos;    
    private String altura;
    private String caracteristica_especial;
    private String ocupacion;
    private String pasatiempo;
    private String estadoCivil;
    private String habilidad;
    private String nivelSocial;
    private Random rand = new Random();
    
    Personaje() throws IOException {
        this.genero = setGenero();
        this.nombre = setNombre();
        this.personalidad = setPersonalidad();
        this.raza =  setRaza();
        this.color_cabello = setColor_cabello();
        this.color_ojos = setColor_ojos();        
        this.altura = setAltura();
        this.caracteristica_especial = setCaracteristica_especial();
        this.ocupacion = setOcupacion();
        this.pasatiempo = setPasatiempo();
        this.estadoCivil = setEstadoCivil();
        this.habilidad = setHabilidad();
        this.nivelSocial = setNivelSocial();
    }
          
    public String getGenero() {
        return genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPersonalidad() {
        return personalidad;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor_cabello() {
        return color_cabello;
    }

    public String getColor_ojos() {
        return color_ojos;
    }
    
    public String getAltura() {
        return altura;
    }

    public String getCaracteristica_especial() {
        return caracteristica_especial;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public String getPasatiempo() {
        return pasatiempo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public String getNivelSocial() {
        return nivelSocial;
    }
    
    /* setter internos*/
    private String setGenero() {
        int r = rand.nextInt(2);
        String genero="";
        //System.out.println(">>"+r);
        if(r==1){
            return "hombre";
        }else{
            return "mujer";
        }
    }
    
    private String setNombre() throws FileNotFoundException, IOException {
        int r= rand.nextInt(21);        
        String genero;
        if(this.genero.equals("hombre")){
            genero = "hombres";           
        }else{
            genero = "mujeres";
        }
        File fichero  = new File("media"+File.separator+genero+".txt");
        String cadena = "";
        FileReader f = new FileReader(fichero);
        BufferedReader b = new BufferedReader(f);        
        for (int i=0; i< r; i++){
            cadena = b.readLine();
        }
        return cadena;                
    }

    private  String pickOne(String[] array){
        int r = rand.nextInt(array.length);
        return array[r];
    }
    
    private String setPersonalidad(){
        String[] tipos = {"Alegre", "Amable", "Firme", "Floja",  "Grosera", "Solitaria", "Ingenua", "Miedosa", "Osada", "Serena", "Tímida", "Pícara"};
        return pickOne(tipos);        
    }

    public String setRaza() {
        String[] tipos ={"Blanca", "Hispano", "Caribeño", "Indio", "Asiático", "Árabe"};
        return pickOne(tipos);
    }

    public String setColor_cabello() {
        String[]tipos={"Negro", "Negro", "Negro", "Rojo", "Blanco", "Rosa"};
        return pickOne(tipos);
    }

    public String setColor_ojos() {
        String[] tipos ={"Negros", "Negros", "Cafes", "Azules", "Rojos", "Negros"};
        return pickOne(tipos);
    }
    

    public String setAltura() {
        String[] tipos ={"Normal", "Alta", "Normal", "Baja", "Normal", "Normal", "Normal"};
        return pickOne(tipos);        
    }

    public String setCaracteristica_especial() {
        String[]  tipos= {"Ninguna", "Ninguna", "Ninguna","Ninguna","Ninguna","Ninguna","un tatuaje en el brazo","Ninguna","un seseo al hablar", "Ninguna" };
        return pickOne(tipos);
    }

    public String setOcupacion() {        
        if(this.genero.equals("hombre")){
            String[] tipos ={"Arqueologo", "Militar", "Marinero", "Oficinista", "Empresario", "Estudiante", "Relojero", "Informático", "Doctor", "Escritor", "Físico", "Matemático"};
            return pickOne(tipos);
        }else{
            String[] tipos ={"Oficinista", "Enfermera", "Doctora", "Trabajadora Social", "Maestra", "Policía", "Deportista", "Juez"};
            return pickOne(tipos);
        }
    }

    public String setPasatiempo() {
        String[] tipos={"Astronomía", "Atletismo", "Libros", "Autos Clásicos", "Bailar", "Campismo", "Cantar", "Cocina", "Comics", "Judo", "Legos", "cuartos de escape", "puzzles", "nada"};
        return pickOne(tipos);                       
    }

    public String setEstadoCivil() {
        if(this.genero.equals("hombre")){
            String[] tipos ={"Casado", "Soltero", "Divorciado", "Viudo"};
            return pickOne(tipos);
        }else{
            String[] tipos ={"Casada", "Soltera", "Divorciada", "Viuda"};
            return pickOne(tipos);
        }
    }

    public String setHabilidad() {
        String habilidad = "";
        return habilidad;
    }

    public String setNivelSocial() {
        String[] tipos ={"alta", "media", "baja"};
        return pickOne(tipos);
    }
    
    
}

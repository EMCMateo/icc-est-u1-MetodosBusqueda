package models;

import java.io.StringReader;

public class Persona {

    

    private int codigo;
    private String nombre;
    
    public Persona() {
    }

    public Persona(int codigo, String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
    }


    
    @Override

    public String toString() {
        return "Persona{" +
                "codigo = " + codigo +
                ", nombre = '" + nombre + '\'' +
                '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }   
    
    
}
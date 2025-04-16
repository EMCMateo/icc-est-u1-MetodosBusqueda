package controllers;
import models.Persona;
import views.ShowConsole;
public class MetodosOrdenamiento {
    // Atributos
    private Persona[] personas;
    public MetodosOrdenamiento(Persona [] people) {
        this.personas = people;
        
    }

        public Persona [] ordenarPorNombre() {
            String aux="";
            for (int i = 0; i < personas.length - 1; i++) {
                for (int j = 0; j < personas.length - 1 - i; j++) {

                    if (personas[j].getNombre().compareTo(personas[j + 1].getNombre()) > 0) {
                        aux = personas[j].getNombre();
                        personas[j].setNombre(personas[j + 1].getNombre());
                        personas[j + 1].setNombre(aux);

                    }
                       

                    }
                }
                return personas;
            }
    
        
    }
    



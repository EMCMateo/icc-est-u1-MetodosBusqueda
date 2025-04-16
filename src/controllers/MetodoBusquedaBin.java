package controllers;
import models.Persona;
import views.ShowConsole;

public class MetodoBusquedaBin {
    private Persona [] personasBin;
    private ShowConsole show;

    public MetodoBusquedaBin(Persona[] personasB) {
        this.personasBin = personasB;
        this.show = new ShowConsole();
        show.showMessage("Clase MBB creada.  Metodos Busqueda Binaria");
        
       

    }

    private int findPersonByCode(int codigo ) {
        
        int inicio = 0;
        int fin = personasBin.length - 1;

        /* 
        for (int i = 0; i < personasBin.length; i++) {
            if (personasBin[medio].getCodigo() == codigo) {
                return medio;
            } else if (personasBin[medio].getCodigo() < codigo) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
            medio = (inicio + fin) / 2;
        }
            */
           

        while (inicio <= fin) {
            int medio = (inicio +(fin - inicio)) / 2;
            if(personasBin[medio].getCodigo() == codigo) {
                return medio;
            } else if (personasBin[medio].getCodigo() < codigo) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }

    }
        return -1; // Si no se encuentra, devolver -1
    }


    private int findPersonByName(String nombre){
        MetodosOrdenamiento metodosOrdenamiento = new MetodosOrdenamiento(personasBin);
        Persona [] personasBin = metodosOrdenamiento.ordenarPorNombre();

        int inicio = 0;
        int fin = personasBin.length - 1;
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            if (personasBin[medio].getNombre().equalsIgnoreCase(nombre)) {
                return medio;
            } else if (personasBin[medio].getNombre().compareToIgnoreCase(nombre) < 0) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1; // Si no se encuentra, devolver -1
    }
    
        public void showPersonByCode() {
            int codeToFind = show.getCodigo();
            int indexPersona = findPersonByCode(codeToFind);
            if (indexPersona != -1) {
                show.showMessage("Persona encontrada");
                show.showMessage(personasBin[indexPersona].toString());
            } else {
                show.showMessage("Persona no encontrada con el código: " + codeToFind);
            }
        }

        public void ShowPersonByName() {
            String nameToFind = show.getNombre();
            int indexPersona = findPersonByName(nameToFind);
            if (indexPersona != -1) {
                show.showMessage("Persona encontrada");
                show.showMessage(personasBin[indexPersona].toString());
            } else {
                show.showMessage("Persona no encontrada con el nombre: " + nameToFind);
            }
        }
    }

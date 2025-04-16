package controllers;
import views.ShowConsole;
import models.Persona;

public class MetodosBusqueda {
    private ShowConsole show;
    private Persona[] personas = new Persona[10];

    public MetodosBusqueda() {
        show = new ShowConsole();
    }

    public MetodosBusqueda(Persona[] persons) {
        show = new ShowConsole();
        this.personas = persons; // Corrección: Asignar correctamente el parámetro
        showPersonByCoode();
    }

    public int FindByPerson(int codigo) {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i] != null && personas[i].getCodigo() == codigo) { // Validación de nulos
                System.out.println("El elemento " + codigo + " se encuentra en la posición " + i);
                return i;
            }
        }
        return -1; // Si no se encuentra, devolver -1
    }

    public void showPersonByCoode() {
        int codeToFind = show.getCodigo();
        int indexPersona = FindByPerson(codeToFind);
        if (indexPersona != -1) {
            show.showMessage("Persona encontrada");
            show.showMessage(personas[indexPersona].toString());
        } else {
            show.showMessage("Persona no encontrada con el código: " + codeToFind);
        }
    }
}
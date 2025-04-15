package controllers;
import views.ShowConsole;
import models.Persona;
public class MetodosBusqueda{
    private ShowConsole show;
    private Persona[] personas = new Persona[10];
    public MetodosBusqueda() {
        show = new ShowConsole();
    }
    public MetodosBusqueda(Persona[] persons) {
        show = new ShowConsole();
        this.personas = personas;
        ShowPersonByCoode();
    }

    public int FindByPerson(int codigo){
        for (int i = 0; i < personas.length; i++) {
                if (personas[i].getCodigo() == codigo) {
                    System.out.println("El elemento " + codigo + " se encuentra en la posicion " + i);
                    return i;
                }else {
                return -1;
                }
         
    }return -1;
}
    
    public void ShowPersonByCoode() {
        int codeToFind = show.getCodigo();
        int indexPersona = FindByPerson(codeToFind);
        if (indexPersona != -1) {
            show.showMessage("Persona encontrada");
            show.showMessage(personas[indexPersona].toString());
        } else {
            show.showMessage("Persona no encontrada con el codigo: " + codeToFind);
        }
    }
    

    
}
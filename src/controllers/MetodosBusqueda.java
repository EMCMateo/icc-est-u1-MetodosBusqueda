package controllers;
import views.ShowConsole;
    
public class MetodosBusqueda{

    public static int busquedaLineal(int[] arreglo, int busquedaLineal) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == busquedaLineal) {
                System.out.println("El elemento " + busquedaLineal + " se encuentra en la posicion " + i);
                return i;
            }
        }
        return -1;
    }
    

    ShowConsole show = new ShowConsole();
}
import controllers.MetodosBusqueda;
public class App {
    
    public static void main(String[] args) {
        int[] numeros = {5, 8, 12, 20, 33, 45};
        int busquedaLineal = 20;

        int resultado = MetodosBusqueda.busquedaLineal(numeros, busquedaLineal);

        if (resultado != -1) {
            System.out.println("Valor encontrado en la posición: " + resultado);
        } else {
            System.out.println("Valor no encontrado.");
        }

        
    }
}

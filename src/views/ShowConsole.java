package views;
import java.util.Scanner;
public class ShowConsole {
        Scanner scanner = new Scanner(System.in);
    public void ShowMenu(){
        System.out.println("Metodo Busqueda: ");
    }

    public int getCodigo(){
        System.out.println("Digite el codigo de la persona: ");
        int codigo = scanner.nextInt();
        System.out.println("El codigo es: " + codigo);
        return codigo;
    }

    public String getNombre(){
        System.out.println("Digite el nombre de la persona: ");
        String nombre = scanner.nextLine();
        System.out.println("El nombre es: " + nombre);
        return nombre;
    }
    public void showMessage(String message)
    {
        System.out.println(message);
    }


        public ShowConsole(){}
}

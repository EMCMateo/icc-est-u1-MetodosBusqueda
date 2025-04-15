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
    public void showMessage(String message)
    {
        System.out.println(message);
    }

    
        public ShowConsole(){}
}

import controllers.MetodoBusquedaBin;
import controllers.MetodosBusqueda;
import models.Persona;
public class App {
    
    public static void main(String[] args) {
        int[] numeros = {5, 8, 12, 20, 33, 45};
        int busquedaLineal = 20;
        Persona [] personass = new Persona[7];
        //MetodosBusqueda metodosBusqueda = new MetodosBusqueda();





        personass [0] = new Persona(101, "Juan");
        personass [1] = new Persona(102, "Maria");
        personass [2] = new Persona(103, "Carlos");
        personass [3] = new Persona(104, "Ana");
        personass [4] = new Persona(105, "Luis");
        personass [5] = new Persona(106, "Sofia");
        personass [6] = new Persona(107, "Pedro");
        

        //MetodosBusqueda metodosBusqueda2 = new MetodosBusqueda(personass);

        MetodoBusquedaBin metodosBusquedaBin = new MetodoBusquedaBin(personass);

        //metodosBusquedaBin.showPersonByCode();

        metodosBusquedaBin.ShowPersonByName();


       
    }
}

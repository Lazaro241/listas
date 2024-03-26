import java.util.Scanner;
public class Nodo {
    String nombre;
    String mail;
    Nodo siguiente;
    public Nodo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dame el nombre pornografico: ");
        this.nombre=scanner.nextLine();
        System.out.print("Ahora dame el mail pornografico: ");
        this.mail=scanner.nextLine();
        this.siguiente=null;
    }
}

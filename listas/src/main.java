import java.util.Scanner;
public class main {
    public static void main(String[] args){
        int porno=0;
        String nom;
        Scanner scanner = new Scanner(System.in);
        ListaEnlazada lista = new ListaEnlazada();
        while(porno!=4){
            System.out.println("1. Ingresar contacto\n2. Imprimir lista\n3. Eliminar contacto\n4. Cerrar");
            porno=scanner.nextInt();
            switch(porno){
                case 1:
                lista.insertar();
                break;
                case 2:
                lista.imprimir();
                break;
                case 3:
                lista.eliminar();
                break;
            }
            scanner.nextLine();
            scanner.nextLine();
        }
        scanner.close();
    }
}

import java.util.Scanner;
public class main {
    public static void main(String[] args){
        int porno=0;
        Scanner scanner = new Scanner(System.in);
        ListaEnlazada lista = new ListaEnlazada();
        while(porno!=3){
            System.out.println("1. Ingresar contacto\n2. Imprimir lista\n3. Cerrar");
            porno=scanner.nextInt();
            switch(porno){
                case 1:
                lista.insertar();
                break;
                case 2:
                lista.imprimir();
                break;
            }
            scanner.nextLine();
            scanner.nextLine();
        }
        scanner.close();
    }
}

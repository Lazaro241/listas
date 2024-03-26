import java.util.Scanner;

public class ListaEnlazada {
    Nodo cabeza;
    public ListaEnlazada(){
        cabeza=null;
    }
    public boolean verificar(){
        if(cabeza==null){
            return true;
        }
        else{
            return false;
        }
    }
    public void insertar(){
        Nodo nuevo = new Nodo();
        if(cabeza==null){
            cabeza=nuevo;
        } else {
            Nodo actual=cabeza;
            Nodo anterior=null;
            while(actual!=null){
                anterior=actual;
                actual=actual.siguiente;
            }
            anterior.siguiente=nuevo;
        }
    }
    public void imprimir(){
        if(verificar()==false){
            Nodo actual = cabeza;
            int cont=1;
            while(actual!=null){
                System.out.println(cont+"° Contacto:\nNombre: "+(actual.nombre)+"\nMail: "+(actual.mail));
                actual=actual.siguiente;
                cont++;
            }
        }
        else{
            System.out.println("La lista está vacía.");
        }   
    }
    public void eliminar(){
        if(verificar()==false){
            String nombre;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el nombre de la persona que desea eliminar");
            nombre=scanner.nextLine();
            Nodo actual=cabeza;
            Nodo anterior=null;
            while (actual!=null){
                if (actual.nombre.equalsIgnoreCase(nombre)){
                    if (anterior==null){
                        cabeza=actual.siguiente;
                    }
                    else{
                        anterior.siguiente=actual.siguiente;
                    }
                    System.out.println("Se eliminó a la mierda la/el " + nombre);
                    actual=null;
                }
                else{
                    anterior=actual;
                    actual=actual.siguiente;
                }
            }
            System.out.println("No se encontró una bosta");
        }
        else{
            System.out.println("La lista está vacía.");
        }
    }
   
}

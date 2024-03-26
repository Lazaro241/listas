public class ListaEnlazada {
    Nodo cabeza;
    public ListaEnlazada(){
        cabeza=null;
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
        Nodo actual = cabeza;
        int cont=1;
        while(actual!=null){
            System.out.println(cont+"° Contacto:\nNombre: "+(actual.nombre)+"\nMail: "+(actual.mail));
            actual=actual.siguiente;
            cont++;
        }
        
    }
}

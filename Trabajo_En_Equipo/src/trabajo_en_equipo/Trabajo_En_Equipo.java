
package trabajo_en_equipo;


public class Trabajo_En_Equipo {


    public static void main(String[] args) {
        lista_sencilla l1=new lista_sencilla();
<<<<<<< Upstream, based on origin/master
        //Se insertan dos datos en una lista sencilla
        l1.insertar(1, 2);
        //Impresión de la lista
        l1.imprimir();
=======
        l1.insertar(1, 2);
        l1.imprimir();
//        System.out.println("Hola mundo");
//        //Ejercicio basico de listas...
//        nodo cab;
//        nodo q;
//        cab = new nodo(1);
//        q = new nodo (2);
//        cab.sig = q;
//        nodo aux = cab;
//        System.out.println("Impresion de la lista: ");
//        while(aux != null){
//            System.out.println(aux.info);
//            aux = aux.sig;
//        }
//        System.out.println("_________");
//        q = new nodo (3);
//        cab.sig.sig = q;
//        q.sig = null;
//        aux = cab;
//        System.out.println("Impresion de la lista: ");
//        while(aux != null){
//            System.out.println(aux.info);
//            aux = aux.sig;
//        }
>>>>>>> f773b47 Nuevo Trabajo En Equipo
    }
    
}

class lista_sencilla {
    nodo cab;					
    lista_sencilla(){
        cab=new nodo(-1);				
        cab=cab;
    }
    void insertar(int a, int b){			     
        nodo q;
        cab = new nodo(a);
        q = new nodo (b);
        cab.sig = q;
    }
    void imprimir ()
    {
        nodo aux = cab;
        System.out.println("Impresion de la lista: ");
        while(aux != null){
            System.out.println(aux.info);
            aux = aux.sig;
        }
    }
    
}

class nodo{
    int info;
    nodo (int x){
        info = x;
    }
    nodo sig;
}

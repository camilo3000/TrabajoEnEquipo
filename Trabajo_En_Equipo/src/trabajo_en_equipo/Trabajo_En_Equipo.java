
package trabajo_en_equipo;


public class Trabajo_En_Equipo {


    public static void main(String[] args) {
        lista_sencilla l1=new lista_sencilla();
        //Se insertan dos datos en una lista sencilla
        l1.insertar(1, 2);
        //Impresión de la lista
        l1.imprimir();

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

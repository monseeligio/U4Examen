package arboles;

import java.util.Scanner;

public class Arboles {
    public static void main(String[] args) {
    Procesos arbol =new Procesos();
     int elemento;
     int opc2=0;
     int opc;
     Scanner LECTOR = new Scanner(System.in);
       do{ 
        System.out.println("\n-------Menu------");
        System.out.println("1. Insertar dato");
        System.out.println("2. Arbol normal y recorridos");
        System.out.println("3. Arbol espajo y recorridos");
         System.out.println("4. Salir del programa");
        System.out.println("¿Que desea realizar?");
        opc=LECTOR.nextInt();
        switch(opc){  
            case 1:  
            Scanner Lector2 = new Scanner(System.in);
            System.out.println("inserte numero");  
            elemento=Lector2.nextInt();            
            Nodo nodoActual=new Nodo(elemento);
            arbol.insertar(nodoActual);
            int elemento2=elemento;
           
            break;
            case 2:
            System.out.println("Arbol normal");
            System.out.println("Preorden: ");
            arbol.Preorden(arbol.nodoRaiz);
            System.out.println("\nPosOrden: ");
            arbol.PosOrden(arbol.nodoRaiz);
            System.out.println("\nIn-orden");
            arbol.inOrden(arbol.nodoRaiz);
            break; 
            case 3:
            System.out.println("Arbol espejo: ");
            System.out.println("Preorden: ");
            arbol.Preorden2(arbol.nodoRaiz);
            System.out.println("PosOrden");
            arbol.PosOrden2(arbol.nodoRaiz);
            System.out.println("In-orden");
            arbol.inOrden2(arbol.nodoRaiz);
            break;
            default:System.out.println("No existe esa opcion, por favor intente de nuevo");
        }
       }while(opc2!=4);



    }
    
}

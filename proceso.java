

package arboles;
public class Procesos {
    int cantidad=0;
    Nodo nodoPadre=null;
    Nodo nodoRaiz=null;
    
    Nodo nodoPadre2=null;
    Nodo nodoRaiz2=null;
    
    public boolean arbolVacio(){
    return nodoRaiz == null;
    }
    
    public void insertar(Nodo nodoActual){
     if(nodoPadre==null){
         nodoPadre=nodoActual;
         nodoRaiz=nodoActual;
         cantidad++;  
     }
     else{
         if(nodoActual.elemento<nodoPadre.elemento){
             if(nodoPadre.izquierdo==null){
                 nodoPadre.izquierdo=nodoActual;
                 nodoPadre=nodoRaiz;
                  cantidad++;  
         }
             else{
                 nodoPadre=nodoPadre.izquierdo;
                 insertar(nodoActual);
             }
         }
            else{
             if(nodoPadre.derecho==null){
              nodoPadre.derecho=nodoActual;
              nodoPadre=nodoRaiz;
              cantidad++;  
             }
             else{
              nodoPadre=nodoPadre.derecho;
              insertar(nodoActual);
             }     
        }    
     }
    } 
    public void insertarespejo(Nodo nodoActual){
     if(nodoPadre2==null){
         nodoPadre2=nodoActual;
         nodoRaiz2=nodoActual;
         cantidad++;  
     }
     else{
         if(nodoActual.elemento<nodoPadre2.elemento){
             if(nodoPadre2.izquierdo==null){
                 nodoPadre2.izquierdo=nodoActual;
                 nodoPadre2=nodoRaiz2;
                  cantidad++;  
         }
             else{
                 nodoPadre2=nodoPadre2.izquierdo;
                 insertar(nodoActual);
             }
         }
            else{
             if(nodoPadre2.derecho==null){
              nodoPadre2.derecho=nodoActual;
              nodoPadre2=nodoRaiz2;
              cantidad++;  
             }
             else{
              nodoPadre2=nodoPadre2.derecho;
              insertar(nodoActual);
             }     
        }    
     }
    } 
    
//Preorden
public void Preorden(Nodo nodoRaiz2){
    if(arbolVacio()){
        System.out.println("El arbol esta vacio");
    }
    else{
    if(nodoRaiz2==null){
     }
  else{
    System.out.print(nodoRaiz2.elemento+", ");
    Preorden(nodoRaiz2.izquierdo);
    Preorden(nodoRaiz2.derecho);
}
}
}

public void Preorden2(Nodo nodoRaiz2){
    if(arbolVacio()){
        System.out.println("El arbol esta vacio");
    }
    else{
    if(nodoRaiz2==null){
     }
  else{
    System.out.print(nodoRaiz2.elemento+", ");
    Preorden2(nodoRaiz2.derecho);
    Preorden2(nodoRaiz2.izquierdo);
}
}
}



//Inorden
public void inOrden(Nodo nodoRaiz2){
if(nodoRaiz2==null){
}
else{
    inOrden(nodoRaiz2.izquierdo);
    System.out.print(nodoRaiz2.elemento+", ");
    inOrden(nodoRaiz2.derecho);
}
}

public void inOrden2(Nodo nodoRaiz2){
if(nodoRaiz2==null){
}
else{
    inOrden2(nodoRaiz2.derecho);
     System.out.print(nodoRaiz2.elemento+", ");
    inOrden2(nodoRaiz2.izquierdo);

}
}


//recorrido postOrden
public void PosOrden(Nodo nodoRaiz2){
if(nodoRaiz2==null){
}
else{
    PosOrden(nodoRaiz2.izquierdo);
    PosOrden(nodoRaiz2.derecho);
    System.out.print(nodoRaiz2.elemento+", ");
}
}
public void PosOrden2(Nodo nodoRaiz2){
if(nodoRaiz2==null){
}
else{
    PosOrden2(nodoRaiz2.derecho);
    PosOrden2(nodoRaiz2.izquierdo);
    System.out.print(nodoRaiz2.elemento+", ");
    
}
}



}

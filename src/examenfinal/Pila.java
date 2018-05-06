/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal;

import java.util.Scanner;

/**
 *
 * @author Andrea Palomo
 */
public class Pila {

    Scanner teclado = new Scanner(System.in);
    private NodoPila cima;
    private NodoPila inicio, fin;
    int tamaño;
    String fondo;
    String buscador;

    public Pila() {
        inicio=null;
        fin=null;
        cima = null;
        tamaño = 0;
    }

    //La pila está vacía
    public boolean Vacia() {
        return cima == null;
    }

    //Insertar elemento en la pila
    public void push(String elemento, String elemento1) {
        NodoPila nuevo = new NodoPila(elemento, elemento1);
        nuevo.siguiente = cima;//para que el último elemento sea el que esté en la cima de la pila
        cima = nuevo;//el nuevo elemento o sea el último es nuestra cima
        tamaño++;//al ingresar un dato aumenta en uno el tamaño
        if(fin==null){
            fin=cima;
        }
    }
    public void pushinicio(String elemento, String elemento1){
        inicio=new NodoPila(elemento, elemento1,inicio);
        if(fin==null){
            fin=inicio;
        }
    }
    public void mostrarrecorrido(){
        NodoPila recorrer= inicio;
        while(recorrer!=null){
            System.out.print("[" + recorrer.dato + "," + recorrer.dato1 + "]=>");
            recorrer=recorrer.siguiente;
        }
    }
    public String popinicio(){
        String elemento=inicio.dato;
        String elemento1=inicio.dato1;
        if(inicio==fin){
            inicio=null;
            fin=null;
        }else{
            inicio=inicio.siguiente;
        }
        return elemento;
    }
    //Sacar un elemento de la pila
    public void pop() {
        String aux = cima.dato;
        String aux1 = cima.dato1;//toma el dato de la cima
        cima = cima.siguiente;//la cima será el siguiente del dato despúes de la cima
        tamaño--;//se reduce el tamaño de la pila
        System.out.println("[" + aux + "," + aux1 + "]");
    }

    // LA CIMA DE LA PILA
    public void cima() {
        System.out.println("[" + cima.dato + "," + cima.dato1 + "]");
    }

    //TAMAÑO DE LA PILA
    public int Pilatamaño() {
        return tamaño;
    }

    //MUESTRA TODOS LOS DATOS CONTENIDOS EN LA PILA
    public void mostrar() {
        NodoPila recolectar = cima;//contiene dato de la pila
        while (recolectar != null) {
            System.out.print("[ " + recolectar.dato + "," + recolectar.dato1 + "]=>");
            recolectar = recolectar.siguiente;
        }
        System.out.println();
    }

    //MUESTRA EL PRIMER DATO INGRESADO EN LA PILA
    public void mostrarfondo() {
        NodoPila primero = cima;//contiene dato de la pila
        if (tamaño == 1) {//busca el tamaño de la pila para mostrar ese dato en la posición
            System.out.println("{"+primero.dato + "," + primero.dato1+"]");//muestra el dato del fondo
        }else{
           System.out.println("{"+fin.dato+","+fin.dato1+"]");//muestra el dato del fondo  
        }
       
    }
    public boolean buscarelemento(String elemento){
        NodoPila temporal= inicio;
        System.out.println(temporal);
//        while (temporal != null && temporal.dato!=elemento ) {
//            temporal=temporal.siguiente1;
//        }
        
        return temporal!=null;
    }
    
    public boolean buscarel(String elemento) {
        NodoPila buscar = cima;
        while (buscar != null && buscar.dato != elemento) {
            buscar = buscar.siguiente;
        }
        
        return buscar == null;
    }
//        NodoPila buscar = cima;
//        while (buscar != null) {
//            System.out.print("[ " + buscar.dato + "," + buscar.dato1 + "]=>");
//        if(buscar.dato==elemento){
//            System.out.println("maria");
//        }
//                System.out.println(buscar.dato);
//                System.out.println("hola"+elemento);
//                buscar = buscar.siguiente;
//                
//            
//        }
        
//        return buscar!=null;
//        NodoPila recolectar = cima;//contiene dato de la pila
//        while (recolectar != null) {
//            recolectar = recolectar.siguiente;
//            if (recolectar.dato != elemento) {
//                System.out.println(recolectar.dato);
//                System.out.println(elemento);
//                System.out.println("ELEMENTO ENCONTRADO");
//                System.out.print("Ingrese el id a modificar del usuario:");
//                buscador= teclado.next();
//                recolectar.dato=buscador;
//                System.out.print("Ingrese el nombre a modificar del usuario:");
////                obus = buscar.next();
//                System.out.print("[ " + recolectar.dato + "," + recolectar.dato1 + "]=>");
//                
//                System.out.println("");
//            }
//        }
//    }
//        NodoPila buscar = cima;
//        boolean buscado=false;
//       
//        if( cima!=null){
//            while(buscar!=null && buscado!=true){
//                if(buscar.dato!=elemento){
//                    System.out.println("USUARIO ENCONTRADO");
//                    System.out.println("Ingrese el id a modificar: ");
//                    buscar.dato=teclado.next();
//                    System.out.println("MODIFICADO EXITOSAMENTE");
//                    buscado=true;
//                }
//                buscar=buscar.siguiente;
//            }
//            if(!buscado){
//                System.out.println("USUARIO NO ENCONTRADO");
//            }
//        }else{
//            System.out.println("PILA VACÍA");
//        }
//    }

    public void modificarel(String elemento, String i, String u) {
        NodoPila modificarse = cima;
        while (modificarse != null) {
            if (modificarse.dato != elemento) {
                modificarse.dato = i;
                modificarse.dato1 = u;
                
                System.out.println("[" + i + "," + u + "]");
                modificarse = modificarse.siguiente;
            }
        }
    }
}

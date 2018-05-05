/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal;

/**
 *
 * @author Andrea Palomo
 */
public class Pila {

    private NodoPila cima;
    int tamaño;
    String fondo;
    String buscador;

    public Pila() {
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
            System.out.println(primero.dato + "," + primero.dato1);
        }
    }

    public boolean buscarel(String elemento) {
        NodoPila buscar = cima;
        while (buscar != null && buscar.dato != elemento) {
            buscar = buscar.siguiente;
        }
        return buscar == null;
    }

    public void modificarel(String i, String u) {
        NodoPila modificarse = cima;
//        if(modificarse != null) {
//            i = modificarse.dato;
//            u = modificarse.dato1;
//            
//        }
        System.out.println("[" + i + "," + u + "]");
            if(i!=modificarse.dato){
                push(i, u);
            }
    }

}

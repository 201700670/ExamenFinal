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
    public Pila(){
        cima=null;
        tamaño=0;
    }
    //La pila está vacía
    public boolean Vacia(){
        return cima==null;
    }
    //Insertar elemento en la pila
    public void push(int elemento){
        NodoPila nuevo=new NodoPila(elemento);
        nuevo.siguiente=cima;//para que el último elemento sea el que esté en la cima de la pila
        cima=nuevo;//el nuevo elemento o sea el último es nuestra cima
        tamaño++;//al ingresar un dato aumenta en uno el tamaño
    }
    //Sacar un elemento de la pila
    public int pop(){
        int aux=cima.dato;//toma el dato de la cima
        cima=cima.siguiente;//la cima será el siguiente del dato despúes de la cima
        tamaño--;//se reduce el tamaño de la pila
        return aux;
    }
    // LA CIMA DE LA PILA
    public int cima(){
        return cima.dato;
    }
    //TAMAÑO DE LA PILA
    public int Pilatamaño(){
        return tamaño;
    }
    
}

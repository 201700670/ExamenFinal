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
public class NodoPila {
    String dato;
    String dato1;
    NodoPila siguiente;

    public NodoPila(String contenido, String nombre) {
        dato = contenido;
        dato1=nombre;
        siguiente=null;
    }
    
}

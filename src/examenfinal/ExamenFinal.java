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
public class ExamenFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Scanner ingreso = new Scanner(System.in);
        Scanner buscar = new Scanner(System.in);
        int opcion = 0;
        String objetoid, objetous, idusu, obid, obus;
        Pila pilaenlazada = new Pila();
        do {
            try {

                // Este es un menú de opciones que se mostrará al usuario
                System.out.println();
                System.out.println("MENÚ DE OPCIONES");
                System.out.println("1. APILAR USUARIO A LA PILA");
                System.out.println("2. DESAPILAR USUARIO A LA PILA ");
                System.out.println("3. MOSTRAR ELEMENTOS");
                System.out.println("4. TAMAÑO DE LA PILA");
                System.out.println("5. MOSTRAR FONDO");
                System.out.println("6. BUSCAR Y MODIFICAR");
                System.out.println("7. MOSTRAR CIMA");
                System.out.println("8. SALIR");
                System.out.print("¿Qué opción desea elegir (1-5)? ");
                opcion = entrada.nextInt(); //se ingresa el número de la opción del menú
                System.out.println("");
                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese id del usuario: ");
                        objetoid = ingreso.next();
                        System.out.print("Ingrese nombre de usuario: ");
                        objetous = ingreso.next();
                        pilaenlazada.push(objetoid, objetous);
                        pilaenlazada.pushinicio(objetoid, objetous);
                        break;
                    case 2:
                        if (!pilaenlazada.Vacia()) {

                            System.out.print("El elemento obtenido a sacar es: ");
                            pilaenlazada.pop();

                        } else {
                            System.out.println("LA PILA ESTÁ VACÍA");
                        }
                        break;
                    case 3:
                        if (!pilaenlazada.Vacia()) {
                            pilaenlazada.mostrar();
                        } else {
                            System.out.println("LA PILA ESTÁ VACÍA");
                        }
                        break;
                    case 4:
                        System.out.println("El tamaño de la pila es: " + pilaenlazada.Pilatamaño());
                        break;
                    case 5:
                        if (!pilaenlazada.Vacia()) {
                            System.out.print("El el usuario del fondo de la pila es: ");
                            pilaenlazada.mostrarfondo();

                        } else {
                            System.out.println("LA PILA ESTÁ VACÍA");
                        }
                        break;
                    case 6:
                        if (!pilaenlazada.Vacia()) {

                            System.out.print("Ingrese el id del usuario: ");
                            idusu = buscar.next();
//                        pilaenlazada.buscarelemento(idusu);
//                        if(pilaenlazada.buscarelemento(idusu)==false){
//                            System.out.println("El usuario: "+idusu+"está en la lista");
//                        }else{
//                            System.out.println("No está en la lista");
//                        }

                            if (pilaenlazada.buscarel(idusu)) {
                                System.out.println("SE ENCUENTRA EN LA LISTA");
                                System.out.print("Ingrese el id a modificar del usuario:");
                                obid = buscar.next();
                                System.out.print("Ingrese el nombre a modificar del usuario:");
                                obus = buscar.next();
                                pilaenlazada.modificarel(idusu, obid, obus);

                            } else {
                                System.out.println("NO SE ENCUENTRA EN LA LISTA");
                                System.out.println(pilaenlazada.buscarel(idusu));
                            }
                        } else {
                            System.out.println("LA PILA ESTÁ VACÍA");
                        }
                        break;
                    case 7:
                        if (!pilaenlazada.Vacia()) {
                            System.out.println("El usuario de la cima es: ");
                            pilaenlazada.cima();
                        } else {
                            System.out.println("LA PILA ESTÁ VACÍA");
                        }
                        break;
                    case 8:
                        System.out.println("GRACIAS POR UTILIZAR EL PROGRAMA");
                        System.exit(0); //salir del programa
                        break;
                    default:
                        System.exit(0);
                        break;
                }
            } catch (NumberFormatException n) {
                System.out.println("ERROR" + n.getMessage());
            }
        } while (opcion != 8);
    }

}

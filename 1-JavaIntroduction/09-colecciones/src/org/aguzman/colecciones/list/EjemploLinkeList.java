package org.aguzman.colecciones.list;

import org.aguzman.colecciones.modelo.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EjemploLinkeList {
    public static void main(String[] args) {
        //Coleccion Api definida para
        LinkedList<Alumno> enlazada = new LinkedList<>();
        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println("está vacía = " + enlazada.isEmpty());
        enlazada.add(new Alumno("Pato", 5));
        enlazada.add(new Alumno("Cata", 6));
        enlazada.add(new Alumno("Luci", 4));
        enlazada.add(new Alumno("Jano", 7));
        enlazada.add(new Alumno("Andres", 3));

        System.out.println(enlazada + ", size = " + enlazada.size());

        enlazada.addFirst(new Alumno("Zeus", 5));
        enlazada.addLast(new Alumno("Atenea", 6));
        System.out.println(enlazada + ", size = " + enlazada.size());

        System.out.println("Primero = " + enlazada.getFirst());//Nos dice cual es el primero
        System.out.println("Último = " + enlazada.getLast());//Nos dice cual es el ultimo
        System.out.println("Indice 2 = " + enlazada.get(2));

        //Alumno zeus = enlazada.pop();
        //enlazada.pollLast();
        enlazada.removeFirst();
        enlazada.removeLast();
        System.out.println(enlazada + ", size = " + enlazada.size());//vemos el tamaño

        enlazada.remove(new Alumno("Jano", 7));
        System.out.println(enlazada + ", size = " + enlazada.size());

        Alumno a = new Alumno("Lucas", 5);//Agregamos un ultimo registro
        enlazada.addLast(a);
        System.out.println("Indice de Lucas = " + enlazada.indexOf(a));//study

        enlazada.remove(2);
        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println("Indice de Lucas = " + enlazada.indexOf(a));

        enlazada.set(3, new Alumno("Lalo", 7));
        System.out.println(enlazada + ", size = " + enlazada.size());

        ListIterator<Alumno> li = enlazada.listIterator();
        //Registro con diferentes tipos de datos
        //Interfaz que hereda de otra interfaz
        //Su aplicacion es importante , es un verificacion de registro por registro
        //Carga en memoria todos los registros que esta iterando
        //iteramos los datos de list
        while(li.hasNext()){//li.hasNext  define de que manera se van a imprimir los registros
            Alumno alumno = li.next();//next verifica los datos
            System.out.println(alumno);//Los imprime tal como estan
        }


        System.out.println("=================== Previous");//lo imprime del 7 hacia abajo
        while(li.hasPrevious()){
            Alumno alumno = li.previous();
            System.out.println(alumno);
        }

    }
}

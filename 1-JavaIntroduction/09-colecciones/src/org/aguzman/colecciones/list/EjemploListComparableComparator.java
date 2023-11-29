package org.aguzman.colecciones.list;

import org.aguzman.colecciones.modelo.Alumno;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import static java.util.Comparator.comparing;

public class EjemploListComparableComparator {
    public static void main(String[] args) {
        //instancia la clase que viene de
        List<Alumno> sa=new LinkedList<>();
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus2", 2));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Lucas", 2));
        sa.add(new Alumno("Lucas", 3));

        // Collections.sort(sa, (a, b) -> b.getNota().compareTo(a.getNota()));
        //sa.sort((a, b) -> a.getNota().compareTo(b.getNota()));

        sa.sort(comparing(Alumno::getNombre).reversed());
        //Reversed los esta ordenando por orden alfabetico de reversa es decir de z , a
        //manipulacion de datos con los colecction
        //Foreach una manera más corta de escribirlo, utiliza el metodo reversed
        //Datos no repetidos con set
        //DAtos repetidos con un array o array list

        System.out.println(sa);

        System.out.println("Iterando usando Stream forEach");
        sa.forEach(System.out::println);


    }
}

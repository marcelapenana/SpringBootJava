package org.aguzman.colecciones.list;

import org.aguzman.colecciones.modelo.Alumno;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EjemploArrayList {
    public static void main(String[] args) {
        List<Alumno>al=new ArrayList<>();
        System.out.println(al+", size= "+al.size());//metodos del array list para agregar
        System.out.println("Esta vacia: "+al.isEmpty());
        al.add(new Alumno("Cata", 6));//add datos
        al.add(new Alumno("Pato", 6));
        al.add(new Alumno("Luci", 6));

        al.add(2, new Alumno("Jano", 7));//Directamente agregamos un alumno y colocarlo en un index preciso

        al.set(3, new Alumno("Andres", 3));

        System.out.println(al+", size= "+al.size() );

        al.remove(new Alumno("Jano", 7));
        al.remove(0);
        System.out.println(al+", size= "+al.size() );

        boolean b=al.contains(new Alumno("Cata", 6));
        System.out.println("La lista contiene a cata: "+b);
        //Convertir el array  a arraylist y lo recorre
        //Collection son más utilizados en base de datos
        //Más sencillo para convertir inf al lado de  colecction para manejarlo
        Object a[]=al.toArray();

        for (int i=0; i<a.length; i++){
            System.out.println("Desde el arreglo"+a[i]);
        }
    }
}

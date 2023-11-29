package org.aguzman.colecciones.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        System.out.println(hs.add("uno"));
        System.out.println(hs.add("dos"));
        System.out.println(hs.add("tres"));
        System.out.println(hs.add("cuatro"));
        System.out.println(hs.add("siete"));
        System.out.println(hs);

        boolean b=hs.add("tres");
        System.out.println("Permite elementos duplicados");
        //No permite elementod duplicados
        //SEt ordena y verifica qu no haya duplicados
        System.out.println(hs);
    }
}

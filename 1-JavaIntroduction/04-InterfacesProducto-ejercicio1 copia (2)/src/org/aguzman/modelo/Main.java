package org.aguzman.modelo;

import static org.aguzman.modelo.IElectronico.ImprimirElectronico;
import static org.aguzman.modelo.ILibro.ImprimirLibro;

public class Main {
    public static void main(String[] args) {
       TVLcd tv=new TVLcd("LG", 6);
       IPhone ip=new IPhone("Apple", "CDs","Negro");

        ImprimirElectronico(tv);
        ImprimirElectronico(ip);

        ImprimirElectronico(new IElectronico() {});

        Libro li=new Libro(12,null,"Paulo Martinez","EL amanecer","Monte Carlo");
        ImprimirLibro(new ILibro(){});
        ImprimirLibro(li);

        Comics co=new Comics(18,null,"Sandi Monterrey","Tu y yo","san Martin", "Juan Escobar");
        ImprimirLibro(co);
    }
}

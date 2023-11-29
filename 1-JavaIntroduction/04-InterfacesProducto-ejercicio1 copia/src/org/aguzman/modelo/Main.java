package org.aguzman.modelo;
import static org.aguzman.modelo.IElectronico.*;
public class Main {
    public static void main(String[] args) {
       TVLcd tv=new TVLcd("LG", 6);
       IPhone ip=new IPhone("Apple", "CDs","Negro");

        ImprimirElectronico(tv);
        ImprimirElectronico(ip);

        ImprimirElectronico(new IElectronico() {
            @Override
            public String  ImprimirElectronico(){
                return "";
            }
        });

    }
}

package org.aguzman.modelo;

public interface IElectronico {
    String TEXTO_DEFECTO = "Imprimiendo un valor por defecto";

    default  String  ImprimirElectronico(){
        return TEXTO_DEFECTO;
    }

    static void  ImprimirElectronico(IElectronico iElectronico){
        System.out.println(iElectronico. ImprimirElectronico());
    }


}

package org.aguzman.modelo;

public interface ILibro {
    String TEXTO_DEFECTO = "LIBROS";
    default  String  ImprimirLibro(){
        return TEXTO_DEFECTO;
    }
    static void  ImprimirLibro(ILibro iLibro){
        System.out.println(iLibro.ImprimirLibro());
    }

}

package com.springbootexamen.com.examen2;

import com.springbootexamen.com.examen2.models.domain.ItemFactura;
import com.springbootexamen.com.examen2.models.domain.Producto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

/*    @Bean("itemsFactura")
    public List<ItemFactura> registrarItems(){
        Producto producto1 = new Producto("Camara Sony", 100);
        Producto producto2 = new Producto("Bicicleta Bianchi aro 26", 200);

        ItemFactura linea1 = new ItemFactura(producto1, 2);
        ItemFactura linea2 = new ItemFactura(producto2, 4);

        return Arrays.asList(linea1, linea2);
    }*/

    @Bean("itemsFacturaOficina")
    @Primary
    public List<ItemFactura> registrarItemsOficina(){
        Producto producto1 = new Producto("Cuidado bucal", "Pasta de dientes", 250);
        Producto producto2 = new Producto("Cuidado Corporal","Crema de manos", 500);
        //Producto producto3 = new Producto("Impresora HP Multifuncional", 80);
        //Producto producto4 = new Producto("Escritorio Oficina", 300);

        ItemFactura linea1 = new ItemFactura(producto1, 2);
        ItemFactura linea2 = new ItemFactura(producto2, 1);
        //ItemFactura linea3 = new ItemFactura(producto3, 1);
        //ItemFactura linea4 = new ItemFactura(producto4, 1);

        return Arrays.asList(linea1, linea2);
    }
}

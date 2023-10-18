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
    @Bean("itemsFacturaOficina")
    @Primary
    public List<ItemFactura> registrarItemsOficina(){
        Producto producto1 = new Producto("Cuidado bucal", "Pasta de dientes", 3);
        Producto producto2 = new Producto("Cuidado Corporal","Crema de manos", 12);
        Producto producto3 = new Producto("Cuidado bucal", "Cepillo de dientes", 4);
        Producto producto4 = new Producto("Cuidado Corporal", "Crema de limpieza facial", 14);

        ItemFactura linea1 = new ItemFactura(producto1, 2);
        ItemFactura linea2 = new ItemFactura(producto2, 3);
        ItemFactura linea3 = new ItemFactura(producto3, 4);
        ItemFactura linea4 = new ItemFactura(producto4, 1);

        return Arrays.asList(linea1, linea2, linea3, linea4);


    }



}

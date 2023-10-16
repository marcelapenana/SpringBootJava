package com.bolsadeideas.springboot.di.app;

import com.bolsadeideas.springboot.di.app.models.domain.ItemFactura;
import com.bolsadeideas.springboot.di.app.models.domain.Producto;
import com.bolsadeideas.springboot.di.app.service.IServicio;
import com.bolsadeideas.springboot.di.app.service.MiServicio;
import com.bolsadeideas.springboot.di.app.service.MiServicioComplejo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    @Primary
    public IServicio registrarMiServicio(){
        return new MiServicio();
    }
    @Bean("miServicioComplejo")
    public IServicio registrarMiServicioComplejo(){
        return new MiServicioComplejo();
    }

    @Bean("itemsFactura")
    public List<ItemFactura> registrarItems(){
        Producto producto1=new Producto("Camara sony", 100);
        Producto producto2=new Producto("Bici sony", 200);

        ItemFactura linea1=new ItemFactura(producto1, 2);
        ItemFactura linea2=new ItemFactura(producto2, 4);
        return Arrays.asList(linea1, linea2);

    }

    @Bean("itemsFacturaOficina")
    public List<ItemFactura> registrarItemsOficina(){
        Producto producto1=new Producto("monitor lg", 180);
        Producto producto2=new Producto("Notebook Asus", 500);
        Producto producto3=new Producto("Impresora", 180);
        Producto producto4=new Producto("Escritorio", 500);

        ItemFactura linea1=new ItemFactura(producto1, 1);
        ItemFactura linea2=new ItemFactura(producto2, 4);
        ItemFactura linea3=new ItemFactura(producto3, 2);
        ItemFactura linea4=new ItemFactura(producto4, 7);

        return Arrays.asList(linea1, linea2, linea3, linea4);

    }
}

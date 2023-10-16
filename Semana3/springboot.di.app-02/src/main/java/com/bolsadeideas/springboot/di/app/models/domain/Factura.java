package com.bolsadeideas.springboot.di.app.models.domain;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.io.Serializable;
import java.util.List;

@Component
@RequestScope
public class Factura  implements Serializable {

    //inyeccion de dependencia
    //osc: el servicio del controlador no se instancia si no que con autorride nos permite inyectar y tomar el
    // componente (clase) que vamos a utilizar
    //sau: ya no es necesario instanciar las clases, con component sprin lo hace por nosotros
    //melga: La notacion autowired nos permite automaticamente podemos acceder a los objetos automaticamente por medio de spring
    //
    private static final long serialVersionUID =9460043571281469L;
    @Value("${factura.descripcion}")
    private String descripcion;
    @Autowired
    private Cliente cliente;
    private List<ItemFactura> items;
    @PostConstruct
    public void inicializar(){
        cliente.setNombre(cliente.getNombre().concat("").concat("José"));
        descripcion=descripcion.concat("Del cliente: ").concat(cliente.getNombre());

    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemFactura> getItems() {
        return items;
    }

    public void setItems(List<ItemFactura> items) {
        this.items = items;
    }

    @PreDestroy
    public void destruir(){
        System.out.println("Factura destruida ".concat(descripcion));


    }

}

package com.bolsadeideas.springboot.di.app.service;
//con lo comentado se puede definir la clase con beans
import org.springframework.stereotype.Component;
//definimos como componente
//@Component("MiServicioSimple") //este objeto se define una sola vez, se puede usar @service
public class MiServicio implements IServicio {
    //En este momento estamos inyectando por medio de una interfaz Iservici, inyectando a travez del tipo generico
    //sin usar la implementacion concreta con esto podemos tener varias clases que implementan la inerfaz y
    //a travez del selector @qualifier podemos selccionar que
    //implementacion concreta queremos utilizar e inyectar en el controlador
    //aqui iran los metodos para mostrar , mod, eliminar
    //con objeto mapeados

    //se pueden tener muchos controladores que tengan la
    //clase miservicio
    //implementamos el metodo y override dice que es implementacion de un padre y lo estamos sobreescribiendo
    @Override
    public String operacion() {
        return "ejecutando algún proceso importante simple ...";
    }
}

package com.bolsadeideas.springboot.web.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
	@PropertySource("classpath:textos.properties")//esta es la ubicacion del archivo
})
public class TextosPropertiesConfig {
	//creamos esta clase para configurar el archivo de textos propierties

}

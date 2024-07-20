package com.example.runa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
@SpringBootApplication
public class RunaApplication {
	//Agregando comentario
	public static void main(String[] args) {
		SpringApplication.run(RunaApplication.class, args);

		Bicicleta bicicleta = new Bicicleta();
		bicicleta.mover();
		bicicleta.claxon();



		Coche coche = new Coche();
		coche.mover();
		coche.claxon();
		coche.cargarCombustible();
	}

}

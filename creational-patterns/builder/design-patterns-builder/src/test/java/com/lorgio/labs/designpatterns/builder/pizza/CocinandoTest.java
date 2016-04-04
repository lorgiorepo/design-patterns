package com.lorgio.labs.designpatterns.builder.pizza;

import org.junit.Test;

import static junit.framework.Assert.*;

public class CocinandoTest {

	@Test
	public void cocinandoPizzaHawai(){
		
		Cocina cocina = new Cocina();
		PizzaBuilder hawaiPizzaBuilder = new HawaiPizzaBuilder();
		cocina.setPizzaBuilder(hawaiPizzaBuilder);
		cocina.construirPizza();
		Pizza pizza = cocina.getPizza();
		assertNotNull("No se pudo construir la pizza", pizza);
	}
	
	@Test
	public void cocinandoPizzaPicante(){
		
		Cocina cocina = new Cocina();
		PizzaBuilder picantePizzaBuilder = new PicantePizzaBuilder();
		cocina.setPizzaBuilder(picantePizzaBuilder);
		cocina.construirPizza();
		Pizza pizza = cocina.getPizza();
		assertNotNull("No se pudo construir la pizza", pizza);
	}
}

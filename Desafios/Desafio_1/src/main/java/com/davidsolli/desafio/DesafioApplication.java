package com.davidsolli.desafio;

import com.davidsolli.desafio.entities.Order;
import com.davidsolli.desafio.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//Exemplo 1
		Order order = new Order(1034, 150.00, 20.00);
		System.out.println("Pedido código " + order.getCode());
		System.out.println("Valor total: " + orderService.total(order) + "\n");

		//Exemplo 2
		Order order2 = new Order(2282, 800.00, 10.00);
		System.out.println("Pedido código " + order2.getCode());
		System.out.println("Valor total: " + orderService.total(order2) + "\n");

		//Exemplo 3
		Order order3 = new Order(1309, 95.90, 0.00);
		System.out.println("Pedido código " + order3.getCode());
		System.out.println("Valor total: " + orderService.total(order3) + "\n");
	}
}

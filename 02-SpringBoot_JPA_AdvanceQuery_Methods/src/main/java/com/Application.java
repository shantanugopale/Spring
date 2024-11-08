package com;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.model.Product;
import com.service.IProductService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println("Hi");
		IProductService service = context.getBean(IProductService.class);

//		getAllData(service);

//		getFirstPage(service);

//		getSecondPage(service);

		List<Product> pList = service.lowToHigh();
		System.out.println(pList);
	}

	private static void getSecondPage(IProductService service) {
		List<Product> pList = service.getSecondPage();
		System.out.println(pList);
	}

	private static void getFirstPage(IProductService service) {
		List<Product> pList = service.getFirstPage();
		System.out.println(pList);
	}

	private static void getAllData(IProductService service) {
		List<Product> pList = service.getAllData();
		System.out.println(pList);
	}

}

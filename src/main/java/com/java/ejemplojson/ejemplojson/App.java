package com.java.ejemplojson.ejemplojson;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
	public static void main(String[] args) {
		ArrayList<String> arrayString = new ArrayList<String>();
		arrayString.add("1");
		arrayString.add("2");
		arrayString.add("3");
		arrayString.add("4");
		arrayString.add("5");
		arrayString.add("6");
		arrayString.add("7");
		arrayString.add("8");
		arrayString.add("9");
		arrayString.add("10");
		String resultado = "";

		ObjectMapper objMap = new ObjectMapper();
		try {
			resultado = objMap.writeValueAsString(getBeans());
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		System.out.println(resultado);
	}

	public static List<BeanDato> getBeans() {
		List<BeanDato> beans = new ArrayList<BeanDato>();
		int menor = 1;
		int mayor = 100;
		Random r = new Random();

		for (int i = 0; i < 100; i++) {
			int v1, v2, v3;
			v1 = r.nextInt(mayor - menor) + mayor;
			v2 = r.nextInt(mayor - menor) + mayor;
			v3 = r.nextInt(mayor - menor) + mayor;
			beans.add(new BeanDato(String.format("%d", v1), 
								   String.format("%d", v2), 
								   String.format("%d", v3)));
		}
		return beans;
	}
}

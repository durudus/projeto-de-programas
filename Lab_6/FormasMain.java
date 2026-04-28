package br.edu.icomp.ufam.lab_heranca;

import java.util.ArrayList;

public class FormasMain {
	public static void main(String[] args) {
		ArrayList<FormaGeometrica> formas = new ArrayList<>();
		
		Circulo circulo = new Circulo(14, 7, 6);
		Retangulo retangulo = new Retangulo(12, 5, 2, 7);
		Quadrado quadrado = new Quadrado(5, 9, 5.0);
		
		formas.add(circulo);
		formas.add(retangulo);
		formas.add(quadrado);
		
		for (FormaGeometrica forma : formas) {
            System.out.println(forma);
        }
	}
}
package exercicioLogicaProgramacao10;
import java.util.Scanner;

public class Validar {
	private float lado1;
	public float lado2;
	public float lado3;
	public Scanner Leitor = new Scanner(System.in);


	public void setLados() {
		
		System.out.println("lado A: ");
		lado1 = Leitor.nextFloat();
		System.out.println("lado B: ");
		lado2 = Leitor.nextFloat();
		System.out.println("lado C: ");
		lado3 = Leitor.nextFloat();	
	}
	public void lados() {
		
		if (lado1 + lado2 > lado3)
		System.out.println("É um triangulo!!");
		else
		System.out.println("não é um triangulo!!");
		
	}
}
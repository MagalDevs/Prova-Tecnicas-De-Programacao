package main;

import java.util.Scanner;

public class Pessoa {
	private String nome;
	private double altura;
	private double peso;
	
	//Construtor
	public Pessoa(String nome, double altura, double peso) {
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
	}
	
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	//métodos
	public void calculeImc(double peso, double altura) {
		double imc = peso / (altura * altura);
		if(imc >= 18.5 && imc <= 24.9) {
			System.out.println("Peso Normal");
		}else {
			System.out.print("Sobrepeso");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("Deseja cadastrar uma Pessoa?(S/N)");
			String menu = scanner.next().toLowerCase();
			
			switch(menu) {
				case "s":
					scanner.nextLine(); 
					
					System.out.print("Digite o Nome:");
					String nome = scanner.nextLine();
					System.out.println("");
					
					Double peso = 0.0;
					while(true) {
						System.out.print("Digite o Peso(0kg - 200kg):");
						peso = scanner.nextDouble();
						if(peso > 200 || peso < 0) {
							System.out.println("Peso Inválido, digite novamente");
							continue;
						}else {
							break;
						}
					}
					System.out.println("");
					
					System.out.print("Digite o altura(ex: 1,70):");
					Double altura = scanner.nextDouble();
					System.out.println("");
					
					Pessoa pessoa = new Pessoa(nome, altura, peso);
					
					System.out.print("O Imc do " + pessoa.getNome() + " é: ");
					pessoa.calculeImc(pessoa.getPeso(), pessoa.getAltura());
					System.out.println("");
					
					break;
					
				case "n":
					System.out.println("Encerrando Programa...");
					return;
					
				default:
					System.out.println("Opção inválida, Digite ou S ou N");
					break;
			}
			
		}
		
	}
}

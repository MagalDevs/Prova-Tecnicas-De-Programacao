package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        
        String menuEnunciado = """
                1 - Adicionar Nome
                2 - Apagar Nome
                3 - Ver Tamanho da Lista
                4 - Pesquisar se uma Pessoa está na Lista
                5 - Imprimir Lista
                6 - Sair
                
                Insira aqui:
                """;
        
        while (true) {
            System.out.print(menuEnunciado);
            String menu = scanner.nextLine();
            System.out.println("");
            
            switch (menu) {
                case "1":
                    while (true) {
                        System.out.print("Nome: ");
                        String nomeAdd = scanner.nextLine().toLowerCase();  // Usar nextLine para capturar o nome completo
                        
                        nomes.add(nomeAdd);
                        
                        System.out.println("");
                        System.out.print("Deseja adicionar mais algum nome? (S/N): ");
                        String menuNome = scanner.nextLine().toLowerCase();
                        
                        if (menuNome.equals("n")) {  // Comparação de strings usando equals
                            break;
                        }
                    }
                    break;
                    
                case "2":
                    System.out.print("Qual nome remover: ");
                    String nomeRemover = scanner.nextLine().toLowerCase();  // Usar nextLine para capturar o nome completo
                    
                    if (nomes.contains(nomeRemover)) {
                        nomes.remove(nomeRemover);
                        System.out.println("Nome removido.");
                    } else {
                        System.out.println(nomeRemover + " não está na lista.");
                    }
                    break;
                
                case "3":
                    System.out.println("Tamanho da lista: " + nomes.size());
                    break;
                    
                case "4":
                    System.out.print("Qual nome pesquisar: ");
                    String nomePesquisar = scanner.nextLine().toLowerCase();  // Usar nextLine para capturar o nome completo
                    
                    if (nomes.contains(nomePesquisar)) {
                        System.out.println(nomePesquisar + " está na lista.");
                    } else {
                        System.out.println(nomePesquisar + " não está na lista.");
                    }
                    break;
                    
                case "5":
                    System.out.println("Lista de Nomes:");
                    for (int i = 0; i < nomes.size(); i++) {
                        System.out.println((i + 1) + " - " + nomes.get(i));
                    }
                    break;
                    
                case "6":
                    System.out.println("Encerrando programa...");
                    return;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            System.out.println("");
        }
    }
}

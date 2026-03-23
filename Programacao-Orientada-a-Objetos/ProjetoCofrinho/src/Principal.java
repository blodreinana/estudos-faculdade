// Aluna: Allana Helena Campos Albino
// RU:  5349178

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();
        int opcao = -1;
        System.out.println("Seja bem-vinda(o) ao seu cofrinho!");
        
        while (opcao != 0) {
            System.out.println("Menu Cofrinho:");
            System.out.println("1 - Adicionar Moeda");
            System.out.println("2 - Remover Moeda");
            System.out.println("3 - Listar Moedas");
            System.out.println("4 - Calcular Total Convertido para Real");
            System.out.println("0 - Encerrar");
            System.out.print("Opcao: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Escolha a Moeda:");
                System.out.println("1 - Real");
                System.out.println("2 - Dolar");
                System.out.println("3 - Euro");
                System.out.print("Opcao: ");
                int tipoMoeda = scanner.nextInt();

                System.out.print("Digite o valor: ");
                double valor = scanner.nextDouble();

                Moeda moeda = null;
                if (tipoMoeda == 1) {
                    moeda = new Real(valor);
                } else if (tipoMoeda == 2) {
                    moeda = new Dolar(valor);
                } else if (tipoMoeda == 3) {
                    moeda = new Euro(valor);
                } else {
                    System.out.println("Moeda invalida.");
                }

                if (moeda != null) {
                    cofrinho.adicionar(moeda);
                    System.out.println("Moeda adicionada.");
                }

            } else if (opcao == 2) {
                System.out.println("Escolha a Moeda a ser removida:");
                System.out.println("1 - Real");
                System.out.println("2 - Dolar");
                System.out.println("3 - Euro");
                System.out.print("Opcao: ");
                int tipoMoeda = scanner.nextInt();

                System.out.print("Digite o valor: ");
                double valor = scanner.nextDouble();

                Moeda moeda = null;
                if (tipoMoeda == 1) {
                    moeda = new Real(valor);
                } else if (tipoMoeda == 2) {
                    moeda = new Dolar(valor);
                } else if (tipoMoeda == 3) {
                    moeda = new Euro(valor);
                } else {
                    System.out.println("Moeda invalida.");
                }

                if (moeda != null) {
                    cofrinho.remover(moeda);
                    System.out.println("Moeda removida.");
                }

            } else if (opcao == 3) {
                cofrinho.listagemMoedas();

            } else if (opcao == 4) {
                double total = cofrinho.totalConvertido();
                System.out.println("Total convertido para Real: " + total);

            } else if (opcao != 0) {
                System.out.println("Opcao invalida.");
            }
        }

        System.out.println("Fim.");
        scanner.close();
    }
}
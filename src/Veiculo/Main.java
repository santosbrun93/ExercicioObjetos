package Veiculo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem vindo ao Cadastro de Veículos !!");
        System.out.println("Insira o modelo do veículo: ");
        String modelo1 = entrada.nextLine().toUpperCase();

        System.out.println("Insira a marca do veículo: ");
        String marca1 = entrada.nextLine().toUpperCase();

        System.out.println("Insira o ano do veículo: ");
        int ano1 = entrada.nextInt();

        System.out.println("Insira a velocidade máxima do veículo: ");
        double velocidadeMaxima1 = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Insira a cor do veículo: ");
        String cor1 = entrada.nextLine();

        System.out.println("Insira o valor da Tabela Fipe do veículo: ");
        double valorFipe1 = entrada.nextDouble();


        Veiculo veiculo1 = new Veiculo(modelo1, marca1, ano1, velocidadeMaxima1, cor1, valorFipe1);


        System.out.println(veiculo1.toString());

        int opcao;
        do {
            System.out.println("\n Insira a opção desejada: ");
            System.out.println("1 - Você deseja acelerar o veiculo ? ");
            System.out.println("2 - Você deseja freiar o veículo ? ");
            System.out.println("0 - Sair ? ");

            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Insira a velocidade que deseja acelerar: ");
                    double velocidadeInformada = entrada.nextDouble();
                    veiculo1.acelerarCarro(veiculo1, velocidadeInformada);
                    break;
                case 2:
                    veiculo1.frearCarro(veiculo1);
                    break;

                case 0:
                    System.out.println("Good bye!!");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }


        } while (opcao != 0);
    }
}

package ExerciciosAula15_02.Funcionario;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome;

        String sobrenome;

        String cidade;

        String estado;

        int horasTrabalhadas;

        double valorHora;


        System.out.println("Insira o nome do funcionário: ");
        nome = entrada.nextLine();

        System.out.println("Insira o sobrenome do funcionário: ");
        sobrenome = entrada.nextLine();

        System.out.println("Insira a Cidade do funcionário: ");
        cidade = entrada.nextLine();

        System.out.println("Insira o Estado do funcionário: ");
        estado = entrada.nextLine();

        System.out.println("Insira a quantidade de horas do funcionário: ");
        horasTrabalhadas = entrada.nextInt();

        System.out.println("Insira o valor por hora do funcionário: ");
        valorHora = entrada.nextDouble();

        Funcionario numero1 = new Funcionario(nome, sobrenome, cidade, estado, horasTrabalhadas, valorHora);

        int opcao = 0;

        do {



            System.out.println("1 - Incrementar horas trabalhadas no mês: ");
            System.out.println("2 - Alterar valor hora: ");
            System.out.println("3 - Calcular valor do salário mensal: ");
            System.out.println("0 - Sair ");
            System.out.println("Insira a opção desejada: ");
            opcao = entrada.nextInt();


            switch(opcao) {

                case 1:
                    int quantidadeHoras = 0;
                    System.out.println("Insira a quantidade de horas para incrementar: ");
                    quantidadeHoras = entrada.nextInt();
                    numero1.incrementarHoras( quantidadeHoras ,  numero1);
                    break;
                case 2:
                    double valorNovo = 0;
                    System.out.println("Insira o novo valor da hora trabalhada: ");
                    quantidadeHoras = entrada.nextInt();
                    numero1.alterarValorHora(numero1, quantidadeHoras);
                    break;
                case 3:
                    double salarioFinal = 0;
                    salarioFinal = numero1.calcularSalario(numero1);
                    System.out.println("O valor do salário do Funcionário "+numero1.getNome()+" é R$:"+salarioFinal);
                    break;
                case 0:
                    System.out.println("Fim do programa!");
                    break;
            }
        }while(opcao != 0 );
    }
}

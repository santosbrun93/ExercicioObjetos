package MainExerciciosAula17_02;

import ExerciciosAula17_02.Operario;

import java.util.Scanner;

public class MainOperario {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome = entrada.nextLine();
        String endereco = entrada.nextLine();
        String telefone = entrada.nextLine();
        entrada.nextLine();
        int codigoSetor = entrada.nextInt();
        double salarioBase = entrada.nextDouble();
        double imposto = entrada.nextDouble();
        double valorProducao = entrada.nextDouble();
        double comissao = entrada.nextDouble();

        Operario oper = new Operario(nome, endereco, telefone, codigoSetor, salarioBase, imposto, valorProducao, comissao  );
    }
}

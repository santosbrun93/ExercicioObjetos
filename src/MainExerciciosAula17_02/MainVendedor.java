package MainExerciciosAula17_02;

import java.util.Scanner;

public class MainVendedor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome = entrada.nextLine();
        String endereco = entrada.nextLine();
        String telefone = entrada.nextLine();
        entrada.nextLine();
        int codigoSetor = entrada.nextInt();
        double salarioBase = entrada.nextDouble();
        double imposto = entrada.nextDouble();
    }
}

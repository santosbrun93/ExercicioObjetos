package Livro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem vindo ! ");
        System.out.println("Insira o título do Livro: ");
        String tituloLivro = entrada.nextLine();

        System.out.println("Insira o nome do leitor: ");
        String nomeLeitor = entrada.nextLine();

        System.out.println("Insira a quantidade total de páginas: ");
        int paginasTotais = entrada.nextInt();

        System.out.println("Insira a quantidade de páginas que já foram lidas: ");
        int paginasLidas = entrada.nextInt();

        Livro livro1 = new Livro(tituloLivro, nomeLeitor, paginasTotais, paginasLidas);


        System.out.println(livro1.toString());
        livro1.verificaProgresso(livro1);





    }
}

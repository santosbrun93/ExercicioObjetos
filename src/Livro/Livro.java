package Livro;

public class Livro {

    String titulo;

    String nomeLeitor;

    int quantidadePaginasTotal;

    int quantidadePaginasLidas;

    public Livro() {

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNomeLeitor() {
        return nomeLeitor;
    }

    public void setNomeLeitor(String nomeLeitor) {
        this.nomeLeitor = nomeLeitor;
    }

    public int getQuantidadePaginasTotal() {
        return quantidadePaginasTotal;
    }

    public void setQuantidadePaginasTotal(int quantidadePaginasTotal) {
        this.quantidadePaginasTotal = quantidadePaginasTotal;
    }

    public int getQuantidadePaginasLidas() {
        return quantidadePaginasLidas;
    }

    public void setQuantidadePaginasLidas(int quantidadePaginasLidas) {
        this.quantidadePaginasLidas = quantidadePaginasLidas;
    }

    public Livro(String titulo, String nomeLeitor, int quantidadePaginasTotal, int quantidadePaginasLidas) {
        this.titulo = titulo;
        this.nomeLeitor = nomeLeitor;
        this.quantidadePaginasTotal = quantidadePaginasTotal;
        this.quantidadePaginasLidas = quantidadePaginasLidas;
    }

    public double verificaProgresso(Livro livro){

        double percentual = (livro.getQuantidadePaginasLidas() * 100) / livro.getQuantidadePaginasTotal();


        System.out.printf("Você já leu %.2f%%  do Livro ", percentual);
        return percentual;

    }

    @Override
    public String toString() {
        return "Livro:" +
                "\nTítulo : '" + titulo + '\'' +
                ",\n Nome do Leitor : '" + nomeLeitor + '\'' +
                ",\n quantidadePaginasTotal: " + quantidadePaginasTotal +
                ",\n quantidadePaginasLidas: " + quantidadePaginasLidas;
    }
}

package ExerciciosAula17_02;

public class Fornecedor extends Pessoa{

    private double valorCredito;

    private double valorDivida;

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    //Os construtores são formas de poliformismo Overload, devido a utilização de multiplos
    // métodos com chaves de valores diferente para serem recebidas.
    public Fornecedor(double valorCredito, double valorDivida) {
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public Fornecedor(String nome, double valorCredito, double valorDivida) {
        super(nome);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public Fornecedor(String nome, String telefone, double valorCredito, double valorDivida) {
        super(nome, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public double obterSaldo(Fornecedor fornecedor){
        double saldo = fornecedor.getValorCredito() - fornecedor.getValorDivida();
        return saldo;
    }

    @Override   //Override de sobreescrição do método da classe pai Pessoa.
    public String toString() {
        return "\nFornecedor: " +
                "\nNome : " + getNome() +
                ", \nEndereco : " + getEndereco() +
                ", \nTelefone : " + getTelefone() +
                ", \nvalor do Crédito : " + getValorCredito() +
                ", valor da Divida : " + getValorDivida() ;
    }
}

package ExerciciosAula17_02;

public class Vendedor extends Empregado{

    private double valorVendas;

    private double comissao;

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

                        //Os construtores são formas de poliformismo Overload, devido a utilização de multiplos
                        // métodos com chaves de valores diferente para serem recebidas.
    public Vendedor(int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public Vendedor(String nome, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public Vendedor(String nome, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    @Override                   //Override de sobreescrição do método da classe pai Empregado.
    public double calcularSalario(Empregado empregado) {
        double salarioLiquido = this.getSalarioBase() - (this.getSalarioBase() * (this.getImposto() / 100));

        return salarioLiquido + ((this.getValorVendas() * (this.getComissao() / 100 )));


    }

    @Override                   //Override de sobreescrição do método da classe pai Empregado.
    public String toString() {
        return " Vendedor :" +
                "\nNome : " + getNome() +
                ", \nEndereco : " + getEndereco() +
                ", \nTelefone : " + getTelefone() +
                ", \nCódigo do Setor :" + getCodigoSetor() +
                ", \nSalário Base :" + getSalarioBase() +
                ", \nimposto : " + getImposto()+"%" +
                ", \nValor de Vendas : " + getValorVendas() +
                ", \nComissão sobre vendas : " + getComissao();
    }
}

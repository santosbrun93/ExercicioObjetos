package ExerciciosAula17_02;

public class Operario extends Empregado {

    private double valorProducao;

    private double comissao;

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public Operario(int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public Operario(String nome, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public Operario(String nome, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario(Empregado empregado) {
        double salarioLiquido = this.getSalarioBase() - (this.getSalarioBase() * this.getImposto());

        return salarioLiquido + (this.getValorProducao() * this.getComissao());
    }
}

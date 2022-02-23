package ExerciciosAula17_02;

public class Empregado extends Pessoa{

    private int codigoSetor;

    private double salarioBase;

    private double imposto;

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    //Os construtores são formas de poliformismo Overload, devido a utilização de multiplos
    // métodos com chaves de valores diferente para serem recebidas.
    public Empregado(int codigoSetor, double salarioBase, double imposto) {
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public Empregado(String nome, int codigoSetor, double salarioBase, double imposto) {
        super(nome);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public Empregado(String nome, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public double calcularSalario(Empregado empregado){
        double salarioLiquido = this.getSalarioBase() - (this.getSalarioBase() * (this.getImposto() / 100));
        return salarioLiquido;
    }

    //Nesse cenário foi implementado um exemplo de polimorfismo de Overload, criados múltiplos métodos com diferentes parâmetros a serem recebidos.
    public double calcularSalario(Empregado empregado, int codigoSetor){
        codigoSetor = empregado.getCodigoSetor();

        double bonus = 0;
        if(codigoSetor <= 0 ){
                bonus = 0;
                System.out.println("Valor inválido no código do Setor, bonus será zerado!!");
            }else if(codigoSetor == 1){
                bonus = this.getSalarioBase() * 0.05;
            }else if(codigoSetor == 2){
                bonus = this.getSalarioBase() * 0.10;
            }else if(codigoSetor == 3){
                bonus = this.getSalarioBase() * 0.20;
            }else if(codigoSetor > 3){
                bonus = 0;
                System.out.println("Valor inválido no código do Setor, bonus será zerado!!");
        }

        double salarioLiquido = this.getSalarioBase() - (this.getSalarioBase() * (this.getImposto() / 100));
        return salarioLiquido + bonus;
    }

    @Override                //Override de sobreescrição do método da classe pai Pessoa.
    public String toString() {
        return "\nEmpregado :" +
                "\nNome : " + getNome() +
                ", \nEndereco : " + getEndereco() +
                ", \nTelefone : " + getTelefone() +
                ", \nCódigo do Setor :" + getCodigoSetor() +
                ", \nSalário Base :" + getSalarioBase() +
                ", \nimposto: " + getImposto()+"%" ;
    }
}


















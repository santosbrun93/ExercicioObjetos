package ExerciciosAula15_02.Funcionario;

public class Funcionario {

    String nome;

    String sobrenome;

    String cidade;

    String estado;

    int horasTrabalhadas;

    double valorHora;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public Funcionario() {
    }


    @Override
    public String toString() {
        return "ExerciciosAula15_02.ExerciciosAula15_02.Funcionario.Funcionario.Funcionario{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                '}';
    }

    public Funcionario(String nome, String sobrenome, String cidade, String estado, int horasTrabalhadas, double valorHora) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cidade = cidade;
        this.estado = estado;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public void incrementarHoras(int horas, Funcionario funcionario){
        horas += funcionario.getHorasTrabalhadas();
        funcionario.setHorasTrabalhadas(horas);
    }


    public double calcularSalario (Funcionario funcionario){
        double valorSalario = funcionario.getHorasTrabalhadas() * funcionario.getValorHora();

        return valorSalario;
    }

    public void alterarValorHora( Funcionario funcionario, double valorNovo){
        funcionario.setValorHora(valorNovo);
    }
}

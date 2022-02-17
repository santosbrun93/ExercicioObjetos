package Veiculo;

public class Veiculo {

    String modelo;

    String marca;

    int ano;

    double velocidadeMaxima;

    String cor;

    double valorFipe;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValorFipe() {
        return valorFipe;
    }

    public void setValorFipe(double valorFipe) {
        this.valorFipe = valorFipe;
    }

    public Veiculo(String modelo, String marca, int ano, double velocidadeMaxima, String cor, double valorFipe) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.velocidadeMaxima = velocidadeMaxima;
        this.cor = cor;
        this.valorFipe = valorFipe;
    }

    @Override
    public String toString() {
        return "Veiculo:" +
                "\n Modelo: " + modelo +
                ",\n Marca: " + marca +
                ",\n Ano:  " + ano;
    }

    public void acelerarCarro(Veiculo veiculo  ,double aceleracao){

        if(aceleracao > veiculo.getVelocidadeMaxima()){
            System.out.println("Velocidade acima do valor permitido para o veículo");
        }else System.out.printf("“Estou acelerando %.2f KM/H", aceleracao);
    }

    public void frearCarro(Veiculo veiculo){

        System.out.printf("Estou freando o veículo %s " ,veiculo.getModelo());

    }
}

package br.com.carlosbrito.builder;

import br.com.carlosbrito.model.veiculo.Carro;

/**
 * @author carlos.brito
 * Criado em: 11/07/2025
 */
public class CarroBuilder {
    private int id;
    private String modelo;
    private String fabricante;
    private String cor;
    private int anoFabricacao;
    private String placa;
    private int numeroPortas;
    private String tipoCombustivel;
    private boolean arCondicionado;
    private int capacidadePortaMalas;

    public CarroBuilder comId(int id){
        this.id = id;
        return this;
    }

    public CarroBuilder comModelo(String modelo){this.modelo = modelo; return this;}

    public CarroBuilder comFabricante(String fabricante){this.fabricante = fabricante; return this;}

    public CarroBuilder comCor(String cor){this.cor = cor; return this;}

    public CarroBuilder comAnoFabricacao(int anoFabricacao){this.anoFabricacao = anoFabricacao; return this;}

    public CarroBuilder comPlaca(String placa){this.placa = placa; return this;}

    public CarroBuilder comNumeroPortas(int numeroPortas){this.numeroPortas = numeroPortas;return this;}

    public CarroBuilder comTipoCombustivel(String tipoCombustivel){this.tipoCombustivel = tipoCombustivel; return this;}

    public CarroBuilder comArCondicionado(boolean arCondicionado){this.arCondicionado = arCondicionado;return this;}

    public CarroBuilder comCapacidadePortaMalas(int capacidadePortaMalas){this.capacidadePortaMalas = capacidadePortaMalas;return this;}

    public Carro build(){
        return new Carro(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public boolean getArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public int getCapacidadePortaMalas() {
        return capacidadePortaMalas;
    }

    public void setCapacidadePortaMalas(int capacidadePortaMalas) {
        this.capacidadePortaMalas = capacidadePortaMalas;
    }
}

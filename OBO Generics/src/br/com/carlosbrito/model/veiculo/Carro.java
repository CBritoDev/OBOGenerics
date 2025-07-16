package br.com.carlosbrito.model.veiculo;

import br.com.carlosbrito.builder.CarroBuilder;

/**
 * @author carlos.brito
 * Criado em: 09/07/2025
 */
public class Carro  extends Veiculo implements Cloneable{
    private int numeroPortas;
    private String tipoCombustivel;
    private boolean arCondicionado;
    private int capacidadePortaMalas;

    public Carro(CarroBuilder builder) {
        super(builder.getId(), builder.getFabricante(), builder.getCor(), builder.getAnoFabricacao(), builder.getPlaca(), builder.getModelo());
        this.numeroPortas = builder.getNumeroPortas();
        this.tipoCombustivel = builder.getTipoCombustivel();
        this.arCondicionado = builder.getArCondicionado();
        this.capacidadePortaMalas = builder.getCapacidadePortaMalas();
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

    public boolean isArCondicionado() {
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

    @Override
    public String toString(){
        return  String.format(
                "Modelo: %s" + "\n" +
                        "Ano: %d" + "\n" +
                        "Placa: %s" + "\n" +
                        "Fabricante: %s" + "\n" +
                        "Tipo de combustível: %s" + "\n" +
                        "Número de portas: %d" + "\n" +
                        "Capacidade porta-malas: %d" + "\n"+
                        "Possui ar condicionado: %s",
                getModelo(), getAnoFabricacao(),getPlaca(),getFabricante(), tipoCombustivel, numeroPortas, capacidadePortaMalas, arCondicionado ? "Sim" : "Não"
        );
    }

    @Override
    public Carro clone() {
        return (Carro) super.clone();
    }

}

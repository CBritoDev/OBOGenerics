package br.com.carlosbrito.model.veiculo;

/**
 * @author carlos.brito
 * Criado em: 09/07/2025
 */
public abstract class Veiculo implements Cloneable {
    private final int id;
    private String modelo;
    private String fabricante;
    private String cor;
    private int anoFabricacao;
    private String placa;

    public Veiculo(int id, String fabricante, String cor, int anoFabricacao, String placa, String modelo){
        this.id = id;
        this.fabricante = fabricante;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.placa = placa;
        this.modelo = modelo;
    }

    public int getId() {
        return id;
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
    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    @Override
    public Veiculo clone() {
        try {
            return (Veiculo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Erro ao clonar o veiculo", e);
        }
    }


}

package br.com.carlosbrito.builder;

import br.com.carlosbrito.model.veiculo.Motocicleta;

/**
 * @author carlos.brito
 * Criado em: 11/07/2025
 */
public class MotocicletaBuilder {
    private int id;
    private String modelo;
    private String fabricante;
    private String cor;
    private int anoFabricacao;
    private String placa;
    private int cilindradas;
    private boolean partidaEletrica;
    private String tipoMotocicleta;
    private Boolean temBagageiro;

    public MotocicletaBuilder comId(int id){
        this.id = id;
        return this;
    }

    public MotocicletaBuilder comModelo(String modelo){this.modelo = modelo; return this;}

    public MotocicletaBuilder comFabricante(String fabricante){this.fabricante = fabricante; return this;}

    public MotocicletaBuilder comCor(String cor){this.cor = cor; return this;}

    public MotocicletaBuilder comAnoFabricacao(int anoFabricacao){this.anoFabricacao = anoFabricacao; return this;}

    public MotocicletaBuilder comPlaca(String placa){this.placa = placa; return this;}

    public MotocicletaBuilder comCilindradas(int cilindradas){this.cilindradas = cilindradas; return this;}

    public MotocicletaBuilder comPartidaEletrica(boolean partidaEletrica){this.partidaEletrica = partidaEletrica; return this;}

    public MotocicletaBuilder comTipoMotocicleta(String tipoMotocicleta){this.tipoMotocicleta = tipoMotocicleta; return this;}

    public MotocicletaBuilder comTemBagageiro(boolean temBagageiro){this.temBagageiro = temBagageiro; return this;}

    public Motocicleta build(){
        return new Motocicleta(this);
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

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public boolean isPartidaEletrica() {
        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

    public String getTipoMotocicleta() {
        return tipoMotocicleta;
    }

    public void setTipoMotocicleta(String tipoMotocicleta) {
        this.tipoMotocicleta = tipoMotocicleta;
    }

    public Boolean getTemBagageiro() {
        return temBagageiro;
    }

    public void setTemBagageiro(Boolean temBagageiro) {
        this.temBagageiro = temBagageiro;
    }
}

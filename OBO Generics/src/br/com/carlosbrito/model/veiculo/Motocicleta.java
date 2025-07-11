package br.com.carlosbrito.model.veiculo;

import br.com.carlosbrito.builder.MotocicletaBuilder;

/**
 * @author carlos.brito
 * Criado em: 11/07/2025
 */
public class Motocicleta extends Veiculo {
    private int cilindradas;
    private boolean partidaEletrica;
    private String tipoMotocicleta;
    private boolean temBagageiro;

    public Motocicleta(MotocicletaBuilder builder) {
        super(builder.getId(), builder.getFabricante(), builder.getCor(), builder.getAnoFabricacao(), builder.getPlaca(), builder.getModelo());
        this.cilindradas = builder.getCilindradas();
        this.partidaEletrica = builder.isPartidaEletrica();
        this.tipoMotocicleta = builder.getTipoMotocicleta();
        this.temBagageiro = builder.getTemBagageiro();
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

    public boolean isTemBagageiro() {
        return temBagageiro;
    }

    public void setTemBagageiro(boolean temBagageiro) {
        this.temBagageiro = temBagageiro;
    }

    @Override
    public String toString() {
        return String.format(
                "Modelo: %s" + "\n" +
                        "Ano: %d" + "\n" +
                        "Placa: %s" + "\n" +
                        "Fabricante: %s" + "\n" +
                        "Cilindradas: %d" + "\n" +
                        "Tipo de motocicleta: %s" + "\n" +
                        "Possui bagageiro: %s" + "\n" +
                        "Possui partida elétrica: %s",
                getModelo(), getAnoFabricacao(), getPlaca(), getFabricante(), cilindradas, tipoMotocicleta, temBagageiro ? "Sim" : "Não", partidaEletrica ? "Sim" : "Não"
        );
    }
}

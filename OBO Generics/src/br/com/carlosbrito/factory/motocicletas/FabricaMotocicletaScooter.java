package br.com.carlosbrito.factory.motocicletas;

import br.com.carlosbrito.builder.MotocicletaBuilder;
import br.com.carlosbrito.interfaces.IFabricaVeiculo;
import br.com.carlosbrito.model.veiculo.Motocicleta;
import br.com.carlosbrito.model.veiculo.Veiculo;

/**
 * @author carlos.brito
 * Criado em: 11/07/2025
 */
public class FabricaMotocicletaScooter implements IFabricaVeiculo {
    @Override
    public Veiculo criarVeiculo() {
        return new MotocicletaBuilder()
                .comId(0)
                .comFabricante("Yamaha")
                .comModelo("A definir")
                .comCor("Branco")
                .comAnoFabricacao(2025)
                .comPlaca("A definir")
                .comCilindradas(160)
                .comTipoMotocicleta("Scooter")
                .comTemBagageiro(true)
                .comPartidaEletrica(true)
                .build();
    }
}

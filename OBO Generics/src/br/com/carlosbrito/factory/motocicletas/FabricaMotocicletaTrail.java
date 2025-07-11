package br.com.carlosbrito.factory.motocicletas;

import br.com.carlosbrito.builder.MotocicletaBuilder;
import br.com.carlosbrito.interfaces.IFabricaVeiculo;
import br.com.carlosbrito.model.veiculo.Veiculo;

/**
 * @author carlos.brito
 * Criado em: 11/07/2025
 */
public class FabricaMotocicletaTrail implements IFabricaVeiculo {
    @Override
    public Veiculo criarVeiculo() {
        return new MotocicletaBuilder()
                .comId(0)
                .comFabricante("Honda")
                .comModelo("A definir")
                .comCor("Vermelha")
                .comAnoFabricacao(2025)
                .comPlaca("A definir")
                .comCilindradas(291)
                .comTipoMotocicleta("Trail")
                .comTemBagageiro(true)
                .comPartidaEletrica(true)
                .build();
    }
}

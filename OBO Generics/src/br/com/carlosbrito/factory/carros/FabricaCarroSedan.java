package br.com.carlosbrito.factory.carros;

import br.com.carlosbrito.builder.CarroBuilder;
import br.com.carlosbrito.interfaces.IFabricaVeiculo;
import br.com.carlosbrito.model.veiculo.Veiculo;

/**
 * @author carlos.brito
 * Criado em: 11/07/2025
 */
public class FabricaCarroSedan implements IFabricaVeiculo {

    @Override
    public Veiculo criarVeiculo() {
       return new CarroBuilder()
               .comModelo("Sedan generico")
               .comAnoFabricacao(2025)
               .comFabricante("Montadora XXX")
               .comCor("A definir")
               .comTipoCombustivel("Flex")
               .comNumeroPortas(4)
               .comCapacidadePortaMalas(450)
               .comArCondicionado(true)
               .comPlaca("A definir")
               .build();
    }
}

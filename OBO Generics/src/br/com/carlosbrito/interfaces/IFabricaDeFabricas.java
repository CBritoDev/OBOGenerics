package br.com.carlosbrito.interfaces;

import br.com.carlosbrito.factory.Fabrica;
import br.com.carlosbrito.model.veiculo.Veiculo;

/**
 * @author carlos.brito
 * Criado em: 11/07/2025
 */
public interface IFabricaDeFabricas {
   IFabricaVeiculo criarFabrica(String tipoVeiculo, String subtipo);
}

package br.com.carlosbrito.factory;

import br.com.carlosbrito.builder.MotocicletaBuilder;
import br.com.carlosbrito.factory.carros.FabricaCarroHatch;
import br.com.carlosbrito.factory.carros.FabricaCarroSUV;
import br.com.carlosbrito.factory.carros.FabricaCarroSedan;
import br.com.carlosbrito.factory.motocicletas.FabricaMotocicletaEsportiva;
import br.com.carlosbrito.factory.motocicletas.FabricaMotocicletaScooter;
import br.com.carlosbrito.factory.motocicletas.FabricaMotocicletaTrail;
import br.com.carlosbrito.interfaces.IFabricaDeFabricas;
import br.com.carlosbrito.interfaces.IFabricaVeiculo;
import br.com.carlosbrito.model.veiculo.Veiculo;

import java.util.Locale;

/**
 * @author carlos.brito
 * Criado em: 11/07/2025
 */
public class Fabrica implements IFabricaDeFabricas {

    private static Fabrica instancia;

    private Fabrica(){}

    public synchronized static Fabrica getInstance(){
        if(instancia == null){
            instancia = new Fabrica();
        }
        return instancia;
    }

    @Override
    public IFabricaVeiculo criarFabrica(String tipoVeiculo, String subtipo) {
        if(tipoVeiculo.equalsIgnoreCase("Carro")){
            return switch (subtipo.toLowerCase()){
                case "hatch" -> new FabricaCarroHatch();
                case "sedan" -> new FabricaCarroSedan();
                case "suv" -> new FabricaCarroSUV();
                default -> throw new IllegalArgumentException("Tipo de veiculo não reconhecido: " + subtipo);
            };
        }else if(tipoVeiculo.equalsIgnoreCase("Motocicleta") || tipoVeiculo.equalsIgnoreCase("Moto")){
            return switch (subtipo.toLowerCase()){
                case "esportiva" -> new FabricaMotocicletaEsportiva();
                case "scooter" -> new FabricaMotocicletaScooter();
                case "trail" -> new FabricaMotocicletaTrail();
                default -> throw new IllegalArgumentException("Tipo de veiculo não reconhecido: " + subtipo);
            };
        }
        throw new IllegalArgumentException("Tipo de veículo não reconhecido: " + tipoVeiculo);
    }
}

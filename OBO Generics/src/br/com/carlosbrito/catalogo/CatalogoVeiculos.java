package br.com.carlosbrito.catalogo;

import br.com.carlosbrito.builder.CarroBuilder;
import br.com.carlosbrito.builder.MotocicletaBuilder;
import br.com.carlosbrito.factory.carros.FabricaCarroHatch;
import br.com.carlosbrito.factory.carros.FabricaCarroSUV;
import br.com.carlosbrito.factory.carros.FabricaCarroSedan;
import br.com.carlosbrito.factory.motocicletas.FabricaMotocicletaEsportiva;
import br.com.carlosbrito.factory.motocicletas.FabricaMotocicletaScooter;
import br.com.carlosbrito.factory.motocicletas.FabricaMotocicletaTrail;
import br.com.carlosbrito.model.veiculo.Motocicleta;
import br.com.carlosbrito.model.veiculo.Veiculo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author carlos.brito
 * Criado em: 15/07/2025
 */
public class CatalogoVeiculos {

    private static final Map<String, Veiculo> veiculos =  new HashMap<>();

    static {
        adicionarVeiculo("Corolla", new CarroBuilder()
                .comFabricante("Toyota")
                .comAnoFabricacao(2023)
                .comCor("Branco")
                .comTipoCombustivel("Flex")
                .comNumeroPortas(4)
                .comCapacidadePortaMalas(470)
                .comArCondicionado(true)
                .build());

        adicionarVeiculo("Civic", new CarroBuilder()
                .comFabricante("Honda")
                .comAnoFabricacao(2022)
                .comCor("Prata")
                .comTipoCombustivel("Gasolina")
                .comNumeroPortas(4)
                .comCapacidadePortaMalas(519)
                .comArCondicionado(true)
                .build());
        adicionarVeiculo("Virtus", new CarroBuilder()
                .comFabricante("Volkswagen")
                .comAnoFabricacao(2023)
                .comCor("Azul")
                .comTipoCombustivel("Flex")
                .comNumeroPortas(4)
                .comCapacidadePortaMalas(521)
                .comArCondicionado(true)
                .build());

        adicionarVeiculo("Hilux SW4", new CarroBuilder()
                .comFabricante("Toyota")
                .comAnoFabricacao(2022)
                .comCor("Preto")
                .comTipoCombustivel("Diesel")
                .comNumeroPortas(4)
                .comCapacidadePortaMalas(500)
                .comArCondicionado(true)
                .build());
        adicionarVeiculo("Compass", new CarroBuilder()
                .comFabricante("Jeep")
                .comAnoFabricacao(2023)
                .comCor("Preto")
                .comTipoCombustivel("Flex")
                .comNumeroPortas(4)
                .comCapacidadePortaMalas(410)
                .comArCondicionado(true)
                .build());
        adicionarVeiculo("Haval H6", new CarroBuilder()
                .comFabricante("GWM")
                .comAnoFabricacao(2024)
                .comCor("Preto")
                .comTipoCombustivel("Hibrido")
                .comNumeroPortas(4)
                .comCapacidadePortaMalas(560)
                .comArCondicionado(true)
                .build());

        adicionarVeiculo("Onix", new CarroBuilder()
                .comFabricante("Chevrolet")
                .comAnoFabricacao(2023)
                .comCor("Preto")
                .comTipoCombustivel("Flex")
                .comNumeroPortas(4)
                .comCapacidadePortaMalas(275)
                .comArCondicionado(true)
                .build());
        adicionarVeiculo("HB20", new CarroBuilder()
                .comFabricante("Hyundai")
                .comAnoFabricacao(2023)
                .comCor("Branco")
                .comTipoCombustivel("Flex")
                .comNumeroPortas(4)
                .comCapacidadePortaMalas(400)
                .comArCondicionado(true)
                .build());
        adicionarVeiculo("Argo", new CarroBuilder()
                .comModelo("Argo")
                .comFabricante("Fiat")
                .comAnoFabricacao(2023)
                .comCor("Vermelho")
                .comTipoCombustivel("Flex")
                .comNumeroPortas(4)
                .comCapacidadePortaMalas(300)
                .comArCondicionado(true)
                .build());

        adicionarVeiculo("Kawasaki Ninja 400", new MotocicletaBuilder()
                .comFabricante("Kawasaki")
                .comAnoFabricacao(2023)
                .comCor("Verde")
                .comTipoCombustivel("Gasolina")
                .comCilindradas(399)
                .comPartidaEletrica(true)
                .comTemBagageiro(false)
                .build());
        adicionarVeiculo("Yamaha R3", new MotocicletaBuilder()
                .comFabricante("Yamaha")
                .comAnoFabricacao(2023)
                .comCor("Azul")
                .comTipoCombustivel("Gasolina")
                .comCilindradas(321)
                .comPartidaEletrica(true)
                .comTemBagageiro(false)
                .build());
        adicionarVeiculo("CBR 500R", new MotocicletaBuilder()
                .comFabricante("Honda")
                .comAnoFabricacao(2023)
                .comCor("Vermelho")
                .comTipoCombustivel("Gasolina")
                .comCilindradas(471)
                .comPartidaEletrica(true)
                .comTemBagageiro(false)
                .build());

        adicionarVeiculo("Honda PCX", new MotocicletaBuilder()
                .comFabricante("Honda")
                .comAnoFabricacao(2023)
                .comCor("Cinza")
                .comTipoCombustivel("Gasolina")
                .comCilindradas(160)
                .comPartidaEletrica(true)
                .comTemBagageiro(true)
                .build());
        adicionarVeiculo("Yamaha NMax", new MotocicletaBuilder()
                .comFabricante("Yamaha")
                .comAnoFabricacao(2023)
                .comCor("Preto")
                .comTipoCombustivel("Gasolina")
                .comCilindradas(160)
                .comPartidaEletrica(true)
                .comTemBagageiro(true)
                .build());
        adicionarVeiculo("Dafra Citycom", new MotocicletaBuilder()
                .comFabricante("Honda")
                .comAnoFabricacao(2022)
                .comCor("Branco")
                .comTipoCombustivel("Gasolina")
                .comCilindradas(300)
                .comPartidaEletrica(true)
                .comTemBagageiro(true)
                .build());

        adicionarVeiculo("XRE 300", new MotocicletaBuilder()
                .comFabricante("Honda")
                .comAnoFabricacao(2023)
                .comCor("Preto")
                .comTipoCombustivel("Flex")
                .comCilindradas(300)
                .comPartidaEletrica(true)
                .comTemBagageiro(false)
                .build());
        adicionarVeiculo("Lander 250", new MotocicletaBuilder()
                .comFabricante("Yamaha")
                .comAnoFabricacao(2022)
                .comCor("Azul")
                .comTipoCombustivel("Flex")
                .comCilindradas(250)
                .comPartidaEletrica(true)
                .comTemBagageiro(false)
                .build());
        adicionarVeiculo("Himalayan",new MotocicletaBuilder()
                .comFabricante("Royal Enfield")
                .comAnoFabricacao(2023)
                .comCor("Preto")
                .comTipoCombustivel("Gasolina")
                .comCilindradas(411)
                .comPartidaEletrica(true)
                .comTemBagageiro(false)
                .build());
    }

    public static void adicionarVeiculo(String modelo, Veiculo veiculo){
        if(modelo != null && veiculo != null){
            veiculos.put(modelo.toLowerCase(), veiculo);;
        }else{
            throw new IllegalArgumentException("Veículo não adicionado por falta de informações ou por campo vazio!");
        }

    }

    public static void removerVeiculo(String modelo){
        if(veiculos.containsKey(modelo.toLowerCase())){
            veiculos.remove(modelo.toLowerCase());
            System.out.println("Veículo %s removido com sucesso!".formatted(modelo));
        }else{
            throw new IllegalArgumentException("Veiculo " +modelo+ " não encontrado");
        }
    }

    public static Veiculo buscarModelos(String modelo){
        Veiculo veiculo = veiculos.get(modelo.toLowerCase());
        if(veiculo == null) return null;
        try{
            return veiculo.clone();
        }catch(Exception e){
            System.out.println("Erro ao clonar veículo: " + e.getMessage());
            return  null;
        }
    }

    public static List<String> listarModelosDisponiveis(){
        return new ArrayList<>(veiculos.keySet());
    }


}

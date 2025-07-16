package br.com.carlosbrito.catalogo;

import br.com.carlosbrito.model.servicos.*;
import br.com.carlosbrito.model.veiculo.Veiculo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author carlos.brito
 * Criado em: 15/07/2025
 */
public class CatalogoServicos {
    private static final Map<String, Servico> servicos =  new HashMap<>();

    static {
        adicionarServico(new AlinhamentoBalanceamento());
        adicionarServico(new DiagnosticoEletronico());
        adicionarServico(new RevisaoFreios());
        adicionarServico(new TrocaDeOleo());
        adicionarServico(new TrocaFiltros());
    }

    public static void adicionarServico(Servico servico){
        if(servico != null){
            servicos.put(servico.getNome().toLowerCase(), servico);
            System.out.println("Serviço %s adicionado com sucesso!".formatted(servico.getNome()));

        }else{
            throw new IllegalArgumentException("ERRO! Campo inválido ou vazio");
        }
    }

    public static void removerServico(Servico servico){
        if(servico != null){
            servicos.remove(servico);
            System.out.println("Serviço %s removido com sucesso!".formatted(servico.getNome()));
        }else{
            throw new IllegalArgumentException("ERRO! Campo inválido ou vazio");
        }
    }

    public static Servico buscarServicos(String nomeServico){
        Servico servico = servicos.get(nomeServico);
        if(servico == null) return null;
        try{
            return servico.clone();
        }catch(Exception e){
            System.out.println("Erro ao clonar serviço: " + e.getMessage());
            return  null;
        }
    }

    public static List<String> listarServicos(){
        return new ArrayList<>(servicos.keySet());
    }

}

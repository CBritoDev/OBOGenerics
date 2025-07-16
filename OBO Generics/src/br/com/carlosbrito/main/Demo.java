package br.com.carlosbrito.main;

import br.com.carlosbrito.builder.ClientePessoaFisicaBuilder;
import br.com.carlosbrito.builder.EnderecoBuilder;
import br.com.carlosbrito.catalogo.CatalogoServicos;
import br.com.carlosbrito.catalogo.CatalogoVeiculos;
import br.com.carlosbrito.factory.carros.FabricaCarroSedan;
import br.com.carlosbrito.model.Endereco;
import br.com.carlosbrito.model.Orcamento;
import br.com.carlosbrito.model.cliente.Cliente;
import br.com.carlosbrito.model.cliente.ClientePessoaFisica;
import br.com.carlosbrito.model.servicos.AlinhamentoBalanceamento;
import br.com.carlosbrito.model.servicos.Servico;
import br.com.carlosbrito.model.veiculo.Veiculo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author carlos.brito
 * Criado em: 08/07/2025
 */
public class Demo {
    public static void main(String[] args){
        Endereco enderecoCliente1 = new EnderecoBuilder()
                .comId(0)
                .comRua("Aprobinário")
                .comNumero(284)
                .comBairro("Alta Vista")
                .comCidade("Ageolopólis")
                .comEstado("PR")
                .comCep("00000-00")
                .build();

        Cliente cliente1 = new ClientePessoaFisicaBuilder()
                .comId(0)
                .comNome("Carlos")
                .comSobrenome("Brito")
                .comCPF("887.477.020-01")
                .comEndereco(enderecoCliente1)
                .comTelefone("4002-8922")
                .build();

        Veiculo veiculo = CatalogoVeiculos.buscarModelos("Argo");

        Servico servico1 = CatalogoServicos.buscarServicos("troca de óleo");
        Servico servico2 = CatalogoServicos.buscarServicos("diagnóstico eletrônico");
        Servico servico3 = CatalogoServicos.buscarServicos("revisão de freios");

        List<Servico> listaServicos = new ArrayList<>();
        listaServicos.add(servico1);
        listaServicos.add(servico2);

        System.out.println("%.2f\n%.2f\n%.2f".formatted(servico1.getValor(),servico2.getValor(),servico3.getValor()));

        Orcamento orcamento1 = new Orcamento(0,veiculo,cliente1,listaServicos,LocalDate.now() );
        System.out.println(orcamento1.gerarResumo());


        orcamento1.adicionarServico(servico3);
        System.out.println(orcamento1.gerarResumo());

        orcamento1.removeServico(servico2);
        System.out.println(orcamento1.gerarResumo());
    }

}

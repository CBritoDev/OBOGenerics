package br.com.carlosbrito.app;

import br.com.carlosbrito.builder.ClientePessoaFisicaBuilder;
import br.com.carlosbrito.builder.EnderecoBuilder;
import br.com.carlosbrito.factory.Fabrica;
import br.com.carlosbrito.interfaces.IFabricaDeFabricas;
import br.com.carlosbrito.interfaces.IFabricaVeiculo;
import br.com.carlosbrito.model.cliente.Cliente;
import br.com.carlosbrito.model.cliente.ClientePessoaFisica;
import br.com.carlosbrito.model.Endereco;
import br.com.carlosbrito.model.veiculo.Carro;
import br.com.carlosbrito.model.veiculo.Veiculo;
import br.com.carlosbrito.util.DocumentoUtil;

/**
 * @author carlos.brito
 * Criado em: 08/07/2025
 */
public class Demo {
    public static void main(String[] args){
        Endereco endereco = new EnderecoBuilder()
                .comRua("Catapimbas")
                .comNumero(70)
                .comBairro("Chocado")
                .comCep("40028922")
                .comCidade("Divinópolis")
                .comEstado("MG")
                .build();
        ClientePessoaFisica cliente = new ClientePessoaFisicaBuilder()
                .comNome("Carlos")
                .comTelefone("08000000")
                .comSobrenome("Brito")
                .comEndereco(endereco)
                .comCPF("1234567890")
                .build();

        String isValido = DocumentoUtil.validarCPF(cliente.getCpf()) ? "válido" : "inválido";
        System.out.println(cliente);
        System.out.println("O CPF: " + cliente.getCpf() + " é: " + isValido);
        System.out.println("");

        IFabricaDeFabricas fabricaPrincipal = Fabrica.getInstance();

        IFabricaVeiculo fabricaMoto = fabricaPrincipal.criarFabrica("moto", "esportiva");
        Veiculo moto = fabricaMoto.criarVeiculo();
        if (moto != null) {
            
        }


    }

}

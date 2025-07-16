package br.com.carlosbrito.builder;

import br.com.carlosbrito.model.Endereco;
import br.com.carlosbrito.model.cliente.ClientePessoaJuridica;
import br.com.carlosbrito.util.DocumentoUtil;

/**
 * @author carlos.brito
 * Criado em: 16/07/2025
 */
public class ClientePessoaJuridicaBuilder {
    private int id;
    private String nome;
    private final String telefone;
    private Endereco endereco;
    private final String cnpj;
    private String nomeFantasia;
    private final String razaoSocial;

    public ClientePessoaJuridicaBuilder(String cnpj, String razaoSocial, String telefone) {
        if (cnpj == null || razaoSocial == null || telefone == null) {
            throw new IllegalArgumentException("CNPJ, Razão Social e Telefone são obrigatórios");
        }

        if(DocumentoUtil.validarCNPJ(cnpj)){
            this.cnpj = cnpj;
        }else{
            throw new IllegalArgumentException("O CNPJ inserido não é válido!");
        }

        this.razaoSocial = razaoSocial;
        this.telefone = telefone;
    }

    public ClientePessoaJuridicaBuilder comId(int id){
        this.id = id;
        return this;
    }

    public ClientePessoaJuridicaBuilder comNome(String nome){
        this.nome = nome;
        return this;
    }


    public ClientePessoaJuridicaBuilder comEndereco(Endereco endereco){
        this.endereco = endereco;
        return this;
    }



    public ClientePessoaJuridicaBuilder comNomeFantasia(String nomeFantasia){
        this.nomeFantasia = nomeFantasia;
        return this;
    }


    public ClientePessoaJuridica build(){
        return ClientePessoaJuridica.create(this);
    }

    public int getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }


    public Endereco getEndereco() {
        return endereco;
    }


    public String getCnpj() {
        return cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }


    public String getRazaoSocial() {
        return razaoSocial;
    }

}

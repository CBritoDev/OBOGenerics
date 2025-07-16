package br.com.carlosbrito.builder;

import br.com.carlosbrito.model.cliente.ClientePessoaFisica;
import br.com.carlosbrito.model.Endereco;
import br.com.carlosbrito.util.DocumentoUtil;

import java.time.LocalDate;

/**
 * @author carlos.brito
 * Criado em: 09/07/2025
 */
public class ClientePessoaFisicaBuilder {
    private int id;
    private final String nome;
    private final String sobrenome;
    private final String telefone;
    private Endereco endereco;
    private final String cpf;
    private LocalDate dataNascimento;


    public ClientePessoaFisicaBuilder(String nome, String sobrenome, String cpf, String telefone) {
        if (nome == null || sobrenome == null || cpf == null || telefone == null) {
            throw new IllegalArgumentException("Nome, Sobrenome, CPF e Telefone são obrigatórios");
        }

        if(DocumentoUtil.validarCPF(cpf)){
            this.cpf = cpf;
        }else{
            throw new IllegalArgumentException("O CNPJ inserido não é válido!");
        }

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
    }

    public ClientePessoaFisicaBuilder comId(int id){
        this.id = id;
        return this;
    }

    public ClientePessoaFisicaBuilder comEndereco(Endereco endereco){
        this.endereco = endereco;
        return this;
    }


    public ClientePessoaFisica build(){
        return ClientePessoaFisica.create(this);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}

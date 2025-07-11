package br.com.carlosbrito.builder;

import br.com.carlosbrito.model.cliente.ClientePessoaFisica;
import br.com.carlosbrito.model.Endereco;

import java.time.LocalDate;

/**
 * @author carlos.brito
 * Criado em: 09/07/2025
 */
public class ClientePessoaFisicaBuilder {
    private int id;
    private String nome;
    private String sobrenome;
    private String telefone;
    private Endereco endereco;
    private String cpf;
    private LocalDate dataNascimento;

    public ClientePessoaFisicaBuilder comId(int id){
        this.id = id;
        return this;
    }

    public ClientePessoaFisicaBuilder comNome(String nome){
        this.nome = nome;
        return this;
    }

    public ClientePessoaFisicaBuilder comSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
        return this;
    }

    public ClientePessoaFisicaBuilder comTelefone(String telefone){
        this.telefone = telefone;
        return this;
    }

    public ClientePessoaFisicaBuilder comEndereco(Endereco endereco){
        this.endereco = endereco;
        return this;
    }

    public ClientePessoaFisicaBuilder comCPF(String cpf){
        this.cpf = cpf;
        return this;
    }

    public ClientePessoaFisica build(){
        return new ClientePessoaFisica(this);
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

package br.com.carlosbrito.builder;

import br.com.carlosbrito.model.Endereco;

/**
 * @author carlos.brito
 * Criado em: 09/07/2025
 */
public class EnderecoBuilder {
    private int id;
    private String rua;
    private int numero;
    private String bairro;
    private final String cep;
    private String cidade;
    private String estado;

    public EnderecoBuilder(String cep){
        if(cep == null){
            throw new IllegalArgumentException("O campo CEP é obrigatório!");
        }
        this.cep = cep.replaceAll("\\D","");
    }

    public EnderecoBuilder comId(int id){
        this.id = id;
        return this;
    }

    public EnderecoBuilder comRua(String rua){
        this.rua = rua;
        return this;
    }

    public EnderecoBuilder comNumero(int numero){
        this.numero = numero;
        return this;
    }

    public EnderecoBuilder comBairro(String bairro){
        this.bairro = bairro;
        return this;
    }

    public EnderecoBuilder comCidade(String cidade){
        this.cidade = cidade;
        return this;
    }

    public EnderecoBuilder comEstado(String estado){
        this.estado = estado;
        return this;
    }

    public Endereco build(){
        return Endereco.create(this);
    }

    public int getId() {
        return id;
    }

    public int getNumero() {
        return numero;
    }

    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }
}

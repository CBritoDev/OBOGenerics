package br.com.carlosbrito.model;

import br.com.carlosbrito.builder.EnderecoBuilder;

/**
 * @author carlos.brito
 * Criado em: 08/07/2025
 */
public class Endereco {

    private final int id;
    private String rua;
    private int numero;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;

    public Endereco(EnderecoBuilder builder){
        this.id = builder.getId();
        this.rua = builder.getRua();
        this.numero = builder.getNumero();
        this.bairro = builder.getBairro();
        this.cep =  builder.getCep();
        this.cidade = builder.getCidade();
        this.estado = builder.getEstado();
    }

    public int getId() {
        return id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return String.format(
                "%s %d, %s, %s - %s, %s",
                rua, numero,bairro,cidade,estado,cep
        );
    }
}

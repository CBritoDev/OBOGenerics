package br.com.carlosbrito.model.cliente;

import br.com.carlosbrito.interfaces.IValidadorDocumento;
import br.com.carlosbrito.model.Endereco;

/**
 * @author carlos.brito
 * Criado em: 08/07/2025
 */
public abstract class Cliente implements IValidadorDocumento {

    private final int id;
    private String nome;
    private String telefone;
    private Endereco endereco;

    public Cliente(int id, String nome, String telefone, Endereco endereco){
        this.nome = nome;
        this.id = id;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String toString(){
        return String.format(
                "Cliente: %s" +"\n"+
                 "Contato: %s" + "\n",
                nome,telefone
        );
    }
}

package br.com.carlosbrito.builder;

import br.com.carlosbrito.model.PessoaJuridicaOwner;
import br.com.carlosbrito.util.DocumentoUtil;

/**
 * @author carlos.brito
 * Criado em: 16/07/2025
 */
public class PessoaJOwnerBuilder {
    private int id;
    private String nomeFantasia;
    private final String razaoSocial;
    private final String cnpj;
    private String inscricaoEstadual;
    private final char[] senha;
    private final String usuario;
    private String email;
    private String telefone;



    public PessoaJOwnerBuilder(String cnpj, String razaoSocial, char[] senha, String usuario) {
        if (cnpj == null || razaoSocial == null || senha == null || usuario == null ) {
            throw new IllegalArgumentException("CNPJ,Razão Social, Usuário e senha são obrigatórios");
        }

        if(DocumentoUtil.validarCNPJ(cnpj)){
            this.cnpj = cnpj;
        }else{
            throw new IllegalArgumentException("O CNPJ inserido não é válido!");
        }

        this.razaoSocial = razaoSocial;
        this.senha = senha;
        this.usuario = usuario;
    }

    public PessoaJOwnerBuilder comId(int id){
        this.id = id;
        return this;
    }


    public PessoaJOwnerBuilder comNomeFantasia(String nomeFantasia){
        this.nomeFantasia = nomeFantasia;
        return this;
    }

    public PessoaJOwnerBuilder comInscricaoEstadual(String inscricaoEstadual){
        this.inscricaoEstadual = inscricaoEstadual;
        return this;
    }

    public PessoaJOwnerBuilder comEmail(String email){
        this.email = email;
        return this;
    }

    public PessoaJOwnerBuilder comTelefone(String telefone){
        this.telefone = telefone;
        return this;
    }

    public PessoaJuridicaOwner build(){
        return  PessoaJuridicaOwner.create(this);
    }

    public int getId() {
        return id;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public String getUsuario() {
        return usuario;
    }


    public char[] getSenha() {
        return senha;
    }


    public String getEmail() {
        return email;
    }


    public String getTelefone() {
        return telefone;
    }

}

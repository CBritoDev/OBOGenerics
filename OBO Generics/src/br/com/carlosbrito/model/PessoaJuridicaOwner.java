package br.com.carlosbrito.model;

import br.com.carlosbrito.builder.PessoaJOwnerBuilder;
import br.com.carlosbrito.interfaces.IValidadorDocumento;
import br.com.carlosbrito.util.DocumentoUtil;

/**
 * @author carlos.brito
 * Criado em: 16/07/2025
 */
public final class PessoaJuridicaOwner implements IValidadorDocumento{
    private final int id;
    private final String nomeFantasia;
    private final String razaoSocial;
    private final String cnpj;
    private final String inscricaoEstadual;
    private final char[] senha;
    private final String usuario;
    private final String email;
    private final String telefone;

    private final DocumentoUtil documentoUtil;


    PessoaJuridicaOwner(PessoaJOwnerBuilder builder) {
        this.documentoUtil = new DocumentoUtil();
        this.id = builder.getId();
        this.nomeFantasia = builder.getNomeFantasia();
        this.razaoSocial = builder.getRazaoSocial();
        this.cnpj = builder.getCnpj();
        this.inscricaoEstadual = builder.getInscricaoEstadual();
        this.senha = builder.getSenha();
        this.usuario = builder.getUsuario();
        this.email = builder.getEmail();
        this.telefone = builder.getTelefone();
    }

    public static PessoaJuridicaOwner create(PessoaJOwnerBuilder builder) {
        return new PessoaJuridicaOwner(builder);
    }

    @Override
    public boolean validarDocumento() {
        return documentoUtil.validarCNPJ(this.cnpj);
    }


    public int getId() {
        return id;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public char[] getSenha() {
        return senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getEmail() {
        return email;
    }


    public String getTelefone() {
        return telefone;
    }

}

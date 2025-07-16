package br.com.carlosbrito.model.cliente;

import br.com.carlosbrito.builder.ClientePessoaJuridicaBuilder;
import br.com.carlosbrito.builder.PessoaJOwnerBuilder;
import br.com.carlosbrito.model.Endereco;
import br.com.carlosbrito.model.PessoaJuridicaOwner;
import br.com.carlosbrito.util.DocumentoUtil;

import java.util.Objects;

/**
 * @author carlos.brito
 * Criado em: 08/07/2025
 */
public class ClientePessoaJuridica extends Cliente {

    private String cnpj;
    private String nomeFantasia;
    private String razaoSocial;

    ClientePessoaJuridica(ClientePessoaJuridicaBuilder builder) {
        super(builder.getId(),builder.getNome(),builder.getTelefone(),builder.getEndereco());
        this.cnpj = builder.getCnpj();
        this.nomeFantasia = builder.getNomeFantasia();
        this.razaoSocial = builder.getRazaoSocial();
    }

    public static ClientePessoaJuridica create(ClientePessoaJuridicaBuilder builder) {
        return new ClientePessoaJuridica(builder);
    }

    @Override
    public boolean validarDocumento() {
        return DocumentoUtil.validarCNPJ(cnpj);
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String toString() {
        return String.format(
                "Razão Social: %s" + "\n" +
                        "Nome fantasia: %s" + "\n" +
                        "CNPJ: %s",
                        razaoSocial, getNomeFantasia(), cnpj
        );
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ClientePessoaJuridica that = (ClientePessoaJuridica) o;
        return Objects.equals(cnpj, that.cnpj) && Objects.equals(razaoSocial, that.razaoSocial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cnpj, razaoSocial);
    }
}

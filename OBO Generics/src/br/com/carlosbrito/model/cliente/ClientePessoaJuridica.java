package br.com.carlosbrito.model.cliente;

import br.com.carlosbrito.model.Endereco;
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

    public ClientePessoaJuridica(String cnpj,String nomeFantasia,String razaoSocial,int id, String nome, String telefone, Endereco endereco) {
        super(id, nome, telefone, endereco);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
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

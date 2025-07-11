package br.com.carlosbrito.model.cliente;

import br.com.carlosbrito.builder.ClientePessoaFisicaBuilder;
import br.com.carlosbrito.util.DocumentoUtil;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author carlos.brito
 * Criado em: 08/07/2025
 */
public class ClientePessoaFisica extends Cliente {
    private String cpf;
    private String sobrenome;
    private LocalDate dataNascimento;


    public ClientePessoaFisica(ClientePessoaFisicaBuilder builder){
        super(builder.getId(), builder.getNome(), builder.getTelefone(), builder.getEndereco());
        this.cpf = builder.getCpf();
        this.sobrenome = builder.getSobrenome();
        this.dataNascimento = builder.getDataNascimento();
    }


    @Override
    public boolean validarDocumento() {
        return DocumentoUtil.validarCPF(cpf);
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return String.format(
                "Cliente: %s %s" + "\n"+
                        "CPF: %s" + "\n" +
                        "Contato: %s"+ "\n" +
                        "Endereço: %s",
                getNome(), sobrenome, cpf, getTelefone(), getEndereco()
        );
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ClientePessoaFisica that = (ClientePessoaFisica) o;
        return Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }
}

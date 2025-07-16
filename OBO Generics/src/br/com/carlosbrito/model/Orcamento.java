package br.com.carlosbrito.model;

import br.com.carlosbrito.interfaces.ICalculoValorFInal;
import br.com.carlosbrito.model.cliente.Cliente;
import br.com.carlosbrito.model.servicos.Servico;
import br.com.carlosbrito.model.veiculo.Veiculo;

import java.time.LocalDate;
import java.util.List;

/**
 * @author carlos.brito
 * Criado em: 15/07/2025
 */
public class Orcamento implements ICalculoValorFInal {
    private final int id;
    private Veiculo veiculo;
    private Cliente cliente;
    private List<Servico> listaServicos;
    private double valorFinal;
    private LocalDate dataCriacao;

    public Orcamento( int id, Veiculo veiculo, Cliente cliente, List<Servico> listaServicos, LocalDate dataCriacao){
        this.id = id;
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.listaServicos = listaServicos;
        this.dataCriacao = dataCriacao;
    }

    public void adicionarServico(Servico servico){
        if(servico != null){
            this.listaServicos.add(servico);
            System.out.println("Serviço %s adicionado com sucesso!".formatted(servico.getNome()));
        }else{
            throw new IllegalArgumentException("Erro ao adicionar o serviço. O campo é nulo");
        }
        calcularValorFinal();
    }

    public void removeServico(Servico servico){
        if(servico != null){
            this.listaServicos.remove(servico);
            System.out.println("Serviço %s removido com sucesso!".formatted(servico.getNome()));
        }else{
            throw new IllegalArgumentException("Erro ao adicionar o serviço. O campo é nulo");
        }
        calcularValorFinal();
    }


    @Override
    public void calcularValorFinal() {
        double soma = 0.0;
        for(Servico servico : listaServicos){
            soma += servico.getValor();
        }

        this.valorFinal = soma;
    }

    public String gerarResumo() {
        calcularValorFinal();
        StringBuilder sb = new StringBuilder();
        sb.append("==== ORÇAMENTO ====\n");
        sb.append("Data: ").append(dataCriacao).append("\n");
        sb.append("Cliente: ").append(cliente.getNome()).append("\n");
        sb.append("Veículo: ").append(veiculo.getModelo()).append("\n");
        sb.append("\nServiços:\n");
        for (Servico servico : listaServicos) {
            sb.append("- ").append(servico.getNome())
                    .append(": R$ ").append(String.format("%.2f", servico.getValor()))
                    .append("\n");
        }
        sb.append("\nValor total: R$ ").append(String.format("%.2f", valorFinal)).append("\n");
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public List<Servico> getServico() {
        return listaServicos;
    }

    public void setServico(List<Servico> servico) {
        this.listaServicos = servico;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }
}

package br.com.carlosbrito.model.servicos;

/**
 * @author carlos.brito
 * Criado em: 15/07/2025
 */
public abstract class Servico implements Cloneable{
    private final int id;
    private String nome;
    private String descricao;
    private double valor;

    public void aplicarDesconto(Double valorDesconto) {
        if(valorDesconto < 0){
            throw new IllegalArgumentException("Desconto não pode ser negativo");
        }else if(valorDesconto > this.valor){
            throw new IllegalArgumentException("Desconto não poder ser maior que o valor do serviço");
        }
        this.valor -= valorDesconto;
    }

    public Servico(int id, String nome, String descricao, double valor){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString(){
        return String.format(
                "Serviço: %s | Descrição: %s | Valor: R$ %.2f",
                nome, descricao,valor
        );
    }

    @Override
    public Servico clone() throws CloneNotSupportedException {
        return(Servico) super.clone();
    }
}

package br.com.carlosbrito.model.servicos;

/**
 * @author carlos.brito
 * Criado em: 15/07/2025
 */
public class TrocaDeOleo extends Servico implements Cloneable{

    public TrocaDeOleo() {
        super(0, "Troca de óleo",
                "Substituição do óleo do motor e verificação do filtro",
                120.00);
    }

    @Override
    public TrocaDeOleo clone() throws CloneNotSupportedException {
        return (TrocaDeOleo) super.clone();
    }
}

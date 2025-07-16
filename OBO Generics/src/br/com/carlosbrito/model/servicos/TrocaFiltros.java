package br.com.carlosbrito.model.servicos;

/**
 * @author carlos.brito
 * Criado em: 15/07/2025
 */
public class TrocaFiltros extends Servico implements Cloneable{

    public TrocaFiltros() {
        super(0, "Troca de filtros",
                "Substituição de filtros de ar, óleo e combustível",
                90.00);
    }

    @Override
    public TrocaFiltros clone() throws CloneNotSupportedException {
        return(TrocaFiltros) super.clone();
    }
}

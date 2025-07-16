package br.com.carlosbrito.model.servicos;

/**
 * @author carlos.brito
 * Criado em: 15/07/2025
 */
public class DiagnosticoEletronico extends Servico implements Cloneable{

    public DiagnosticoEletronico() {
        super(0,"Diagnóstico eletrônico",
                "Leitura do sistema eletrônico do veículo para identificar falhas ou panes",
                150.00);
    }

    @Override
    public DiagnosticoEletronico clone() throws CloneNotSupportedException {
        return(DiagnosticoEletronico) super.clone();
    }
}

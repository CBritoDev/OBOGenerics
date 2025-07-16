package br.com.carlosbrito.model.servicos;

/**
 * @author carlos.brito
 * Criado em: 15/07/2025
 */
public class AlinhamentoBalanceamento extends Servico implements Cloneable{

    public AlinhamentoBalanceamento(){
        super(0,"Alinhamento e balancemento de rodas",
                "Ajuste do alinhamento das rodas e balanceamento para evitar vibrações",
                100.00);
    }

    @Override
    public AlinhamentoBalanceamento clone() throws CloneNotSupportedException {
        return (AlinhamentoBalanceamento) super.clone();
    }
}

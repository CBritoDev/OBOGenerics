package br.com.carlosbrito.model.servicos;

/**
 * @author carlos.brito
 * Criado em: 15/07/2025
 */
public class RevisaoFreios  extends Servico implements Cloneable{

    public RevisaoFreios(){
        super(0,"Revisão de freios",
                "Verificação e troca das pastilhas, discos e fluido de freio",
                180.00);
    }

    @Override
    public RevisaoFreios clone() throws CloneNotSupportedException {
        return(RevisaoFreios) super.clone();
    }
}

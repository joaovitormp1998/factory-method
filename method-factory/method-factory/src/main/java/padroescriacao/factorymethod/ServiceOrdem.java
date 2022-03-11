package padroescriacao.factorymethod;

public class ServiceOrdem implements IService {

    public String criar() {
        return "Ordem de serviço criada";
    }

    public String deletar() {
        return "Ordem de Serviço excluida";
    }

    public String gerarrelatorio() {
        return "Relatorio de Ordens de Serviço";
    }

}
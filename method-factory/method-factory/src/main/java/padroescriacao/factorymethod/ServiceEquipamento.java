package padroescriacao.factorymethod;

public class ServiceEquipamento implements IService {

    public String criar() {
        return "Equipamento Criado";
    }

    public String deletar() {
        return "Equipamento Excluido";
    }

    public String gerarrelatorio() {
        return "Relatorio de Equipamento Gerado";
    }
}
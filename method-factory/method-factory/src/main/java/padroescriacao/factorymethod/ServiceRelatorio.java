package padroescriacao.factorymethod;

public class ServiceRelatorio implements IService {

    public String criar() {
        return "Relatorio Criado";
    }

    public String  deletar() {
        return "Relatorio excluido";
    }

    public  String gerarrelatorio(){return "Relatorio Geral Gerado Com Sucesso!";}
}

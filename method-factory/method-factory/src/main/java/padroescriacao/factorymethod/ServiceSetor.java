package padroescriacao.factorymethod;

public class ServiceSetor implements IService {

    public String criar() {
        return "Setor Criado Com Sucesso!!";
    }

    public String deletar() {
        return "Setor Excluido";
    }

    public  String gerarrelatorio(){return "Relatorio de Setor gerado !";}
}

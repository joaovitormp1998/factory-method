package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceSetorTest {

    @Test
    void deveCriarSetor() {
        IService service = ServiceFactory.obterService("Setor");
        assertEquals("Setor Criado Com Sucesso!!", service.criar());
    }

    @Test
    void deveExcluirSetor() {
        IService service = ServiceFactory.obterService("Setor");
        assertEquals("Setor Excluido", service.deletar());
    }
    @Test
    void deveGerarRelatorioSetor(){
        IService service = ServiceFactory.obterService("Setor");
        assertEquals("Relatorio de Setor gerado !", service.gerarrelatorio());
    }

}
package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceRelatorioTest {

    @Test
    void deveCriarRelatorio() {
        IService service = ServiceFactory.obterService("Relatorio");
        assertEquals("Relatorio Criado com Sucesso !!", service.criar());
    }

    @Test
    void deveExcluirRelatorio() {
        IService service = ServiceFactory.obterService("Relatorio");
        assertEquals("Relatorio Geral Excluido", service.deletar());
    }

}
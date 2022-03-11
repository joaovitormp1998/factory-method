package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceOrdemTest {

    @Test
    void deveCriarOrdem() {
        IService service = ServiceFactory.obterService("Ordem");
        assertEquals("Ordem criada com Sucesso!!", service.criar());
    }

    @Test
    void deveExcluirOrdem() {
        IService service = ServiceFactory.obterService("Ordem");
        assertEquals("Ordem Exluida", service.deletar());
    }

}
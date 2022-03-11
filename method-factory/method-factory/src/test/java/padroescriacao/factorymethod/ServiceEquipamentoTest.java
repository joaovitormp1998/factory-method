package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceEquipamentoTest {

    @Test
    void deveCriarEquipamento() {
        IService service = ServiceFactory.obterService("Equipamento");
        assertEquals("Equipamento Criado Com Sucesso!!", service.criar());
    }

    @Test
    void deveExcluirEquipamento() {
        IService service = ServiceFactory.obterService("Equipamento");
        assertEquals("Equipamento Excluido", service.deletar());
    }

}
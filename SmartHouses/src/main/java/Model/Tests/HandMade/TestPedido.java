package Model.Tests.HandMade;

import Model.Pedido;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class TestPedido {

    @Test
    void getDate() {
        LocalDateTime data = LocalDateTime.of(2023, 5, 10, 10, 30);

        Pedido pedido = new Pedido(data, "casa", "123", "funcao", "especificacoes", true);

        assertEquals(data, pedido.getDate());
    }

    @Test
    void setDate() {
        LocalDateTime data1 = LocalDateTime.of(2023, 5, 10, 10, 30);

        Pedido pedido = new Pedido(data1, "casa", "123", "funcao", "especificacoes", true);

        LocalDateTime data2 = LocalDateTime.of(2023, 6, 10, 10, 30);

        pedido.setDate(data2);

        assertEquals(data2,pedido.getDate());
    }

    @Test
    void getTipo() {

        LocalDateTime data = LocalDateTime.of(2023, 5, 10, 10, 30);

        Pedido pedido = new Pedido(data, "casa", "123", "funcao", "especificacoes", true);

        assertEquals("casa", pedido.getTipo());

    }

    @Test
    void setTipo() {

        LocalDateTime data1 = LocalDateTime.of(2023, 5, 10, 10, 30);

        Pedido pedido = new Pedido(data1, "casa", "123", "funcao", "especificacoes", true);

        pedido.setTipo("casa1");

        assertEquals("casa1",pedido.getTipo());

    }

    @Test
    void getId() {
        LocalDateTime data = LocalDateTime.of(2023, 5, 10, 10, 30);

        Pedido pedido = new Pedido(data, "casa", "123", "funcao", "especificacoes", true);

        assertEquals("123", pedido.getId());
    }

    @Test
    void setId() {
        LocalDateTime data1 = LocalDateTime.of(2023, 5, 10, 10, 30);

        Pedido pedido = new Pedido(data1, "casa", "123", "funcao", "especificacoes", true);

        pedido.setId("456");

        assertEquals("456",pedido.getId());
    }

    @Test
    void getFuncao() {
        LocalDateTime data = LocalDateTime.of(2023, 5, 10, 10, 30);

        Pedido pedido = new Pedido(data, "casa", "123", "funcao", "especificacoes", true);

        assertEquals("funcao", pedido.getFuncao());
    }

    @Test
    void setFuncao() {
        LocalDateTime data1 = LocalDateTime.of(2023, 5, 10, 10, 30);

        Pedido pedido = new Pedido(data1, "casa", "123", "funcao", "especificacoes", true);

        pedido.setFuncao("funcao2");

        assertEquals("funcao2",pedido.getFuncao());
    }

    @Test
    void getEspecificacoes() {
        LocalDateTime data = LocalDateTime.of(2023, 5, 10, 10, 30);

        Pedido pedido = new Pedido(data, "casa", "123", "funcao", "especificacoes", true);

        assertEquals("especificacoes", pedido.getEspecificacoes());
    }

    @Test
    void setEspecificacoes() {
        LocalDateTime data1 = LocalDateTime.of(2023, 5, 10, 10, 30);

        Pedido pedido = new Pedido(data1, "casa", "123", "funcao", "especificacoes", true);

        pedido.setEspecificacoes("especificacoes");

        assertEquals("especificacoes",pedido.getEspecificacoes());
    }

    @Test
    void getMode() {
        LocalDateTime data = LocalDateTime.of(2023, 5, 10, 10, 30);

        Pedido pedido = new Pedido(data, "casa", "123", "funcao", "especificacoes", true);

        assertEquals(true, pedido.getMode());
    }

    @Test
    void setMode() {
        LocalDateTime data1 = LocalDateTime.of(2023, 5, 10, 10, 30);

        Pedido pedido = new Pedido(data1, "casa", "123", "funcao", "especificacoes", true);

        pedido.setMode(false);

        assertEquals(false,pedido.getMode());
    }

    @Test
    void testToString() {

        LocalDateTime date = LocalDateTime.of(2023, 5, 10, 10, 30);

        Pedido pedido = new Pedido(date, "casa", "123", "funcao", "especificacoes", true);

        String expectedString = "Pedido{date=2023-05-10T10:30, tipo='casa', id='123', funcao='funcao', especificacoes='especificacoes', mode=true}";

        String actualString = pedido.toString();

        assertEquals(expectedString, actualString);
    }
}
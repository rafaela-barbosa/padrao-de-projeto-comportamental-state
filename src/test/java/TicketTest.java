import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicketTest {

    Ticket ticket;

    @BeforeEach
    public void setUp() {
        ticket = new Ticket();
    }

    // Ticket Aberto

    @Test
    public void deveAtribuirTicketAberto() {
        ticket.setEstado(TicketEstadoAberto.getInstance());
        assertTrue(ticket.atribuir());
        assertEquals(TicketEstadoEmAtendimento.getInstance(), ticket.getEstado());
    }

    @Test
    public void deveFecharTicketAberto() {
        ticket.setEstado(TicketEstadoAberto.getInstance());
        assertTrue(ticket.fechar());
        assertEquals(TicketEstadoFechado.getInstance(), ticket.getEstado());
    }

    @Test
    public void naoDeveReabrirTicketAberto() {
        ticket.setEstado(TicketEstadoAberto.getInstance());
        assertFalse(ticket.reabrir());
    }

    @Test
    public void naoDeveAguardarTicketAberto() {
        ticket.setEstado(TicketEstadoAberto.getInstance());
        assertFalse(ticket.aguardarCliente());
    }

    @Test
    public void naoDeveResponderTicketAberto() {
        ticket.setEstado(TicketEstadoAberto.getInstance());
        assertFalse(ticket.responder());
    }

    @Test
    public void naoDeveResolverTicketAberto() {
        ticket.setEstado(TicketEstadoAberto.getInstance());
        assertFalse(ticket.resolver());
    }

    // Ticket Em Atendimento


    @Test
    public void deveAguardarClienteQuandoTicketEmAtendimento() {
        ticket.setEstado(TicketEstadoEmAtendimento.getInstance());
        assertTrue(ticket.aguardarCliente());
        assertEquals(TicketEstadoAguardandoCliente.getInstance(), ticket.getEstado());
    }

    @Test
    public void deveResolverTicketEmAtendimento() {
        ticket.setEstado(TicketEstadoEmAtendimento.getInstance());
        assertTrue(ticket.resolver());
        assertEquals(TicketEstadoResolvido.getInstance(), ticket.getEstado());
    }

    @Test
    public void naoDeveAtribuirTicketEmAtendimento() {
        ticket.setEstado(TicketEstadoEmAtendimento.getInstance());
        assertFalse(ticket.atribuir());
    }

    @Test
    public void naoDeveReabrirTicketEmAtendimento() {
        ticket.setEstado(TicketEstadoEmAtendimento.getInstance());
        assertFalse(ticket.reabrir());
    }

    @Test
    public void naoDeveResponderTicketEmAtendimento() {
        ticket.setEstado(TicketEstadoEmAtendimento.getInstance());
        assertFalse(ticket.responder());
    }

    @Test
    public void naoDeveFecharTicketEmAtendimento() {
        ticket.setEstado(TicketEstadoEmAtendimento.getInstance());
        assertFalse(ticket.fechar());
    }

    // Ticket Aguardando Cliente

    @Test
    public void deveResponderTicketAguardandoCliente() {
        ticket.setEstado(TicketEstadoAguardandoCliente.getInstance());
        assertTrue(ticket.responder());
        assertEquals(TicketEstadoEmAtendimento.getInstance(), ticket.getEstado());
    }

    @Test
    public void deveFecharTicketAguardandoCliente() {
        ticket.setEstado(TicketEstadoAguardandoCliente.getInstance());
        assertTrue(ticket.fechar());
        assertEquals(TicketEstadoFechado.getInstance(), ticket.getEstado());
    }

    @Test
    public void naoDeveAtribuirTicketAguardandoCliente() {
        ticket.setEstado(TicketEstadoAguardandoCliente.getInstance());
        assertFalse(ticket.atribuir());
    }

    @Test
    public void naoDeveAguardarClienteQuandoTicketAguardandoCliente() {
        ticket.setEstado(TicketEstadoAguardandoCliente.getInstance());
        assertFalse(ticket.aguardarCliente());
    }

    @Test
    public void naoDeveResolverTicketAguardandoCliente() {
        ticket.setEstado(TicketEstadoAguardandoCliente.getInstance());
        assertFalse(ticket.resolver());
    }

    @Test
    public void naoDeveReabrirTicketAguardandoCliente() {
        ticket.setEstado(TicketEstadoAguardandoCliente.getInstance());
        assertFalse(ticket.reabrir());
    }


    // Ticket Resolvido

    @Test
    public void deveReabrirTicketResolvido() {
        ticket.setEstado(TicketEstadoResolvido.getInstance());
        assertTrue(ticket.reabrir());
        assertEquals(TicketEstadoEmAtendimento.getInstance(), ticket.getEstado());
    }

    @Test
    public void deveFecharTicketResolvido() {
        ticket.setEstado(TicketEstadoResolvido.getInstance());
        assertTrue(ticket.fechar());
        assertEquals(TicketEstadoFechado.getInstance(), ticket.getEstado());
    }

    @Test
    public void naoDeveAtribuirTicketResolvido() {
        ticket.setEstado(TicketEstadoResolvido.getInstance());
        assertFalse(ticket.atribuir());
    }

    @Test
    public void naoDeveAguardarClienteQuandoTicketResolvido() {
        ticket.setEstado(TicketEstadoResolvido.getInstance());
        assertFalse(ticket.aguardarCliente());
    }

    @Test
    public void naoDeveResponderTicketResolvido() {
        ticket.setEstado(TicketEstadoResolvido.getInstance());
        assertFalse(ticket.responder());
    }

    @Test
    public void naoDeveResolverTicketEmAtendimento() {
        ticket.setEstado(TicketEstadoResolvido.getInstance());
        assertFalse(ticket.resolver());
    }

    // Ticket Fechado

    @Test
    public void naoDeveAtribuirTicketFechado() {
        ticket.setEstado(TicketEstadoFechado.getInstance());
        assertFalse(ticket.atribuir());
    }

    @Test
    public void naoDeveAguardarClienteQuandoTicketFechado() {
        ticket.setEstado(TicketEstadoFechado.getInstance());
        assertFalse(ticket.aguardarCliente());
    }

    @Test
    public void naoDeveResponderTicketFechado() {
        ticket.setEstado(TicketEstadoFechado.getInstance());
        assertFalse(ticket.responder());
    }

    @Test
    public void naoDeveResolverTicketFechado() {
        ticket.setEstado(TicketEstadoFechado.getInstance());
        assertFalse(ticket.resolver());
    }

    @Test
    public void naoDeveReabrirTicketFechado() {
        ticket.setEstado(TicketEstadoFechado.getInstance());
        assertFalse(ticket.reabrir());
    }

    @Test
    public void naoDeveFecharTicketFechado() {
        ticket.setEstado(TicketEstadoFechado.getInstance());
        assertFalse(ticket.fechar());
    }

}

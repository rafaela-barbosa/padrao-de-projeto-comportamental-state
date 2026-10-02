
public class TicketEstadoAguardandoCliente extends TicketEstado{

    private TicketEstadoAguardandoCliente() {};

    private static TicketEstadoAguardandoCliente instance = new TicketEstadoAguardandoCliente();
    public static TicketEstadoAguardandoCliente getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Aguardando Cliente";
    }

    public boolean responder(Ticket ticket) {
        ticket.setEstado(TicketEstadoEmAtendimento.getInstance());
        return true;
    }

    public boolean fechar(Ticket ticket) {
        ticket.setEstado(TicketEstadoFechado.getInstance());
        return true;
    }

}


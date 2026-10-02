
public class TicketEstadoAberto extends TicketEstado{

    private TicketEstadoAberto() {};

    private static TicketEstadoAberto instance = new TicketEstadoAberto();
    public static TicketEstadoAberto getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Aberto";
    }

    public boolean atribuir(Ticket ticket) {
        ticket.setEstado(TicketEstadoEmAtendimento.getInstance());
        return true;
    }

    public boolean fechar(Ticket ticket) {
        ticket.setEstado(TicketEstadoFechado.getInstance());
        return true;
    }

}

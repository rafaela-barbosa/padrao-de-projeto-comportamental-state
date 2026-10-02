
public class TicketEstadoResolvido extends TicketEstado{

    private TicketEstadoResolvido () {};

    private static TicketEstadoResolvido instance = new TicketEstadoResolvido();
    public static TicketEstadoResolvido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Resolvido";
    }

    public boolean reabrir(Ticket ticket) {
        ticket.setEstado(TicketEstadoEmAtendimento.getInstance());
        return true;
    }

    public boolean fechar(Ticket ticket) {
        ticket.setEstado(TicketEstadoFechado.getInstance());
        return true;
    }
}

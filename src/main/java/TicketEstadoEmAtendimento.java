
public class TicketEstadoEmAtendimento extends TicketEstado{

    private TicketEstadoEmAtendimento() {};

    private static TicketEstadoEmAtendimento instance = new TicketEstadoEmAtendimento();
    public static TicketEstadoEmAtendimento getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em Atendimento";
    }

    public boolean aguardarCliente(Ticket ticket) {
        ticket.setEstado(TicketEstadoAguardandoCliente.getInstance());
        return true;
    }

    public boolean resolver(Ticket ticket) {
        ticket.setEstado(TicketEstadoResolvido.getInstance());
        return true;
    }

}

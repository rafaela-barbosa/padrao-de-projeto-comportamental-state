
public class TicketEstadoFechado extends TicketEstado{

    private TicketEstadoFechado() {};

    private static TicketEstadoFechado instance = new TicketEstadoFechado();
    public static TicketEstadoFechado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Fechado";
    }

}

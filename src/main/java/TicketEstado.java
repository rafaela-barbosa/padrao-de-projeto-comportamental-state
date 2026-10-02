
public abstract class TicketEstado {

    public abstract String getEstado();

    public boolean atribuir(Ticket ticket){
        return false;
    }

    public boolean aguardarCliente(Ticket ticket) {
        return false;
    }

    public boolean responder(Ticket ticket) {
        return false;
    }

    public boolean resolver(Ticket ticket) {
        return false;
    }

    public boolean reabrir(Ticket ticket) {
        return false;
    }

    public boolean fechar(Ticket ticket) {
        return false;
    }

}

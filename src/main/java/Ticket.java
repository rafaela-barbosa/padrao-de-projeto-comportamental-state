
public class Ticket {

    private String titulo;
    private TicketEstado estado;

    public Ticket () {
        this.estado = TicketEstadoAberto.getInstance();
    }

    public void setEstado(TicketEstado estado) {
        this.estado = estado;
    }

    public boolean atribuir () {
        return estado.atribuir(this);
    }

    public boolean aguardarCliente () {
        return estado.aguardarCliente(this);
    }

    public boolean responder() {
        return estado.responder(this);
    }

    public boolean resolver() {
        return estado.resolver(this);
    }

    public boolean reabrir() {
        return estado.reabrir(this);
    }

    public boolean fechar() {
        return estado.fechar(this);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public TicketEstado getEstado() {
        return estado;
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

}
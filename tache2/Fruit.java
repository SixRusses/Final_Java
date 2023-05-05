package m1.examen_final.tache2;

public abstract class Fruit {

    protected String origin;
    protected Ticket ticket;

    public Fruit(String origin) {
        this.origin = origin;
        this.ticket = null;
    }

    public Fruit(String origin, Ticket ticket) {
        this.origin = origin;
        this.ticket = ticket;
    }

    public long getValue() {
        if (ticket != null) {
            return ticket.getValue();
        }
        return getValueWithoutDiscount();
    }

    public abstract long getValueWithoutDiscount();
}

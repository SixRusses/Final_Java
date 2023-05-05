package m1.examen_final.tache2;

public class Banana {

    private String origin;
    private long value = 50;

    public Banana (String origin) {
        this.origin = origin;
    }

    public Banana (String origin, Ticket ticket) {
        this.origin = origin;
        this.value = ticket.getValue();
    }

    public long getValueWithoutDiscount() {
        return value;
    }

    public long getValue() {
        return this.value;
    }

    public String getOrigin() {
        return origin;
    }
}

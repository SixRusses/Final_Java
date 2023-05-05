package m1.examen_final.tache2;

public class Orange extends Fruit {
    public String origin;
    private long value;

    private int seedsLevel;



    // Constructeur
    public Orange (String origin, long value) {
        super(origin);
        this.value = value;
        this.seedsLevel = 0; //Niveau de pépins par défaut
    }

    public Orange (String origin, long value, int seedsLevel) throws IllegalStateException {
        super(origin);
        long maxSeedsLevel = value / 10;
        if (seedsLevel > maxSeedsLevel) {
            throw new IllegalArgumentException("Le niveau de pépins est trop élevé pour cette orange.");
        }
        this.value = value - (5 * seedsLevel);
        this.seedsLevel = seedsLevel;
    }

    public Orange(String origin, Ticket ticket) {
        super(origin, ticket);
        this.value = ticket.getValue();
        this.seedsLevel = 0;
    }

    public long getValueWithoutDiscount() {
        return value;
    }

    public long getValue() {
        return value;
    }

    public String getOrigin() {
        return origin;
    }

    public int getSeedsLevel() {
        return seedsLevel;
    }

    @Override
    public String toString() {
        return "Orange " + origin + " " + getValue();
    }


    // A VERIFIER
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Orange)) {
            return false;
        }
        if (origin != null)
        {
            Orange o = (Orange) obj;
            return this.origin.equals(o.origin) && this.getValue() == o.getValue() && this.seedsLevel == o.seedsLevel;
        }

        return false;
    }


}

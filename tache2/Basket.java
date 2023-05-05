package m1.examen_final.tache2;

import java.util.ArrayList;

public class Basket {

    private static int counter = 0;
    private int id;
    private ArrayList<Orange> oranges;
    private ArrayList<Banana> bananas;

    public Basket() {
        this.id = ++counter;
        this.oranges = new ArrayList<Orange>();
        this.bananas = new ArrayList<Banana>();
    }

    public void addOrange(Orange orange) {
        oranges.add(orange);
    }

    public void addBanana(Banana banana) {
        bananas.add(banana);
    }

    public int getId() {
        return this.id;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Basket id - ").append(this.id).append(" - [\n");
        for (Orange orange : oranges) {
            sb.append(orange.toString()).append("\n");
        }
        sb.append("]");
        return sb.toString();
    }

    public long getTotalValue() {
        long total = 0;
        for (Orange orange : oranges) {
            total += orange.getValue();
        }
        return total;
    }

    public void boycottOrigin(String country) {
        ArrayList<Orange> orangesToRemove = new ArrayList<>();
        ArrayList<Banana> bananasToRemove = new ArrayList<>();

        for (Orange orange : oranges) {
            if (orange.getOrigin().equals(country)) {
                orangesToRemove.add(orange);
            }
        }

        for (Banana banana : bananas) {
            if (banana.getOrigin().equals(country)) {
                bananasToRemove.add(banana);
            }
        }

        oranges.removeAll(orangesToRemove);
        bananas.removeAll(bananasToRemove);
    }


}

package org.example;

public class Man extends Person {
    private boolean hasBike;

    public Man(String firstName, String lastName, int age, boolean partner, boolean hasBike) {
        super(firstName, lastName, age, partner);
        this.hasBike = hasBike;
    }

    public boolean hasBike() {
        return hasBike;
    }

    public void setHasBike(boolean hasBike) {
        this.hasBike = hasBike;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has bike: " + (hasBike ? "Yes" : "No"));
    }
}

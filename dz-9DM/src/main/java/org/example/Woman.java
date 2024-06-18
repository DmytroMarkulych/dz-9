package org.example;

public class Woman extends Person {
    private boolean hasLory;
    private boolean isRetired;
    private boolean registerPartnership;
    private boolean deregisterPartnership;

    public Woman(String firstName, String lastName, int age, boolean partner, boolean hasLory, boolean isRetired, boolean registerPartnership, boolean deregisterPartnership) {
        super(firstName, lastName, age, partner);
        this.hasLory = hasLory;
        this.isRetired = isRetired;
        this.registerPartnership = registerPartnership;
        this.deregisterPartnership = deregisterPartnership;
    }

    public boolean hasLory() {
        return hasLory;
    }

    public void setHasLory(boolean hasLory) {
        this.hasLory = hasLory;
    }

    public boolean isRetired() {
        return isRetired;
    }

    public void setRetired(boolean isRetired) {
        this.isRetired = isRetired;
    }

    public boolean hasRegisterPartnership() {
        return registerPartnership;
    }

    public void setRegisterPartnership(boolean registerPartnership) {
        this.registerPartnership = registerPartnership;
    }

    public boolean checkAndRegisterPartnership(Man man) {
        if (man == null) {
            throw new IllegalArgumentException("Man cannot be null");
        }
        if (registerPartnership) {
            setLastName(man.getLastName());
            return true;
        }
        return false;
    }

    public boolean isDeregisterPartnership() {
        return deregisterPartnership;
    }

    public void setDeregisterPartnership(boolean deregisterPartnership) {
        this.deregisterPartnership = deregisterPartnership;
    }

    public boolean returnDeregisterPartnership(String originalLastName) {
        if (originalLastName == null || originalLastName.isEmpty()) {
            throw new IllegalArgumentException("Original last name cannot be null or empty");
        }
        if (deregisterPartnership) {
            setLastName(originalLastName);
            return true;
        }
        return false;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Lory: " + (hasLory ? "Yes" : "No"));
        System.out.println("Retired: " + (isRetired ? "Yes" : "No"));
        System.out.println("Register Partnership: " + (registerPartnership ? "Yes" : "No"));
        System.out.println("Deregister Partnership: " + (deregisterPartnership ? "Yes" : "No"));
    }
}

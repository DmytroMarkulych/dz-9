package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            Man man = new Man("John", "Doe", 30, true, true);
            Woman woman = new Woman("Jane", "Smith", 28, true, true, true, true, true);

            // Перевірка реєстрації партнерства
            if (woman.checkAndRegisterPartnership(man)) {
                System.out.println("Partnership registered successfully.");
            } else {
                System.out.println("Partnership not registered.");
            }

            woman.displayInfo();

            woman.setDeregisterPartnership(true);
            if (woman.returnDeregisterPartnership("Smith")) {
                System.out.println("Partnership deregistered successfully.");
            } else {
                System.out.println("Partnership not deregistered.");
            }

            woman.displayInfo();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

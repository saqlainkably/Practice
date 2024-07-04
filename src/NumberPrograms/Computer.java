package NumberPrograms;
//   Write a Java program to create a class called "Computer" with instance variables "processor," "RAM," and "storage."
//   Include a method to calculate the price of the computer based on the processor, RAM, and storage capacity
//   and a method to print the computer's processor, RAM, and storage capacity.
public class Computer {
    // Instance variables
    private String processor;
    private int RAM; // in GB
    private int storage; // in GB

    // Constructor
    public Computer(String processor, int RAM, int storage) {
        this.processor = processor;
        this.RAM = RAM;
        this.storage = storage;
    }

    // Method to calculate price based on processor, RAM, and storage
    public double calculatePrice() {
        // Dummy calculation based on some arbitrary factors
        double basePrice = 800; // Base price
        double RAMFactor = 50; // Price per GB of RAM
        double storageFactor = 0.1; // Price per GB of storage

        // Calculate price based on processor, RAM, and storage
        double price = basePrice + RAM * RAMFactor + storage * storageFactor;

        // Adjust price based on processor type if needed
        if (processor.equals("Intel i9")) {
            price *= 1.3; // 30% increase for Intel i9 processors
        } else if (processor.equals("AMD Ryzen 9")) {
            price *= 1.2; // 20% increase for AMD Ryzen 9 processors
        }

        return price;
    }

    // Method to print computer details
    public void printComputerDetails() {
        System.out.println("Computer Details:");
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + RAM + " GB");
        System.out.println("Storage: " + storage + " GB");
    }

    // Main method to test the Computer class
    public static void main(String[] args) {
        // Creating instances of Computer
        Computer computer1 = new Computer("Intel i9", 16, 512);
        Computer computer2 = new Computer("AMD Ryzen 7", 8, 256);

        // Printing details of computer1
        computer1.printComputerDetails();
        double price1 = computer1.calculatePrice();
        System.out.println("Price: $" + price1);

        // Printing details of computer2
        computer2.printComputerDetails();
        double price2 = computer2.calculatePrice();
        System.out.println("Price: $" + price2);
    }
}

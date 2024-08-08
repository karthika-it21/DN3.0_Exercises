package com.example.test;

import com.example.Computer;

public class TestBuilderPattern {
    public static void main(String[] args) {
        // Create a basic computer
        Computer basicComputer = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM("8GB")
                .setStorage("256GB SSD")
                .build();

        System.out.println("Basic Computer: " + basicComputer);

        // Create a high-end gaming computer
        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGPU("NVIDIA RTX 3080")
                .setPowerSupply("850W")
                .setMotherboard("ASUS ROG Strix")
                .build();

        System.out.println("Gaming Computer: " + gamingComputer);
    }
}

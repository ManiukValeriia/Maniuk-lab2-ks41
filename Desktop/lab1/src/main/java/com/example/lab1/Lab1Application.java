package com.example.lab1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class Lab1Application implements CommandLineRunner {

    private final SumAction sumAction;
    private final FactorialAction factorialAction;
    private final MultiplyAction multiplyAction; // ✅ добавили

    public Lab1Application(SumAction sumAction, FactorialAction factorialAction, MultiplyAction multiplyAction) {
        this.sumAction = sumAction;
        this.factorialAction = factorialAction;
        this.multiplyAction = multiplyAction;
    }

    public static void main(String[] args){
        SpringApplication.run(Lab1Application.class, args);
    }

    @Bean
    public static Scanner scanner() {
		// Демонстраційна зміна для merge

        return new Scanner(System.in);
    }

    @Override
    public void run(String... args) {
        // Сумма 
        sumAction.execute();
        System.out.printf("%d + %d = %d%n", sumAction.getA(), sumAction.getB(), sumAction.getResult());

        // Факториал
        factorialAction.execute();
        System.out.printf("%d! = %d%n", factorialAction.getN(), factorialAction.getResult());

        // ✅ Новое действие — умножение
        multiplyAction.execute(); 
        System.out.printf("%d * %d = %d%n", multiplyAction.getA(), multiplyAction.getB(), multiplyAction.getResult());
    }
}

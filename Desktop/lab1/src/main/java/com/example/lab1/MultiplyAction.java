package com.example.lab1;

import org.springframework.stereotype.Component;
import java.util.Scanner;

@Component
public class MultiplyAction {
    private final Scanner sc;
    private int a, b, result;

    public MultiplyAction(Scanner sc) { this.sc = sc; }

    public void execute() {
        System.out.print("\nenter a => ");
        a = sc.nextInt();
        System.out.print("enter b => ");
        b = sc.nextInt();
        result = a * b;
    }

    public int getA() { return a; }
    public int getB() { return b; }
    public int getResult() { return result; }
}


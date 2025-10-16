package com.example.lab1;

import org.springframework.stereotype.Component;
import java.util.Scanner;

@Component
public class FactorialAction {
    private final Scanner sc;
    private int n;
    private long result;

    public FactorialAction(Scanner sc) { this.sc = sc; }

    public void execute() {
        System.out.print("\nenter n => ");
        n = sc.nextInt();
        result = 1;
        for (int i = 1; i <= n; i++) result *= i;
    }

    public int getN() { return n; }
    public long getResult() { return result; }
}

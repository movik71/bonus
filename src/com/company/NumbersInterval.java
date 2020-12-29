package com.company;

public class NumbersInterval {

    private String line;

    public NumbersInterval(String line) {
        this.line = line;
    }

    public void printIntervals() {
        String[] numbers = line.split(" ");
        String current = numbers[0];
        int i = 1;
        while (true) {
            current = current.replace(",", "");
            if (current.equals("eot")) {
                break;
            }
            int number = Integer.parseInt(current);
            System.out.print(number);
            String next = numbers[i].replace(",", "");
            int last = 0;
            while (!next.equals("eot")) {
                int n = Integer.parseInt(next);
                if ((n-1) == number) {
                    last = n;
                    number = n;
                    i++;
                    next = numbers[i].replace(",", "");
                }
                else {
                    break;
                }
            }
            if (last != 0) {
                System.out.print("-" + last);
            }
            if (!numbers[i].equals("eot")) {
                System.out.print("; ");
            }
            else {
                System.out.print(" eot");
            }
            current = numbers[i];
            i++;
        }
    }
}

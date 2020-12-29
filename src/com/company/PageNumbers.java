package com.company;

public class PageNumbers {

    private String line;

    public PageNumbers(String line) {
        this.line = line;
    }

    // Печатает последовательные номера печатаемых страниц
    public void printConsecutiveNumbers() {
        String[] numbers = line.split(" ");
        String current = numbers[0];
        int i = 1;
        while (!current.equals("eot")) {
            current = current.replace(",", "");
            if (!current.contains("-")) {
                System.out.println(current);
            }
            else {
                String[] pair = current.split("-");
                int first = Integer.parseInt(pair[0]);
                int second = Integer.parseInt(pair[1]);
                if (first >= second) {
                    for (int j = second; j <= first; j++) {
                        System.out.println(j);
                    }
                }
                else {
                    for (int j = first; j <= second; j++) {
                        System.out.println(j);
                    }
                }
            }
            current = numbers[i];
            i++;
        }
    }
}

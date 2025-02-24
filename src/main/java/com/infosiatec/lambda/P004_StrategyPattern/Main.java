package com.infosiatec.lambda.P004_StrategyPattern;

public class Main {

    /**
     * Strategy pattern example.
     * Interface로 대표되는 알고리즘 패밀리를 정의하고, 각각의 알고리즘을 구현한 클래스를 만들어서 사용하는 패턴.
     */
    public static void main(String[] args) {

        String text = "This is a text from 20 April 2050";

        String noNrClassic = Remover.remove(text, new NumberRemover());
        System.out.println("No numbers result (classic): " + noNrClassic);

        String noWsClassic = Remover.remove(text, new WhitespacesRemover());
        System.out.println("No whitespaces result (classic): " + noWsClassic);

        String noNr = Remover.remove(text, s -> s.replaceAll("\\d", ""));
        System.out.println("\nNo numbers result (lambda): " + noNr);

        String noWs = Remover.remove(text, s -> s.replaceAll("\\s", ""));
        System.out.println("No whitespaces result (lambda): " + noWs);
    }

}

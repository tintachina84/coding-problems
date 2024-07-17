package com.infosiatec.lambda.P002_ExecuteAroundPattern;

import java.io.IOException;
import java.util.Scanner;

public class Main {

  /**
   * Execute Arount Patter (전후 처리 패턴)
   * 특정 작업을 둘러싼 보일러 플레이트 코드를 제거하기 위해 쓰임.
   * 주로 리소스를 열고 닫는 작업을 처리할 때 유용함.
   * @FunctionalInterface를 사용하는 것 외에 Doubles.read()를 재사용함으로써 코드 중복을 줄임.
   */
  public static void main(String[] args) throws IOException {

    double singleDouble = Doubles.read((Scanner sc) -> getFirst(sc));
    System.out.println("Single double: " + singleDouble);

    double sumAllDoubles = Doubles.read((Scanner sc) -> sumAll(sc));
    System.out.println("Sum all doubles: " + sumAllDoubles);
  }

  private static double getFirst(Scanner scanner) {
    if (scanner.hasNextDouble()) {
      return scanner.nextDouble();
    }

    return Double.NaN;
  }

  private static double sumAll(Scanner scanner) {

    double sum = 0.0d;
    while (scanner.hasNextDouble()) {
      sum += scanner.nextDouble();
    }

    return sum;
  }

}

package com.infosiatec.lambda.P001_WritingFunctionalInterface;

import java.util.Arrays;
import java.util.List;

public class Main {

  /**
   * 1. Melon 클래스 작성
   * 2. 멜론을 종류별로 필터링하는 기능을 제공해달라는 요청을 받음.
   * 3. Filters라는 유틸리티 클래스를 만들고 멜론 목록과 필터링할 유형을 파라미터로 받는 static 메서드를 만들었음.
   */
  public static void main(String[] args) {

    List<Melon> melons = Arrays.asList(
        new Melon("Gac", 5500, "Europe"), new Melon("Bailan", 6000, "China"),
        new Melon("Watermelon", 1200, "Europe"), new Melon("Gac", 3400, "US"),
        new Melon("Bailan", 1300, "China"));

    // 타입별 필터
    List<Melon> bailans = Filters.filterByType(melons, "Bailan");
    System.out.println("Bailans: " + bailans);

    // 무게별 필터
    List<Melon> melonsOf1200g = Filters.filterByWeight(melons, 1200);
    System.out.println("Melons of 1200 grams: " + melonsOf1200g);

    // 타입 및 무게별 필터
    List<Melon> bailansOf1300g = Filters.filterByTypeAndWeight(melons, "Bailan", 1300);
    System.out.println("Bailans of 1300 grams: " + bailansOf1300g);

    List<Melon> gacs = Filters.filterMelons(melons, new GacMelonPredicate());
    List<Melon> huge = Filters.filterMelons(melons, new HugeMelonPredicate());
    System.out.println("Gacs: " + gacs);
    System.out.println("Huge: " + huge);

    List<Melon> europeans = Filters
        .filterMelons(melons, new MelonPredicate() {

          @Override
          public boolean test(Melon melon) {
            return "europe".equalsIgnoreCase(melon.getOrigin());
          }
        });
    System.out.println("Europeans: " + europeans);

    List<Melon> europeansLambda = Filters
        .filterMelons(melons, m -> "europe".equalsIgnoreCase(m.getOrigin()));
    System.out.println("Europeans (via lambda): " + europeansLambda);

    List<Melon> watermelons = Filters
        .filter(melons, (Melon m) -> "Watermelon".equalsIgnoreCase(m.getType()));
    System.out.println("Watermelons: " + watermelons);

    List<Integer> numbers = Arrays.asList(1, 13, 15, 2, 67);
    List<Integer> smallThan10 = Filters
        .filter(numbers, (Integer i) -> i < 10);
    System.out.println("Numbers < 10: " + smallThan10);
  }
}

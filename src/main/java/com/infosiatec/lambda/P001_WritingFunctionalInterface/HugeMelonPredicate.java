package com.infosiatec.lambda.P001_WritingFunctionalInterface;

public class HugeMelonPredicate implements MelonPredicate {

  @Override
  public boolean test(Melon melon) {
    return melon.getWeight() > 5000;
  }
}

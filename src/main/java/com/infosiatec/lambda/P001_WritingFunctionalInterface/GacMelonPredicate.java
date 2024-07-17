package com.infosiatec.lambda.P001_WritingFunctionalInterface;

public class GacMelonPredicate implements MelonPredicate {

  @Override
  public boolean test(Melon melon) {
    return "gac".equalsIgnoreCase(melon.getType());
  }
}

package com.infosiatec.lambda.P003_FactoryPattern;

public class Main {

    /**
     * 팩토리 패턴은 호출자에게 인스턴스화 프로세스를 노출시키지 않고 여러 종류의 객체를 생성할 수 있게 함.
     * 복잡하거나 민감한 생성 프로세스를 숨기고 호출자에게 직관적이고 쉽게 사용할 수 있는 인터페이스를 제공.
     */
    public static void main(String[] args) {

        천혜향 red = (천혜향) MelonFactory.newInstance(천혜향.class);
        오렌지 orange = (오렌지) MelonFactory.newInstance("레드향", 2000, "red");
        
        System.out.println("천혜향: " + red);
        System.out.println("오렌지: " + orange);
    }
    
}

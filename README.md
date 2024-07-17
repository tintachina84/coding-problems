# JAVA Lambda

### 람다 표현식의 해부
```java
    (File folder, String fileName) -> folder.canRead() && fileName.endsWith(".pdf");

    lambda parameter             arrow              lambda body
```

위 람다의 익명 클래스 버전
```java
FilenameFilter filter = new FilenameFilter() {
  @Override
  public boolean accept(File folder, String fileName) {
    return folder.canRead() && fileName.endsWith(".pdf");
  }
};
```

람다는 함수형 인터페이스의 맥락에서만 사용할 수 있다.

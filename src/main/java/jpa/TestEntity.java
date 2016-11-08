package jpa;

public class TestEntity {
  int a;
  String b;

  @Override
  public String toString() {
    return "TestEntity{" +
      "b='" + b + '\'' +
      ", a=" + a +
      '}';
  }
}
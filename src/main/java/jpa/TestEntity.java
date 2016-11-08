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

  public int getA() {
    return a;
  }

  public TestEntity setA(int a) {
    this.a = a;
    return this;
  }

  public String getB() {
    return b;
  }

  public TestEntity setB(String b) {
    this.b = b;
    return this;
  }
}
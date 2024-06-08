package functionalinterfaceslambdas;

public class client {
  public static void main(String[] args) {
    // Way 1: from fooImpl class
    fooImpl f = new fooImpl();
    f.bar();

    // Way 2: using anonymous class
    foo f1 = new foo() {
      @Override
      public void bar() {
        System.out.println("from anonymous class");
      }
    };
    f1.bar();

    // Way 3: using lambda
    foo f3 = () -> System.out.println("from lambda");
    f3.bar();

  }
}

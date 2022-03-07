package classes.nested;

class LocalClassEx {
  private static int CST = 1;
  private int a = 2;

  // compile time error because LocalClass is not visible in this scope
  // LocalClass instance; 

  static {

    //  compile time error because 'static' is an illegal modifier
    //    static class LocalClass {
    //
    //    }

    class LocalClass {

      int localCst = CST;

      // compile time error because cannot make a static reference to a non static field
      //int localA = a;

      //  compile time error because  can only be defined inside a top-level class or interface or in a static context
      //    interface MyInterface{
      //
      //    }

      public static final int CST = 1;
    }

    abstract class AbstractLocalClass {

    }

    final class FinalLocalClass {

    }

  }

  public void methodA() {
    // LocalClass cannot be resolved to a variable
    // int a = LocalClass.CST;

    int localCst = CST;
    int localA = a;

  }

}

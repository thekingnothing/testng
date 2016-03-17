package test.testng1003;

import org.testng.SkipException;

/**
 *
 */
public class SomeClass {

  public void doSomething() {
    throw new SkipException(""){

    };
  }

}

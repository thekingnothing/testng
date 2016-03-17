package test.testng1003;

import org.testng.annotations.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 */
public class FailedInvocationTest {

  @Test
  public void testSkipException() throws Throwable {

    ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

    Class<?> aClass = classLoader.loadClass(SomeClass.class.getName());
    Method method = aClass.getMethod("doSomething");

    try {
      method.invoke(aClass.newInstance());
    } catch (InvocationTargetException e) {
      throw e.getTargetException();
    }
  }
}

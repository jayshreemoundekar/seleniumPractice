package listeners;

import org.testng.Assert;
import org.testng.SkipException;

public class ListenersTest {
	void test1()
    {
        System.out.println("This is test1");
        Assert.assertEquals("A","A");

    }
    void test2()
    {
        System.out.println("This is test2");
        Assert.assertEquals("A","B");

    }
    void test3()
    {
        System.out.println("This is test3");
        Assert.assertEquals("A","A");
        throw new SkipException("this is Skip exception");
    }

}

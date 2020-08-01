package logic;

import org.testng.annotations.*;

import static org.testng.Assert.*;
public class Test1Tests {
    public Test1 test1;

    @BeforeClass
    public void install(){
        test1 = new Test1();
    }

    @AfterClass
    public void clean(){
        test1=null;
    }

    @Test
    public void test1_001(){
        assertEquals(test1.test(5),2);
    }

    @Test
    public void test1_002(){
        assertEquals(test1.test(21),6);
    }

    @Test
    public void test1_003(){
        assertEquals(test1.test(20),5);
    }

    @Test
    public void test1_004(){
        assertEquals(test1.test(3),2);
    }

    @Test
    public void test1_005(){
        assertEquals(test1.test(6),3);
    }

    @Test
    public void test1_006(){
        assertEquals(test1.test(0),0);
    }

    @Test
    public void test1_007(){
        assertEquals(test1.test(-5),0);
    }
}

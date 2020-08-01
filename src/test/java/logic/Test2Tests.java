package logic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class Test2Tests {
    public Test2 test2;
    @BeforeClass
    public void install(){
        test2 = new Test2();
    }

    @AfterClass
    public void clean(){
        test2=null;
    }

    @Test
    public void test2_001(){
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        assertEquals(test2.test(height),49);
    }

    @Test
    public void test2_002(){
        int[] height = new int[]{3,2,8,1,1,6,5,12,3};
        assertEquals(test2.test(height),40);
    }

    @Test
    public void test2_003(){
        int[] height = new int[]{1,2,3};
        assertEquals(test2.test(height),2);
    }

    @Test
    public void test2_004(){
        int[] height = new int[]{20,5,5,5,8,5,5};
        assertEquals(test2.test(height),32);
    }

    @Test
    public void test2_005(){
        int[] height = new int[]{1,2,3,4,5,6,7,8,0};
        assertEquals(test2.test(height),16);
    }
}

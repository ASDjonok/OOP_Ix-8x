package lab8;

import lab4.Student;
import org.junit.Assert;

public class Test extends Assert {

    @org.junit.Test
    public void test() {
        assertTrue(true);
    }

    @org.junit.Test
    public void test2() {
        assertTrue(false);
    }

    @org.junit.Test
    public void testStudent() throws WrongNameException {
        Student student =
                new Student("1", "", "",
                        1, 1);
        assertEquals(student.getAverageMark(), 1.1, 0.2);
    }
}

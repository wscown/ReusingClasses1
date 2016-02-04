import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by wscown on 2/3/16.
 */
import java.util.ArrayList;

public class ArrayListRotateSpec {

    @Test
    public void testRotate() {

        //With
        ArrayListRotation<String> alr = new ArrayListRotation<String>();

        alr.add("test1");
        alr.add("test2");
        alr.add("test3");
        alr.add("test4");
        alr.add("test5");

        assertEquals("1st entry of the array should have been 'test1'", "test1", alr.get(0));
        assertEquals("2nd entry of the array should have been 'test2'", "test2", alr.get(1));
        assertEquals("3rd entry of the array should have been 'test3'", "test3", alr.get(2));
        assertEquals("4th entry of the array should have been 'test4'", "test4", alr.get(3));
        assertEquals("5th entry of the array should have been 'test5'", "test5", alr.get(4));

        //When
        alr.rotate(1);

        //Then
        assertEquals("1st entry of the array should have been 'test2'", "test2", alr.get(0));
        assertEquals("2nd entry of the array should have been 'test3'", "test3", alr.get(1));
        assertEquals("3rd entry of the array should have been 'test4'", "test4", alr.get(2));
        assertEquals("4th entry of the array should have been 'test5'", "test5", alr.get(3));
        assertEquals("5th entry of the array should have been 'test1'", "test1", alr.get(4));

        //When
        alr.rotate(6);

        //Then
        assertEquals("1st entry of the array should have been 'test3'", "test3", alr.get(0));
        assertEquals("2nd entry of the array should have been 'test4'", "test4", alr.get(1));
        assertEquals("3rd entry of the array should have been 'test5'", "test5", alr.get(2));
        assertEquals("4th entry of the array should have been 'test1'", "test1", alr.get(3));
        assertEquals("5th entry of the array should have been 'test2'", "test2", alr.get(4));
    }
}

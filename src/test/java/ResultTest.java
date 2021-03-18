import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import java.util.List;

public class ResultTest {


    @DisplayName("If the first element in the list is less than 0 exception will be thrown")
    @Test
    void testGradingStudent_firstElementLessZero(){

        Result result = new Result();
        List<Integer> list = new LinkedList<>();

        list.add(-5);
        list.add(1);

        assertThrows(Exception.class, () ->{

            Result.gradingStudents(list);
        });
    }

    @DisplayName("If the first element in the list is higher than 60 exception will be thrown")
    @Test
    void testGradingStudent_firstElementHigherSixty(){

        Result result = new Result();
        List<Integer> list = new LinkedList<>();

        list.add(61);
        list.add(1);

        assertThrows(Exception.class, () ->{

            Result.gradingStudents(list);
        });
    }

    @DisplayName ("If list contains only one element an exception will be thrown")
    @Test
    void testGradingStudents_oneElement(){

        Result result = new Result();
        List<Integer> list = new LinkedList<>();
        List<Integer> list1 = new LinkedList<>();

        assertThrows(Exception.class, ()->{

            Result.gradingStudents(list);

        });
    }

    @DisplayName("If the difference between an element in the list and the next multiple of 5 is less than 3 the element is rounded up")
    @Test
    void testGradingStudents_roundingUp() throws Exception {

        Result result = new Result();
        List<Integer> list = new LinkedList<>();
        List<Integer> list1 = new LinkedList<>();

        list.add(2);
        list.add(84);
        list.add(83);

        list1.add(85);
        list1.add(85);

        assertEquals(Result.gradingStudents(list), list1);
    }

    @DisplayName("If an element in the list is less than 37 it will not be rounded up")
    @Test
    void testGradingStudents_notRoundedUp() throws Exception {

        Result result = new Result();
        List<Integer> list = new LinkedList<>();
        List<Integer> list1 = new LinkedList<>();

        list.add(1);
        list.add(29);

        list1.add(29);

        assertEquals(Result.gradingStudents(list), list1);
    }

    @DisplayName("If the difference between an element in the list and the next multiple of 5 is more the 3 the element will not be rounded up")
    @Test
    void testGradingStudents_notRoundedUp2() throws Exception {

        Result result = new Result();
        List<Integer> list = new LinkedList<>();
        List<Integer> list1 = new LinkedList<>();

        list.add(1);
        list.add(57);

        list1.add(57);

        assertEquals(Result.gradingStudents(list), list1);
    }

    @DisplayName("Test checks if an element is less than zero, if so exception will be thrown")
    @Test
    void testGradingStudent_lessZero(){

        Result result = new Result();
        List<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(-6);

        assertThrows(Exception.class, ()->{

            Result.gradingStudents(list);

        });
    }

    @DisplayName("If an element in the list is more than hundred an exception will be thrown")
    @Test
    void testGradingStudent_moreHundred(){

        Result result = new Result();
        List<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(120);

        assertThrows(Exception.class, ()->{

            Result.gradingStudents(list);

        });
    }

    @DisplayName("Test checks if the format of the output is correct")
    @Test
    void testGradeStudent_correctFormat() throws Exception {

        Result result = new Result();
        List<Integer> list = new LinkedList<>();
        List<Integer> finalList = new LinkedList<>();

        list.add(4);
        list.add(73);
        list.add(67);
        list.add(38);
        list.add(33);

        finalList.add(75);
        finalList.add(67);
        finalList.add(40);
        finalList.add(33);

        assertEquals(finalList, Result.gradingStudents(list));

    }

    @DisplayName("Test checks if exception is thrown when list is empty")
    @Test
    void testGradeStudent_isEmpty() throws Exception {

        Result result = new Result();
        List<Integer> list = new LinkedList<>();

        assertThrows(Exception.class, ()->{

            Result.gradingStudents(list);

        });

    }
}

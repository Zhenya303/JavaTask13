import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test

    public void matchesForForSimpleTaskTest() {

        SimpleTask simpleTask = new SimpleTask(1, "Собрать вещи в поход");

        boolean expected = true;

        Assertions.assertEquals(expected, simpleTask.matches("вещи"));
        Assertions.assertNotEquals(expected, simpleTask.matches("Вещи"));
    }

    @Test

    public void matchesForEpicTest() {

        String[] subtasks = {"Шорты", "Тапки", "Майки"};
        Epic epic = new Epic(2, subtasks);

        boolean expected = true;
        boolean actual = epic.matches("Тапки");

        Assertions.assertEquals(expected, epic.matches("Тапки"));
        Assertions.assertNotEquals(expected, epic.matches("тапки"));
    }

    @Test

    public void matchesForMeetingTest() {

        Meeting meeting = new Meeting(
                3,
                "Тренировка на брусьях",
                "Спортивная Гимнастика",
                "Утро понедельника");

        boolean expected = true;
        ;

        Assertions.assertEquals(expected, meeting.matches("Утро"));
        Assertions.assertEquals(expected, meeting.matches("Тренировка"));
        Assertions.assertEquals(expected, meeting.matches("Гимнастика"));
        Assertions.assertNotEquals(expected, meeting.matches("тренировка"));
    }


}


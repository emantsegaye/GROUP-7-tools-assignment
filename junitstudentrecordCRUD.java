import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentRecordCRUDTest {

    private StudentRecordCRUD studentRecordCRUD;

    @BeforeEach
    void setup() {
        studentRecordCRUD = new StudentRecordCRUD();
    }

    @AfterEach
    void tearDown() {
        studentRecordCRUD = null;
    }

    @Test
    void testCreateStudent() {
        studentRecordCRUD.createStudent(); // assume user inputs are provided
        assertEquals(1, studentRecordCRUD.students.size());
    }

    @Test
    void testReadStudents() {
        studentRecordCRUD.createStudent(); // assume user inputs are provided
        studentRecordCRUD.readStudents();
        assertEquals(1, studentRecordCRUD.students.size());
    }

    @Test
    void testUpdateStudent() {
        Student student = new Student("John Doe", "CS", "12345", 20);
        studentRecordCRUD.students.add(student);

        studentRecordCRUD.updateStudent(); // assume user inputs are provided
        assertEquals("John Doe", student.getName());
        assertEquals("CS", student.getDepartment());
        assertEquals("12345", student.getId());
        assertEquals(20, student.getAge());
    }

    @Test
    void testDeleteStudent() {
        Student student = new Student("John Doe", "CS", "12345", 20);
        studentRecordCRUD.students.add(student);

        studentRecordCRUD.deleteStudent(); // assume user inputs are provided
        assertEquals(0, studentRecordCRUD.students.size());
    }
}
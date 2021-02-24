package ChapterThree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeartRateTest {
    HeartRate heartRate;

    @BeforeEach
    void setUp() {
        heartRate = new HeartRate("Daniel", "Idoko", 13, 1, 13, 1987);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void TestIfObjectAtThePointOfrCreationIsNotNull() {
        assertNotNull(heartRate);
    }

    @Test
    void TestIfFirstNameCanBeSet() {
        heartRate.setFirstName("Daniel");
        assertEquals("Daniel", heartRate.getFirstName());
    }

    @Test
    void TestIfLastNameCanBeSet() {
        heartRate.setLastName("Idoko");
        assertEquals("Idoko", heartRate.getLastName());
    }

    @Test
    void TestDateOfBirthCanBeSet() {
        heartRate.setDateOfBirth(13);
        assertEquals(13,heartRate.getDateOfBirth());
    }
    @Test
    void TestThatDayOfBirthCanBeSet(){
        heartRate.setDayOfBirth(1);
        assertEquals(1,heartRate.getMDayOfBirth());
    }
    @Test
    void TestThatYearOfBirthCanBeSet(){
        heartRate.setYearOfBirth(1987);
        assertEquals(1987,heartRate.getYearOfBirth());
    }
    @Test
    void TestThatAPersonsAgeCanBeCalculated(){

        heartRate.calculateAPersonsAge();
    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentAnalyzerTest {
    StudentAnalyzer analyzer = new StudentAnalyzer();

    @Test
    public void testCountExcellentStudents() {

        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        assertEquals(2, analyzer.countExcellentStudents(scores));

        scores = Arrays.asList(9.0, 8.5);
        assertEquals(2, analyzer.countExcellentStudents(scores));

        scores = Collections.emptyList();
        assertEquals(0, analyzer.countExcellentStudents(scores));

        scores = Arrays.asList(0.0, 10.0, 10.0);
        assertEquals(2, analyzer.countExcellentStudents(scores));

        scores = Arrays.asList(-5.0, 12.0, 9.0, 8.0);
        assertEquals(2, analyzer.countExcellentStudents(scores));
    }

    @Test
    public void testCalculateValidAverage() {

        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        assertEquals(8.17, analyzer.calculateValidAverage(scores), 0.01);

        scores = Arrays.asList(9.0, 8.5);
        assertEquals(8.75, analyzer.calculateValidAverage(scores), 0.01);

        scores = Collections.emptyList();
        assertEquals(0.0, analyzer.calculateValidAverage(scores), 0.01);

        scores = Arrays.asList(0.0, 10.0, 10.0);
        assertEquals(6.666, analyzer.calculateValidAverage(scores), 0.01);

        scores = Arrays.asList(-5.0, 12.0, 9.0, 8.0);
        assertEquals(8.5, analyzer.calculateValidAverage(scores), 0.01);
    }
}

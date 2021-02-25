package daniel.tpo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Check PI dots")
    void checkPiDots() {
        assertAll(
                () -> Assertions.assertEquals(0, Calculator.sin(-Math.PI)),
                () -> Assertions.assertEquals(-1, Calculator.sin(-Math.PI / 2)),
                () -> Assertions.assertEquals(0, Calculator.sin(0)),
                () -> Assertions.assertEquals(1, Calculator.sin(Math.PI / 2)),
                () -> Assertions.assertEquals(0, Calculator.sin(Math.PI)),
                () -> Assertions.assertEquals(0, Calculator.sin(3 * Math.PI))
        );
    }

    @Test
    @DisplayName("Check dots from (-PI, PI)")
    void checkDots() {
        assertAll(
                () -> Assertions.assertEquals(-0.842, Calculator.sin(-2.14)),
                () -> Assertions.assertEquals(-0.921, Calculator.sin(-1.17)),
                () -> Assertions.assertEquals(0.932, Calculator.sin(1.2)),
                () -> Assertions.assertEquals(0.259, Calculator.sin(2.88)),
                () -> Assertions.assertEquals(-0.49, Calculator.sin(-2.63)),
                () -> Assertions.assertEquals(-0.605, Calculator.sin(-0.65)),
                () -> Assertions.assertEquals(0.548, Calculator.sin(0.58)),
                () -> Assertions.assertEquals(0.638, Calculator.sin(2.45)),
                () -> Assertions.assertEquals(0.638, Calculator.sin(2.45 + 2 * Math.PI))
        );
    }
}
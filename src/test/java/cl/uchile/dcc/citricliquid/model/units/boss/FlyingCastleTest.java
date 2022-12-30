package cl.uchile.dcc.citricliquid.model.units.boss;

import cl.uchile.dcc.citricliquid.model.units.AbstractUnitTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FlyingCastleTest extends AbstractUnitTest {

    @BeforeEach
    public void setUp(){
        unit = new FlyingCastle(10,2,1,-3);
    }


    @Override
    @Test
    public void constructorTest() {
        final var expectedUnit = new FlyingCastle(10,2,1,-3);
        Assertions.assertEquals(expectedUnit, unit);
    }

    @Override
    @Test
    public void setHpTest() { checkHpTest(5, -8, 12); }

    @Override
    @Test
    public void checkCopyTest() {
        final var expectedUnit = new FlyingCastle(10, 2, 1, -3);
        final var actualUnit = unit.copy();
        // Checks that the copied player have the same parameters as the original
        Assertions.assertEquals(expectedUnit, actualUnit);
        // Checks that the copied player doesn't reference the same object
        Assertions.assertNotSame(expectedUnit, actualUnit);
    }

    @Override
    @Test
    public void setHpConsistencyTest() { checkHpConsistencyTest(); }

    @Override
    @Test
    public void setRollConsistencyTest() { checkRollConsistencyTest(); }
}

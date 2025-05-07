//////////////////////////////////////////////////////////////////// 
// Matteo Marcon 2101060
// Roberto Piovesan 2101065
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class IntegerToRomanTest {
@Test
public void testPrimiTreInteri() {
assertEquals(IntegerToRoman.convert(1),"I");
assertEquals(IntegerToRoman.convert(2),"II");
assertEquals(IntegerToRoman.convert(3),"III");
}
}

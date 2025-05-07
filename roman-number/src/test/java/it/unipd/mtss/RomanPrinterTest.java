//////////////////////////////////////////////////////////////////// 
// Matteo Marcon 2101060
// Roberto Piovesan 2101065
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class RomanPrinterTest {
@Test
public void printerTestPrimiTreInteri() {
assertEquals(RomanPrinter.print(1)," ‾|‾ \n  |  \n _|_ \n");
assertEquals(RomanPrinter.print(2)," ‾|‾  ‾|‾ \n  |    |  \n _|_  _|_ \n");
assertEquals(RomanPrinter.print(3)," ‾|‾  ‾|‾  ‾|‾ \n  |    |    |  \n _|_  _|_  _|_ \n");
}
}

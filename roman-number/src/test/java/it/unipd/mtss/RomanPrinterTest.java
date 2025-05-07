//////////////////////////////////////////////////////////////////// 
// Matteo Marcon 2101060
// Roberto Piovesan 2101065
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class RomanPrinterTest {
@Test
public void printerTestPrimiSeiInteri() {
assertEquals(RomanPrinter.print(1)," ‾|‾ \n  |  \n _|_ \n");
assertEquals(RomanPrinter.print(2)," ‾|‾  ‾|‾ \n  |    |  \n _|_  _|_ \n");
assertEquals(RomanPrinter.print(3)," ‾|‾  ‾|‾  ‾|‾ \n  |    |    |  \n _|_  _|_  _|_ \n");
assertEquals(RomanPrinter.print(4)," ‾|‾  \\    / \n  |    \\  /  \n _|_    \\/   \n");
assertEquals(RomanPrinter.print(5)," \\    / \n  \\  /  \n   \\/   \n");
assertEquals(RomanPrinter.print(6)," \\    /  ‾|‾ \n  \\  /    |  \n   \\/    _|_ \n");

}
}

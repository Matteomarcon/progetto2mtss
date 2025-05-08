//////////////////////////////////////////////////////////////////// 
// Matteo Marcon 2101060
// Roberto Piovesan 2101065
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
public class RomanPrinterTest {
@Test
public void testEccezioni(){
assertThrows(IllegalArgumentException.class, () -> 
RomanPrinter.print(0));
assertThrows(IllegalArgumentException.class, () -> 
RomanPrinter.print(9999));
}
@Test
public void testCostruttore() {
RomanPrinter romanprinter = new RomanPrinter();
assertNotNull(romanprinter);
}
@Test
public void printerTestPrimiDieciInteri() {
assertEquals(RomanPrinter.print(1)," ‾|‾ \n  |  \n _|_ \n");
assertEquals(RomanPrinter.print(2)," ‾|‾  ‾|‾ \n  |    |  \n _|_  _|_ \n");
assertEquals(RomanPrinter.print(3)," ‾|‾  ‾|‾  ‾|‾ \n  |    |    |  \n _|_  _|_  _|_ \n");
assertEquals(RomanPrinter.print(4)," ‾|‾  \\    / \n  |    \\  /  \n _|_    \\/   \n");
assertEquals(RomanPrinter.print(5)," \\    / \n  \\  /  \n   \\/   \n");
assertEquals(RomanPrinter.print(6)," \\    /  ‾|‾ \n  \\  /    |  \n   \\/    _|_ \n");
assertEquals(RomanPrinter.print(7)," \\    /  ‾|‾  ‾|‾ \n  \\  /    |    |  \n"
+"   \\/    _|_  _|_ \n");
assertEquals(RomanPrinter.print(8)," \\    /  ‾|‾  ‾|‾  ‾|‾ \n  \\  /    |    |    |  \n"
+"   \\/    _|_  _|_  _|_ \n");
assertEquals(RomanPrinter.print(9)," ‾|‾  \\  / \n  |    \\/  \n _|_  /  \\ \n");
assertEquals(RomanPrinter.print(10)," \\  / \n  \\/  \n /  \\ \n");
}
}

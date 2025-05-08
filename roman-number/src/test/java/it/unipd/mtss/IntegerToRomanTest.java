//////////////////////////////////////////////////////////////////// 
// Matteo Marcon 2101060
// Roberto Piovesan 2101065
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
public class IntegerToRomanTest {
@Test
public void testEccezioni(){
assertThrows(IllegalArgumentException.class, () -> 
IntegerToRoman.convert(0));
assertThrows(IllegalArgumentException.class, () -> 
IntegerToRoman.convert(9999));
}
@Test
public void testCostruttore() {
IntegerToRoman integertoroman = new IntegerToRoman();
assertNotNull(integertoroman);
}
@Test
public void testPrimiCinquecentoInteri() {
assertEquals(IntegerToRoman.convert(1),"I");
assertEquals(IntegerToRoman.convert(2),"II");
assertEquals(IntegerToRoman.convert(3),"III");
assertEquals(IntegerToRoman.convert(4),"IV");
assertEquals(IntegerToRoman.convert(5),"V");
assertEquals(IntegerToRoman.convert(6),"VI");
assertEquals(IntegerToRoman.convert(7),"VII");
assertEquals(IntegerToRoman.convert(8),"VIII");
assertEquals(IntegerToRoman.convert(9),"IX");
assertEquals(IntegerToRoman.convert(10),"X");
assertEquals(IntegerToRoman.convert(11),"XI");
assertEquals(IntegerToRoman.convert(14),"XIV");
assertEquals(IntegerToRoman.convert(15),"XV");
assertEquals(IntegerToRoman.convert(16),"XVI");
assertEquals(IntegerToRoman.convert(19),"XIX");
assertEquals(IntegerToRoman.convert(20),"XX");
assertEquals(IntegerToRoman.convert(30),"XXX");
assertEquals(IntegerToRoman.convert(40),"XL");
assertEquals(IntegerToRoman.convert(50),"L");
assertEquals(IntegerToRoman.convert(60),"LX");
assertEquals(IntegerToRoman.convert(90),"XC");
assertEquals(IntegerToRoman.convert(100),"C");
assertEquals(IntegerToRoman.convert(200),"CC");
assertEquals(IntegerToRoman.convert(400),"CD");
assertEquals(IntegerToRoman.convert(500),"D");
}
}

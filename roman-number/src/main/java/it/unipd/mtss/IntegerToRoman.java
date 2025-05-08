//////////////////////////////////////////////////////////////////// 
// Matteo Marcon 2101060
// Roberto Piovesan 2101065
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
public static String convert(int number){
String[] lettereRomane = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
int[] interiCorrispondenti = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
if (number < 1 || number > 1000) {
throw new IllegalArgumentException("Devi inserire un numero tra 1 e 1000!");
}
String conversione = "";
for (int i=0; i<interiCorrispondenti.length; i++) {
while (number >= interiCorrispondenti[i]) {
number = number - interiCorrispondenti[i];
conversione = conversione + lettereRomane[i];
}
}
return conversione;
}
}
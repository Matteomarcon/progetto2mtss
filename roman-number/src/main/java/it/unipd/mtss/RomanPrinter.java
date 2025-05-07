//////////////////////////////////////////////////////////////////// 
// Matteo Marcon 2101060
// Roberto Piovesan 2101065
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {
public static String print(int num){
return printAsciiArt(IntegerToRoman.convert(num));
}
private static String printAsciiArt(String romanNumber){
String asciiArt = "";

String[][] lettere = {
{
" |\    /| ", // M
" |‾‾\  ",  // D
" /‾‾\ ",  // C
" |     ",  // L
" \  / ",  // X
" \    / ",  // V
" ‾|‾ " // I
},
{
" | \  / | ", // M
" |   | ",  // D
" |    ",  // C
" |     ",  // L
"  \/  ",  // X
"  \  /  ",  // V
"  |  " // I
},
{
" |  \/  | ", // M
" |__/  ",  // D
" \__/ ",  // C
" |___ ",  // L
" /  \ ",  // X
"   \/   ",  // V
" _|_ " // I
},
};
for( int i=0; i<3; i++) {
for (char c : romanNumber.toCharArray()) {
asciiArt += lettere[i]["MDCLXVI".indexOf(c)];
}
asciiArt += "\n";
}
return asciiArt;
}
}

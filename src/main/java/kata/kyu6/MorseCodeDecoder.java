package main.java.kata.kyu6;

import java.util.HashMap;
import java.util.Map;

public class MorseCodeDecoder {


    public static String decode(String morse) {
        //Replacing the map for some Morse codes
        HashMap<String, String> morseCode = new HashMap<String, String>();
        morseCode.put("....", "H");
        morseCode.put(".", "E");
        morseCode.put("-.--", "Y");
        morseCode.put(".---", "J");
        morseCode.put("..-", "U");
        morseCode.put("-..", "D");

        String[] morseCodeTable = morse.split("((?<=\\s+)|(?=\\s+))");
        StringBuilder decoded = new StringBuilder();
        int counter = 0;
        for(int i=0;i<morseCodeTable.length;i++) {
            if (!morseCodeTable[i].isBlank()) {
                decoded.append(morseCode.get(morseCodeTable[i]));
                counter = 0;
            } else {
                ++counter;
                if (counter == 3)
                    decoded.append(morseCodeTable[i]);
            }
        }
        return decoded.toString();
    }
}

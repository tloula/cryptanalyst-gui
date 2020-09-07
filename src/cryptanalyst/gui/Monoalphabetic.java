/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptanalyst.gui;

/**
 *
 * @author Ian
 */
public class Monoalphabetic {
    private String cipherText;
    private int[] letterFrequency;
    private char[] plainTextMapping;
    private char[] cipherTextMapping;
    
    public Monoalphabetic(String ciphertext, int[] freqency) {
        //use custom frequencies
        this.cipherText = ciphertext;
        this.letterFrequency = freqency;
        this.plainTextMapping = new char[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        this.cipherTextMapping = new char[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    };
    
    public Monoalphabetic(String ciphertext) {
        //use default frequencies
        //from https://www3.nd.edu/~busiforc/handouts/cryptography/letterfrequencies.html
        //freqencies are relative number in 1000.
        this(ciphertext, 
                new int[]{84, 21, 45, 34, 112, 18, 25, 30, 75, 2, 11, 55, 30,
                          67, 72, 32, 2, 76, 57, 70, 36, 10, 13, 3, 18, 3}); 
    };
    

    public void setCalibratedFrequency(String calibration) {
        this.letterFrequency = calcFrequency(calibration);
    };
    
    public int[] getCalibratedFrequency() {
        return this.letterFrequency;
    }
    
    public void setPlaintextMapping(char[] map) {
        //
        this.plainTextMapping = map;
        this.cipherTextMapping = convertMap(map);
    }
    
    public char[] getCipherTextMapping() {
        //This is a mapping of the cipher text to plain text ->
        // Cipher A = Plain M
        // PLAIN   {A M Q F G ...}
        // CIPHER  {A B C D E ...}
        return this.cipherTextMapping;
    }
    
    //USE THIS ONE ON GRAPH
    public char[] getPlainTextMapping() {
        //This is a mapping of the plain text to ciper text ->
        // Plain A = Cipher M
        // CIPHER {A M Q F G ...}
        // PLAIN  {A B C D E ...}
        return this.cipherTextMapping;
    }
    
    public char[] convertMap(char[] initMap) {
        //converts a map of plain -> cipher to a cipher -> plain map and inverse
        //this is accomplished using a mirrored sort
        char[] newMap = new char[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        
        //sort initMap from least to greatest, mirroring moves
        //used insertion sort
        for (int i = 0; i < initMap.length; i++) {
            char initMapKey = initMap[i];
            char newMapKey = newMap[i];
            int j = i-1;
            while (j >= 0 && initMap[i] > initMapKey) {
                initMap[j+1] = initMap[j];
                newMap[j+1] = newMap[j];
                j--;
            }
            initMap[j+1] = initMapKey;
            newMap[j+1] = newMapKey;
        }        
        return newMap;
    }
    
    public String Decode() {
        String plaintext = "";
        String ciphertext = this.cipherText.toUpperCase();
        for (int i = 0;  i < this.cipherText.length(); i++) {
            char currChar = ciphertext.charAt(i);
            int charVal = currChar - 0x41;
            if (charVal < 0 || charVal >= 26) {
                plaintext += this.cipherTextMapping[charVal];
            } else {
                plaintext += currChar;
            }
        }
        return plaintext;
    }
    
    private void initialMap() {
        //generate an initial mapping base on frequencies
        this.plainTextMapping = new char[] {'A', 'B', 'C'};
        this.cipherTextMapping = new char[] {'A', 'B', 'C'};
    }
    
    public int[] getCiphertextFrequency() {
        //returns
        // value: int freq in 1000 char
        // index: ciphertext letter -> {a, b, c, ...}
        return calcFrequency(this.cipherText);
    }
    
    private int[] calcFrequency(String text) {
        //returns
        // value: int freq in 1000 char
        // index: letter -> {a, b, c, ...}
        int charCount = 0;
        int[] newFreq = new int[26];
        text = text.toUpperCase();
        for (int i = 0; i < text.length(); i++) {
            int currChar = text.charAt(i);
            int LetterIndex = currChar - 0x41;
            if (LetterIndex < 0 || LetterIndex >= 26) {
                //space
                continue;
            }
            newFreq[LetterIndex]++;
            charCount++;
        }
        
        for (int i = 0; i < 26; i++) {
            newFreq[i] = (newFreq[i]*1000)/charCount;            
        }
        return newFreq;
    }
}

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
        this.cipherText = ciphertext;
        this.letterFrequency = freqency;
    };
    
    public Monoalphabetic(String ciphertext) {
        //from https://www3.nd.edu/~busiforc/handouts/cryptography/letterfrequencies.html
        //freqencies are relative number in 1000.
        this(ciphertext, 
                new int[]{84, 21, 45, 34, 112, 18, 25, 30, 75, 2, 11, 55, 30,
                          67, 72, 32, 2, 76, 57, 70, 36, 10, 13, 3, 18, 3}); 
    };
    
    public void setFrequency(String calibration) {
        int charCount = 0;
        int[] newFreq = new int[26];
        calibration = calibration.toUpperCase();
        for (int i = 0; i < calibration.length(); i++) {
            int currChar = calibration.charAt(i);
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
        this.letterFrequency = newFreq;
    };
    
    public int[] getFrequency() {
        return this.letterFrequency;
    }
}

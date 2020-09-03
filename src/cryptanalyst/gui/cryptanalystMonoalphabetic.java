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
public class cryptanalystMonoalphabetic {
    private String cipherText;
    private int[] letterFrequency;
    private char[] plainTextMapping;
    private char[] cipherTextMapping;
    
    public cryptanalystMonoalphabetic(String ciphertext, int[] freqency) {
        this.cipherText = ciphertext;
        this.letterFrequency = freqency;
    };
    
    public cryptanalystMonoalphabetic(String ciphertext) {
        this(ciphertext, new int[]{5, 17, 26, 3}); 
    };
    
    
}

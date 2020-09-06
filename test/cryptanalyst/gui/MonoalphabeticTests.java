/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptanalyst.gui;

import cryptanalyst.gui.Monoalphabetic;
import org.junit.Assert;
import org.junit.Test;
import org.junit.*;

/**
 *
 * @author Ian
 */
public class MonoalphabeticTests{
    @Test
    public void testLetterFreqency() {
        Monoalphabetic uut = new Monoalphabetic("THIS IS A TEST");
        int[] freq = uut.getFrequency();
        int[] exp = new int[]{84, 21, 45, 34, 112, 18, 25, 30, 75, 2, 11, 55,
            30, 67, 72, 32, 2, 76, 57, 70, 36, 10, 13, 3, 18, 3};
        Assert.assertArrayEquals(exp , freq);
    }
    
    @Test
    public void testUserLetterFreqency() {
        Monoalphabetic uut = new Monoalphabetic("THIS IS A TEST");
        //Isaiah 45
        String teststr = "“This is what the Lord says to his anointed,\n" +
"    to Cyrus, whose right hand I take hold of\n" +
"to subdue nations before him\n" +
"    and to strip kings of their armor,\n" +
"to open doors before him\n" +
"    so that gates will not be shut:\n" +
"2 \n" +
"I will go before you\n" +
"    and will level the mountains[a];\n" +
"I will break down gates of bronze\n" +
"    and cut through bars of iron.\n" +
"3 \n" +
"I will give you hidden treasures,\n" +
"    riches stored in secret places,\n" +
"so that you may know that I am the Lord,\n" +
"    the God of Israel, who summons you by name.\n" +
"4 \n" +
"For the sake of Jacob my servant,\n" +
"    of Israel my chosen,\n" +
"I summon you by name\n" +
"    and bestow on you a title of honor,\n" +
"    though you do not acknowledge me.\n" +
"5 \n" +
"I am the Lord, and there is no other;\n" +
"    apart from me there is no God.\n" +
"I will strengthen you,\n" +
"    though you have not acknowledged me,\n" +
"6 \n" +
"so that from the rising of the sun\n" +
"    to the place of its setting\n" +
"people may know there is none besides me.\n" +
"    I am the Lord, and there is no other.\n" +
"7 \n" +
"I form the light and create darkness,\n" +
"    I bring prosperity and create disaster;\n" +
"    I, the Lord, do all these things.\n" +
"\n" +
"8 \n" +
"“You heavens above, rain down my righteousness;\n" +
"    let the clouds shower it down.\n" +
"Let the earth open wide,\n" +
"    let salvation spring up,\n" +
"let righteousness flourish with it;\n" +
"    I, the Lord, have created it.\n" +
"\n" +
"9 \n" +
"“Woe to those who quarrel with their Maker,\n" +
"    those who are nothing but potsherds\n" +
"    among the potsherds on the ground.\n" +
"Does the clay say to the potter,\n" +
"    ‘What are you making?’\n" +
"Does your work say,\n" +
"    ‘The potter has no hands’?\n" +
"10 \n" +
"Woe to the one who says to a father,\n" +
"    ‘What have you begotten?’\n" +
"or to a mother,\n" +
"    ‘What have you brought to birth?’\n" +
"\n" +
"11 \n" +
"“This is what the Lord says—\n" +
"    the Holy One of Israel, and its Maker:\n" +
"Concerning things to come,\n" +
"    do you question me about my children,\n" +
"    or give me orders about the work of my hands?\n" +
"12 \n" +
"It is I who made the earth\n" +
"    and created mankind on it.\n" +
"My own hands stretched out the heavens;\n" +
"    I marshaled their starry hosts.\n" +
"13 \n" +
"I will raise up Cyrus[b] in my righteousness:\n" +
"    I will make all his ways straight.\n" +
"He will rebuild my city\n" +
"    and set my exiles free,\n" +
"but not for a price or reward,\n" +
"    says the Lord Almighty.”\n" +
"\n" +
"14 This is what the Lord says:\n" +
"\n" +
"“The products of Egypt and the merchandise of Cush,[c]\n" +
"    and those tall Sabeans—\n" +
"they will come over to you\n" +
"    and will be yours;\n" +
"they will trudge behind you,\n" +
"    coming over to you in chains.\n" +
"They will bow down before you\n" +
"    and plead with you, saying,\n" +
"‘Surely God is with you, and there is no other;\n" +
"    there is no other god.’”\n" +
"\n" +
"15 \n" +
"Truly you are a God who has been hiding himself,\n" +
"    the God and Savior of Israel.\n" +
"16 \n" +
"All the makers of idols will be put to shame and disgraced;\n" +
"    they will go off into disgrace together.\n" +
"17 \n" +
"But Israel will be saved by the Lord\n" +
"    with an everlasting salvation;\n" +
"you will never be put to shame or disgraced,\n" +
"    to ages everlasting.\n" +
"\n" +
"18 \n" +
"For this is what the Lord says—\n" +
"he who created the heavens,\n" +
"    he is God;\n" +
"he who fashioned and made the earth,\n" +
"    he founded it;\n" +
"he did not create it to be empty,\n" +
"    but formed it to be inhabited—\n" +
"he says:\n" +
"“I am the Lord,\n" +
"    and there is no other.\n" +
"19 \n" +
"I have not spoken in secret,\n" +
"    from somewhere in a land of darkness;\n" +
"I have not said to Jacob’s descendants,\n" +
"    ‘Seek me in vain.’\n" +
"I, the Lord, speak the truth;\n" +
"    I declare what is right.\n" +
"\n" +
"20 \n" +
"“Gather together and come;\n" +
"    assemble, you fugitives from the nations.\n" +
"Ignorant are those who carry about idols of wood,\n" +
"    who pray to gods that cannot save.\n" +
"21 \n" +
"Declare what is to be, present it—\n" +
"    let them take counsel together.\n" +
"Who foretold this long ago,\n" +
"    who declared it from the distant past?\n" +
"Was it not I, the Lord?\n" +
"    And there is no God apart from me,\n" +
"a righteous God and a Savior;\n" +
"    there is none but me.\n" +
"\n" +
"22 \n" +
"“Turn to me and be saved,\n" +
"    all you ends of the earth;\n" +
"    for I am God, and there is no other.\n" +
"23 \n" +
"By myself I have sworn,\n" +
"    my mouth has uttered in all integrity\n" +
"    a word that will not be revoked:\n" +
"Before me every knee will bow;\n" +
"    by me every tongue will swear.\n" +
"24 \n" +
"They will say of me, ‘In the Lord alone\n" +
"    are deliverance and strength.’”\n" +
"All who have raged against him\n" +
"    will come to him and be put to shame.\n" +
"25 \n" +
"But all the descendants of Israel\n" +
"    will find deliverance in the Lord\n" +
"    and will make their boast in him.";
        uut.setFrequency(teststr);
        int[] freq = uut.getFrequency();
        int[] exp = new int[]{74, 17, 16, 46, 119, 16, 22, 68, 65, 0, 8, 43, 26,
            57, 94, 10, 0, 63, 65, 94, 25, 11, 25, 0, 25, 0};
        Assert.assertArrayEquals(exp , freq);
        
    }
}

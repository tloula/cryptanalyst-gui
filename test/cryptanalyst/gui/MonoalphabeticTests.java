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
        System.out.println("Testing initial calibration");
        Monoalphabetic uut = new Monoalphabetic("THIS IS A TEST");
        int[] freq = uut.getCalibratedFrequency();
        for (int i : freq) {
            System.out.print(i + ", ");
        }
        System.out.println(" len: " + freq.length);
        int[] exp = new int[]{84, 21, 45, 34, 112, 18, 25, 30, 75, 2, 11, 55,
            30, 67, 72, 32, 2, 76, 57, 70, 36, 10, 13, 3, 18, 3};
        Assert.assertArrayEquals(exp , freq);
    }
    
    @Test
    public void testUserLetterFreqency() {
        System.out.println("Testing user calibration");
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
        uut.setCalibratedFrequency(teststr);
        int[] freq = uut.getCalibratedFrequency();
        int[] exp = new int[]{74, 17, 16, 46, 119, 16, 22, 68, 65, 0, 8, 43, 26,
            57, 94, 10, 0, 63, 65, 94, 25, 11, 25, 0, 25, 0};
        Assert.assertArrayEquals(exp , freq);
        
    }
    
    @Test
    public void testdecryptLetterFreqency() {
        System.out.println("Testing automatic decryption of a ceasar cipher");
        Monoalphabetic uut = new Monoalphabetic("“WKLV LV ZKDW WKH ORUG VDBV WR KLV DQRLQWHG,\n" +
"    WR FBUXV, ZKRVH ULJKW KDQG L WDNH KROG RI\n" +
"WR VXEGXH QDWLRQV EHIRUH KLP\n" +
"    DQG WR VWULS NLQJV RI WKHLU DUPRU,\n" +
"WR RSHQ GRRUV EHIRUH KLP\n" +
"    VR WKDW JDWHV ZLOO QRW EH VKXW:\n" +
"2 \n" +
"L ZLOO JR EHIRUH BRX\n" +
"    DQG ZLOO OHYHO WKH PRXQWDLQV[D];\n" +
"L ZLOO EUHDN GRZQ JDWHV RI EURQCH\n" +
"    DQG FXW WKURXJK EDUV RI LURQ.\n" +
"3 \n" +
"L ZLOO JLYH BRX KLGGHQ WUHDVXUHV,\n" +
"    ULFKHV VWRUHG LQ VHFUHW SODFHV,\n" +
"VR WKDW BRX PDB NQRZ WKDW L DP WKH ORUG,\n" +
"    WKH JRG RI LVUDHO, ZKR VXPPRQV BRX EB QDPH.\n" +
"4 \n" +
"IRU WKH VDNH RI MDFRE PB VHUYDQW,\n" +
"    RI LVUDHO PB FKRVHQ,\n" +
"L VXPPRQ BRX EB QDPH\n" +
"    DQG EHVWRZ RQ BRX D WLWOH RI KRQRU,\n" +
"    WKRXJK BRX GR QRW DFNQRZOHGJH PH.\n" +
"5 \n" +
"L DP WKH ORUG, DQG WKHUH LV QR RWKHU;\n" +
"    DSDUW IURP PH WKHUH LV QR JRG.\n" +
"L ZLOO VWUHQJWKHQ BRX,\n" +
"    WKRXJK BRX KDYH QRW DFNQRZOHGJHG PH,\n" +
"6 \n" +
"VR WKDW IURP WKH ULVLQJ RI WKH VXQ\n" +
"    WR WKH SODFH RI LWV VHWWLQJ\n" +
"SHRSOH PDB NQRZ WKHUH LV QRQH EHVLGHV PH.\n" +
"    L DP WKH ORUG, DQG WKHUH LV QR RWKHU.\n" +
"7 \n" +
"L IRUP WKH OLJKW DQG FUHDWH GDUNQHVV,\n" +
"    L EULQJ SURVSHULWB DQG FUHDWH GLVDVWHU;\n" +
"    L, WKH ORUG, GR DOO WKHVH WKLQJV.\n" +
"\n" +
"8 \n" +
"“BRX KHDYHQV DERYH, UDLQ GRZQ PB ULJKWHRXVQHVV;\n" +
"    OHW WKH FORXGV VKRZHU LW GRZQ.\n" +
"OHW WKH HDUWK RSHQ ZLGH,\n" +
"    OHW VDOYDWLRQ VSULQJ XS,\n" +
"OHW ULJKWHRXVQHVV IORXULVK ZLWK LW;\n" +
"    L, WKH ORUG, KDYH FUHDWHG LW.\n" +
"\n" +
"9 \n" +
"“ZRH WR WKRVH ZKR TXDUUHO ZLWK WKHLU PDNHU,\n" +
"    WKRVH ZKR DUH QRWKLQJ EXW SRWVKHUGV\n" +
"    DPRQJ WKH SRWVKHUGV RQ WKH JURXQG.\n" +
"GRHV WKH FODB VDB WR WKH SRWWHU,\n" +
"    ‘ZKDW DUH BRX PDNLQJ?’\n" +
"GRHV BRXU ZRUN VDB,\n" +
"    ‘WKH SRWWHU KDV QR KDQGV’?\n" +
"10 \n" +
"ZRH WR WKH RQH ZKR VDBV WR D IDWKHU,\n" +
"    ‘ZKDW KDYH BRX EHJRWWHQ?’\n" +
"RU WR D PRWKHU,\n" +
"    ‘ZKDW KDYH BRX EURXJKW WR ELUWK?’\n" +
"\n" +
"11 \n" +
"“WKLV LV ZKDW WKH ORUG VDBV—\n" +
"    WKH KROB RQH RI LVUDHO, DQG LWV PDNHU:\n" +
"FRQFHUQLQJ WKLQJV WR FRPH,\n" +
"    GR BRX TXHVWLRQ PH DERXW PB FKLOGUHQ,\n" +
"    RU JLYH PH RUGHUV DERXW WKH ZRUN RI PB KDQGV?\n" +
"12 \n" +
"LW LV L ZKR PDGH WKH HDUWK\n" +
"    DQG FUHDWHG PDQNLQG RQ LW.\n" +
"PB RZQ KDQGV VWUHWFKHG RXW WKH KHDYHQV;\n" +
"    L PDUVKDOHG WKHLU VWDUUB KRVWV.\n" +
"13 \n" +
"L ZLOO UDLVH XS FBUXV[E] LQ PB ULJKWHRXVQHVV:\n" +
"    L ZLOO PDNH DOO KLV ZDBV VWUDLJKW.\n" +
"KH ZLOO UHEXLOG PB FLWB\n" +
"    DQG VHW PB HALOHV IUHH,\n" +
"EXW QRW IRU D SULFH RU UHZDUG,\n" +
"    VDBV WKH ORUG DOPLJKWB.”\n" +
"\n" +
"14 WKLV LV ZKDW WKH ORUG VDBV:\n" +
"\n" +
"“WKH SURGXFWV RI HJBSW DQG WKH PHUFKDQGLVH RI FXVK,[F]\n" +
"    DQG WKRVH WDOO VDEHDQV—\n" +
"WKHB ZLOO FRPH RYHU WR BRX\n" +
"    DQG ZLOO EH BRXUV;\n" +
"WKHB ZLOO WUXGJH EHKLQG BRX,\n" +
"    FRPLQJ RYHU WR BRX LQ FKDLQV.\n" +
"WKHB ZLOO ERZ GRZQ EHIRUH BRX\n" +
"    DQG SOHDG ZLWK BRX, VDBLQJ,\n" +
"‘VXUHOB JRG LV ZLWK BRX, DQG WKHUH LV QR RWKHU;\n" +
"    WKHUH LV QR RWKHU JRG.’”\n" +
"\n" +
"15 \n" +
"WUXOB BRX DUH D JRG ZKR KDV EHHQ KLGLQJ KLPVHOI,\n" +
"    WKH JRG DQG VDYLRU RI LVUDHO.\n" +
"16 \n" +
"DOO WKH PDNHUV RI LGROV ZLOO EH SXW WR VKDPH DQG GLVJUDFHG;\n" +
"    WKHB ZLOO JR RII LQWR GLVJUDFH WRJHWKHU.\n" +
"17 \n" +
"EXW LVUDHO ZLOO EH VDYHG EB WKH ORUG\n" +
"    ZLWK DQ HYHUODVWLQJ VDOYDWLRQ;\n" +
"BRX ZLOO QHYHU EH SXW WR VKDPH RU GLVJUDFHG,\n" +
"    WR DJHV HYHUODVWLQJ.\n" +
"\n" +
"18 \n" +
"IRU WKLV LV ZKDW WKH ORUG VDBV—\n" +
"KH ZKR FUHDWHG WKH KHDYHQV,\n" +
"    KH LV JRG;\n" +
"KH ZKR IDVKLRQHG DQG PDGH WKH HDUWK,\n" +
"    KH IRXQGHG LW;\n" +
"KH GLG QRW FUHDWH LW WR EH HPSWB,\n" +
"    EXW IRUPHG LW WR EH LQKDELWHG—\n" +
"KH VDBV:\n" +
"“L DP WKH ORUG,\n" +
"    DQG WKHUH LV QR RWKHU.\n" +
"19 \n" +
"L KDYH QRW VSRNHQ LQ VHFUHW,\n" +
"    IURP VRPHZKHUH LQ D ODQG RI GDUNQHVV;\n" +
"L KDYH QRW VDLG WR MDFRE’V GHVFHQGDQWV,\n" +
"    ‘VHHN PH LQ YDLQ.’\n" +
"L, WKH ORUG, VSHDN WKH WUXWK;\n" +
"    L GHFODUH ZKDW LV ULJKW.\n" +
"\n" +
"20 \n" +
"“JDWKHU WRJHWKHU DQG FRPH;\n" +
"    DVVHPEOH, BRX IXJLWLYHV IURP WKH QDWLRQV.\n" +
"LJQRUDQW DUH WKRVH ZKR FDUUB DERXW LGROV RI ZRRG,\n" +
"    ZKR SUDB WR JRGV WKDW FDQQRW VDYH.\n" +
"21 \n" +
"GHFODUH ZKDW LV WR EH, SUHVHQW LW—\n" +
"    OHW WKHP WDNH FRXQVHO WRJHWKHU.\n" +
"ZKR IRUHWROG WKLV ORQJ DJR,\n" +
"    ZKR GHFODUHG LW IURP WKH GLVWDQW SDVW?\n" +
"ZDV LW QRW L, WKH ORUG?\n" +
"    DQG WKHUH LV QR JRG DSDUW IURP PH,\n" +
"D ULJKWHRXV JRG DQG D VDYLRU;\n" +
"    WKHUH LV QRQH EXW PH.\n" +
"\n" +
"22 \n" +
"“WXUQ WR PH DQG EH VDYHG,\n" +
"    DOO BRX HQGV RI WKH HDUWK;\n" +
"    IRU L DP JRG, DQG WKHUH LV QR RWKHU.\n" +
"23 \n" +
"EB PBVHOI L KDYH VZRUQ,\n" +
"    PB PRXWK KDV XWWHUHG LQ DOO LQWHJULWB\n" +
"    D ZRUG WKDW ZLOO QRW EH UHYRNHG:\n" +
"EHIRUH PH HYHUB NQHH ZLOO ERZ;\n" +
"    EB PH HYHUB WRQJXH ZLOO VZHDU.\n" +
"24 \n" +
"WKHB ZLOO VDB RI PH, ‘LQ WKH ORUG DORQH\n" +
"    DUH GHOLYHUDQFH DQG VWUHQJWK.’”\n" +
"DOO ZKR KDYH UDJHG DJDLQVW KLP\n" +
"    ZLOO FRPH WR KLP DQG EH SXW WR VKDPH.\n" +
"25 \n" +
"EXW DOO WKH GHVFHQGDQWV RI LVUDHO\n" +
"    ZLOO ILQG GHOLYHUDQFH LQ WKH ORUG\n" +
"    DQG ZLOO PDNH WKHLU ERDVW LQ KLP.");
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
        uut.setCalibratedFrequency(teststr);
        uut.initialMap();
        System.out.println(uut.Decode());
        System.out.print("Plaintext mapping: ");
        System.out.println(uut.getPlainTextMapping());
    }
}

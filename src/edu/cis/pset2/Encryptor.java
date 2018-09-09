package edu.cis.pset2;

import java.util.Random;

public class Encryptor
{
    private String succ;
    private String encryptedString;

    public Encryptor ()
    {
        succ = "";
        encryptedString = "";
    }



    public void setSucc(String s) {
        succ = s;
    }

    public String getSucc()
    {
        return succ;
    }

    public void setEncryptedString(String e) {
        encryptedString = e;
    }

    public String getEncryptedString()
    {
        return encryptedString;
    }



    public void encrypt( String s )
    {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < s.length(); i++)
        {
            char character = charArray[i];
            int charValue = (int) character;
            if ((charValue > 78 && charValue < 91))
            {
                encryptedString = encryptedString + (char)( 65 + (13 - (91 - charValue )));
                // upper case
            }
            else if (charValue > 110 && charValue < 123)
            {
                encryptedString = encryptedString + (char)( 97 + (13 - (123 - charValue )));
                // lower case
            }
            else if (charValue == 32)
            {
                encryptedString = encryptedString + (char)charValue;
                // whitespace
            }
            else
            {
                encryptedString = encryptedString + (char)(charValue + 13);
            }
        }
    }


    public void betterEncrypt()
    {





        // Encode with japanese romaji characters
        // every s d h g f n m b z w r t p k j c is replaced with one randomly *based on starting consonant*
        // s = sa/shi/su/se/so, d = da/de/do, h = ha/hi/he/ho, g = ga/gi/gu/ge/go, f = hu, n = na ni nu ne no...
        // z = za/zu/ze/zo, w = wa/wo... t = ta/tsu/te/to... j = ji/dji, c = cha/chi/chu/che/cho
    }
}

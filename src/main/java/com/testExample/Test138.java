package com.testExample;

public class Test138 {
    public static void stringReplace (String text)
    {
        text = text.replace ('j' , 'c');
    }
    public static void bufferReplace (StringBuffer text)
    {
        text = text.append ("c");
    }
    public static void main (String args[])
    {
        String textString = new String ("java");
        StringBuffer textBuffer = new StringBuffer ("java");
        stringReplace(textString);
        bufferReplace(textBuffer);
        System.out.println (textString + textBuffer);
    }
}

package com.string;

import java.util.Optional;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBufferExample stringBufferExample = new StringBufferExample();
//        StringBuffer ab = new StringBuffer("Hello");
//        System.out.println(ab.capacity());
       // stringBufferExample.returncapacityString();
       stringBufferExample.getOptionalReturnAppend();
      // StringExample.equalsString();



    }


    public Optional<Integer> returncapacityString(){

        StringBuffer sb = new StringBuffer();
      ///  System.out.println(sb.capacity()); // default 16
      //   sb.append("Hello");


        //System.out.println(sb.capacity()); //  16
        sb.append("java is my favourite language");
        System.out.println(sb.capacity()); // Now (16*2)+2=34     i.e (oldcapacity*2)+2



        return Optional.of(sb.capacity());

    }

    public Optional<StringBuffer> getOptionalReturnAppend(){
        StringBuffer s1 =new StringBuffer("Hello ");
//        s1.append("Java");
//
//       System.out.println(s1.append("java"));
        return Optional.of(s1.append("java"));



    }
    public StringBuffer getOptionalDeleteString(){
        {
            StringBuffer sb = new StringBuffer("Hello java");
            sb.delete(1, 3);
            System.out.println(sb);
            sb.deleteCharAt(3);
           System.out.println(sb);
          return sb;
        }
    }

    public Optional<Boolean> equalsString(){
        StringBuffer sb1 = new StringBuffer("Hello java");
        StringBuffer sb2 = new StringBuffer("Hello java");
        System.out.println(sb1.equals(sb2));
        return Optional.of(sb1.equals(sb2));
    }
   public void insertString(){
        StringBuffer sb = new StringBuffer("Hello ");
        sb.insert(1, "Java");
        // Now original string is changed
        System.out.println(sb);
    }
   public void replaceString(){
        StringBuffer sb = new StringBuffer("Hello");
        sb.replace(1, 3, "Java");
        System.out.println(sb);
    }
}
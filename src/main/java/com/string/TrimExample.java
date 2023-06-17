package com.string;

import java.util.Optional;



public class TrimExample {
    public static void main(String[] args) {
       TrimExample trimExample = new TrimExample();
       trimExample.getOptionalTrim("  abced ");

    }
    public Optional<String> getOptionalTrim(String string){
       System.out.println(string.trim());
        return Optional.of(string.trim());
    }
    public Optional<Boolean> getOptionalEmpty(String value ){
        System.out.println(value.isEmpty());
        return Optional.of(value.isEmpty());


    }
    public Optional<Boolean>getOptionalEquals(String s1 , String s2){
        System.out.println(s1.equals(s2));
       return Optional.of(s1.equals(s2)) ;
    }
   public Optional<Boolean>getOptionalEqualsIgnoreCase(String value ,String value1){
        return Optional.of(value.equalsIgnoreCase(value1));
   }
   public Optional<Integer>getOptionalCompareTo(String name,String name1){
        return  Optional.of(name.compareTo(name1));
   }

    public Optional<Integer>getOptionalCompareToIgnoreCase(String name,String name1){
        return  Optional.of(name.compareToIgnoreCase(name1));
    }

    public Optional<CharSequence> getOptionalSubSequcence(String name){
          return Optional.of(name.subSequence(3,9));

    }


}

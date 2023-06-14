package com.exception.uncheckedexception;

public class UnchekedException {

    public int divide(int a, int b){
        return a/b;
    }

    public int getChartAtIndex(String input,int index){
        return input.charAt(index);
    }
    public String arrayOutOfBoundsException(int arr[]) {

        int i;
        try {
            int length = arr.length;
            i = arr[length];

        } catch (ArrayIndexOutOfBoundsException e) {

            return e.getMessage();

        }

        return " "+i;
    }

    public String  arithmeticException(int a,int b ) {
        int c;
        try {
            c = a / b;
        } catch (ArithmeticException e) {
            return e.getMessage();

        }

        return "" + c;

    }

    public String nullPointerException(String name){
        int length;
        try {
            length = name.length();

        }catch (NullPointerException e){
           // e.printStackTrace() ;
            return e.getMessage();

        }
        return ""+length;
    }

    public String numberFormatException(String str){
        int i=0;
         try {
             i= Integer.parseInt(str);

         }catch (NumberFormatException e){
           //e.printStackTrace();
             return e.getMessage();

         }
       return ""+i;
    }

    public static void main(String[] args)  {
        UnchekedException unchekedException = new UnchekedException();
        int s[]={1,2,3};
        unchekedException.arrayOutOfBoundsException(s);

        System.out.println(unchekedException.arithmeticException(10,0));
        System.out.println(unchekedException.nullPointerException(null));
        System.out.println(unchekedException.numberFormatException("abc"));

       // System.out.println(unchekedException.arrayOutOfBoundsException(s));


    }

}

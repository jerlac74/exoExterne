package org.example;

public class MainExple {
    public static void main(String[] args) {
        System.out.println("MainExple");
        System.out.println(accum("abcd"));
        System.out.println(accum("RqaEzty"));
        System.out.println(accum("cwAt"));
    }

    public static String accum(String strSrc){
        /*
        https://www.codewars.com/kata/5667e8f4e3f572a8f2000039

        accum("abcd") -> "A-Bb-Ccc-Dddd"
        accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
        accum("cwAt") -> "C-Ww-Aaa-Tttt"
         */
        StringBuilder strb=new StringBuilder();
        if(!strSrc.isEmpty()){
            String upperTemp;
            char[] tabStr =strSrc.toLowerCase().toCharArray();
            for (int i = 0; i < tabStr.length; i++) {
                upperTemp =String.valueOf(tabStr[i]).toUpperCase();
                strb.append(upperTemp);
                for (int j = 1; j < i+1; j++) {
                    strb.append(tabStr[i]);
                }
                strb.append("-");
            }
            return strb.substring(0,strb.length()-1);
        }

        return "";
    }
}

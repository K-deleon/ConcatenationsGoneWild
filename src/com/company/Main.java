package com.company;

public class Main {

    public static void main(String[] args) {

        String t1 = cat(68, 108);
        System.out.println(t1);

        String t2 = cat(35, 59);
        System.out.println(t2);

    }

    private static String cat(int start, int end){
        int startPos = start;
        int endPos = end;

        char startChar = (char)startPos;


        StringBuffer ss = new StringBuffer(startChar);
        for(int j = startPos; j < endPos; startPos++){
            startChar = (char)startPos;
            ss.append(startChar);
        }

        String sa = ss.toString();

        return sa;

    }

}

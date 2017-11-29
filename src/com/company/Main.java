package com.company;

public class Main {

    public static void main(String[] args) {

        String t1 = cat(68, 108);
        System.out.println(t1);

        String t2 = cat(35, 59);
        System.out.println(t2);

    }

    public String cat(int s, int e){
        int startPos = s;
        int endPos = e;

        char startChar = (char)startPos;


        StringBuffer ss = new StringBuffer(startChar);
        for(int j = startPos; j < endPos; startChar++){
            ss.append(startChar + 1);
        }

        String sa = ss.toString();

        return sa;

    }

}

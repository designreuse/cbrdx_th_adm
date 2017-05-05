package com.ciberdix.th.configuration;

import java.util.ArrayList;

/**
 * Created by Danny on 5/05/2017.
 */
public class SoundexEsp {

    public static String soundexEsp (String s){

        char[] x = s.toLowerCase().toCharArray();
        char firstLetter = 'A';

        // convert letters to numeric code
        for (int i = 0; i < x.length; i++) {
            switch (x[i]) {

                case 'p':
                    x[i] = '0';
                    break;

                case 'b':
                case 'v':
                    x[i] = '1';
                    break;

                case 'f':
                case 'h':
                    x[i] = '2';
                    break;

                case 't':
                case 'd':
                    x[i] = '3';
                    break;

                case 's':
                case 'z':
                case 'c':
                case 'x':
                    x[i] = '4';
                    break;

                case 'y':
                case 'l':
                    x[i] = '5';
                    break;

                case 'n':
                case 'ñ':
                case 'm':
                    x[i] = '6';
                    break;

                case 'q':
                case 'k':
                    x[i] = '7';
                    break;

                case 'g':
                case 'j':
                    x[i] = '8';
                    break;

                case 'r':
                    x[i] = '9';
                    break;

                default:
                    x[i] = 'x';
                    break;
            }
        }

        // remove duplicates
        String output = "" + firstLetter;
        for (int i = 1; i < x.length; i++) {
            if (x[i] != x[i - 1] && x[i] != 'x')
                output += x[i];
        }

        // pad with 0's or truncate
        output = output + "0000";
        return output.substring(0, 4);

    }

    public static ArrayList<String> getList (String s){

        ArrayList<String> list = new ArrayList<>();
        String str = "", strQ = s.toLowerCase();
        char cQ;

        for (int i=0; i<strQ.length(); i++) {
            cQ = strQ.charAt(i);
            switch (cQ){
                case 'Á':case 'á':
                    cQ = 'a';
                    break;
                case 'É':case 'é':
                    cQ = 'e';
                    break;
                case 'Í':case 'í':
                    cQ = 'i';
                    break;
                case 'Ó':case 'ó':
                    cQ = 'o';
                    break;
                case 'Ú':case 'ú':
                    cQ = 'u';
                    break;
                case 'Ñ':case 'ñ':
                    cQ = 'n';
                    break;
            }
            if (' ' != cQ){
                str = str + cQ;
            }else{
                list.add(soundexEsp(str));
                str = "";
            }
        }

        list.add(soundexEsp(str));

        return list;
    }

}

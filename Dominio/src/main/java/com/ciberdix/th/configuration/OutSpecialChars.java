package com.ciberdix.th.configuration;

import org.apache.commons.codec.language.Soundex;

import java.util.ArrayList;

/**
 * Created by Danny on 4/05/2017.
 */
public class OutSpecialChars {

    public static String getStr(String query){

        String str = "", strQ = query.toLowerCase();
        char cQ;

        for (int i=0; i<strQ.length(); i++){
            cQ = strQ.charAt(i);
            switch (cQ){
                case 'Á':case 'À':case 'Â':case 'Ã':case 'Ä':case 'Å':
                case 'à':case 'á':case 'â':case 'ã':case 'ä':case 'å':
                    cQ = 'a';
                    break;
                case 'É':case 'È':case 'Ê':case 'Ë':
                case 'é':case 'è':case 'ê':case 'ë':
                    cQ = 'e';
                    break;
                case 'Í':case 'Ì':case 'Î':case 'Ï':
                case 'í':case 'ì':case 'î':case 'ï':
                    cQ = 'i';
                    break;
                case 'Ó':case 'Ò':case 'Ô':case 'Õ':case 'Ö':
                case 'ó':case 'ò':case 'ô':case 'õ':case 'ö':
                    cQ = 'o';
                    break;
                case 'Ú':case 'Ù':case 'Û':case 'Ü':
                case 'ú':case 'ù':case 'û':case 'ü':
                    cQ = 'u';
                    break;
                case 'Ñ':case 'ñ':
                    cQ = 'n';
                    break;
                case 'ÿ':
                    cQ = 'y';
                    break;
            }
            str = str + cQ;
        }

        return str;
    }

}

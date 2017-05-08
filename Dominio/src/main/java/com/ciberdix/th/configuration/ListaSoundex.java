package com.ciberdix.th.configuration;

import org.apache.commons.codec.language.Soundex;

import java.util.ArrayList;

/**
 * Created by Danny on 4/05/2017.
 */
public class ListaSoundex {

//    public static ArrayList<String> generarList(String query, Soundex soundex){
//        ArrayList<String> list = new ArrayList<>();
//        String str = "", strQ = query.toLowerCase();
//        char cQ;
//
//        for (int i=0; i<strQ.length(); i++){
//            cQ = strQ.charAt(i);
//            switch (cQ){
//                case 'Á':case 'á':
//                    cQ = 'a';
//                    break;
//                case 'É':case 'é':
//                    cQ = 'e';
//                    break;
//                case 'Í':case 'í':
//                    cQ = 'i';
//                    break;
//                case 'Ó':case 'ó':
//                    cQ = 'o';
//                    break;
//                case 'Ú':case 'ú':
//                    cQ = 'u';
//                    break;
//                case 'Ñ':case 'ñ':
//                    cQ = 'n';
//                    break;
//            }
//            if (' ' != cQ){
//                str = str + cQ;
//            }else{
//                list.add(soundex.soundex(str));
//                str = "";
//            }
//        }
//        list.add(soundex.soundex(str));
//
//        return list;
//    }

}

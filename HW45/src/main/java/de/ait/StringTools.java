package de.ait;

public abstract class StringTools {
    public static String FirstToUpperCase(String str){
        return str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
    }

    public static boolean isStartingFromCapital(String str){
        return str.substring(0, 1).equals(str.substring(0,1).toUpperCase());
    }


}

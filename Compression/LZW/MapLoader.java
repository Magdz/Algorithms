
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author magdz
 */
public class MapLoader {
    private static final HashMap map = new HashMap();
    
    public static HashMap inverse(HashMap map){
        HashMap inverse = new HashMap();
        for(Object key : map.keySet()){
            inverse.put(map.get(key), key);
        }
        return inverse;
    }
    
    public static HashMap loadAB(){
        map.clear();
        map.put("A", 0b0);
        map.put("B", 0b1);
        return map;
    }
    
    public static HashMap loadAlphabet(){
        map.clear();
        map.put(" ", 0);
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);
        map.put("F", 6);
        map.put("G", 7);
        map.put("H", 8);
        map.put("I", 9);
        map.put("J", 10);
        map.put("K", 11);
        map.put("L", 12);
        map.put("M", 13);
        map.put("N", 14);
        map.put("O", 15);
        map.put("P", 16);
        map.put("Q", 17);
        map.put("R", 18);
        map.put("S", 19);
        map.put("T", 20);
        map.put("U", 21);
        map.put("V", 22);
        map.put("W", 23);
        map.put("X", 24);
        map.put("Y", 25);
        map.put("Z", 26);
        return map;
    }
    
    public static HashMap loadASCII(){
        map.clear();
        for(int i = 0; i<128; i++){
            map.put(Character.toString((char)i), i);
        }
        return map;
    }
    
}

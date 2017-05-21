
import java.util.ArrayList;
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
public class LZW {
    private HashMap map;
    private HashMap inverse;
    private int lastByte;
    
    public LZW(){
        map = new HashMap();
    }
    
    public void loadAB(){
        map = MapLoader.loadAB();
        inverse = MapLoader.inverse(map);
        lastByte = 1;
    }
    
    public void loadAlphabet(){
        map = MapLoader.loadAlphabet();
        inverse = MapLoader.inverse(map);
        lastByte = 26;
    }
    
    public void loadASCII(){
        map = MapLoader.loadASCII();
        inverse = MapLoader.inverse(map);
        lastByte = map.size();
    }
    
    public ArrayList compress(String s){
        String current = "";
        ArrayList compressed = new ArrayList();
        char next;
        for(int i = 0; i < s.length(); i++){
            next = s.charAt(i);
            if(map.get(current + next) == null){
                compressed.add(map.get(current));
                lastByte++;
                map.put(current + next, lastByte);
                current = "" + next;
            }else{
                current += next;
            }
        }
        compressed.add(map.get(current));
        return compressed;
    }
    
    public String decompress(ArrayList compressed){
        String s = "";
        for(Object c : compressed){
            if(inverse.get(c) != null){
                s += inverse.get(c);
            }else{
                decompressAssist(s);
                s += inverse.get(c);
            }
        }
        return s;
    }
    
    private void decompressAssist(String s){
        String current = "";
        char next;
        for(int i = 0; i < s.length(); i++){
            next = s.charAt(i);
            if(map.get(current + next) == null){
                lastByte++;
                map.put(current + next, lastByte);
                inverse.put(lastByte, current + next);
                current = "" + next;
            }else{
                current += next;
            }
        }
    }
}

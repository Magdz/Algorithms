/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap;

import java.util.*;

/**
 *
 * @author Ahmed
 */
public class Hashmap {
    
    private final int N=(int)1e4+7;
    private final String[] Table;
    
    public Hashmap(){
        Table=new String[N];
    }
    
    private int Hash1(String S){
        int Hash1=0;
        for(int i=0;i<S.length();++i){
            if(S.charAt(i)>='a' && S.charAt(i)<='z'){
                Hash1+=(S.charAt(i)-'a')*10*(i+1);
            }
            if(S.charAt(i)>='A' && S.charAt(i)<='Z'){
                Hash1+=(S.charAt(i)-'A')*10*(i+1);
            }
        }
        return Hash2(Hash1);
    }
    
    private int Hash2(int H){
        int Hash2=(H*7)%N;
        return Hash2;
    }
    
    public int setHash(String S){
        int Hash=Hash1(S);
        Table[Hash]=S;
        return Hash;
    }
    
    public String getData(int Hash){
        return Table[Hash];
    }
    
    public void Print(){
        System.out.println("Hashmap:");
        for(int i=0;i<N;++i)
            if(Table[i]!=null)
                System.out.println(" "+Table[i]+" ("+i+")");
    }
}

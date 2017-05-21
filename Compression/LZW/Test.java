
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Magdz
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LZW compression = new LZW();
        String sentance = "compressed and decompressed";
        compression.loadASCII();
        ArrayList compressed = compression.compress(sentance);
        for (Object element : compressed) {
            System.out.print(element + ",");
        }
        System.out.println("");
        compression.loadASCII();
        String decompressed = compression.decompress(compressed);
        System.out.println(decompressed);
        System.out.println(sentance.compareToIgnoreCase(decompressed));
    }
    
}

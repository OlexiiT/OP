package lab_14;

import java.io.*;

public class Task7 {
    
    public static void main(String[] args) {
        
        System.out.println("---Task7---\n");
        System.out.println("Checksum: " + checkSum("source.txt"));
        System.out.println("\n---Task7 completed---");
        
    }
    
    static byte checkSum(String fileName) {
        
        byte sum = 0;
        try (FileInputStream fis = new FileInputStream(fileName)) {
            byte[] buf = new byte[1024];
            int readed;
            while ((readed = fis.read(buf)) != -1) {
                for (int i = 0; i < readed; i++) {
                    sum = (byte) ((sum & buf[i]) - (sum | buf[i]));
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Ooops, no such file");
        } catch (IOException ex) {
            System.out.println("Ooops, IO exception");
        } 
        return sum;
        
    }
    
}

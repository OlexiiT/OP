package lab_14;

import java.io.*;

public class Task3 {

    public static void main(String[] args) {
        
        System.out.println("---Task3---\n");
        copyNoEmptyStrings("source.txt", "destination.txt");
        System.out.println("\n---Task3 completed---");

    }

    static void copyNoEmptyStrings(String source, String destination) {

        try ( BufferedReader bufferedReader = new BufferedReader(new FileReader(source));  
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destination))) {
            String nextLine = null;
            while ((nextLine = bufferedReader.readLine()) != null) {
                if (nextLine.equals("")) continue;
                System.out.println(nextLine);
                nextLine = nextLine  + String.format("%n");
                bufferedWriter.write(nextLine);
            }
            System.out.println("\nCopy completed succesfully");
        } catch (FileNotFoundException ex) {
            System.out.println("Ooops, no such file");
        } catch (IOException ex) {
            System.out.println("Ooops, IO exception");
        } finally {
            System.out.println("Attempt completed");
        }

    }

}

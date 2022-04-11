package marsrover.utils;

import marsrover.Rover;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InstructionsReader {
        public static List<String> readCommandeFromFile(String fileName) {
            BufferedReader br = null;
            List<String> listCommande=new ArrayList<>();
            try {
                File file = new File(fileName);
                FileReader fr = new FileReader(file);
                br = new BufferedReader(fr);
                String line;
                while ((line = br.readLine()) != null) {
                    listCommande.add(line);
                }
                return listCommande;
            }
            catch(IOException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            } finally
            {
                try {
                    if (br != null) {
                        br.close();
                    }
                }
                catch(IOException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }
}

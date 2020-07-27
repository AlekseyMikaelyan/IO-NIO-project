package org.example.ionioproject.ionioprojectutil;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FirstTask {
    public static void fileReader() {

        try{
            File file = new File("file.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);

            String line;
            List<String> lines = new ArrayList<>();

            while((line = reader.readLine()) != null) {
                lines.add(line);
            }

            String substring = "тает лёд";

            for(String s : lines) {
                if(s.contains(substring)) {
                    System.out.println(s);
                }
            }

            fileReader.close();
            reader.close();

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}

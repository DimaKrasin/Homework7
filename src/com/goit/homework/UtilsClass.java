package com.goit.homework;

import java.io.*;

public class UtilsClass {

        public static void writeToFile(String json, String path) throws IOException {
            System.out.println("Saving data");
            FileWriter writer = new FileWriter(path,true);
            writer.write(json);
            writer.write("\n");
            writer.flush();
            writer.close();
        }

        public static String readFromFile(String path) throws IOException {
            System.out.println("Loading data");
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String json = reader.readLine();
            return json;
        }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Spyros
 */
public class FileIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            // First Lab in writing to files
            // BufferedWriter Object
            // Add import java.io.BufferedWriter
            // But still complains about constructor
            //
            // third lab adds constructor and FileWriter Object
            // add import for FileWriterS
            // and also add filename with no path
            // but still 
            //
            // forth lab add the try/catch block
            // add a line to new file
            // and
            // add the writer.close() method to save the file
            
          

            BufferedWriter writer = new BufferedWriter(new FileWriter("myfile.txt"));
            writer.write("my first data");
            writer.close();
            
        } catch (IOException ex) {
            Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        
    }
    
}

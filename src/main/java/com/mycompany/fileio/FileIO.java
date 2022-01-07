/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author Spyros
 */
public class FileIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // First Lab in writing to files
        // BufferedWriter Object
        // Add import java.io.BufferedWriter
        // But still complains about constructor
        //
        // third lab adds constructor and FileWriter Object
        // add import for FileWriterS
        // and also add filename with no path
        // but still errors
        
        BufferedWriter writer = new BufferedWriter(new FileWriter("myfile.txt"));
        
    }
    
}

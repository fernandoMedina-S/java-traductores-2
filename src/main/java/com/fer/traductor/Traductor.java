/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.fer.traductor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fer-m
 */
public class Traductor {

    public static void main(String[] args) throws IOException {
        String Entrada = "resources/fichero.txt";
        String Salida = "resources/fichero1.txt";

        List<String> tokens = new ArrayList<>();
        Lexical lexical;

        try (BufferedReader lectura = new BufferedReader(new FileReader(Entrada))) {
            String linea;

            while ((linea = lectura.readLine()) != null) {

                String[] palabras = linea.split(" ");
                for (String palabra : palabras) {
                    tokens.add(palabra);
                }
                
            }
            
            lexical = new Lexical(tokens);
            
            lexical.analize();
            lexical.getResults();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
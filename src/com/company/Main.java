package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {


        //Skriv til fil:
        String str = "Hello\nhej\ndavs";
        String mitFilnavn = "minFil.txt";
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(mitFilnavn));
            writer.write(str); //skriver streng til filen
            writer.newLine(); //skriver ny line til filen
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Læs fra fil 1:

        String file ="minFil.txt";
        String currentLine;
        String heleTeksten = "";
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
             currentLine = reader.readLine(); // læs én linie.
             while (currentLine != null) {
                 heleTeksten += currentLine + "\n";
                 currentLine = reader.readLine(); // læs én linie.

             }
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(heleTeksten);






    //Læs fra fil 2: Retskrivningsordbogen
        //https://dsn.dk/retskrivning/om-retskrivningsordbogen/ro-elektronisk-og-som-bog
        //https://dsn.dk/retskrivning/om-retskrivningsordbogen/RO2012.opslagsord.med.homnr.og.ordklasse.zip
        //inkluderet her og omdøbt til ro.txt

    String file2 ="ro.txt";
    String currentLine2;

    try {
        BufferedReader reader2 = new BufferedReader(new FileReader(file2));

                //test og tildeling i samme linje
        while ((currentLine2 = reader2.readLine()) != null) {
            String[] ord = currentLine2.split(";");
            System.out.println(ord[0]);
        }
        reader2.close();

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }

    }
}

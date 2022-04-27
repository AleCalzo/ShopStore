package com.solvd.cultural.reads;

import java.io.*;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Reads {

    private static final Logger LOG = LogManager.getLogger("");

    public static String dato() {
        String sdato = " ";

        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader flujoE = new BufferedReader(isr);
            sdato = flujoE.readLine();

        } catch (IOException e) {
            LOG.debug("Error " + e.getMessage());
        }
        return sdato;

    }

    public static int datoInt() {
        return Integer.parseInt(dato());
    }

    public static float datoFloat() {
        return Float.parseFloat(dato());
    }

    // Leer un char por teclado

    public static char datoChar() {
        char c = ' ';

        try {
            java.io.BufferedInputStream b = new BufferedInputStream(System.in);
            c = (char) b.read();

        } catch (IOException e) {
            LOG.debug("Error, document not found");
            e.printStackTrace();
        }
        return c;
    }

    public static long datoLong() {
        return Long.parseLong(dato());
    }

    class ReadFiles {
        public void reed (){
            try {
                FileReader entry = new FileReader ("C/Usuarios/aleca/Documents");

                int c= entry.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


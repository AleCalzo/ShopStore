package com.solvd.exceptions;

import org.apache.log4j.Logger;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Image extends Exception{

    public Image() {

        try {
            BufferedImage image = ImageIO.read(new File("src/graphic/footboll"));

        } catch (IOException e) {

            System.out.println("Image not found");

        }

    }
}

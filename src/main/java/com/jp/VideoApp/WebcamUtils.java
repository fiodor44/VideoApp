package com.jp.VideoApp;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;

public class WebcamUtils {
    public static void DetectWebcam() {
        Webcam webcam = Webcam.getDefault();
        if (webcam != null) {
            System.out.println("Webcam trouvée: " + webcam.getName());
        } else {
            System.out.println("No webcam detected");
        }
    }


    public static void WebcamPanelExample() throws InterruptedException, IOException {
        Webcam webcam = Webcam.getDefault();
        webcam.setViewSize(WebcamResolution.VGA.getSize());

        WebcamPanel panel = new WebcamPanel(webcam);
        panel.setFPSDisplayed(true);
        panel.setDisplayDebugInfo(true);
        panel.setImageSizeDisplayed(true);
        panel.setMirrored(true);

        JFrame window = new JFrame("Test webcam panel");
        window.add(panel);
        window.setResizable(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setVisible(true);
        Thread.sleep(10000);
        BufferedImage image = webcam.getImage();

        ImageIO.write(image, "PNG", new File("test.png"));


    }
}

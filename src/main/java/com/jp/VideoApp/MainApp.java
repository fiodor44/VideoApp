package com.jp.VideoApp;

import java.io.IOException;

import javax.swing.*;

public class MainApp {
    public static void main(String[] args) throws InterruptedException, IOException {
        //Fenetre fenetre = new Fenetre();

        //WebcamUtils.DetectWebcam();
        //WebcamUtils.WebcamPanelExample();

        SwingUtilities.invokeLater(new WebcamViewer());

    }
}

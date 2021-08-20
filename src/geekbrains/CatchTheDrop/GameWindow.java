package geekbrains.CatchTheDrop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GameWindow extends JFrame {

    private static GameWindow gameWindow;

    public static void main(String[] args) {
        gameWindow=new GameWindow();
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // данной командой мы настроили наше окно таким образом, что при закрытии окна программа будет завершаться
        // настрим точку с которой будет появляться наше окно, левый верхний угол экрана считается 00, вниз от этой точки идет ось Y а в право от нее ось X, координаты передаются в пикселях
        gameWindow.setLocation(200, 100); //установили координаты х и у
        gameWindow.setSize(906, 478); //установили размер окна
        gameWindow.setResizable(false);// запретим изменение размера экрана мышкой или кнопкой "развернуть"
        gameWindow.setVisible(true); //установка видимости


    }
}

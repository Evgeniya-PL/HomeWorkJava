package homework7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {
    private static final int WIN_WIDTH = 507;
    private static final int WIN_HEIGHT = 555;
    private static final int WIN_POSX = 650;
    private static final int WIN_POSY = 250;
    private final SettingWindow settingWindow;
    Map map;

    GameWindow(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIN_WIDTH, WIN_HEIGHT);
        setLocation(WIN_POSX, WIN_POSY);
        setTitle("Tic Tac Toe");
        setResizable(false);
        JButton btnStart = new JButton("Start new game");
        JButton btnExit = new JButton("Exit game");
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingWindow.setVisible(true);
            }
        });
        JPanel panelButton = new JPanel(new GridLayout(1,2));
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        panelButton.add(btnStart);
        panelButton.add(btnExit);
        map = new Map();
        settingWindow = new SettingWindow(this);


        add(panelButton, BorderLayout.SOUTH);
        add(map);
        setVisible(true);

    }
    void startGame (int gameMode, int fieldSizeX, int fieldSizeY, int winLength){
        map.startNewGame(gameMode, fieldSizeX, fieldSizeY, winLength);
    }
}

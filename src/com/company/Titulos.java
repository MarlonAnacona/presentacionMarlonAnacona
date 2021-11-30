package com.company;

import javax.swing.*;
import java.awt.*;

public class Titulos extends JLabel {
public  Titulos(String titulos, Color colorFondo){

    this.setText(titulos);
    this.setBackground(colorFondo);

    this.setForeground(Color.white);
    this.setFont(new Font(Font.DIALOG,Font.BOLD+Font.ITALIC,24));
this.setHorizontalAlignment(JLabel.CENTER);
this.setOpaque(true);

}

}

package com.company;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GUI_Presentacion extends JFrame {
    //atributos
    private JButton JbotonmiFoto, JbotonmiHobby, JbotonmisExpectativas;
    private Titulos misDatos;
    private JPanel panelDatos, panelBbotones;
    private JLabel jLabelimagen;
    private JTextArea expectativasTexto;
    private escucha accionBotones;
    //metodos

    public GUI_Presentacion() {
        intGUI();
        //configurar ventana
        this.setTitle("Mi presentación Marlon Anacona");
        this.setSize(600, 540);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private void intGUI() {
        //configurar panel y su
        //control de botones
        accionBotones=new  escucha();
        misDatos = new Titulos("Mi nombre es Marlon Anacona", Color.BLACK);
        this.add(misDatos, BorderLayout.NORTH);

        panelDatos = new JPanel();

        panelDatos.setBorder(BorderFactory.createTitledBorder(null, "Un poco mas de mi", TitledBorder.CENTER,
                TitledBorder.DEFAULT_POSITION, new Font("Calibri", Font.PLAIN, 20), Color.BLACK));
        this.add(panelDatos, BorderLayout.CENTER);
        JbotonmiFoto = new JButton("Este soy yo");
        JbotonmiFoto.addMouseListener(accionBotones);
        JbotonmiHobby = new JButton("Este es mi Hobby");
        JbotonmiHobby.addMouseListener(accionBotones);
        JbotonmisExpectativas = new JButton("Espero...");
        JbotonmisExpectativas.addKeyListener(accionBotones);

        panelBbotones = new JPanel();
        panelBbotones.add(JbotonmiFoto);
        panelBbotones.add(JbotonmiHobby);
        panelBbotones.add(JbotonmisExpectativas);
        this.add(panelBbotones, BorderLayout.SOUTH);

        jLabelimagen =new JLabel();
        expectativasTexto= new JTextArea(10,12);
    }



    public static void main(String[] args) {
	// Ejecución del programa

        EventQueue.invokeLater(new Runnable(){

            public void run(){

    GUI_Presentacion mipresentacion= new GUI_Presentacion();
            }

        });
    }


    private class escucha implements MouseListener, KeyListener {
        private ImageIcon image;

        @Override
        public void mouseClicked(MouseEvent e) {
            panelDatos.removeAll();
    //Al presionar un click en el boton de mi foto, aparecera la foto
            if(e.getSource()==JbotonmiFoto){

                //mostrara la foto
                image= new ImageIcon(getClass().getResource("/java/pp.jpg"));
                jLabelimagen.setIcon(image);
                panelDatos.add(jLabelimagen);

                revalidate();
                repaint();
            }
                else {
                    //Al presionar doble click en el boton de hobby aparecera el hobby
                if (e.getClickCount() == 2 && e.getSource() == JbotonmiHobby) {
                    image = new ImageIcon(getClass().getResource("/java/futbol.jpg"));
                    jLabelimagen.setIcon(image);
                    panelDatos.add(jLabelimagen);

                    revalidate();
                    repaint();
                }
                else{
                    if(e.getSource()==JbotonmisExpectativas){

                    }
                }
            }

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }


        @Override
        public void keyTyped(KeyEvent e) {

    /*
    Al presionar el boton expectativas y presionar la letra M, aparecera el texto de mis expectativas
*/            panelDatos.removeAll();


            if(e.getKeyChar()==KeyEvent.VK_M){
                expectativasTexto.setFont(new Font("Calibri",Font.ITALIC,20));

                expectativasTexto.setBackground(null);

                expectativasTexto.setText("Mis expectativas para este curso es mejorar\n"
                        + "mis conocimientos en interfaces");
                panelDatos.add(expectativasTexto);

                revalidate();
                repaint();
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {



        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
/*
    private class accion implements ActionListener
    {
        private ImageIcon image;

        @Override
        public void actionPerformed(ActionEvent e)
        {

        panelDatos.removeAll();

            if(e.getSource()== JbotonmiFoto)
            {
                //mostrara la foto
           image= new ImageIcon(getClass().getResource("/java/pp.jpg"));
            jLabelimagen.setIcon(image);
            panelDatos.add(jLabelimagen);
            }else{
                if(e.getSource()== JbotonmiHobby)
                {
                    //describira el hobyy


                }else{
                    if(e.getSource()== JbotonmisExpectativas)
                    {

                        expectativasTexto.setFont(new Font("Calibri",Font.ITALIC,20));

                        expectativasTexto.setBackground(null);
                 expectativasTexto.setText("Mis expectativas para este curso es mejorar\n"
                + "mis conocimientos en interfaces");
                panelDatos.add(expectativasTexto);
                    }
                }
            }
            revalidate();
            repaint();
        }

        public void  dobelClick(MouseEvent evt){
            ImageIcon image;

            if(evt.getClickCount()==2){

            }
        }

    }*/
}

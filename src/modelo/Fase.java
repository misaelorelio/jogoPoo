package modelo;

import javax.swing.*;
import java.awt.*;

public class Fase extends JPanel {
    private Image fundo;
    public Fase() {
        ImageIcon carregando = new ImageIcon("recursos\\fundo.jpg");
        fundo = carregando.getImage();
    }

    public void paint (Graphics g) {
        Graphics2D graficos = (Graphics2D) g;
        graficos.drawImage(fundo, 0, 0, null);
        g.dispose();
    }

}

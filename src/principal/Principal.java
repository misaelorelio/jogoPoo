package principal;

import modelo.Fase;

import javax.swing.*;

public class Principal  extends JFrame {
    public Principal(){
        Fase fase = new Fase();
        super.add(fase);
        super. setTitle("Misael");
        super.setSize(1024, 728);
        super.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        super.setLocationRelativeTo(null);
        super.setResizable(false);
        super.setVisible(true);
    }
    public static void main(String[] args) {
        new Principal();
    }
}

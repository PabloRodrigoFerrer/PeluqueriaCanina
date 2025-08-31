
package com.mycompany.peluqueriacanina;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import igu.MenuPrincipal;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class PeluqueriaCanina {

    public static void main(String[] args) {
        
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("No se pudo aplicar FlatLaf");
        }        
        
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.setVisible(true);
        menuPrincipal.setLocationRelativeTo(null);
        
    }
}

package config;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;

public class ThemeConfig {

    public static void config() {
        FlatDarkLaf.setup();

        //ກໍານົດ Font
        UIManager.put("defaultFont", new Font("Lao_Somvang", Font.PLAIN, 16));
        UIManager.put("OptionPane.messageFont", new Font("Lao_Somvang", Font.PLAIN, 14));
        UIManager.put("OptionPane.okButtonText", "ຕົກລົງ");
        UIManager.put("OptionPane.cancelButtonText", "ຍົກເລີກ");
        UIManager.put("OptionPane.yesButtonText", "ເເມ່ນ");
        UIManager.put("OptionPane.nocancelButtonText", "ບໍ່ເເມ່ນ");

        
        
        UIManager.put("Button.background", Color.CYAN);
        UIManager.put("Button.foreground", Color.BLACK);
        UIManager.put("TextComponent.arc", 5);
        UIManager.put("Button.arc", 60);
        UIManager.put("CheckBox.arc", 100);
    }
}

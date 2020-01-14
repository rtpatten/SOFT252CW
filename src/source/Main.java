package source;
import guis.MainMenu;

public class Main {

    public static void main(String[] args) {
        Data root = Data.getInstance();
        root.setup();
        
        new MainMenu().setVisible(true);
    }
}

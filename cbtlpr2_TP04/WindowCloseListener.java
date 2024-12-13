import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowCloseListener extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Janela fechada pelo usuário.");
        System.exit(0); // Fecha a aplicação
    }
}


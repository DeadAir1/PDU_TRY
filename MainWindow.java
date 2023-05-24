package PDU_TRY;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private LeftPanel leftPanel;
    private CenterPanel centerPanel;
    private RightPanel rightPanel;
    private JScrollPane scrollPane;
    public MainWindow() throws HeadlessException {
        setLayout(new BorderLayout());
        leftPanel=new LeftPanel();
        centerPanel=new CenterPanel();          //Inicjalizacja paneli
        rightPanel=new RightPanel();
        scrollPane=new JScrollPane();
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        this.getContentPane().add(leftPanel, BorderLayout.WEST);
        this.getContentPane().add(rightPanel,BorderLayout.EAST); // Dodanie paneli z ustawieniem BorderLayout
        this.getContentPane().add(centerPanel,BorderLayout.CENTER);


        pack();

        setVisible(true);
        this.setSize(800,600); // Ustawienia okna MainWindow
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

package PDU_TRY;

import javax.swing.*;
import java.awt.*;
public class LeftPanel extends JPanel {
    private AddButton addButton;
    private JScrollPane scrollPanel;
    private JPanel panel;

    public LeftPanel() {
        this.setLayout(new BorderLayout());
        this.setBackground(Color.BLUE);
        this.setPreferredSize(new Dimension(230, 600));

        // Panel
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        scrollPanel = new JScrollPane(panel);
        scrollPanel.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        // AddButton
        addButton = new AddButton(panel);
        addButton.setPreferredSize(new Dimension(200, 50));

        this.add(scrollPanel, BorderLayout.CENTER);
        this.add(addButton, BorderLayout.SOUTH);
    }
}

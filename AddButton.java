package PDU_TRY;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddButton extends JButton {
    private JPanel panel;

    public AddButton(JPanel panel) {
        this.setText("Add");
        this.setPreferredSize(new Dimension(200, 50));
        this.panel = panel;

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = JOptionPane.showInputDialog(this, "");
                if (message != null && !message.isEmpty()) {
                    VBDLogic vbdLogic = new VBDLogic(message);
                    VBDVisual vbdVisual = new VBDVisual(vbdLogic);
                    panel.add(vbdVisual);
                    panel.revalidate();
                }
            }
        });
    }
}


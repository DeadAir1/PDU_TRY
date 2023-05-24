package PDU_TRY;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VRD extends JPanel {

    private JButton off;
    private JLabel size;
    private JCheckBox remove;
    private JCheckBox checkBox;
    public VRD() {
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        size=new JLabel("Size");

        //Tworzenie JButton off
        off =new JButton("Off");
        checkBox=new JCheckBox("delete every 10 sekund");
        off.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remove(size);
                remove(off);
                remove(checkBox);
                revalidate();
            }
        });
        this.add(size);
        this.add(checkBox);
        this.add(off);



    }
}

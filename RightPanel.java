package PDU_TRY;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RightPanel extends JPanel {
    private JButton add;
   private JScrollPane scrollPane;
   private JPanel panel;


    public RightPanel() {

        this.setLayout(new BorderLayout());

        //Dodanie JScrollPane
        panel=new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        scrollPane=new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        this.add(scrollPane,BorderLayout.CENTER);

        //Dodanie JButton add
        add=new JButton("Add");
        add.setPreferredSize(new Dimension(200,50));
        this.add(add,BorderLayout.SOUTH);
        //Dodanie checkBox

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VRD vrd=new VRD();
                Border border = BorderFactory.createLineBorder(Color.BLACK);
                vrd.setBorder(border);
                panel.add(vrd);
                revalidate();
            }
        });

            revalidate();

        //Elementy rightPanel
        this.setBackground(Color.YELLOW);
        this.setPreferredSize(new Dimension(200,600));


    }
}

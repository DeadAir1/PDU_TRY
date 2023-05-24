package PDU_TRY;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CenterPanel extends JPanel {
    private JButton plus;
    private JButton minus;
    private JPanel buttonPanel;
    private JPanel dodatPanel;

    public CenterPanel() {
        this.setLayout(new BorderLayout());

        //Plus
        plus = new JButton("+");
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BTS bts=new BTS();
                bts.setBackground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
                dodatPanel.add(bts);
                revalidate();
            }
        });
        //Minus
        minus = new JButton("-");
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remove(dodatPanel);
                revalidate();
            }
        });

        //DodatPanel
        dodatPanel=new JPanel();
        //ButtonPanel
        buttonPanel=new JPanel();
        buttonPanel.setLayout(new BorderLayout());
        buttonPanel.add(minus,BorderLayout.WEST);
        buttonPanel.add(plus,BorderLayout.EAST);

        this.add(buttonPanel,BorderLayout.SOUTH);
        this.add(dodatPanel);


    }
}

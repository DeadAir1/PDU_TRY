
package PDU_TRY;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class VBDVisual extends JPanel {
    private VBDLogic vbdLogic;
    private JTextField numer;
    private JLabel labelTextField;
    private JSlider slider;
    private JLabel sliderLabel;
    private JComboBox stan;
    private JButton exit;

    public VBDVisual(VBDLogic vbdLogic) {
        this.vbdLogic = vbdLogic;

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setVisible(true);

        numer = new JTextField(vbdLogic.getNumber());
        numer.setEditable(false);
        numer.setPreferredSize(new Dimension(200, 20));
        numer.setFont(new Font("NumerFont", Font.BOLD, 14));

        labelTextField = new JLabel(numer.getText());

        slider = new JSlider(0, 100, vbdLogic.getBandwidth());
        sliderLabel = new JLabel("Czestotliwosc: " + vbdLogic.getBandwidth());
        slider.setPreferredSize(new Dimension(200, 100));
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int value = slider.getValue();
                sliderLabel.setText("Czestotliwosc: " + value);
                vbdLogic.setBandwidth(value);
            }
        });

        String[] stans = {"Active", "Waiting"};
        stan = new JComboBox(stans);
        stan.setPreferredSize(new Dimension(200, 50));

        exit = new JButton("Stop");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vbdLogic.stop();
                remove(labelTextField);
                remove(slider);
                remove(sliderLabel);
                remove(stan);
                remove(exit);
                revalidate();
            }
        });

        this.add(labelTextField);
        this.add(sliderLabel);
        this.add(slider);
        this.add(stan);
        this.add(exit);
    }
}
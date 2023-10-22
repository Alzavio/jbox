import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;


public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("JBox");
        f.setSize(550, 400);
        f.setLayout(null);

        // Adds labels, these will be next to each input
        JLabel l1 = new JLabel("Length");
        JLabel l2 = new JLabel("Width");
        JLabel l3 = new JLabel("Height");

        l1.setBounds(30,0, 100, 30);
        l2.setBounds(30,30, 100, 30);
        l3.setBounds(30,60, 100, 30);

        // Sets a format to only allow numbers for the Textfields
        NumberFormat longFormat = NumberFormat.getInstance();
        NumberFormatter numberFormatter = new NumberFormatter(longFormat);
        numberFormatter.setAllowsInvalid(false);

        JFormattedTextField t1 = new JFormattedTextField(numberFormatter);
        JFormattedTextField t2 = new JFormattedTextField(numberFormatter);
        JFormattedTextField t3 = new JFormattedTextField(numberFormatter);

        // Sets a default of 0 for each text field
        t1.setText("0");
        t2.setText("0");
        t3.setText("0");

        t1.setBounds(75,0, 100, 30);
        t2.setBounds(75,30, 100, 30);
        t3.setBounds(75,60, 100, 30);

        // Adds buttons
        JButton b1 = new JButton("Calculate Volume");
        JButton b2 = new JButton("Calculate Surface Area");
        JButton b3 = new JButton("Display Box Details");

        b1.setBounds(0, 100, 170, 30);
        b2.setBounds(170, 100, 170, 30);
        b3.setBounds(340, 100, 170, 30);


        f.add(b1);
        f.add(b2);
        f.add(b3);

        f.add(t1);
        f.add(t2);
        f.add(t3);

        f.add(l1);
        f.add(l2);
        f.add(l3);

        // Event handlers for every button
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f,"Volume: " + (Double.parseDouble(t1.getText()) * Double.parseDouble(t2.getText()) * Double.parseDouble(t3.getText())));
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f,"Surface area: " + (Double.parseDouble(t1.getText()) * Double.parseDouble(t2.getText())) );
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f," Length: " + t1.getText() + "\n Width: "+t2.getText()+ "\n Height: " + t3.getText());
            }
        });

        f.setVisible(true);

    }
}
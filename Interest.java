import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Interest {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;
    public Interest(){
        prepareGUI();
    }
    public static void main(String[] args){
        Interest Interest = new Interest();
        Interest.showTextFieldDemo();
    }
    private void prepareGUI(){
        mainFrame = new JFrame("Monthly Payment Calculator");
        mainFrame.setSize(600,400);
        mainFrame.setLayout(new GridLayout(3, 1));

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("",JLabel.CENTER);
        statusLabel.setSize(350,100);
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }
    void showTextFieldDemo(){
        headerLabel.setText("Check your monthly payment");
        JLabel  principalAmount= new JLabel("Amount: ", JLabel.RIGHT);
        JLabel  interestRate = new JLabel("Interest Percentage: ", JLabel.RIGHT);
        JLabel  years = new JLabel("Years of loan: ", JLabel.RIGHT);
        final JTextField amount = new JTextField(6);
        final JTextField interest = new JTextField(6);
        final JTextField yearsToPay = new JTextField(6);
        JButton calculate = new JButton("Calculate Monthly Payment");
        calculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int dataAmount = Integer.parseInt(amount.getText());
                int dataInterest = Integer.parseInt(interest.getText());
                int years = Integer.parseInt(yearsToPay.getText());
                double months = years*12;
                double rate = (dataInterest*.01);
                rate = rate/12;
                double payment = (dataAmount * rate) / (1 - Math.pow(1 + rate, -months));
                payment = (double)Math.round(payment*100)/100;
                statusLabel.setText("Monthly Payment: $" + String.valueOf(payment));
            }
        });
        controlPanel.add(principalAmount);
        controlPanel.add(amount);
        controlPanel.add(interestRate);
        controlPanel.add(interest);
        controlPanel.add(years);
        controlPanel.add(yearsToPay);
        controlPanel.add(calculate);
        mainFrame.setVisible(true);
    }
}
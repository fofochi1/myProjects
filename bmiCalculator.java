import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class bmiCalculator {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;
    public bmiCalculator(){
        prepareGUI();
    }
    public static void main(String[] args){
        bmiCalculator calculator = new bmiCalculator();
        calculator.showTextFieldDemo();
    }
    private void prepareGUI(){
        mainFrame = new JFrame("Body Mass Index");
        mainFrame.setSize(800,400);
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
    private void showTextFieldDemo(){
        headerLabel.setText("Body Mass Index Calculator");
        JLabel  feet= new JLabel("Height-Feet: ", JLabel.RIGHT);
        JLabel inches = new JLabel("Height-Inches: ", JLabel.RIGHT);
        JLabel  weight = new JLabel("Weight: ", JLabel.RIGHT);
        final JTextField heightFeet = new JTextField(6);
        final JTextField heightInches = new JTextField(6);
        final JTextField weightNumber = new JTextField(6);
        JButton calculate = new JButton("Calculate BMI");
        calculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int dataFeet = Integer.parseInt(heightFeet.getText());
                int dataInches = Integer.parseInt(heightInches.getText());
                int dataWeight = Integer.parseInt(weightNumber.getText());
                int totalInchesHeight = dataFeet*12 + dataInches;
                double inchesSquared = totalInchesHeight*totalInchesHeight;
                double BMI = (dataWeight/inchesSquared)*703;
                BMI = (double)Math.round(BMI*100)/100;

                statusLabel.setText("Body Mass Index: " + String.valueOf(BMI));
            }
        });
        controlPanel.add(feet);
        controlPanel.add(heightFeet);
        controlPanel.add(inches);
        controlPanel.add(heightInches);
        controlPanel.add(weight);
        controlPanel.add(weightNumber);
        controlPanel.add(calculate);
        mainFrame.setVisible(true);
    }
}
package mvc;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorView extends JFrame {
    private JTextField firstNumber = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton = new JButton("Calculate");
    private JTextField calculateSolution = new JTextField(10);

    public CalculatorView() {
        JPanel calculatePanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,200);
        calculatePanel.add(firstNumber);
        calculatePanel.add(additionLabel);
        calculatePanel.add(secondNumber);
        calculatePanel.add(calculateButton);
        calculatePanel.add(calculateSolution);

        this.add(calculatePanel);

    }
    public int getFirstNumber(){
        return Integer.parseInt(firstNumber.getText());
    }
    public int getSecondNumber(){
        return Integer.parseInt(secondNumber.getText());
    }
    public int getCalculateSolution(){
        return Integer.parseInt(calculateSolution.getText());
    }

    public void setCalculateSolution(int solution){
        calculateSolution.setText(Integer.toString(solution));

    }

    public void addCalculationListener(ActionListener listenForCalculationButton){
        calculateButton.addActionListener(listenForCalculationButton);
    }

    public void displayError(String errorMessage){
        JOptionPane.showMessageDialog(this,errorMessage);
    }
}

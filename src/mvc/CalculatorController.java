package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorView theView;
    private CalculatorModel theModel;

    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
        this.theView.addCalculationListener(new CalculationListener());
    }
    class CalculationListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int firstNumber, secondNumber = 0;
            try {

                //The button of calculation was clicked after user input the two numbers. Listener got the event and this method was performed.

                //firstly, controller (current class) give a command to acquire the values of the two number like this.
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();


                //secondly, the controller give a command to calculate the result of the two numbers.
                theModel.addTwoNumbers(firstNumber, secondNumber);

                //lastly, the controller give a command to let the view to display the result.
                theView.setCalculateSolution(theModel.getCalculationValue());
            }catch (NumberFormatException ex){
                theView.displayError("You need to enter two integers.");
            }
        }
    }
}

package mvccalculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// The Controller coordinates interactions
// between the View and Model

public class CalculatorController {
	
	private CalculatorView theView;
	private CalculatorModel theModel;
        int controle = 0;
        float aux = 0;
	
	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		
		// Tell the View that when ever the calculate button
		// is clicked to execute the actionPerformed method
		// in the CalculateListener inner class
		
		this.theView.addCalculateListener(new CalculateListener());
	}
	
	class CalculateListener implements ActionListener{

                @Override
		public void actionPerformed(ActionEvent e) {
			
			float firstNumber, secondNumber;
			
			// Surround interactions with the view with
			// a try block in case numbers weren't
			
			try{
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();
                                
				if(e.getSource() == theView.calculateButton){                                
                                    theModel.addTwoNumbers(firstNumber, secondNumber);
                                }
                                
                                if(e.getSource() == theView.calculateButton2){                                
                                    theModel.subtracao(firstNumber, secondNumber);
                                }
                                
                                if(e.getSource() == theView.calculateButton3){                                
                                    theModel.multiplicacao(firstNumber, secondNumber);
                                }
                                
                                if(e.getSource() == theView.calculateButton4){
                                    
                                    if(secondNumber == 0)
                                    {
                                        theView.displayErrorMessage("Operacao Invalida! Divisao por 0!");
                                    }
                                    else
                                        theModel.divisao(firstNumber, secondNumber);
                                }
                                
                                if(e.getSource() == theView.gravaN1){
                                    aux = theView.getFirstNumber();
                                    controle = 1;
                                }
                                
                                if(e.getSource() == theView.recuperaN1){
                                    if(controle == 1)
                                        theView.setFirstNumber(aux);
                                    else
                                        theView.displayErrorMessage("Nenhum numero gravado!");
                                }
				
				theView.setCalcSolution(theModel.getCalculationValue());
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				theView.displayErrorMessage("Digite 2 números");
				
			}
			
		}
		
	}
	
}
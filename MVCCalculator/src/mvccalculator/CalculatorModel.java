package mvccalculator;

public class CalculatorModel {
    private float calculationValue;
	
	public void addTwoNumbers(float firstNumber, float secondNumber){
		
		calculationValue = firstNumber + secondNumber;
	}
        
        public void subtracao(float firstNumber, float secondNumber){
		
		calculationValue = firstNumber - secondNumber;
	}
        
        public void multiplicacao(float firstNumber, float secondNumber){
		
		calculationValue = firstNumber * secondNumber;
	}
        
        public void divisao(float firstNumber, float secondNumber){
		
		calculationValue = firstNumber / secondNumber;
	}
	
	public float getCalculationValue(){
		
		return calculationValue;	
	}
}

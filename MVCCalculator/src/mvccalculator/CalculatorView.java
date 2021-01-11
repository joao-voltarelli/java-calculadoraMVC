package mvccalculator;
import java.awt.event.ActionListener;
import javafx.geometry.Pos;
import javax.swing.*;

public class CalculatorView extends JFrame{

	private JTextField firstNumber  = new JTextField(10);
	private JTextField secondNumber = new JTextField(10);
	protected JButton calculateButton = new JButton("Soma");
        protected JButton calculateButton2 = new JButton("Subtracao");
        protected JButton calculateButton3 = new JButton("Multiplicacao");
        protected JButton calculateButton4 = new JButton("Divisao");
        protected JButton gravaN1 = new JButton("Gravar N1");
        protected JButton recuperaN1 = new JButton("Recup. N1");
	private JTextField calcSolution = new JTextField(10);
        private JLabel num1 = new JLabel("Numero 1: ");
        private JLabel num2 = new JLabel("Numero 2: ");
        private JLabel result = new JLabel("Resultado: ");
        private JLabel nome = new JLabel("João Victor Voltarelli");
	
	CalculatorView(){
		
		// Sets up the view and adds the components        
                
		JPanel calcPanel = new JPanel();
                calcPanel.setLayout(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
                this.setTitle("Calculadora - João Victor Voltarelli");
                this.setLocation(100, 100);
                
                num1.setBounds(10, 10, 100, 20);
                firstNumber.setBounds(80, 10, 100, 20);
                num2.setBounds(10, 50, 100, 20);
                secondNumber.setBounds(80, 50, 100, 20);
                calculateButton.setBounds(250, 10, 100, 30);
                calculateButton2.setBounds(360, 10, 100, 30);
                calculateButton3.setBounds(250, 50, 100, 30);
                calculateButton4.setBounds(360, 50, 100, 30);
                gravaN1.setBounds(250, 90, 100, 30);
                recuperaN1.setBounds(360, 90, 100, 30);
                result.setBounds(10, 120, 100, 20);
                calcSolution.setBounds(80, 120, 100, 20);
                nome.setBounds(460, 140, 120, 20);
		
                calcPanel.add(num1);
		calcPanel.add(firstNumber);
                calcPanel.add(num2);
		calcPanel.add(secondNumber);
                calcPanel.add(calculateButton);
                calcPanel.add(calculateButton2);
                calcPanel.add(calculateButton3);
                calcPanel.add(calculateButton4);
                calcPanel.add(gravaN1);
                calcPanel.add(recuperaN1);
                calcPanel.add(result);
                calcPanel.add(calcSolution);
                calcPanel.add(nome);
                
                this.getContentPane().add(calcPanel);
		
		// End of setting up the components --------
	}
        public void setFirstNumber(float n1){
            firstNumber.setText(Float.toString(n1));
        }
	
	public float getFirstNumber(){
		
		return Float.parseFloat(firstNumber.getText());
		
	}
	
	public float getSecondNumber(){
		
		return Float.parseFloat(secondNumber.getText());
		
	}
	
	public float getCalcSolution(){
		
		return Float.parseFloat(calcSolution.getText());
		
	}
	
	public void setCalcSolution(float solution){
		
		calcSolution.setText(Float.toString(solution));
		
	}
	
	// If the calculateButton is clicked execute a method
	// in the Controller named actionPerformed
	
	void addCalculateListener(ActionListener listenForCalcButton){
		
		calculateButton.addActionListener(listenForCalcButton);
                calculateButton2.addActionListener(listenForCalcButton);
                calculateButton3.addActionListener(listenForCalcButton);
		calculateButton4.addActionListener(listenForCalcButton);
                gravaN1.addActionListener(listenForCalcButton);
		recuperaN1.addActionListener(listenForCalcButton);
	}
	
	// Open a popup that contains the error message passed
	
	void displayErrorMessage(String errorMessage){
		
		JOptionPane.showMessageDialog(this, errorMessage);
		
	}
	
}
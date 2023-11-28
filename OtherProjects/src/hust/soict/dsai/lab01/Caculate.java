package hust.soict.dsai.lab01;

import javax.swing.JOptionPane;
public class Caculate{
    public static void main(String[] args)
    {
        String strNum1, strNum2;
        double Sum, Difference, Product, Quotient; 
        strNum1 = JOptionPane.showInputDialog(null,
        			"Please input the first number: ",
        			"Input the first number",
        			JOptionPane.INFORMATION_MESSAGE);
        
        double num1 = Double.parseDouble(strNum1);
        
        strNum2 = JOptionPane.showInputDialog(null, 
        			"Please input the second number: ",
        			"Input the second number", 
        			JOptionPane.INFORMATION_MESSAGE);
        
        double num2 = Double.parseDouble(strNum2);
        
        Sum = num1 + num2;
        JOptionPane.showMessageDialog(null,"Sum = " + Sum,
        			"Sum of 2 numbers",
        			JOptionPane.INFORMATION_MESSAGE);
        
        Difference = Math.abs( num1 - num2 );
        JOptionPane.showMessageDialog(null,
        			"Difference = " + Difference,
        			"Difference of 2 numbers",
        			JOptionPane.INFORMATION_MESSAGE);
        
        Product = num1 * num2;
        JOptionPane.showMessageDialog(null,
        			"Product = " + Product,
        			"Product of 2 numbers",
        			JOptionPane.INFORMATION_MESSAGE);
        
        if(num2 == 0) JOptionPane.showMessageDialog(null, "Invalid divesor!", "Quotient of 2 numbers", 1);
        else{
        	Quotient = num1 / num2;
        	JOptionPane.showMessageDialog(null,
        			"Quotient = " + Quotient,
        			"Quotient of 2 numbers",
        			JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }
}

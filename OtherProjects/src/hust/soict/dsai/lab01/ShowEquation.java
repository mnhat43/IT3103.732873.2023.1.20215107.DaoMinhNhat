package hust.soict.dsai.lab01;

import javax.swing.JOptionPane;

public class ShowEquation
{
    public static void linearEquation()
    {
        String str_a, str_b;
        str_a = JOptionPane.showInputDialog(null,"Please input a: ", "Input a", JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(str_a);
        str_b = JOptionPane.showInputDialog(null,"Please input b: ", "Input b", JOptionPane.INFORMATION_MESSAGE); 
        double b = Double.parseDouble(str_b);

        if(a == 0 && b == 0) JOptionPane.showMessageDialog(null,"The equation has an infinite number of solutions! " );
        else if(a == 0 && b != 0) JOptionPane.showMessageDialog(null,"Unsolution equation! " );
        else JOptionPane.showMessageDialog(null,  "Solution of Equation: " + -b/a );
    }
    public static void linearSystem()
    {
        String str_a, str_b, str_c;
        str_a = JOptionPane.showInputDialog(null,"Please input a: ", "Input a", JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(str_a);
        str_b = JOptionPane.showInputDialog(null,"Please input b: ", "Input b", JOptionPane.INFORMATION_MESSAGE);
        double b = Double.parseDouble(str_b);
        str_c = JOptionPane.showInputDialog(null,"Please input c: ", "Input c", JOptionPane.INFORMATION_MESSAGE);
        double c = Double.parseDouble(str_c);

        if(a == 0 && b == 0 && c != 0) JOptionPane.showMessageDialog(null,"Unsolution equation! " );
        else {
            JOptionPane.showMessageDialog(null,"X = t, t is a real number" + "\n" + "Y = " + (-a/b) + "t" + " + " + (-c/b));
        }
    }
    public static void quadraticEquation()
    {
        String str_a, str_b, str_c;
        str_a = JOptionPane.showInputDialog(null,"Please input a: ", "Input a", JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(str_a);
        str_b = JOptionPane.showInputDialog(null,"Please input b: ", "Input b", JOptionPane.INFORMATION_MESSAGE);
        double b = Double.parseDouble(str_b);
        str_c = JOptionPane.showInputDialog(null,"Please input c: ", "Input c", JOptionPane.INFORMATION_MESSAGE);
        double c = Double.parseDouble(str_c);

        if (a == 0) 
        {
            if(b == 0 && b == c) JOptionPane.showMessageDialog(null,"The equation has an infinite number of solutions! " );
            else if(b == 0 && c != 0) JOptionPane.showMessageDialog(null,"Unsolution equation! " );
            else JOptionPane.showMessageDialog(null, -c/b , "Solution of Equation: ", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(a !=0 )
        {
            double delta = b*b - 4*a*c;
            if(delta < 0) JOptionPane.showMessageDialog(null,"Unsolution equation! " );
            else if(delta == 0) JOptionPane.showMessageDialog(null, "Double solutions of Equation: " + (-b/(2*a)));
            else {
                JOptionPane.showMessageDialog(null,
                		"First Solutions of Equation: "
                		+ (-b + Math.sqrt(delta))/(2*a)
                		+ "\n Second Solutions of Equation: "
                		+ (-b - Math.sqrt(delta))/(2*a));
            }
        }
    }
    public static void main(String args[])
    {
        String menu;
        menu = JOptionPane.showInputDialog(null,"Please choose your Equation! \n"
        		+ "1. The first-degree equation (linear equation) with one variable aX+b=0 \n"
        		+ "2. The system of first-degree equations (linear system) with two variables aX+bY+c=0 \n"
        		+ "3. The second-degree equation with one variable aX^2+bX+c=0 \n"
        		+ "0. Exit program!", "Choose your Equation", JOptionPane.INFORMATION_MESSAGE );
        int item = Integer.parseInt(menu);
        switch (item) {
            case 1:
            	linearEquation();
                break;
            case 2:
            	linearSystem();
                break;
            case 3:
            	quadraticEquation();
                break;
            case 0:
                System.exit(0);
            default:
                break;
        }
        System.exit(0);
    }
}
import javax.swing.JOptionPane;

public class Addition
{
    public static void main(String[] args)
    {
        String firstNumber =
                JOptionPane.showInputDialog("enter first integer");
                String secondNumber =
                        JOptionPane.showInputDialog("enter second integer");
                
int number1 = Integer.parseInt(firstNumber);
int number2 = Integer.parseInt(secondNumber);

int sum = number1 + number2;

JOptionPane.showMessageDialog(null, "the sum is" + sum, "sum of two integers", JOptionpane.PLAIN_MESSAGE);
    }
}

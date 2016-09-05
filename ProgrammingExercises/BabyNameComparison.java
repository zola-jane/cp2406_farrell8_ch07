/*
 * Created by Zola on 5/09/2016.
 */
import javax.swing.*;
public class BabyNameComparison
{
    public static void main(String[] args)
    {
    String firstName, secondName, thirdName;
        firstName = JOptionPane.showInputDialog(null, "Enter the first name:");
        secondName = JOptionPane.showInputDialog(null, "Enter the second name");
        thirdName = JOptionPane.showInputDialog(null, "Enter the third name");

        System.out.println("The baby name combinations are:");
        System.out.println(firstName + " " + secondName);
        System.out.println(firstName + " " + thirdName);
        System.out.println(secondName + " " + firstName);
        System.out.println(secondName + " " + thirdName);
        System.out.println(thirdName + " " + firstName);
        System.out.println(thirdName + " " + secondName);
    }
}

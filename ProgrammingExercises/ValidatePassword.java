/*
 * Created by Zola on 5/09/2016.
 */
import javax.swing.JOptionPane;
public class ValidatePassword
{
    public static void main(String[] args)
    {

        String password;
        password = JOptionPane.showInputDialog(null, "Enter a password");
        int passwordLength;
        final int NUM = 2;
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int digitCount = 0;
        passwordLength = password.length();

        for(int i = 0; i < passwordLength; i++)
        {
            char ch = password.charAt(i);
            if(Character.isUpperCase(ch))
                upperCaseCount ++;
            else
                if(Character.isLowerCase(ch))
                    lowerCaseCount ++;
                else
                    digitCount ++;
        }

        if(upperCaseCount >= NUM && lowerCaseCount >= NUM && digitCount >= NUM)
            JOptionPane.showMessageDialog(null, "Your password is valid");
        else
            {
            JOptionPane.showMessageDialog(null, "The password is missing the following:");
            if (upperCaseCount < NUM)
                JOptionPane.showMessageDialog(null, "Uppercase letters");
            if (lowerCaseCount < NUM)
                JOptionPane.showMessageDialog(null, "Lowercase letters");
            if (digitCount < NUM)
                JOptionPane.showMessageDialog(null, "Digits");
            }

    }
}

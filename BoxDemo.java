/**
   Name: Chanel Carpenter
   Date: April 22, 2018
   Professor: Fahringer
   Class: CPS 121
*/

import javax.swing.JOptionPane;        // For JOption GUI
import java.text.DecimalFormat;        // To format decimal places on numbers

/**
   This program demonstrates the Box class.
*/

public class BoxDemo
{
   public static void main(String[] args)
   {
      String input;                       // To hold user's input
      String YN;                          // To hold Yes or No
      boolean cube = true;                // To differenciate between cubes and not cubes
      boolean bigger = true;              // When you want to go to Texas...
      double length, width, height;       // To hold variables
      double num1, num2, num3;            // To hold more variables
      String isMult;                      // To tell the program to multiple or add
      String output, output2;             // To show off what the program can do
      
      
      
      //Create a Box object
      //Thank you Easter bunny...
      Box box = new Box();
      
      //Ask if the box is cube or rectangle
      YN = JOptionPane.showInputDialog("Is this box a cube? (Y/N)");
      YN = YN.toLowerCase();
            if (YN.equals("y"))
				   cube = true;
			   if (YN.equals("n"))
				   cube = false;
      
      //Get and set the length of the box
      input = JOptionPane.showInputDialog("What is the length of your box?");
      length = Double.parseDouble(input);
      box.setLength(length);
      
      //If it is a rectangle...
      while(cube == false)
      {
         input = JOptionPane.showInputDialog("What is the width of your box?");
         box.setWidth(Double.parseDouble(input));
         
         input = JOptionPane.showInputDialog("What is the height of your box?");
         box.setHeight(Double.parseDouble(input));
      }
      
      //If it is a cube...
      while(cube == true)
      {
         box.setWidth(length);
         box.setHeight(length);
      }
      
      output = "The length of your box is: " + box.getLength() + "\nThe width of your box is: " + box.getWidth() + 
               "\nThe height of your box is: " + box.getHeight();
               
      //Get the area and volume of the box
      output = output + "The area of box is: " + box.getArea() + "\nThe volume of your box is: " + box.getVolume();
      
      //Display output
      JOptionPane.showMessageDialog(null, output);
      
      //Ask if user would like to make the box bigger
      YN = JOptionPane.showInputDialog("Would you like to make the bigger?");
      YN = YN.toLowerCase();
         if (YN.equals("y"))
				bigger = true;
			if (YN.equals("n"))
				bigger = false;
      
      //Ask user if they would like to multiple or add to the dimensions of the box      
      while(bigger == true)
      {
         isMult = JOptionPane.showInputDialog("Would you like to multiple the dimensions or add to them?" +
                                             "\nFor multiple enter '1' \nFor addition enter '2'");
                     
         while (isMult.equals("1"))
         {
            input = JOptionPane.showInputDialog("Please enter the multiplier:");
            num1 = Double.parseDouble(input);
            num2 = 0;
            num3 = 0;
            box.makeLarger(isMult, num1, num2, num3, box);
         }
         
         while (isMult.equals("2"))
         {
            input = JOptionPane.showInputDialog("Please enter the amount to add to the length:");
            num1 = Double.parseDouble(input);
            
            input = JOptionPane.showInputDialog("Please enter the amount to add to the width:");
            num2 = Double.parseDouble(input);
            
            input = JOptionPane.showInputDialog("Please enter the amount to add to the height:");
            num3 = Double.parseDouble(input);
            
            box.makeLarger(isMult, num1, num2, num3, box);
         }
      }
         
      //Display new output
      output2 = "The new box's dimensions are: \nLength: " + length + "\nWidth: " + width + "\nHeight: " + height +
               "\nArea: " + box.getArea() + "\nVolume" + box.getVolume();
               
      JOptionPane.showMessageDialog(null, output2);
   }
}
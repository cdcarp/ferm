/**
   Name: Chanel Carpenter
   Date: April 22, 2018
   Professor: Fahringer
   Class: CPS 121
*/

import javax.swing.JOptionPane;        // For JOption GUI
import java.text.DecimalFormat;        // To format decimal places on numbers

/**
   This program creates three types of boxes: a box, a cube, and a rectangular solid.
*/

public class Box
{
   private double length;
   private double width;
   private double height;
   
   
   /*********************** Constructor ********************************
      Sets length, width, and height to 0 
   *********************************************************************/
      
   public Box()
   {
      length = 0.0;
      width = 0.0;
      height = 0.0;
   }
   
   /************* Constructor***********************
   Accepts length, width, and height as an arguments
   @param length, @param width, @param height
   *************************************************/
   
   public Box(double l, double w, double h)
   {
      length = l;
      width = w;
      height = h;
   }
   
   public void setLength(double num)
   {
      length = num;
   }
   
   public void setWidth(double num)
   {
      width = num;
   }
   
   public void setHeight(double num)
   {
      height = num;
   }
   
   public double getLength()
   {
      return length;
   }
   
   public double getWidth()
   {
      return width;
   }
   
   public double getHeight()
   {
      return height;
   }
      
   /************************ Methods **********************************
      Calculates volume and surface area of a box
   ********************************************************************/
   
   public double getVolume()
   {
      return length * width * height;
   }
   
   public double getArea()
   {
      return 2*((width * length) + (height* length) + (height* width));
   }
   
   /************************ Methods **********************************
      To change the size of the boxes
   ********************************************************************/
   
   public double makeLarger(String isMult, double num1, double num2, double num3, Box b)
   {
      Box newbox;
      
      if (isMult.equals('1'))
      {
         length = getLength() * num1;
         width = getWidth() * num1;
         height = getHeight() * num1;
      }
      
      if (isMult.equals('2'))
      {
         length = getLength() + num1;
         width = getWidth() + num2;
         height = getHeight() + num3;
      }     
      return newBox;

   }
}
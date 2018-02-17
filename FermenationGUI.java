// Test for Fermentation GUI
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/** 
   This program is for helping homebrewers and winemakers keep on track
   during their fermenation process.... hopefully.
*/

public class FermenationGUI extends JFrame
{
   private JPanel panel;                  // To reference a panel
   private JLabel startLabel;             // New brew label
   private JLabel nameLabel;              // Label for name of brew
   private JTextField nameTextField;      // Name of brew text field
   private JButton beerButton;            // Beer button
   private JButton wineButton;            // Wine button
   private JButton meadButton;            // Mead button
   private final int WINDOW_WIDTH = 410;  // Window width
   private final int WINDOW_HEIGHT = 150; // Window height
   
   /**
      Constructor
   */
   
   public FermenationGUI()
   {
      // Sets the window title
      setTitle("The Fermentor's Friend");
      
      // Sets the size of the window
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      
      // Specify what happens when the close button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // Builds the panel and add it to the frame.
      buildPanel();
      
      // Add the panel to the frame's content pane.
      add(panel);
      
      // Display window
      setVisible(true);
   }
   
   private void buildPanel()
   {
      // Label to display instructions
      startLabel = new JLabel("What are you fermenting?");
      
      // Create buttons for fermenation options
      beerButton = new JButton("Beer");
      wineButton = new JButton("Wine");
      meadButton = new JButton("Mead");
      
      // Registers an event listener with all 3 buttons
      beerButton.addActionListener(new BeerButtonListener());
      wineButton.addActionListener(new WineButtonListener());
      meadButton.addActionListener(new MeadButtonListener());
      
      // Creates a panel and add the components to it
      panel = new JPanel();
      panel.add(startLabel);
      panel.add(beerButton);
      panel.add(wineButton);
      panel.add(meadButton);
      
      // Adds the panel to the content pane
      add(panel);
      
      // Displays the window
      setVisible(true);
   }
   /** 
      Private inner class that handles the event when the user 
      clicks the buttons, currently a test of buttons
   */
   
   private class BeerButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // Sets the panel's background to red
         panel.setBackground(Color.RED);        
      }
   }
   
   private class WineButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // Sets the panel's background to blue
         panel.setBackground(Color.BLUE);
      }
   }
   
   private class MeadButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // Sets the panel's background to yellow
         panel.setBackground(Color.YELLOW);
      }
   }
   
   /**
      main method
   */
   
   public static void main(String[] args)
   {
      new FermenationGUI();
   }
}
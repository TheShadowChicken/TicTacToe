import java.awt.*;
import javax.swing.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException; 
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Random; 
import java.io.FileWriter;  
import java.io.IOException; 

public class TicTac extends JFrame {
    TicTacEvent tictac = new TicTacEvent(this);

    JPanel row1 = new JPanel();
    JButton[][] boxes = new JButton[4][4];
    JButton play = new JButton("Play");
    JButton reset = new JButton("Reset");
    JTextField blank1 = new JTextField();
    JTextField blank2 = new JTextField();
    JOptionPane win = new JOptionPane("Winner");
    ImageIcon back = new ImageIcon("cardback.jpg");


    public TicTac() {
        super ("Tic Tac Toe");
        setSize (500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout layout = new FlowLayout();
        setLayout(layout);
        int name = 0;
        String newname;

        GridLayout layout1 = new GridLayout(5, 4, 10, 10);
        row1.setLayout(layout1);
        for (int x=0; x<=3; x++){
            for (int y=0; y<=3; y++){
                name = name + 1;
                newname = Integer.toString(name);
                boxes[x][y] = new JButton(newname);
                boxes[x][y].setIcon(back);
                row1.add(boxes[x][y]);
            }
        }
        row1.add(blank1);
        row1.add(play);
        row1.add(reset);
        row1.add(blank2);
        add (row1);

        play.addActionListener(tictac);
                reset.addActionListener(tictac);

        for (int x=0; x<=3; x++){
            for (int y=0; y<=3; y++){
                boxes[x][y].addActionListener(tictac);
            }
        }
        
        
        

        setVisible(true);
    }
    
        
        
    
    public static String[] readFromFile(){


    String outputAsString = "";
    String [] outputAsArray;

    try{
      File file = new File ("winTracker.txt");
      Scanner fileInput = new Scanner(file); 


      while (fileInput.hasNextLine()){
        outputAsString+=fileInput.nextLine()+"\n"; 
        
      }
      fileInput.close(); 
      

    }catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

    outputAsArray = outputAsString.split("\n");

    return outputAsArray;
    }
    
    
    public static void fileWriter(String[] data){
      try{
        PrintWriter writer = new PrintWriter("winTracker.txt"); 
        for (String line : data){
          writer.println(line); 
          
        }
        writer.close(); 
        
      
      }catch (Exception e){
        System.out.println("An error has occured. ");
        e.getStackTrace(); 
      }
    }
    
    
    
    
     public static void writeToFile(String newLine){

      try {

   

        FileWriter myWriter = new FileWriter("winTracker.txt", true);

        myWriter.write(newLine);
        myWriter.close();

    } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }

    }

    public static void main(String[] arguments){
        TicTac frame = new TicTac();
    }
}
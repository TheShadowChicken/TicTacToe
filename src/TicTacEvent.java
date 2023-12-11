/** Programmer:
 * Date:
 * Program Name: TicTacEvent.java
 * Program Description: This program runs the GUI for Tic Tac Toe
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException; 
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Random; 
import java.io.FileWriter;  
import java.io.IOException; 



public class TicTacEvent implements ItemListener, ActionListener, Runnable {
    TicTac gui;
    Thread playing;
    ImageIcon a = new ImageIcon("FIREX.jpg");
    ImageIcon b = new ImageIcon("WATERO (1).jpg");
    ImageIcon back = new ImageIcon("cardback.jpg");
    int clicks = 0;
    int winX = 0, winY;
    int[][] check = new int[4][4];
    int winCount=0; 
    public TicTacEvent (TicTac in){
        gui = in;
        for (int row=0; row<=3; row++){
           for (int col=0; col<=3; col++){
               check[row][col]=0;
           }
       }
    }

    public void actionPerformed (ActionEvent event) {
       String command = event.getActionCommand();

       if (command.equals("Play")) {
           startPlaying();
           
           
       }
       //reset button to play again yeayea
       if (command.equals("Reset")){
           clicks = 0; 
           
           
           // check = 0 so it doesnt bug when u reset it 
           for(int x = 0; x <= 3; x++){
               for(int y = 0; y <=3; y++){
               check [x][y] = 0; 
           }
           }
           
           
           // resets the boxes so its back to the regular button icon 
           for (int ryell=0; ryell<=3; ryell++){
               for (int justin=0; justin<=3; justin++){
                   
               
           gui.boxes[ryell][justin].setIcon(back);
           }
           }
   
       }
       
       
       
       if (command.equals("1")) {
           b1();
       }
       if (command.equals("2")) {
           b2();
       }
       if (command.equals("3")) {
           b3();
       }
       if (command.equals("4")) {
           b4();
       }
       if (command.equals("5")) {
           b5();
       }
       if (command.equals("6")) {
           b6();
       }
       if (command.equals("7")) {
           b7();
       }
       if (command.equals("8")) {
           b8();
       }
       if (command.equals("9")) {
           b9();
       }
       if (command.equals("10")) {
           b10();
       }
       if (command.equals("11")) {
           b11();
       }
       if (command.equals("12")) {
           b12();
       }
       if (command.equals("13")) {
           b13();
       }
       if (command.equals("14")) {
           b14();
       }
       if (command.equals("15")) {
           b15();
       }
       if (command.equals("16")) {
           b16();
       }
    }

    void b1() {
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[0][0].setIcon(a);
            check[0][0] = 1;
        } else {
            gui.boxes[0][0].setIcon(b);
            check[0][0] = 2;
        }
        winner();

    }
    void b2() {
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[0][1].setIcon(a);
            check[0][1] = 1;
        } else {
            gui.boxes[0][1].setIcon(b);
            check[0][1] = 2;
        }
        winner();
    }
    void b3() {
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[0][2].setIcon(a);
            check[0][2] = 1;
        } else {
            gui.boxes[0][2].setIcon(b);
            check[0][2] = 2;
        }
        winner();
    }
    void b4() {
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[0][3].setIcon(a);
            check[0][3] = 1;
        } else {
            gui.boxes[0][3].setIcon(b);
            check[0][3] = 2;
        }
        winner();
    }
    void b5() {
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[1][0].setIcon(a);
            check[1][0] = 1;
        } else {
            gui.boxes[1][0].setIcon(b);
            check[1][0] = 2;
        }
        winner();
    }
    void b6() {
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[1][1].setIcon(a);
            check[1][1] = 1;
        } else {
            gui.boxes[1][1].setIcon(b);
            check[1][1] = 2;
        }
        winner();
    }
    void b7() {
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[1][2].setIcon(a);
            check[1][2] = 1;
        } else {
            gui.boxes[1][2].setIcon(b);
            check[1][2] = 2;
        }
        winner();
    }   
    void b8() {
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[1][3].setIcon(a);
            check[1][3] = 1;
        } else {
            gui.boxes[1][3].setIcon(b);
            check[1][3] = 2;
        }
        winner();
    }
    void b9() {
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[2][0].setIcon(a);
            check[2][0] = 1;
        } else {
            gui.boxes[2][0].setIcon(b);
            check[2][0] = 2;
        }
        winner();
    }
    
    void b10() {
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[2][1].setIcon(a);
            check[2][1] = 1;
        } else {
            gui.boxes[2][1].setIcon(b);
            check[2][1] = 2;
        }
        winner();
    }
    
    void b11() {
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[2][2].setIcon(a);
            check[2][2] = 1;
        } else {
            gui.boxes[2][2].setIcon(b);
            check[2][2] = 2;
        }
        winner();
    }
    void b12() {
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[2][3].setIcon(a);
            check[2][3] = 1;
        } else {
            gui.boxes[2][3].setIcon(b);
            check[2][3] = 2;
        }
        winner();
    }
    void b13() {
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[3][0].setIcon(a);
            check[3][0] = 1;
        } else {
            gui.boxes[3][0].setIcon(b);
            check[3][0] = 2;
        }
        winner();
    }
    void b14() {
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[3][1].setIcon(a);
            check[3][1] = 1;
        } else {
            gui.boxes[3][1].setIcon(b);
            check[3][1] = 2;
        }
        winner();
    }
    void b15() {
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[3][2].setIcon(a);
            check[3][2] = 1;
        } else {
            gui.boxes[3][2].setIcon(b);
            check[3][2] = 2;
        }
        winner();
    }
    void b16() {
        clicks = clicks + 1;
        if ((clicks%2)==1){
            gui.boxes[3][3].setIcon(a);
            check[3][3] = 1;
        } else {
            gui.boxes[3][3].setIcon(b);
            check[3][3] = 2;
        }
        winner();
    }
    
  
    void winner() {
        /** Check rows for winner */
        for (int x=0; x<=3; x++){
            if ((check[x][0]==check[x][1])&&(check[x][0]==check[x][2]) && (check[x][0]==check[x][3])) {
                if (check[x][0]==1) {
                    
         //write win count to winTracker.txt
                    winX++;
                    String winX2 = String.valueOf(winX); 
                writeToFile(winX2); 
                    JOptionPane.showMessageDialog(null, "X is the winner. They won "+winX+ " times");
                  
                } else if (check[x][0]==2){
                    winY++;
                    String winY2 = String.valueOf(winY); 
                writeToFile(winY2); 
                    JOptionPane.showMessageDialog(null, "Y is the winner. They won "+winY+ " times ");

                }
            }
        }

        /** Check columns for winner */
        for (int x=0; x<=3; x++){
            if ((check[0][x]==check[1][x])&&(check[0][x]==check[2][x])&&(check[0][x]==check[3][x])) {
                if (check[0][x]==1) {
                    winX++;
                    String winX2 = String.valueOf(winX); 
                writeToFile(winX2); 
                    JOptionPane.showMessageDialog(null, "X is the winner. They won "+winX+ " times");
                    
                } else if (check[0][x]==2) {
                    winY++;
                    String winY2 = String.valueOf(winY); 
                writeToFile(winY2); 
                    JOptionPane.showMessageDialog(null, "Y is the winner. They won "+winY+ " times");
                     
                }
            }
        }

        /** Check diagonals for winner */
        
        
       
        if ((check [0][0] == check [1][1]) && (check[1][1] == check [2][2]) && (check [2][2] == check [3][3])){
            if (clicks%2==1 && clicks>6) {
                
                
                
   
                winX++;
                String winX2 = String.valueOf(winX); 
                writeToFile(winX2); 
                JOptionPane.showMessageDialog(null, "X is the winner. They won "+winX+ " times");
               
            } else if (clicks%2==0 && clicks>6) {
                winY++; 
                
                String winY2 = String.valueOf(winY); 
                
                writeToFile(winY2+ "\n"); 
                
                
                JOptionPane.showMessageDialog(null, "Y is the winner. They won "+winY+ " times");
                
               
            }
           
        
        }
        
        
        
         if ((check [0][3] == check [1][2]) && (check [1][2] == check [2][1]) && (check [2][1] == check [3][0])){
            if (clicks%2==1 && clicks>6) {
                
                
                
   
                winX++;
                String winX2 = String.valueOf(winX); 
                writeToFile(winX2); 
                JOptionPane.showMessageDialog(null, "X is the winner. They won "+winX+ " times");
               
            } else if (clicks%2==0 && clicks>6) {
                winY++; 
                
                String winY2 = String.valueOf(winY); 
                
                writeToFile(winY2+ "\n"); 
                
                
                JOptionPane.showMessageDialog(null, "Y is the winner. They won "+winY+ " times");
                
               
            }
           
        
        }
        
        

        /** Checks if the game is a tie */
        if ((clicks==16) && (winX==0 && winY==0)) {
            JOptionPane.showMessageDialog(null, "The game is a tie");
        }

        
            
            
        
    }


    
    void startPlaying() {
        playing = new Thread(this);
        playing.start();
        gui.play.setEnabled(false);
    }

    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
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
        
    public void run() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}


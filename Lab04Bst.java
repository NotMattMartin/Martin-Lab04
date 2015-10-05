// Lab04Bst.java
// The Expo Graphics Program
// This is the student, starting version, of Lab 04B.


import java.awt.*;
import java.applet.*;


public class Lab04Bst extends Applet
{

    public void paint(Graphics g)
    {
        
        // DRAW CUBE
        Expo.drawRectangle(g,0,0,300,300);
        Expo.drawRectangle(g,130,130,430,430);
        Expo.drawLine(g,0,0,130,130);
        Expo.drawLine(g,300,300,430,430);
        Expo.drawLine(g,0,300,130,430);
        Expo.drawLine(g,300,0,430,130);
       
        // DRAW TARGET
        Expo.drawCircle(g,600,200,30);
        Expo.drawCircle(g,600,200,60);
        Expo.drawCircle(g,600,200,90);
        Expo.drawCircle(g,600,200,120);
        Expo.drawCircle(g,600,200,150);

        // DRAW TRIANGLE
        Expo.drawLine(g,300,700,300,800); //See below
        Expo.drawLine(g,350,700,300,800); //Stupid line I don't need
        Expo.drawLine(g,350,700,300,700);
        
        Expo.drawLine(g,250,700,300,700);
        Expo.drawLine(g,250,700,300,800);
        
        Expo.drawLine(g,250,700,325,750); //math
        Expo.drawLine(g,350,700,275,750); //MATH
        // DRAW SMILEY FACE
        Expo.drawOval(g,600,700,150,200);   
        
        Expo.drawCircle(g,550,650,30); //Somewhere above here
        Expo.drawCircle(g,650,650,30);
        
        Expo.drawPoint(g,540,630);
        Expo.drawPoint(g,660,665);
        
        Expo.drawArc(g,550,600,40,25,270,90); //inverse
        Expo.drawArc(g,650,600,40,25,270,90);
        Expo.drawArc(g,600,750,100,40,270,90);
        // DRAW JPII
        /*
        N   N  OOOOO 
        NN  N  O   O
        N N N  O   O
        N  NN  O   O
        N   N  OOOOO
        NN  N  O   O
        N N N  O   O
        N  NN  O   O
        N   N  OOOOO
        NN  N  O   O
        N N N  O   O
        N  NN  O   O
        N   N  OOOOO
        NN  N  O   O
        N N N  O   O
        N  NN  O   O
        N   N  OOOOO
        */
    }

}



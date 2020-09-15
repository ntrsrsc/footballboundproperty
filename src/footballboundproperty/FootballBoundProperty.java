/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballboundproperty;

import java.util.Scanner;

/**
 *
 * @author Reo
 */
public class FootballBoundProperty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyPropertyBean mySource = new MyPropertyBean();
        Listener1 listener1 = new Listener1();
        Listener2 listener2 = new Listener2();
        mySource.addPropertyChangeListener(listener1); 
        mySource.addPropertyChangeListener(listener2); 
        Scanner score = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter Score : ");
            String FootBallScores = score.nextLine();
            if (FootBallScores.equals("")) {
                break;
            }
            mySource.setFootballScores(FootBallScores);
        }
    }
    
}

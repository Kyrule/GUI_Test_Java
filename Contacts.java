/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import javax.swing.JFrame;
/**
 *
 * @author khai
 */
public class Contacts {    
    public static void main(String[] args){        
        JFrame frame=new ContactUI();
        frame.setTitle("GUI Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }    
}

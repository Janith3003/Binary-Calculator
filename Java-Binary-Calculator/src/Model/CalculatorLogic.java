/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

/**
 *
 * @author test
 */
public class CalculatorLogic {
    public String binaryLogic(String num) throws NumberFormatException
    {
        //String num = txt1.getText();
        int numx = Integer.parseInt(num);
        HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
            
        //find boolian numbers
        for(int c=0; numx!=0;c++)
        {
            int numy = numx%2;
            numx = numx/2;
            data.put(c+1, numy);
        }
            
        //Make arraylist to hold boolian numbers
        List<String> output = new ArrayList<String>();
            
        //turn upside down the boolian number
        for(int d=data.size(); 0<d; d--)
        {   
            output.add(Integer.toString(data.get(d)));
        }
        
        //arraylist convert to String variable
        String final_output = String.join("",output);
        
        return final_output;
    }
    
    public String realNumLogic(String num) throws NumberFormatException
    {  
        //multiplicator( 1, 2, 4 ,8...)
        int mul = 1;
        int total = 0;
        
        //turn upside down boolean number
        for(int c=num.length(); 0<c; c--)
        {
            // calculate real number
            int numtemp = Character.getNumericValue(num.charAt(c-1));
            if (mul==1){
                total=total+mul*numtemp;
                 mul++;
            }
            else{
                total=total+mul*numtemp;
                mul=mul*2;
            }
            
        }
        return (Integer.toString(total));
    }
}

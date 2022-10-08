 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import View.VCalculator;

public class MCalculator {
        
    public String createCal(String num)
    {
        CalculatorLogic obj = new CalculatorLogic();
        return obj.logic(num);
    }
}

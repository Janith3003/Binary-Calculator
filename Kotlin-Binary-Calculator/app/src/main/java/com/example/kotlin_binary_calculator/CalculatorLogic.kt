package com.example.kotlin_binary_calculator

class CalculatorLogic {

    fun decimalToBinary (num : String) : String {
        var number : Int = num.toInt()
        var numx : Int = 0
        var data = ArrayList<Int>()
        var rnum : String = ""

        while (number != 0) {
            numx = number%2
            number = number/2
            data.add(numx)
        }

        for (i in (0..data.size-1).reversed()) {
            rnum += data.get(i).toString()
        }

        return rnum
    }

    fun decimalToOctal (num : String) : String {
        var number : Int = num.toInt()
        var numx : Int = 0
        var data = ArrayList<Int>()
        var rnum : String = ""

        while (number != 0) {
            numx = number%8
            number = number/8
            data.add(numx)
        }

        for (i in (0..data.size-1).reversed()) {
            rnum += data.get(i).toString()
        }

        return rnum
    }

    fun binaryToDecimal (num : String): String {
        //multiplicator( 1, 2, 4 ,8...)
        var pos : Int = 1
        var total : Int = 0

        //turn upside down boolean number
        for(c in (1..num.length).reversed())
        {
            // calculate real number
            var numtemp = Character.getNumericValue(num.get(c-1));
            if (pos==1){
                total = total + pos * numtemp;
                pos++;
            }
            else{
                total = total + pos * numtemp;
                pos *= 2;
            }

        }
        return (total.toString());
    }

    // 0 <= number <= 7
    fun octalToDecimal (num : String) : String {
        var pos : Int = 1   // ( 1, 8, 64...)
        var total : Int = 0

        // turn upside down octal number
        for(c in (1..num.length).reversed())
        {
            // calculate real number
            var numtemp = Character.getNumericValue(num.get(c-1));
            total = total + pos * numtemp;
            pos *= 8;

        }
        return (total.toString());
    }

}
fun main() {

/* Question 1:Write a Kotlin program that designs a calculator. The program should read from
 the user two integer numbers and a character which indicates the type of operation desired. */
    print("Question 1 answer //")
    print("Enter frist number here: ")
    var num1 = readLine()!! .toInt()
        print("Enter second number here: ")
    var num2 = readLine()!! .toInt()
        print("Enter the one operation (+, -, *, / , %) here: ")
    var oper : String = readLine()!! .toString()

      if (oper == "+"){
          println("the result is =${num1 + num2} "  )
      }  else if (oper == "-"){
                   println("the result is =${num1 - num2}" )
      } else if (oper == "*"){
          println("the result is =${num1 * num2} ")
      } else if (oper == "/"){
          println("the result is =${num1 / num2} ")
      } else if (oper == "%"){
          println("the result is =${num1 % num2} ")    }

    /*Question 2 :Complete the following program to determine the raise and new salary for an
     employee by adding if -else statements to compute the raise. The input to program includes
      the current annual salary for the employee and a number indicating the performance rating
       (1=excellent, 2=good, and 3=poor). An employee with a rating of 1 will receive a 6% raise
       , an employee with a rating of 2 will receive a 4% raise, and one with a rating of 3 will
       receive a 1.5% raise.*/
    print("Question 2 answer// ")
    println(" Enter employee salary")
    var Sal = readLine()!!.toDouble()
    println("Enter employee rate from 1 to 3")
    var rate : Int= readLine()!!.toInt()
    var newSal : Double = 1.0
    if (rate >=1 && rate<=3){
        if (rate==1){ newSal= Sal/100 *6
                 newSal+=Sal
                 println(newSal) }
        else if (rate==2){ newSal= Sal/100 *4
            newSal+=Sal
            println(newSal)  }
        else if (rate==3){ newSal= Sal/100 *1.5
            newSal+=Sal
            println(newSal)      }   }
    else{      println(" Enter vaild rate from 1 to 3")    }

    print(" solved by : khulud alshrqawi :) ")
    }


import java.util.Scanner;

//import javax.lang.model.util.ElementScanner14;

public class kharem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        double amount,previous,current,halve;
        double two_percent = 0.02;
        halve = 0.5;
        double percent;
        
       
        System.out.println("Portal to calculate electricity bill.");
        System.out.print("What's your name: ");
        name = sc.nextLine();
       
        System.out.print("input your previous bill: ");
        previous = sc.nextDouble();
        
        System.out.print("input your current bill: ");
        current = sc.nextDouble();
        amount = (previous + current) * halve;
        
        System.out.println(amount);
      
      // Domestic
        if (amount<=100){
            //System.out.println(amount +" Domestic");
            double finaal;
            double finish;
            double sixty;
            double domestic_final;

        if (amount<=60){
            finaal = amount *0.3;
            percent = (finaal * two_percent) + finaal;
           
            //System.out.println("Hello " + name +", your bill as a Domestic consumer is $" + finaal);
            //System.out.println("Two Percent of your bill is $" + percent);

            System.out.println("Customer name: "+ name);
            System.out.println("Previous bill: " + previous + "kwh");
            System.out.println("Current bill: " + current + "kwh");
            System.out.println("Category: Domestic consumer");
            System.out.println("Customer bill: $" + finaal);
            System.out.println("Total bill: $" + percent);
        }
        else if(amount >60){
            finaal = amount -60;
            sixty = 60 * 0.3;
            finish = finaal * 0.5;
            domestic_final = sixty + finish;
            percent = (finaal * two_percent)+ domestic_final;
           
            //System.out.println("Hello " + name +", your bill as a Domestic consumer is $" + domestic_final);
            //System.out.println("Two percent of your bill is $" + percent);
            
            System.out.println("Customer name: "+ name);
            System.out.println("Previous bill: " + previous + "kwh");
            System.out.println("Current bill: " + current + "kwh");
            System.out.println("Category: Domestic consumer");
            System.out.println("Customer bill: $" + domestic_final);
            System.out.println("Total bill: $" + percent);


        }

       }

       // Industrial
       else if (amount>100 && amount<200){
            //System.out.println(amount +" Industrial");
            double finaal2;
            double finish2;
            double onetwenty;
            double industrial_final;

        if (amount<=120){
            finaal2 = amount *0.5;
            percent = (finaal2 * two_percent) + finaal2;
            
            //System.out.println("Hello " + name +",our bill as a Industrial consumer is $" + finaal2);
            //System.out.println("Two percent of your bill is " + percent);

            System.out.println("Customer name: "+ name);
            System.out.println("Previous bill: " + previous + "kwh");
            System.out.println("Current bill: " + current + "kwh");
            System.out.println("Category: Industrial consumer");
            System.out.println("Customer bill: $" + finaal2);
            System.out.println("Total bill: $" + percent);
        }
        else if(amount >120){
            finaal2 = amount -120;
            onetwenty = 120 * 0.5;
            finish2 = finaal2 * 0.75;
            industrial_final = onetwenty + finish2;
            percent = (industrial_final * two_percent) + industrial_final;
          
            //System.out.println("Hello " + name +", your bill as a Industrial consumer is $" + industrial_final);
            //System.out.println("Two percent of your bill is " + percent);

            System.out.println("Customer name: "+ name);
            System.out.println("Previous bill: " + previous + "kwh");
            System.out.println("Current bill: " + current + "kwh");
            System.out.println("Category: Industrial consumer");
            System.out.println("Customer bill: $" + industrial_final);
            System.out.println("Total bill: $" + percent);

     
        }

       }
      
       //Commercial
       else if (amount>200){
            //System.out.println(amount + " Commercial");
            double finaal3;
            double finish3;
            double twoHundredOne;
            double commercial_final;

        if (amount<=201){
            finaal3 = amount *0.9;
            percent = (finaal3 *two_percent) + finaal3;
           
            //System.out.println("Hello " + name +", your bill as a Commercial consumer is $" + finaal3);
            //System.out.println("Two percent of your bill is $" + percent);

            System.out.println("Customer name: "+ name);
            System.out.println("Previous bill: " + previous + "kwh");
            System.out.println("Current bill: " + current + "kwh");
            System.out.println("Category: Commercial consumer");
            System.out.println("Customer bill: $" + finaal3);
            System.out.println("Total bill: $" + percent);
        }
       
        else if(amount >201){
            finaal3 = amount -201;
            twoHundredOne = 201 * 0.9;
            finish3 = finaal3 * 1.5;
            commercial_final = twoHundredOne + finish3;
            percent = (commercial_final * two_percent) + commercial_final;
           
            //System.out.println("Hello " + name +", your bill as a Commercial consumer is $" + commercial_final);
            //System.out.println("Two percent of your bill is $" + percent);

            System.out.println("Customer name: "+ name);
            System.out.println("Previous bill: " + previous + "kwh");
            System.out.println("Current bill: " + current + "kwh");
            System.out.println("Category: Commercial consumer");
            System.out.println("Customer bill: $" + commercial_final);
            System.out.println("Total bill: $" + percent);


        }
       }
    }
}
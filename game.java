import java.util.Scanner;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author SuperSpruce
 */
public class DateHomecoming2019 
{
    public static void main(String[] args)
    {
        boolean date = false;
        boolean encounterGirl1 = false;
        boolean encounterGirl2 = false;
        boolean encounterGirl3 = false;
        boolean askGirlToDance = false;
        boolean asked1 = false;
        boolean asked2 = false;
        boolean asked3 = false;
        double encounterGirl1chance;
        double encounterGirl2chance;
        double encounterGirl3chance;
        double chanceForYes1;
        double chanceForYes2;
        double chanceForYes3;
        double ditchChance;
        
        Scanner kboard = new Scanner(System.in);
    
        for(int i = 0; i < 50; i++)
        {
            int daysLeft = 50 - i;
            System.out.println("Days until the dance: " + daysLeft);
            
            encounterGirl1chance = 0.25 + i / 1000;
            encounterGirl2chance = 0.40 + i / 1000;
            if(i % 12 == 1 || i % 12 == 3 || i % 12 == 6 || i % 12 == 8 || i % 12 == 10)
            {
                encounterGirl3chance = 0.55 + i / 1000;
            }
            else
            {
                encounterGirl3chance = 0.15 + i / 1000;
            }
            
            chanceForYes1 = ((i + 30.0) * Math.pow(10, -1.0 / 300 * Math.pow(i, 1.8)) * (1.0 + Math.pow(i, 16) / Math.pow(10, 25))) / 100.0;
            chanceForYes2 = ((i / 10.0 + 25) * Math.pow(10, -1.0 / 7000 * Math.pow(i, 3)) * (1.0 + 0.5 * Math.pow(i, 110) / Math.pow(10, 170))) / 100.0;
            chanceForYes3 = ((Math.pow(i, 0.75) + 15.0) * Math.pow(10, -1.0 / 3000000000000000.0 * Math.pow(i, 10)) * (1.0 + Math.pow(10, Math.pow(1.0010035, Math.pow(i, 2.1))) / Math.pow(10, 10))) / 100.0;
            
            ditchChance = ((51.0 - Math.pow(i, 0.97)) / ((i - 50.0) * (i - 50.0) + 3) + 0.25) / 100.0;
            
            
            if(Math.random() <= encounterGirl1chance && date == false && asked1 == false)
            {
                System.out.println("You encounter Girl1! Ask her to the dance? (Say true for yes and false for no) ");
                askGirlToDance = kboard.nextBoolean();
                if(askGirlToDance == true)
                {
                    asked1 = true;
                    if(Math.random() <= chanceForYes1)
                    {
                        date = true;
                        System.out.println("Girl1 says yes! You got a date for the dance!");
                    }
                    else
                    {
                        System.out.println("Girl1 says no. Better luck next time.");
                    }
                }
            }
            
            if(Math.random() <= encounterGirl2chance && date == false && asked2 == false)
            {
                System.out.println("You encounter Girl2! Ask her to the dance? (Say true for yes and false for no) ");
                askGirlToDance = kboard.nextBoolean();
                if(askGirlToDance == true)
                {
                    asked2 = true;
                    if(Math.random() <= chanceForYes2)
                    {
                        date = true;
                        System.out.println("Girl2 says yes! You got a date for the dance!");
                    }
                    else
                    {
                        System.out.println("Girl2 says no. Better luck next time.");
                    }
                }
            }
            
            if(Math.random() <= encounterGirl3chance && date == false && asked3 == false)
            {
                System.out.println("You encounter Girl3! Ask her to the dance? (Say true for yes and false for no) ");
                askGirlToDance = kboard.nextBoolean();
                if(askGirlToDance == true)
                {
                    asked3 = true;
                    if(Math.random() <= chanceForYes3)
                    {
                        date = true;
                        System.out.println("Girl3 says yes! You got a date for the dance!");
                    }
                    else
                    {
                        System.out.println("Girl3 says no. Better luck next time.");
                    }
                }
            }
            
            if(date == true && Math.random() <= ditchChance)
            {
                date = false;
                System.out.println("Oh no! Your date just ditched you!");
            }
            
            if(asked1 == false || asked2 == false || asked3 == false || date == true)
            {
                try 
                {
                    TimeUnit.SECONDS.sleep(1);
                } 
                catch (InterruptedException ie) 
                {
                    Thread.currentThread().interrupt();
                }
            }
            
        }
        
        if(date == true)
        {
            System.out.println("Congratulations, you have successfully gotten a date to the dance!!");
        }
        else
        {
            System.out.println("Too bad. You didn't get a date for the dance.");
        }
    }
}

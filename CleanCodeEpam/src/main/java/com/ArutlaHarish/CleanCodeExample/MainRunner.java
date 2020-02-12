package com.ArutlaHarish.CleanCodeExample;
import java.util.*;
class MainRunner
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("1 --- Compound and Simple Interest");
            System.out.println("2 --- Estimate Cost for House Construction");
            System.out.println("3 --- Exit");
                   
            switch(sc.nextInt())
            {
                case 1 :
                CalculateSimpleCompound calculateSimpleCompound = new CalculateSimpleCompound();
       
                calculateSimpleCompound.readInput();
                
                calculateSimpleCompound.calculateSimpleInterest();
               
                calculateSimpleCompound.calculateCompoundInterest();
                 break;
                 case 2:
                 
                 InputReader inputReader = new InputReader();
                 
                 inputReader.readInput();
                 
                 String standard=inputReader.getStandard();
                 int totaArea=inputReader.getTotalArea();
                 
                 EstimateHouseCost estimateHouseCost = new EstimateHouseCost(standard, totaArea);
                 estimateHouseCost.Estimate();
                break;
                case 3:
                System.out.println("Exiting...");
                System.exit(0);
                default:
                System.out.println("please enter any thing"); 
                break;        

            }
        }

       
        


    }
}
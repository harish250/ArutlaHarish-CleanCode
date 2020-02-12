package com.ArutlaHarish.CleanCodeExample;
import java.util.Scanner;
class EstimateHouseCost implements EstimateInterface
{
   
    String materialStandard;
    int totalArea;
     EstimateHouseCost(String material,int area)
     {
         materialStandard=material;
         totalArea=area;
     }

    @Override
    public void Estimate() {
          int totalCost=0;

        if(materialStandard.compareToIgnoreCase("standard")==0)
        {
            totalCost+=1200*totalArea;
        }
        else if(materialStandard.compareToIgnoreCase("above standard")==0)
        {
          totalCost+=1500*totalArea;
        }
        else if(materialStandard.compareToIgnoreCase("high standard")==0)
        {
          Scanner sc = new Scanner(System.in);
         System.out.println("Do you need a fully automated one\nYes or No");
         String choice = sc.next();
         if(choice.equals("Yes"))
            totalCost+=2500*totalArea;
         else
         totalCost+= 1800*totalArea;   
        
        }
        System.out.println("The Estimated Cost is "+totalCost);
        

    }
    
}
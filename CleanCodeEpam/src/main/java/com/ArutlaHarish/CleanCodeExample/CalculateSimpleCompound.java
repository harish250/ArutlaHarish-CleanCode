package com.ArutlaHarish.CleanCodeExample;
import java.util.*;
public class CalculateSimpleCompound implements CompoundSimple
{
Scanner scanner;
int principle;
int interestRate;
int termOfLoan;

    CalculateSimpleCompound()
    {
        scanner = null;
        principle = 0;
        interestRate = 0;
        termOfLoan = 0;
    }

    @Override
    public float calculateSimpleInterest() {
         float simpleInterest = (principle*((float)interestRate/100)*termOfLoan)/100;
         return simpleInterest;
        }

    @Override 
    public double calculateCompoundInterest()
    {
        double compoundInterest = (double)(principle * (Math.pow((1+(double)interestRate/100),termOfLoan)))-principle;
        return compoundInterest;        
    }
    
    @Override
    public void readInput()
    {
        scanner = new Scanner(System.in);
        System.out.println("Enter the Principle Amount ");
        principle = scanner.nextInt();
        System.out.println("Enter the Interest Rate ");
        interestRate = scanner.nextInt();
        System.out.println("Enter the Term of Loan");
        termOfLoan = scanner.nextInt();
    }
        
}
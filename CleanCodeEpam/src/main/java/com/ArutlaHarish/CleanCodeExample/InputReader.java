package com.ArutlaHarish.CleanCodeExample;

import java.util.Scanner;

class InputReader
{
  String materialStandard;
  int totalArea;
  InputReader()
  {
      materialStandard=null;
      totalArea=0;
  }
  
  void readInput()
  {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the  Material Standard");
      this.materialStandard=scanner.nextLine();
      System.out.println("Enter the Total Area in Square feet");
      this.totalArea=scanner.nextInt();
  }
  String getStandard()
  {
        return  this.materialStandard;
  }
  int getTotalArea()
  {
      return this.totalArea;
  }



}
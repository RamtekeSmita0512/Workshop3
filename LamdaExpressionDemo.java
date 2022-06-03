package com.Bridgelabz.Workshop3;

import java.util.ArrayList;
interface MyInterface{
  void arthimeticOperation(int num1,int num2);
}

public class LamdaExpressionDemo
{
    public void storelamdaDemo(){
        int num=0;
        ArrayList<Integer> integers = new ArrayList<>();
       // integers ArrayList . ForEach(num-> System.out.println(int num));
        {
            MyInterface VarToStoreLambdaExpression=(num1,num2)-> System.out.println(num1*num2);

            VarToStoreLambdaExpression.arthimeticOperation(3,7);
        }

    }

    public static void main(String[] args) {
        LamdaExpressionDemo ied= new LamdaExpressionDemo();
    }
}

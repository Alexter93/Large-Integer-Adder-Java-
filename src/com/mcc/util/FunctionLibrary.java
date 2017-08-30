package com.mcc.util;

import java.util.InputMismatchException;

/**
 * Created by Owner on 4/21/14.
 */
public class FunctionLibrary extends Exception
{
    String sError;

    public FunctionLibrary()
    {}
    public FunctionLibrary(String input)
    {
        sError = "InvalidNumberException: " + input;
    }
    public String displayError() {return sError;}

    public static String fillInZeros(String string, int length)
    {
        int digitFill = 0;
        String tempString = "";

        digitFill = length - string.length();
        for (int i=0; i<digitFill; i++)
        {
            tempString += "0";
        }

        tempString += string;
        string = tempString;

        return string;
    }

    public static String getString(String s)
    {
        return s;
    }

    /*

    */
    public static String performAddition(String sNumber1, String sNumber2)
    {
        int[] array1;
        int[] array2;
        int[] arrayResult;
        array1 = new int[100];
        array2 = new int[100];
        arrayResult = new int[101];
        int temp = 0;
        int remainder = 0;
        String result = "";

        try
        {
            if (sNumber1.charAt(0) == '-')
            {
                System.out.println("Number 1 needs to be positive!");
                throw new FunctionLibrary("Number 1 needs to be positive!");
            }
            if (sNumber2.charAt(0) == '-')
            {
                System.out.println("Number 2 needs to be positive!");
                throw new FunctionLibrary("Number 2 needs to be positive!");
            }
            for (int i=0; i<sNumber1.length(); i++)
            {
                if (sNumber1.charAt(i) <= '/' || sNumber1.charAt(i) >= ':')
                {
                    System.out.println("Number 1 needs to be a number!");
                    throw new FunctionLibrary("For input string: " + sNumber1.charAt(i));
                }
            }
            for (int i=0; i<sNumber2.length(); i++)
            {
                if (sNumber2.charAt(i) <= '/' || sNumber2.charAt(i) >= ':')
                {
                    System.out.println("Number 2 needs to be a number!");
                    throw new FunctionLibrary("For input string: " + sNumber2.charAt(i));
                }
            }
        }
        catch (FunctionLibrary ex)
        {
            return ex.displayError();
        }
        catch (NumberFormatException ex)
        {
            return "InvalidNumberException: Invalid Number Input!" ;
        }
        catch (InputMismatchException ex)
        {
            return "InvalidNumberException: Invalid Number Input!";
        }
        catch (Exception ex)
        {
            return ex.toString();
        }

        for (int i=0; i<sNumber1.length(); i++)
        {
            array1[i] = Character.getNumericValue(sNumber1.charAt(i));
            array2[i] = Character.getNumericValue(sNumber2.charAt(i));
        }

        for (int i=sNumber1.length()-1; i>=0; i--)
        {
            temp = 0;
            temp += array1[i] + array2[i] + remainder;
            if (temp >= 10)
            {
                if(i==0)
                {
                    arrayResult[0] += temp;
                    remainder = 0;
                }
                else
                {   arrayResult[i] += temp%10;
                    remainder = temp/10;
                }
            }
            else
            {
                arrayResult[i] += temp;
                remainder = 0;
            }
        }
        for (int i=0; i<sNumber1.length(); i++)
        {
            result += String.valueOf(arrayResult[i]);
        }
        return result;
    }
}

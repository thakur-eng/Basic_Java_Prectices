package com.kodewala.scope;

class PaymentScopeofvariable 
{

public int qty = 100; //this can be used anyone (class)

protected String itemName; //used by any class from the same package,sub classin different package

String location; // used by any class from the same packages 

private String userName; //with in the class

public static void main (String args[])
{
 String fileName  = args[0];
 System.out.println(fileName);
 
 }
 
 }
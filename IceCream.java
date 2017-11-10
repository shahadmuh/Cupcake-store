//Shahad almuhizi
//436201525
public class IceCream extends Dessert{
private int numOfScoops;
public IceCream(String flavor,char size,int numOfScoops){
super(flavor,size);
this.numOfScoops=numOfScoops;}

public double CalculatePrice(){
double price=0;
switch (size){
case 'S':
case 's':
price=8;
break;
case 'M':
case 'm':
price=12;
break;
case 'L':
case 'l':
price=15;
break;}
price+=(3*(numOfScoops-1));
return price;}

public String toString(){
String s1=super.toString();
String s="\nNumber Of Scoops= "+numOfScoops;
return s1+s;}}
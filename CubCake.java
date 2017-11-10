//Shahad almuhizi
//436201525
public class CubCake extends Dessert{
private boolean withfruits;
public CubCake(String flavor,char size,boolean withfruits){
super(flavor,size);
this.withfruits=withfruits;}

public double CalculatePrice(){ 
double price=0;
switch (size){
case 'S':
case 's':
price =6;
break;
case 'M':
case 'm':
price=10;
break;
case 'L':
case 'l':
price=12;
break;}
if (withfruits)
price+=3;
return price;}

public String toString(){
String s="\nWithFruits? "+withfruits;
String s1=super.toString();
return s1+s;}}

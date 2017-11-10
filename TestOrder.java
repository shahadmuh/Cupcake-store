//shahad almuhizi
//436201525
import java.util.*;
public class TestOrder{
static Scanner console=new Scanner (System.in);
public static void main(String[] args){
System.out.println("Enter the costumer name: ");
String name=console.nextLine();
System.out.println("Enter the maximum number of Desserts in the order: ");
int max=console.nextInt();
//Order object
Order order1=new Order(name,max);
Dessert d,d1;
int choice,scoop;
char size,size1;
String flav,with1,with2,flav2;
boolean with,add=false;
do {
System.out.println("Enter the number you want:");
System.out.println("1.Add a new dessert (CupCake or IceCream) to order1.");
System.out.println("2.Print all desserts in the order1.");
System.out.println("3.Print total cost of the order.");
System.out.println("4.Print all the ice creams in order1 with a specific Flavor (entered by the user).");
System.out.println("5.Exit.");
choice=console.nextInt();
switch (choice){
case 1:
{System.out.println("Enter C for Cupcake or I for Icecream");
char ch1=console.next().charAt(0);
char ch=Character.toUpperCase(ch1);
if ((ch!='C')&&(ch!='I'))
System.out.println("The charecter you entered is incorrect");
System.out.println("Enter the flavor of your dessert:");
flav2=console.next();
flav=flav2.toLowerCase();
System.out.println("Enter the size of your dessert:(S for small, M for medium, L for large)");
size1=console.next().charAt(0);
size=Character.toUpperCase(size1);
if ((size!='S')&&(size!='M')&&(size!='L')){
System.out.println("The charecter you entered is incorrect");}
if (ch=='C'){
System.out.println("Do you want your cupcake with Fruits?");
with2=console.next();
with1=with2.toUpperCase();
if (with1.equals("yes"))
with=true;
else
with=false;
CubCake cup=new CubCake(flav,size,with);
d=cup;
add=order1.AddDessert(d);}
if (ch=='I'){
System.out.println("Enter the number of Scoops you want in your icecream:*It comes with only one scoop*");
scoop=console.nextInt();
IceCream cream=new IceCream(flav,size,scoop);
d=cream;
add=order1.AddDessert(d);}
if (ch!='C'&&ch!='I')
System.out.println("The charecter you entered is incorrect");
if (add)
System.out.println("Your Order Was Added Successfully");
else
System.out.println("Your Order Was Not Added Successfully");
break;}

case 2:
for (int i=0;i<order1.getNumOfDesserts();i++)
System.out.println(order1.getDessertlist()[i]);
break;
case 3:
System.out.println(order1.getTotalCost());
break;
case 4:
{System.out.println("Enter the flavor of the IceCream you want to print:");
String flavo1=console.next();
String flavo=flavo1.toLowerCase();
Dessert arr[]=order1.GetIceCream(flavo);
for (int s=0;s<arr.length;s++)
System.out.println(arr[s]);
break;}
}
if (choice>5)
System.out.println("The number you enter is incorrect");
}while (choice!=5);}}
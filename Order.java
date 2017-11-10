//Shahad almuhizi
//436201525
public class Order {
protected String name;
protected int numOfDesserts;
private Dessert[] dessertlist;
IceCream ice;
public Order (String name ,int size){
this.name=name;
numOfDesserts=0;
dessertlist=new Dessert[size];}

public int getNumOfDesserts(){
return numOfDesserts;}

public Dessert[] getDessertlist(){
return dessertlist;}

public boolean AddDessert(Dessert d){
if (numOfDesserts<dessertlist.length){
dessertlist[numOfDesserts++]=d;
return true;}
return false;}

public double getTotalCost(){
double cost=0.0;
for (int i=0;i<numOfDesserts;i++)
cost+=dessertlist[i].CalculatePrice();
return cost;}

public Dessert[] GetIceCream(String flavor){
Dessert[] icecream;
int count=0,c=0;
for (int i=0;i<numOfDesserts;i++)
if ((dessertlist[i] instanceof IceCream)&&(dessertlist[i].getFlavor().equals(flavor)))
count++;
icecream= new Dessert[count];
for (int f=0;f<numOfDesserts;f++)
if (dessertlist[f] instanceof IceCream && dessertlist[f].getFlavor().equals(flavor))
icecream[c++]=dessertlist[f];
return icecream;}

public String toString(){
return "Name: "+name+"\nNumber Of Desserts: "+numOfDesserts;}}
//Shahad almuhizi
//436201525
public class Dessert {
protected String flavor;
protected char size;
public Dessert(String flavor,char size){
this.flavor=flavor;
this.size=size;}

public double CalculatePrice(){
return 0.0;}

public String getFlavor(){
return flavor;}

public String toString(){
return "Flavor: "+flavor+"\nSize: "+size;}
}
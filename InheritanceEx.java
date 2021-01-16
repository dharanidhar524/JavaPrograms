class Pizza {
public String addOns = "Cheese";
public String bread = "WheatBread";
public String sauces[] = { "tomatch", "chills",
public void baking() {
System. out. println( "Bread baked directly inside oven" );

public void packing() {
System. out. println("Inside a cardboard carton!" ) ;

class BurgerPizza extends Pizza {
public String patty = "veg";
public String fillings = "lettuce";
@override
public void baking( ) (
System. out . println("Patty inside oven");

public class InheritanceEx {
public static void main(String[] args) {
System, out . println("PIZZA") ;
Pizza vegSupreme = new Pizza();
System. out. println( vegSupreme.addOns) :
System. out. println(vegSupreme.sauces[0]);
System. out , println (vegSupreme.sauces[1]);
System, out . println("BURGER PIZZA") ;
Pizza veg = new BurgerPizza();
System. out. println( veg.addons) :
System. out. println(veg.sauces[0]);
System. out. println(veg.sauces[1]);

}
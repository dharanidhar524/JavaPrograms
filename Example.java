class ElectronicItems{

public void Ele()
{
	System.out.println("Electronic Items");
	System.out.println("here we can distingish some:");
}
}

//1.1 phones extending Elec.items
class Phones extends ElectronicItems{
	public String type[]={"landline","handy"};
	public void types(){
    System.out.println("Phones in ele segment:");
	}
   
}

//1.1.1 Phones exetending Mobiles
class Mobile extends Phones{
	public String models[]={"android","Ios"};
	public String prices[]={"10k","20k"};

}

//1.1.2 cardphones extending phones
class CordPhones extends Phones{
	public String place[]={"home","office"};
	public String prices[]={"5k","3k"};
}

//1.2 Soundsystem extending Elec.Items
class SoundsSys extends ElectronicItems{
	public void SS()
	{
		System.out.println("Sound systems in ele segment");
	
	}
    public String types[]={"earplugs","out speakers"};

}

//1.2.1 ear extends SS
class Earplugs extends SoundsSys{
	String colour="black";
}
//1.2.2 st extends SS
class Stereos extends SoundsSys{
    String Quantity="more than a two";
}




//Main Class
class Example 
{
	public static void main(String args[])
	{
	   Phones p=new Phones();
        p.Ele();
        //mobiles in Phones
        Mobile m=new Mobile();
        m.types();
        System.out.println(m.type[0]);
        System.out.println(m.type[1]);
        //cordphones in phones
        CordPhones cp=new CordPhones();
        cp.types();
        System.out.println(cp.place[0]+"and"+cp.place[1]);
        System.out.println(cp.prices[0]+"and"+cp.prices[1]);
       

       SoundsSys s=new SoundsSys();
       s.Ele();
       //earplugs in SoundSystem
       Earplugs e=new Earplugs();
       e.SS();
        System.out.println(e.colour);
       //stereos in SoundSystem
      Stereos st=new Stereos();
        System.out.println(st.Quantity);
     
        

	}

}
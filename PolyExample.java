class storeDetails
{
	public void name()
	{
	  System.out.println("student firstname:hari");
	}

	public void name(String lastname)
	{
	  System.out.println("student lastname:"+ lastname);
	}

	public void mobile()
	{
	  System.out.println("mobile-1:54896");
	}

	public void mobile(int mobile2)
	{
	  System.out.println("mobile-2:"+mobile2);
	}
}

class PolyExample{
public static void main(String[] args)
{
 System.out.println("---example for polymorphism---");
 System.out.println("Student details");

 boolean lastnameAvailable=false;
 boolean mobile2Available=true;

 storeDetails sd=new storeDetails();
 //-------------------
 if(lastnameAvailable)
 {
 	sd.name();
 	sd.name("krishna");
 }
 else
 {
 	sd.name();
 }	
//--------------------
  if(mobile2Available)
 {
 	sd.mobile();
 	sd.mobile(54789);
 }
 else
 {
 	sd.mobile();
 }
}
}

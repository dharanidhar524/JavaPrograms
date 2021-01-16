
class ElectronicItems {​​​​​​​
public String devices[] = {​​​​​​​"mobiles","TV","computers"}​​​​​​​;


public void designing() 
   {​​​​​​​
System.out.println("these are designed in pcb boards");
    }​​​​​​​
}​​​​​​​


class Phones extends ElectronicItems{​​​​​​​
public String components[] = {​​​​​​​"display","battery","keypad","processor"}​​​​​​​;
public void usage() 
 {​​​​​​​
System.out.println("used for multi purpose");
    }​​​​​​​
}​​​​​​​


class SoundSystems extends ElectronicItems {​​​​​​​
public String equipment[] = {​​​​​​​"amplifier","cables","loudspeakers"}​​​​​​​;
public void use() {​​​​​​​
System.out.println("used for listening");
  }​​​​​​​
}​​​​​​​


class MobilePhones extends Phones {​​​​​​​
public String companies[] ={​​​​​​​"samsung","redmi","realme"}​​​​​​​;
public String  simslots = "dualslot";
public String size = "5inches";
@Override
public void packing() {​​​​​​​
System.out.println("inside a box with charger");
 }​​​​​​​
}​​​​​​​


class CordPhones extends Phones {​​​​​​​
public String devicetype = "wired";  
public void household() {​​​​​​​
System.out.println("used inside  house and office");
   }​​​​​​​
 }​​​​​​​


class Earplugs extends SoundSystems {​​​​​​​
public String buttons[] = {​​​​​​​"volume","play"}​​​​​​​;
public String speakers = "minispeakers";
public void carrying() {​​​​​​​
System.out.println("easy for carring");
 }​​​​​​​
}​​​​​​​
class Stereos extends SoundSystems {​​​​​​​
public String functions[] = {​​​​​​​"playingsongs","recording audio"}​​​​​​​;
public String buttons[] = {​​​​​​​"volup","voldown","start/stop","recording"}​​​​​​​;
@override
public void use() {​​​​​​​
System.out.println("used for listening and recording");
  }​​​​​​​
}​​​​​​​



public class Electronic {​​​​​​​
 public static void main(String[] args) {​​​​​​​
    System.out.println("ElectronicsItems");
  ElectronicItems EI =  new ElectronicItems();
  System.out.println(EI.devices[0]);
  System.out.println(EI.devices[1]);
   System.out.println(EI.devices[2]);
   EI.designing();


System.out.println("Phones");
Phones P = new Phones();
System.out.println(P.components[0]);
  System.out.println(P.components[1]);
   System.out.println(P.components[2]);
 P.usage();


System.out.println("SoundSystems");
SoundSystems SS = new SoundSystems();
System.out.println(SS.equipment[0]);
  System.out.println(SS.equipment[1]);
   System.out.println(SS.equipment[2]);
SS.use(); 


System.out.println("MobilePhones");
MobilePhones MP = new MobilePhones();
System.out.println(MP.companies[0]);
  System.out.println(MP.companies[1]);
   System.out.println(MP.companies[2]);
System.out.println(MP.simslots);
System.out.println(MP.size);
  MP.packing();


System.out.println(" CordPhones");
 CordPhones CP = new  CordPhones();
System.out.println(CP.devicetype);
 CP.household();


System.out.println("Earplugs");
Earplugs E =  new Earplugs();
System.out.println(E.speakers);
System.out.println(E.buttons[0]);
  System.out.println(E.buttons[1]);
E.carrying();


System.out.println("Stereos");
Stereos S = new Stereos();
System.out.println(S.functions[0]);
System.out.println(S.functions[1]);
System.out.println(S.buttons[0]);
System.out.println(S.buttons[1]);
System.out.println(S.buttons[2]);
System.out.println(S.buttons[3]);
S.use();
  }​​​​​​​
}​​​​​​​
















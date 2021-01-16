class TrainJourney
{
    String starting_form;
    String terminating;
    int min;
    public void set_start()
    {
        starting_form="delhi";
        System.out.println("In location:"+starting_form);
    }
    public void get_start()
    {
        terminating="chennai";
        System.out.println("Out location:"+terminating);
    }
    public void get_journey_time(){
        min=30;
        System.out.println("strating in "+min+" minutes");
    }
}

class Freight extends TrainJourney
{
    int capacity;
    int carriages;
    boolean hazardous;

    public void set_hazardous()
    {
        hazardous=false;
        if(hazardous)
          System.out.println("There are few hazardous");
    }
    public void get_capacity()
    {
        capacity=80;
        System.out.println("capacity of "+capacity+" tonnes");
    }
}

class Passenger extends TrainJourney
{
    int first_class;
    int no_carriages;
    boolean catering;

    public void get_first_calss()
    {
        first_class=455;
        System.out.println("there are "+first_class+"  Passenger in first_class");
    }
    public void add_carriages()
    {
        no_carriages=56;
        System.out.println(no_carriages+" carriages in Passenger Section");
    }
    public void in_service()
    {
        catering=true;
        if(catering)
            System.out.println("catering is available");
    }
}



class InheritAssg
{
    public static void main(String[] args) {
        System.out.println("*********Freight inheritance*********");
        Freight f=new Freight();
        f.set_start();
        f.get_start();
        f.get_journey_time();
        

        f.set_hazardous();
        f.get_capacity();
         

        System.out.println("*********Passenger inheritance*********");

        Passenger p=new Passenger();
        p.set_start();
        p.get_start();
        p.get_journey_time();

        
        p.get_first_calss();
        p.add_carriages();
        p.in_service();


    }
}


//java -classpath .;yourjar.jar YourMainClass
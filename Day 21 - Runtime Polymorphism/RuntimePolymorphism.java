/*
Runtime Polymorphism
----------------------
Runtime polymorphism or Dynamic Method Dispatch is a process in which a call to an overridden method is resolved at runtime rather than compile-time.
Test Case1:
Input:
Rate of interest of banks

Output:
SBI Rate of Interest: 8.4
ICICI Rate of Interest: 7.3
AXIS Rate of Interest: 9.7

 */
class Banks{
    float getRateOfInterest(){return 0;}
}
class SBI extends Banks{
    float getRateOfInterest(){return 8.4f;}
}
class ICICI extends Banks{
    float getRateOfInterest(){return 7.3f;}
}
class AXIS extends Banks{
    float getRateOfInterest(){return 9.7f;}
}
class RuntimePolymorphism{
    public static void main(String args[]){
        Banks b;
        b=new SBI();
        System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());
        b=new ICICI();
        System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());
        b=new AXIS();
        System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());
    }
}
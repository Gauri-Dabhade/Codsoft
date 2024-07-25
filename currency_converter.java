import java.util.Scanner;

public class currency_converter {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);

       System.out.println("Welcome to currency Converter!!");
       System.out.println("Enter Your Choice : ");
       System.out.println("1.Convert Rupee to USD ");
       System.out.println("2.Convert USD to Rupee ");
       System.out.println("3.Convert Rupee to Eur");
       System.out.println("4.Convert Eur  to Rupee ");
       System.out.println("5.Convert Rupee to JPY");
       System.out.println("6.onvert JPY to Rupee");
       System.out.println("7.Convert Rupee to AUD");
       System.out.println("8.Convert AUD to Rupee");
       System.out.println("Enter your choice:");
       int choice = scn.nextInt();

       if(choice==1){
        System.out.println("Enter the amount in Rupee: ");
        double Rupee = scn.nextDouble();
        double USD = rupeeTousd(Rupee);
        System.out.println("Converted amount to USD :"+USD);
       }
       else if(choice==2){
        System.out.print("Enter the amount in USD: ");
        double USD = scn.nextDouble();
        double Rupee = usdTorupee(USD);
        System.out.println("Converted amount to Rupee:"+Rupee);
       }
       else if(choice==3){
        System.out.println("Enter the amount in Rupee");
        double Rupee = scn.nextDouble();
        double Eur = rupeeToeur(Rupee);
        System.out.println("Converted amount to Eur :"+Eur);
       }
       else if(choice==4){
        System.out.println("Enter the amount in USD");
        double Eur = scn.nextDouble();
        double Rupee = eurTorupee(Eur);
        System.out.println("Converted amount to Rupee :"+Rupee);
       }
       else if(choice==5){
        System.out.println("Enter the amount in Rupee");
        double Rupee = scn.nextDouble();
        double JPY = rupeeTojpy(Rupee);
        System.out.println("Converted amount to JPY :"+JPY);
       }
       else if(choice==6){
        System.out.println("Enter the amount in JPY");
        double JPY = scn.nextDouble();
        double Rupee = jpyTorupee(JPY);
        System.out.println("Converted amount to Rupee :"+Rupee);
       }
       else if(choice==7){
        System.out.println("Enter the amount in Rupee");
        double Rupee = scn.nextDouble();
        double AUD =  rupeeToaud(Rupee);
        System.out.println("Converted amount to AUD :"+AUD);
       }
       else if(choice==8){
        System.out.println("Enter the amount in AUD");
        double AUD = scn.nextDouble();
        double Rupee = audTorupee(AUD);
        System.out.println("Converted amount to Rupee :"+Rupee);
       }
       else{
        System.out.print("Please Enter the valid choice!");
       }
       scn.close();
}
public static double rupeeTousd(double Rupee){
    return Rupee*0.012;
}
public static double usdTorupee(double USD){
    return USD*87.47;
}
public static double rupeeToeur(double Rupee){
    return Rupee*0.0113;
}
public static double eurTorupee(double Eur){
    return Eur*89.10;
}
public static double rupeeTojpy(double Rupee){
    return Rupee*1.93;
}
public static double jpyTorupee(double JPY){
    return JPY*0.52;
}
public static double rupeeToaud(double Rupee){
    return Rupee*0.018;
}
public static double audTorupee(double AUD){
    return AUD*55.73;
}
}

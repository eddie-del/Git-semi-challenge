import java.util.Scanner;

public class hibalerJavaProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter another first name: ");
        String secName = sc.nextLine();
        System.out.println("Enter another first name: ");
        String thirdName = sc.nextLine();
        
        System.out.println("The names are: "+firstName+", "+secName+" and "+thirdName);
        System.out.println(" ");
        System.out.println("The possibile combinations: ");
        System.out.println("1- "+firstName +" "+ secName);
        System.out.println("2- "+firstName +" "+ thirdName);
        System.out.println("3- "+secName +" "+ firstName);
        System.out.println("4- "+secName +" "+ thirdName);
        System.out.println("5- "+thirdName +" "+ firstName);
        System.out.println("6- "+thirdName +" "+ secName);
        System.out.println(" ");
        
        
        while(true){
            System.out.println("Choose from 1-6 for name combination: ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("The initials for "+firstName +" "+ secName +" is: "+ firstName.toUpperCase().charAt(0)+secName.toUpperCase().charAt(0));
                System.out.println("Suggested username: "+firstName.toLowerCase()+"_"+secName.toLowerCase());
                System.out.println(" ");
            break;
            case 2:
                System.out.println("The initials for "+firstName +" "+ thirdName +" is: "+ firstName.toUpperCase().charAt(0)+thirdName.toUpperCase().charAt(0));
                System.out.println("Suggested username: "+firstName.toLowerCase()+"_"+thirdName.toLowerCase());
                System.out.println(" ");
            break;
            case 3:
                System.out.println("The initials for "+secName +" "+ firstName +" is: "+ secName.toUpperCase().charAt(0)+firstName.toUpperCase().charAt(0));
                System.out.println("Suggested username: "+secName.toLowerCase()+"_"+firstName.toLowerCase());
                System.out.println(" ");
            break;
            case 4:
                System.out.println("The initials for "+secName +" "+ thirdName +" is: "+ secName.toUpperCase().charAt(0)+thirdName.toUpperCase().charAt(0));
                System.out.println("Suggested username: "+secName.toLowerCase()+"_"+thirdName.toLowerCase());
                System.out.println(" ");
            break;
            case 5:
                System.out.println("The initials for "+thirdName +" "+ firstName +" is: "+ thirdName.toUpperCase().charAt(0)+firstName.toUpperCase().charAt(0));
                System.out.println("Suggested username: "+thirdName.toLowerCase()+"_"+firstName.toLowerCase());
                System.out.println(" ");
            break;
            case 6:
                System.out.println("The initials for "+thirdName +" "+ secName +" is: "+ thirdName.toUpperCase().charAt(0)+secName.toUpperCase().charAt(0));
                System.out.println("Suggested username: "+thirdName.toLowerCase()+"_"+secName.toLowerCase());
                System.out.println(" ");
            break;
            default:
                System.out.println("Invalid Input");
                System.out.println(" ");
        }
        }
    }
}
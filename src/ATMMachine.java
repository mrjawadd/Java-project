import java.util.*;
public class ATMMachine{

public static void main(String[] args) {


    System.out.println("Welcome to your account : @username ");  



Scanner sc = new Scanner(System.in);
System.out.println("Enter your pin : ");    

int pin = sc.nextInt();
if(pin==6363){
    System.out.println("Enter Amount : ");
}else{
    System.out.println("Invalid password, Try again");

    return  ;
}

System.out.println("Press\n1 Current\n2 Savings\n3 Withdraw\n4 Back " );    
    

int choice = sc.nextInt();
switch(choice){

 case 1 : 
System.out.println("Current : 1000000" );
break;    
case 2 : 
System.out.println("Savings :250000 " );
break;    
case 3: 
System.out.println("Enter amount : " );
int amount = sc.nextInt();

if( amount <=1000000){
    System.out.println("Congratulations! You have  successfully Withdarw your Amount: "); 


}
else{

    System.out.println("Insufficient balance");

}

break;    
case 4 : 

return ; 
default: 
System.out.println("Invalid option: " );    


    
}



}
    
}

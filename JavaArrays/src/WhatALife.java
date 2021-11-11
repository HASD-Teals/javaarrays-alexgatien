import java.util.Scanner;

public class WhatALife {
    public static Scanner input = new Scanner(System.in);
   
    public static void main(String[] args) {
        
        int[] keyAge = new int[] {0,5,10,13,15,16,18,21,30,40,50,55,65,70,100};
        

         keyAgetoYear (keyAge);
    }
        public static void fullReport (int[] array2){
            String[] keyEvent = new String[] {"Birth", "Kindergarten", "Preteen", "Teen", "Driving",
            "Sweet16", "High School Graduation", "Adult-All States", "Thirties", "Forties", "Fifties",
            "Early Retirement", "Retirement", "Federal Retirement", "Centurian"};
            String[] whatALife = new String[array2.length];
            for (int i= 0; i < array2.length; i++){
                whatALife[i]= (String)(array2[i] + "- " + keyEvent[i]);
                for (int j = 0; j< whatALife.length; j++){
                    System.out.println(whatALife[j]);
            }}
        }

public static void keyAgetoYear (int[] array1){
    int yearBorn; 
    System.out.print("Enter the year born: ");
yearBorn = input.nextInt();

int [] keyYears = new int[array1.length];
for (int i= 0; i< array1.length; i++){
    keyYears[i]= (int)(array1[i] + yearBorn);
}
/*for (int i: keyYears){
    System.out.println(i); */
    fullReport(keyYears);
}

}










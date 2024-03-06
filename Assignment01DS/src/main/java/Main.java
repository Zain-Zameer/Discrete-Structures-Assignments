import java.util.*;
public class Main {
  public static void main(String[] args) {
    int size;
    int choice;
    Scanner input = new Scanner(System.in);
    

    System.out.println("=Assignment 01 of Discrete Structures= \nGroup members (Urooj,Okasha,Muhammad Zain)\n\n");
    System.out.print("Enter the size of data: ");
    size=input.nextInt();

    // Creating data structure to store data
    char[] PSide = new char[size];
    char[] QSide = new char[size];
    
    // Calling method to store data
    storeData(PSide,QSide,size);

    //Selection of logic
    System.out.println("Select logic from the following: ");
    System.out.println("1) Negation ¬\n2) Conjunction of P ^ Q\n3) Disjunction of P v Q\n4) Exclusive OR of P ⊕ Q\n5) Implication\n6) Biconditional (↔)\n");
    System.out.print("Select: ");
    choice = input.nextInt();

    //Conditions of selecting logic [HAVE TO SET WHILE LOOP]
    if(choice==1){
      negation(PSide,QSide,size);
    }
    else if(choice==2){
      conjunction(PSide,QSide,size);
    }
    else if(choice==3){
      disjunction(PSide,QSide,size);
    }
    else if(choice==4){
      exclusive(PSide,QSide,size);
    }
    else if(choice==5){
      implication(PSide,QSide,size);
    }
    else if(choice == 6){
      biconditional(PSide,QSide,size);
    }
    else{
      System.out.println("Invalid choice.");
    }
  }

  // Different methods for different logic
  // Storing the data method
  static void storeData(char[] arr1,char[] arr2,int size){
    
    Scanner input = new Scanner(System.in);
    String input2;
    for(int i = 0;i<size;i++){
      System.out.print("Enter data for P Side at postition "+(i+1)+" : ");
      input2 = input.nextLine();
      input2 = input2.toUpperCase();
      char sm = input2.charAt(0);
      if(sm!='T' || sm=='T'){
        arr1[i] = 'T';
      }
      if(sm=='F'){
        arr1[i] = 'F';
      }
      else{
        arr1[i] = 'T';
      }
      
    }
    for(int i = 0;i<size;i++){
      System.out.print("Enter data for Q Side at postition "+(i+1)+" : ");
        input2 = input.nextLine();
        input2 = input2.toUpperCase();
       char sm = input2.charAt(0);
       if(sm!='T' || sm=='T'){
         arr2[i] = 'T';
       }
       if(sm=='F'){
         arr2[i] = 'F';
       }
       else{
         arr2[i] = 'T';
       }
    }
    System.out.println("\nData stored successfully.\n\n");

  }

  // Negation method (¬)
  static void negation(char[] arr1,char[] arr2,int size){
    int choice;
    Scanner input = new Scanner(System.in);
    char[] sampleArr1 = new char[size];
    char[] sampleArr2 = new char[size];

    System.out.print("Select one of the following:\n1)Negation of P Side\n2)Negation of Q Side\n\n\nSelect: ");
    choice = input.nextInt();
    if(choice==1){
      System.out.println("\nNegation of P Side:");
      System.out.println("P\t\t\t¬P");
      System.out.println("-------------------");
      for(int i = 0;i<size;i++){
        if(arr1[i]=='T'){
          sampleArr1[i] = 'F';
        }
        else{
          sampleArr1[i] = 'T';
        }
      }
      for(int i = 0;i<size;i++){
        System.out.println(arr1[i]+"\t\t\t\t"+sampleArr1[i]);
      }
    }
      
    else if(choice==2){
      System.out.println("\nNegation of Q Side:");
      System.out.println("Q\t\t\t¬Q");
      System.out.println("-------------------");

      for(int i = 0;i<size;i++){
        if(arr2[i]=='T'){
            sampleArr2[i] = 'F';
        }
        else{
            sampleArr2[i] = 'T';
        }
        
      }
      for(int i = 0;i<size;i++){
        System.out.println(arr2[i]+"\t\t\t\t"+sampleArr2[i]);
      }
      
    }
    else{
      System.out.println("Invalid choice.");
    }
  }


  // Conjunction method (^)
  static void conjunction(char[] arr1,char[] arr2,int size){
    char sampleArr[] = new char[size];
    System.out.println("\nConjunction of P ^ Q :");
    System.out.println("P\t\t\tQ\t\t\tP ^ Q");
    System.out.println("---------------------------------");
    for(int i = 0;i<size;i++){
      if(arr1[i]=='T' && arr2[i]=='T'){
        sampleArr[i] = 'T';
      }
      else if(arr1[i]=='F' && arr2[i]=='F'){
        sampleArr[i] = 'F';
      }

      else{
        sampleArr[i] = 'F';
      }
    }
    for(int i = 0;i<size;i++){
      System.out.println(arr1[i]+"\t\t\t"+arr2[i]+"\t\t\t"+sampleArr[i]);
    }
  }

  //Disjunction Method (v)
  static void disjunction(char[] arr1,char[] arr2,int size){
    char[] sampleArr = new char[size];
    System.out.println("\nDisjunction of P v Q :");
    System.out.println("P\t\t\tQ\t\t\tP v Q");
    System.out.println("---------------------------------");
    for(int i = 0;i<size;i++){
      if(arr1[i] == 'T' || arr2[i] == 'T'){
        sampleArr[i] = 'T';
      }
      else{
        sampleArr[i] = 'F';
      }
    }
    for(int i = 0;i<size;i++){
      System.out.println(arr1[i]+"\t\t\t"+arr2[i]+"\t\t\t"+sampleArr[i]);
    }
  }

  //Exclusive OR Method (⊕)
   static void exclusive(char[] arr1,char[] arr2,int size){
     char[] sampleArr = new char[size];
     System.out.println("\nExclusive OR of P ⊕ Q :");
     System.out.println("P\t\t\tQ\t\t\tP ⊕ Q");
     System.out.println("---------------------------------");
     for(int i = 0;i<size;i++){
       if(arr1[i] !=arr2[i]){
         sampleArr[i] = 'T';
       }
       else{
         sampleArr[i] = 'F';
       }
     }
     for(int i = 0;i<size;i++){
       System.out.println(arr1[i]+"\t\t\t"+arr2[i]+"\t\t\t"+sampleArr[i]);
     }
   }

  // Implication Method (->)
  static void implication(char[] arr1,char[] arr2,int size){
    int select;
    Scanner scan = new Scanner(System.in);
    char[] sampleArr = new char[size];
    System.out.println("\nFollowing are the actions of implication: \n1) P -> Q\n2) Q -> P (Converse)\n3) ¬P -> ¬Q (Inverse)\n4) ¬Q -> ¬P (Contrapositive)\n\nSelect: ");
    select = scan.nextInt();

    if(select==1){
      System.out.println("\nImplication of P -> Q :");
      System.out.println("P\t\t\tQ\t\t\tP -> Q");
      System.out.println("---------------------------------");
      for(int i = 0;i<size;i++){
        if(arr1[i] == arr2[i]){
          sampleArr[i] = 'T';
        }
        else{
          sampleArr[i] = arr2[i];
        }
      }
      for(int i = 0;i<size;i++){
         System.out.println(arr1[i]+"\t\t\t"+arr2[i]+"\t\t\t"+sampleArr[i]);
      }
    }
    else if(select==2){
      System.out.println("\nImplication of Q -> P (Converse) :");
      System.out.println("Q\t\t\tP\t\t\tQ -> P");
      System.out.println("---------------------------------");
      for(int i = 0;i<size;i++){
        if(arr2[i] == arr1[i]){
          sampleArr[i] = 'T';
        }
        else{
          sampleArr[i] = arr1[i];
        }
      }
      for(int i = 0;i<size;i++){
         System.out.println(arr2[i]+"\t\t\t"+arr1[i]+"\t\t\t"+sampleArr[i]);
      }
    }

    else if(select==3){
        char[] sampleArr1 = new char[size];
        char[] sampleArr2 = new char[size];

        System.out.println("\nImplication of ¬P -> ¬Q (Inverse) :");
        System.out.println("P\t\t\tQ\t\t\t¬P\t\t\t¬Q\t\t\t¬P -> ¬Q");
        System.out.println("--------------------------------------------");
        
          //First naration of P Side
          for(int i = 0;i<size;i++){
          if(arr1[i]=='T'){
            sampleArr1[i] = 'F';
          }
          else{
            sampleArr1[i] = 'T';
          }
        }
        // Negation of Q Side
          for(int i = 0;i<size;i++){
            if(arr2[i]=='T'){
                sampleArr2[i] = 'F';
            }
            else{
                sampleArr2[i] = 'T';
            }

          }
        // Applying P -> Q now
          for(int i = 0;i<size;i++){
            if(sampleArr1[i] == sampleArr2[i]){
              sampleArr[i] = 'T';
            }
            else{
              sampleArr[i] = sampleArr2[i];
            }
          
        
    }
      for(int i = 0;i<size;i++){
         System.out.println(arr1[i]+"\t\t\t"+arr2[i]+"\t\t\t"+sampleArr1[i]+"\t\t\t"+sampleArr2[i]+"\t\t\t"+sampleArr[i]);
      }
  }
      else if(select==4){
            char[] sampleArr1 = new char[size];
            char[] sampleArr2 = new char[size];

            System.out.println("\nImplication of ¬Q -> ¬P (Contrapositive) :");
            System.out.println("Q\t\t\tP\t\t\t¬Q\t\t\t¬P\t\t\t¬Q -> ¬P");
            System.out.println("-------------------------------------------------");

              //First Negation of P Side
              for(int i = 0;i<size;i++){
              if(arr1[i]=='T'){
                sampleArr1[i] = 'F';
              }
              else{
                sampleArr1[i] = 'T';
              }
            }
            // Negation of Q Side
              for(int i = 0;i<size;i++){
                if(arr2[i]=='T'){
                    sampleArr2[i] = 'F';
                }
                else{
                    sampleArr2[i] = 'T';
                }

              }
            // Applying Q -> P now
        for(int i = 0;i<size;i++){
          if(sampleArr1[i] == sampleArr2[i]){
            sampleArr[i] = 'T';
          }
          else{
            sampleArr[i] = sampleArr1[i];
          }
        }
          for(int i = 0;i<size;i++){
             System.out.println(arr2[i]+"\t\t\t"+arr1[i]+"\t\t\t"+sampleArr2[i]+"\t\t\t"+sampleArr1[i]+"\t\t\t"+sampleArr[i]);
          }
      }
        
    else{
      System.out.println("Invalid Choice");
    }
    
  }

  // Bicondiional
  static void biconditional(char[] arr1,char[] arr2,int size){
    int select;
    Scanner scan = new Scanner(System.in);
    char[] sampleArr = new char[size];
    System.out.print("\nFollowing are the actions of implication: \n1) P <-> Q\n2)(P -> Q) v (Q -> P)\n3) (¬P -> Q) ^ (P -> ¬Q)\n4) P -> (Q -> P)\n\nSelect: ");
    select = scan.nextInt();

    if(select==1){
      System.out.println("\nBiconditional of P <-> Q :");
      System.out.println("P\t\t\tQ\t\t\tP <-> Q");
      System.out.println("---------------------------------");
      for(int i = 0;i<size;i++){
        if(arr1[i] == arr2[i]){
          sampleArr[i] = 'T';
        }
        else{
          sampleArr[i] = 'F';
        }
      }
      for(int i = 0;i<size;i++){
         System.out.println(arr1[i]+"\t\t\t"+arr2[i]+"\t\t\t"+sampleArr[i]);
      }
    }
    else if(select==2){
      char[] sampleArr1 = new char[size];
      char[] sampleArr2 = new char[size];

      System.out.println("P\t\t\tQ\t\t\t(P -> Q)\t\t\t(Q -> P)\t\t\t(P -> Q) v (Q -> P)");
      System.out.println("------------------------------------------------------------------------------------");
      // Solving one side
      for(int i = 0;i<size;i++){
        if(arr1[i] == arr2[i]){
          sampleArr1[i] = 'T';
        }
        else{
          sampleArr1[i] = arr2[i];
        }
      }

      // Solving other side
      for(int i = 0;i<size;i++){
        if(arr2[i] == arr1[i]){
          sampleArr2[i] = 'T';
        }
        else{
          sampleArr2[i] = arr1[i];
        }
      }

      // Solving together 
      for(int i = 0;i<size;i++){
        if(sampleArr1[i] == 'T' || sampleArr2[i] == 'T'){
          sampleArr[i] = 'T';
        }
        else{
          sampleArr[i] = 'F';
        }
      }
      for(int i = 0;i<size;i++){
         System.out.println(arr1[i]+"\t\t\t"+arr2[i]+"\t\t\t\t"+sampleArr1[i]+"\t\t\t\t\t"+sampleArr2[i]+"\t\t\t\t\t\t"+sampleArr[i]);
      }

      
    }

    else if(select==3){
      char[] sampleArr1 = new char[size];
      char[] sampleArr2 = new char[size];
      char[] sampleArr3 = new char[size];
      char[] sampleArr4 = new char[size];

      System.out.println("P\t\t\tQ\t\t\t(¬P)\t\t\t(¬Q)\t\t\t(¬P -> Q)\t\t\t(Q -> ¬P)\t\t\t(¬P -> Q) ^ (P -> ¬Q)");                                         
      System.out.println("------------------------------------------------------------------------------------------------------------------");
      for(int i = 0;i<size;i++){
        if(arr1[i]=='T'){
          sampleArr1[i] = 'F';
        }
        else{
          sampleArr1[i] = 'T';
        }
      }
      for(int i = 0;i<size;i++){
        if(arr2[i]=='T'){
          sampleArr2[i] = 'F';
        }
        else{
          sampleArr2[i] = 'T';
        }
      }

      for(int i = 0;i<size;i++){
        if(sampleArr1[i] == arr2[i]){
          sampleArr3[i] = 'T';
        }
        else{
          sampleArr3[i] = arr2[i];
        }
      }

      for(int i = 0;i<size;i++){
        if(sampleArr2[i] == arr1[i]){
          sampleArr4[i] = 'T';
        }
        else{
          sampleArr4[i] = arr1[i];
        }
      }

      for(int i = 0;i<size;i++){
        if(sampleArr3[i]=='T' && sampleArr4[i]=='T'){
          sampleArr[i] = 'T';
        }
        else if(sampleArr3[i]=='F' && sampleArr4[i]=='F'){
          sampleArr[i] = 'F';
        }

        else{
          sampleArr[i] = 'F';
        }
      }

      

      for(int i = 0;i<size;i++){
          System.out.println(arr1[i]+"\t\t\t"+arr2[i]+"\t\t\t"+sampleArr1[i]+"\t\t\t\t"+sampleArr2[i]+"\t\t\t\t\t"+sampleArr3[i]+"\t\t\t\t\t"+sampleArr4[i]+"\t\t\t\t\t\t"+sampleArr[i]);
      }
    }

    else if(select==4){
      char[] sampleArr1 = new char[size];

      System.out.println("P\t\t\tQ\t\t\t(Q -> P)\t\t\tP -> (Q -> P)");                                         
      System.out.println("---------------------------------------------------------------------------");
      for(int i = 0;i<size;i++){
        if(arr2[i] == arr1[i]){
          sampleArr1[i] = 'T';
        }
        else{
          sampleArr1[i] = arr1[i];
        }
      }

      for(int i = 0;i<size;i++){
        if(arr1[i] == sampleArr1[i]){
          sampleArr[i] = 'T';
        }
        else{
          sampleArr[i] = arr1[i];
        }
      }


      for(int i = 0;i<size;i++){
          System.out.println(arr1[i]+"\t\t\t"+arr2[i]+"\t\t\t"+sampleArr1[i]+"\t\t\t\t"+sampleArr[i]);
      }
      
    }

    
  }
}
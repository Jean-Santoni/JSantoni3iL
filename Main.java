import java.util.Scanner;
import java.lang.Math;
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println("Santoni");
    int [] tab = {2,5,3,6,8,10,56};
   // System.out.println(tab);
    //exo16(tab);
    exo12(5);
    
    
  }
  public static void  exo2(){
    Scanner scanner =new Scanner(System.in);
    System.out.println("Entrez un nombre :");
    int valeurEntree = scanner.nextInt();
    scanner.close();
    for (int i = 0 ; i<11;i++){
      System.out.println(valeurEntree +" *"+i+" ="+valeurEntree*i);
    }    
  }
  public static void  exo3(){
    for (int i = 0 ; i<5;i++){
      System.out.println("* * * * * * ==================");
      System.out.println(" * * * * *  ==================");
    }    
    for (int i = 0 ; i<5;i++){
      System.out.println("==============================");
     
    }  
  }
  public static void  exo4(){
    Scanner scanner =new Scanner(System.in);
    System.out.println("Entrez un nombre :");
    float valeurEntree = scanner.nextFloat();
    scanner.close();
      System.out.println(Math.nextDown(valeurEntree));
      System.out.println(Math.nextUp(valeurEntree));
  }
  public static void  exo5(){
    Scanner scanner =new Scanner(System.in);
    System.out.println("Entrez un nombre :");
    int valeurEntree = scanner.nextInt();
    scanner.close();
    for (int i = 0 ; i <=(valeurEntree+1) ;i++){
      for (int y = 1 ; y< i;y++){
      System.out.print(y+" ");
      }
      System.out.println();  
    }    
  }
  public static void  exo9(int nbr){
    StringBuilder sb = new StringBuilder();
    while(nbr>0){
      sb.append(nbr &1);
      nbr>>=1;
    }
    System.out.println(sb.toString()); 
  }
  public static void  exo16(int [] nbr){
   
    if(nbr.length >= 2){
      if(nbr[0]==10 || nbr[nbr.length-1]==10){
        System.out.println("10 est bien dans le tableau");
      }
      else{
         System.out.println("10 n'est pas dans le tableau");
      }
    }
    else{
      System.out.println("Le tableau est trop petit");
    }
  }
  public static void  exo12(int  nbr){
    int valeur1 = nbr*2;
    int valeur2 = nbr*3;
    System.out.println(nbr+valeur1+ valeur2);
    
    
    
  }
}
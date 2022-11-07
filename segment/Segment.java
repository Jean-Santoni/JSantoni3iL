public class Segment {
  private int extr1;
  private int extr2;
  
  public Segment(int extr1 ,int extr2 ){
      this.extr1 = extr1;
      this.extr2=extr2;
    /*while(this.extr1 > this.extr2){ 
      Scanner scanner =new Scanner(System.in);
      System.out.println("Entrez un nombre :");
      this.extr1 = scanner.nextInt();
      scanner.close();
    }*/
   
  }

   public void ordonne(){
        if(this.extr1>this.extr2){
          int tampon;
          tampon = this.extr1;
          this.extr1 = this.extr2;
          this.extr2= tampon;
        }
  }
  public int longueur(){ 
        return (this.extr2 - this.extr1);
  }
  public int getExtr1(){
    return this.extr1;
  }
  public int getExtr2(){
    return this.extr2;
  }
   public void setExtr1(int newExtr1){
     this.extr1 = newExtr1;
  }
  public void setExtr2(int newExtr2){
     this.extr2 = newExtr2;
  }
}
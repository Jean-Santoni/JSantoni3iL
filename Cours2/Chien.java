import java.util.Scanner;
import java.lang.Math;
public class Chien {
  private String race;
  private int age;
  private String couleur;
  /**
    Constructeur de la classe Chien
    @author SANTO
    @date 07/11/2022

    @param race
      La race du chien

    @param age
      L'age du chien 

    @param couleur
      La couleur du chien

    @return un nouveau chien
  **/
  public Chien( String race, int age,String couleur) {
    this.race = race;
    this.age=age;
    this.couleur = couleur;  
  }
  public void aboyer(){
    System.out.println("WOUF !!!");
  }

   public void dormir(){
    System.out.println("zzzzzzzzzzzzzzzz");
  }
}
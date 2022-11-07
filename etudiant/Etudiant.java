package etudiant;
class Etudiant {
  private String nom;
  private int [] listeNotes;
  private double moyenne;
  
  public Etudiant(String nom , int []listeNotes ){
    this.nom = nom;
    this.listeNotes=listeNotes;
  }

   public void travailler(){
        System.out.println(this.nom +" se met au travail");
  }
  public void seReposer(){ 
        System.out.println(this.nom +" se repose");
  }
  public int getNom(){
    return this.nom;
  }
  public int getListe(){
    return this.listeNotes;
  }
  public int getMoyenne(){
    return this.moyenne;
  }
}
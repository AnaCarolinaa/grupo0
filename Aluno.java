public class Aluno
{
   private String nome;
   private int ID;
   
   public Aluno(String nome, int ID)
   {
      this.nome = nome;
      this.ID = ID;
   }
   
   public String getNome()
   {
      return this.nome;
   }
   
   public int getID()
   {
      return this.ID;
   }
   
   public void setNome(String nome)
   {
      this.nome = nome;
   }
}
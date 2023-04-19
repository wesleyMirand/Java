public class Aluno {
     private String nome;
     private int idade;
     private String matricula;
     
     public Aluno (String nome, int idade, String matricula){
         this.nome = nome;
         this.idade = idade;
         this.matricula = matricula;
    }
    
    public String getNome(){
         return nome;
    } 
    
    public void setNome(String nome){
         this.nome = nome;
    }
    
    public int getIdade(){
          return idade;
    }
    
    public void setIdade(int idade){
          this.idade = idade;
    }   
}

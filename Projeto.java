public class Projeto {
       private String nome;
       private int id;
       
       public Projeto(String nome, int id) {
             this.nome = nome;
             this.id = id;
       }
       
       public void imprimirInformações() {
              system.out.println("nome do Projeto" +nome);
              system.out.println("Id do Projeto" + id);
       }
}

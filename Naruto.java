public class Naruto extends Personagem {
  private String jutsuPrincipal;

  public Naruto(int chakra) {
      super("Naruto Uzumaki", chakra, "Vila da Folha");
      this.jutsuPrincipal = "Rasengan";
  }

  @Override
  public void atacar() {
      if (chakra >= 20) {
          System.out.println(nome + " usa " + jutsuPrincipal + " para atacar o inimigo!");
          chakra -= 20;
      } else {
          System.out.println(nome + " não tem chakra suficiente para usar " + jutsuPrincipal + ".");
      }
  }

  @Override
  public void defender() {
      System.out.println(nome + " usa Clones das Sombras para se defender!");
  }

  // Polimorfismo: Naruto tem uma habilidade especial de se transformar no Modo Sábio
  public void modoSabio() {
      if (chakra >= 50) {
          System.out.println(nome + " entrou no Modo Sábio, aumentando seus poderes!");
          chakra -= 50;
      } else {
          System.out.println(nome + " não tem chakra suficiente para entrar no Modo Sábio.");
      }
  }
}

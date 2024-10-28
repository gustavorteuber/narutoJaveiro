public class Sasuke extends Personagem {
  private String jutsuPrincipal;

  public Sasuke(int chakra) {
      super("Sasuke Uchiha", chakra, "Vila da Folha");
      this.jutsuPrincipal = "Chidori";
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
      System.out.println(nome + " usa o Sharingan para prever os ataques inimigos e se defender!");
  }

  public void usarSusanoo() {
      if (chakra >= 70) {
          System.out.println(nome + " usa o Susanoo, criando uma armadura gigante para se proteger!");
          chakra -= 70;
      } else {
          System.out.println(nome + " não tem chakra suficiente para usar o Susanoo.");
      }
  }
}

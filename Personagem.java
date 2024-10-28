public abstract class Personagem implements Ninja {
  protected String nome;
  protected int chakra;
  protected String vila;

  public Personagem(String nome, int chakra, String vila) {
      this.nome = nome;
      this.chakra = chakra;
      this.vila = vila;
  }

  public void mostrarStatus() {
      System.out.println(nome + " tem " + chakra + " pontos de chakra.");
  }

  @Override
  public abstract void atacar(); // Método abstrato para ser implementado por subclasses

  @Override
  public abstract void defender(); // Método abstrato para ser implementado por subclasses
}

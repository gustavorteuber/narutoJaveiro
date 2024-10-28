public class Main {
  public static void main(String[] args) {
      Naruto naruto = new Naruto(100);
      Sasuke sasuke = new Sasuke(100);

      naruto.mostrarStatus();
      naruto.atacar();
      naruto.modoSabio();
      naruto.defender();
      naruto.mostrarStatus();

      sasuke.mostrarStatus();
      sasuke.atacar();
      sasuke.usarSusanoo();
      sasuke.defender();
      sasuke.mostrarStatus();
  }
}

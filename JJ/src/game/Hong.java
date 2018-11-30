package game;

public class Hong {
   int x, y;
   int hp;
   int at;
   int mo;
   double an;

   Hong() {
      this.hp = 150;
      this.at = 40;
      this.mo = 15;
      this.an = 180.0d;
   }

   public int getHp() {
      return hp;
   }

   public void setHp(int hp) {
      this.hp = hp;
   }

}
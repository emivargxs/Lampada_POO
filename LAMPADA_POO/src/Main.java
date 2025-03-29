import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      /*
      Circulo c1 = new Circulo(8, -9.2, 2.5);
      
      System.out.printf("Circulo em (%f, %f) com raio (%f) e area (%f) e circ (%f).\n",
        c1.getX(), c1.getY(), c1.getRaio(), c1.calcArea(), c1.calcCircunferencia()
      );
      
      
      c1.moverPara(1.1, -2.2);
      
      System.out.printf("Circulo em (%f, %f) com raio (%f) e area (%f) e circ (%f).\n",
        c1.getX(), c1.getY(), c1.getRaio(), c1.calcArea(), c1.calcCircunferencia()
      );
      */
      
      Lampada lampadaSala = new Lampada();
      
      for (int i = 0; i< 10000; i++) {
        lampadaSala.ligar();
      }

      System.out.println("Lampada ligada? " + lampadaSala.isLigada());
      
      
      
      
  }
}
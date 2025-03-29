import java.util.Random;

public class Lampada {


  private boolean estado;
  private boolean queimada;
  
  
  public Lampada () {
    desligar();
    this.queimada = false;
  }
  
  public void ligar () {
    
    if (this.queimada)
      return;
      
    // sorteia um numero entre 0.0 e 1.0
    Random rnd = new Random();
    double nroSorteado = rnd.nextDouble();
    
    if (nroSorteado < 0.3) // 30% 
    {
      this.queimada = true;
      desligar();
    } else {
      this.estado = true;
    }
              
  
  }
  
  public void desligar () {
    this.estado = false;
  }
  
  public boolean isLigada () {
    return this.estado;
  }

}


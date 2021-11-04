/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombicide;

/**
 *
 * @author arturv
 */
public class Caminante extends Zombie{
    private static int marcador;
    
    public Caminante(int danyo, int movimiento)
    {
       super(danyo,movimiento);
       setMuere(1); 
    }
    
    public Caminante()
    {
        super(1,1);
        setMuere(1);
    }
    
    public int getMaxGolpeo()
    {
        return marcador;
    }
    
    public void setmarcador(int marcador)
    {
        this.marcador = marcador;
    }
    
    @Override
    public void CalcularGolpeo(SkillsPersonaje skills) 
    {
        System.out.println("Calculando golpeo");
       int calculo = calcula(skills);   
          //Por ser caminante
          calculo+=5;     
          if(calculo>getMaxGolpeo())
          {
              setmarcador(calculo);
          }    
    }
}

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
public class Arma {
    int danyo;
    int distancia;
    TipoArma tipo;
    
    public Arma()
    {
        danyo=1;
        distancia=0;
        tipo=TipoArma.SARTEN;
    }
    
    public Arma(int danyo, int distancia)
    {
        this.danyo=danyo;
        this.distancia=distancia;
        tipo=TipoArma.SARTEN;
    }
    
    public Arma(int danyo,int distancia,TipoArma tipo)
    {
        this.danyo=danyo;
        this.distancia=distancia;
        this.tipo = tipo;
    }
    
    public int getdanyo()
    {
        return danyo;
    }
    
    public void setdanyo(int danyo)
    {
        this.danyo = danyo;
    }
    
    public int getdistancia()
    {
        return distancia;
    }
    
    public void setdistancia(int distancia)
    {
        this.distancia = distancia;
    }
    
    public TipoArma gettipo()
    {
        return tipo;
    }
    
    public void settipo(TipoArma tipo)
    {
        this.tipo=tipo;
    }
    
    public void armarse()
    {
        System.out.println("Grito de guerra."); //Pendiente poner varios
    }
}

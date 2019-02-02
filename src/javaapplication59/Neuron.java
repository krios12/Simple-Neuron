
package javaapplication59;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Dawid
 */
public class Neuron {
    
    
    double suma;
    double cel;
    double wynik;
    double w1;
    double w2;
    double c;
    
   public Neuron()
   {
       Random generator = new Random();
       this.w1=generator.nextDouble();
       this.w2=generator.nextDouble();
       this.c=0.2;
       
       
       
       
   }
   
   
    public final double run(int x,double x1, double x2, double cel)
   {
       this.cel=cel;
       switch (x) {
            case 0:
                return funkcjaAktywacji1(x1,x2);
                
            case 1:
                return funkcjaAktywacji2(x1,x2);
                
            default:
                return funkcjaAktywacji3(x1,x2);
                
          
        }
       
   }
   
    
    public final double funkcjaAktywacji1(double x1, double x2)
    {
        this.suma= x1*this.w1+x2*this.w2;
        
        if(this.suma > 0.6)
        {
            wynik = 1;
        }
        else 
        {
            wynik = 0;
        }
        
        this.w1= w1+x1*(cel-wynik)*c;
        this.w2= w2+x2*(cel-wynik)*c;
        
        return wynik;
    }
    
    public final double funkcjaAktywacji2(double x1, double x2)
    {
        this.suma= x1*this.w1+x2*this.w2;
        
        if(this.suma > 0.6)
        {
            wynik = 1;
        }
        else 
        {
            wynik = 0;
        }
        
        this.w1= w1+x1*(cel-wynik)*c;
        this.w2= w2+x2*(cel-wynik)*c;
        
        return wynik;
    }
    
    public final double funkcjaAktywacji3(double x1, double x2)
    {
        this.suma= x1*this.w1+x2*this.w2;
        
        if(this.suma > 0.6)
        {
            wynik = 1;
        }
        else 
        {
            wynik = 0;
        }
        
        this.w1= w1+x1*(cel-wynik)*c;
        this.w2= w2+x2*(cel-wynik)*c;
        
        return wynik;
    }
    
    
}

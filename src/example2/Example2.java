/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example2;

/**
 *
 * @author Younis
 */
public class Example2 
{
    private int a ,b;
    
    Example2( int m ,int n)
    {
        a =m;
        b=n;
    }
 void showdata()
 {
     System.out.println(a);
     System.out.println(b);
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Example2 b1 = new Example2(12,15);
        b1.showdata();
        
        
        // TODO code application logic here
    }
    
}

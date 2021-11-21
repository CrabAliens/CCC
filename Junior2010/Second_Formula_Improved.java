
import java.util.*;
 
import java.io.*;


public class Second_Formula_Improved
{  
  public void convert_two( int a, int b, int c, int d, int t )
  {
    int steps = 0;
    int turn_n = 0;
    int turn_b = 0;
    int nikky = 0;
    int bryon = 0;
    
    while( steps <= t )
    {
      steps += 1;
      
      if( turn_n <= a )
        nikky += 1;
      else
      {
        if( turn_n <= a + b )
          nikky -= 1;
        else
          turn_n = 0;
      }      

      if( turn_b <= c )
        bryon += 1;
      else
      {
        if( turn_b <= c + d )
          bryon -= 1;
        else
          turn_b = 0;
      }   
      
      turn_n += 1;
      turn_b += 1;
    }
    
    if( nikky > bryon )
      System.out.println( "Nikky" );
    else if( bryon > nikky )
      System.out.println( "Bryon" );
    else
      System.out.println( "Tie" );
    }
  
  public static void main( String args[] ) throws IOException
  {
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;
    int t = 0;
    
    int n;
    
    while( a > -1 && b > -1 && c > -1 && d > -1 && t > -1 )
    {  
      System.out.println( "Input your 5 numbers here: " );
  
      Scanner scanner = new Scanner( System.in );
  
      a = scanner.nextInt();
      b = scanner.nextInt();
      c = scanner.nextInt();
      d = scanner.nextInt();
      t = scanner.nextInt();
  
      Second_Formula_Improved formula = new Second_Formula_Improved();
  
      formula.convert_two( a, b, c, d, t );
    }
  }
}
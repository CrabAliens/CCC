
import java.util.*;
 
import java.io.*;


public class Second_Formula
{  
  public void convert_two( int a, int b, int c, int d, int t )
  {
    int steps = 0;
//    int cutoff_n = t % ( a + b );
//    int cutoff_b = t % ( c + d );
//    
//    int n_b_s_n = cutoff_n / ( a + b );
//    int n_b_s_b = cutoff_b / ( c + d );
//    
//    int n_s_t_n = 0;
//    int n_s_t_b = 0;
//    
//    int remainder;
//    
//    boolean switcher_n = false;
//    boolean switcher_b = false;
//    
//      if( a < t && b < t && c < t && d < t )
//      {
//        if( cutoff_n > a )
//        {
//          cutoff_n = cutoff_n - a;
//          
//          switcher_n = true;
//        }
//        
//        if( cutoff_b > c )
//        {
//          cutoff_n = cutoff_n - c;
//          
//          switcher_n = true;
//        }
//        
//        if( a - b > c - d )
//        {
//          remainder = n_b_s_n * ( a - b ) - n_b_s_b * ( c - d );
//          
//          if( switcher_n == true && switcher_b == true )
//          {
//            if( b - d > remainder )
//            {
//              System.out.println( "Bryon" );
//            }
//            else
//            {
//              System.out.println( "Nikky" );
//            }          
//          }
//          if( switcher_n == true && switcher_b == false )
//          {
//            if( b + d > remainder )
//            {
//              System.out.println( "Bryon" );
//            }
//            else
//            {
//              System.out.println( "Nikky" );
//            }          
//          }
//          if( switcher_n == false && switcher_b == true )
//          {
//            System.out.println( "Nikky" );
//          }
//          if( switcher_n == false && switcher_b == false )
//          {
//            if( d - b > remainder )
//            {
//              System.out.println( "Bryon" );
//            }
//            else
//            {
//              System.out.println( "Nikky" );
//            }          
//          }
//        }
//        else if( a - b < c - d )
//        {
//          remainder = n_b_s_b * ( c - d ) - n_b_s_n * ( a - b );
//          
//          if( switcher_n == true && switcher_b == true )
//          {
//            if( d - b < remainder )
//            {
//              System.out.println( "Bryon" );
//            }
//            else
//            {
//              System.out.println( "Nikky" );
//            }          
//          }
//          if( switcher_n == true && switcher_b == false )
//          {
//            if( d + b < remainder )
//            {
//              System.out.println( "Bryon" );
//            }
//            else
//            {
//              System.out.println( "Nikky" );
//            }          
//          }
//          if( switcher_n == false && switcher_b == true )
//          {
//            System.out.println( "Bryon" );
//          }
//          if( switcher_n == false && switcher_b == false )
//          {
//            if( b - d < remainder )
//            {
//              System.out.println( "Bryon" );
//            }
//            else
//            {
//              System.out.println( "Nikky" );
//            }          
//          }
//        }
//        else
//        {
//          System.out.println( "Tie" );
//        }
//      }
//      else
//      {
//        if( a > t && b < t )
//        {
//          System.out.println( "Nikky" );
//        }
//        else if( a < t && b > t )
//        {
//          System.out.println( "Bryon" );
//        }
//        else
//        {
//          System.out.println( "Tie" );
//        }
//      }
    
    
    
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
  
      Second_Formula formula = new Second_Formula();
  
      formula.convert_two( a, b, c, d, t );
    }
  }
}
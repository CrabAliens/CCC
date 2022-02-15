
import java.util.*;
 
import java.io.*;


public class First_Test
{  
  public void convert( int i )
  {
    if( i > 5 && i < 8 )
      System.out.println( 9 - i );
    else if( i > 7 && i < 10 )
      System.out.println( 10 - i );
    else if( i == 10 )
      System.out.println( 1 );
    else if( i % 2 == 0 )
      System.out.println( ( i + 2 )/2 );
    else
      System.out.println( ( i + 1 )/2 );
  }

  public static void main( String args[] ) throws IOException
  {
    Scanner scanner = new Scanner( System.in );
    int i = 0;
    int n;
    
    while( i > -1 )
    {    
      i = scanner.nextInt();
      
      First_Test formula = new First_Test();
  
      formula.convert( i );
    }
  }
}
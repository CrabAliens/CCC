
import java.util.*;
 
import java.io.*;


public class Formula
{  
  public void convert( int i )
  {
    if( i > 5 )
    {
      i = 10-i;
    }
    
    if( i % 2 == 0 )
    {
      System.out.println( ( i + 2 )/2 );
    }
    
    else
    {
      System.out.println( ( i + 1 )/2 );
    }
  }

  public static void main( String args[] ) throws IOException
  {
    int i = 0;
    int n;
    
    while( i > -1 )
    {  
      System.out.println( "Input your number here: " );
  
      Scanner scanner = new Scanner( System.in );
  
      i = scanner.nextInt();
  
      Formula formula = new Formula();
  
      formula.convert( i );
    }
  }
}
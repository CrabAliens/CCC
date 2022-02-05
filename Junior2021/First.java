import java.util.*;

import java.io.*;

public class First
{
  public String formula( int B )
  {
    int P = 5 * B - 400;
    
    if( P > 100 )
      return Integer.toString( P ) + "\n" + Integer.toString( -1 );
    else if( P < 100 )
      return Integer.toString( P ) + "\n" + Integer.toString( 1 );
    else
      return Integer.toString( P ) + "\n" + Integer.toString( 0 );
  }
  public static void main( String args[] )throws IOException
  {
    Scanner scanner = new Scanner( System.in );
    
    First code = new First();
    
    while( true )
    {
      String result = code.formula( scanner.nextInt() );

      System.out.println( result );
    }
  }
}
      
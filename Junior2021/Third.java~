import java.util.*;

import java.io.*;

public class Third
{
  public String formula( int one, int two, String prev )
  {
    String dir = "";
    
    switch( ( one + two )%2 )
    {
      case 1:
        dir = "left ";
        break;
      case 0:
        dir = "right ";
        break;
    }
    if( one + two == 0 )
      dir = prev;
    return dir;
  }
  public static void main( String args[] )throws IOException
  {
    Scanner scanner = new Scanner( System.in );
    
    Third code = new Third();
    
    String prev = "";
    
    while( true )
    {
      String input = scanner.next();
      
      int a = Integer.parseInt( input.substring( 0, 1 ) );
      int b = Integer.parseInt( input.substring( 1, 2 ) );
      int c = Integer.parseInt( input.substring( 2, 3 ) );
      int d = Integer.parseInt( input.substring( 3, 4 ) );
      int e = Integer.parseInt( input.substring( 4, 5 ) );        
      
      prev = code.formula( a, b, prev );
        
      if( a == 9 && b == 9 && c == 9 && d == 9 && e == 9 ) 
        break;
      
      System.out.println( prev + ( ( c * 100 ) + ( d * 10 ) + ( e ) ) );
    }
  }
}
            
      
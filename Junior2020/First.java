import java.util.*;
import java.io.*;

public class First
{
  public int formula( int s, int m, int l )
  {
    if( 1 * s + 2 * m + 3 * l >= 10 )
      return 1;
    else
      return -1;
  }
  public static void main( String args[] )throws IOException
  {
    Scanner scanner = new Scanner( System.in );
    
    First code = new First();
     
    while( true )
    {
      int result = code.formula( scanner.nextInt(), scanner.nextInt(), scanner.nextInt() );
      if( result == 1 )
        System.out.println( "happy" );
      else
        System.out.println( "sad" );
    }
  }
}
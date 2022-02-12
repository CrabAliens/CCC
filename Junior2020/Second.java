import java.util.*;
import java.io.*;

public class Second
{
  public int formula( int p, int n, int r )
  {
    int d = 0;
    int i = n;
    int prev_i = 0;
    int substitute = 0;
    
    while( i <= p )
    {
      d += 1;
      substitute = i;
      i = ( ( i - prev_i ) * r ) + i;
      prev_i = substitute;
    }
    
    return d;
  }
  public static void main( String args[] )throws IOException
  {
    Scanner scanner = new Scanner( System.in );
    
    Second code = new Second();
      
    while( true )
      System.out.println( code.formula( scanner.nextInt(), scanner.nextInt(), scanner.nextInt() ) );
  }
}
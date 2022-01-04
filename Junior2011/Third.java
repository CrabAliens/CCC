import java.util.*;

import java.io.*;

public class Third
{
  public int formula( int first, int second, int count )
  {
    if( first - second < second )
      count += 1;
    else
      return count;
     
    return formula( second, first - second, count );
  }
  public static void main( String args[] )throws IOException
  {
    Scanner scanner = new Scanner( System.in );
    
    Third code = new Third();
    
    System.out.println( code.formula( scanner.nextInt(), scanner.nextInt(), 3 ) );
  }
}
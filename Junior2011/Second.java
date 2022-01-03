import java.util.*;
  
import java.io.*;

public class Second
{
  public int formula( int humidity, int patience )
  {
    for( int t = 1; t <= patience; t++ )
    {
      if((-6*t*t*t*t) + (humidity*t*t*t) + (2*t*t) + t <= 0)
        return t;
    }
    return -1;
  }
  public static void main( String args[] )throws IOException
  {
    Scanner scanner = new Scanner( System.in );
    
    Second code = new Second();
    
    int t = code.formula( scanner.nextInt(), scanner.nextInt() );
      
    if( t != -1 )
      System.out.println( "The balloon first touches the ground at hour: \n" + t );
    else
      System.out.println( "The balloon does not touch ground in the given time." );
  }
}
      
    
  

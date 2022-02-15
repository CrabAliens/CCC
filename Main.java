
import java.util.*;
 
import java.io.*;


public class Main
{  
  public static void main( String args[] ) throws IOException
  {
    Scanner scanner = new Scanner( System.in );

    int counter = 0;
    ArrayList<Integer> runs_w = new ArrayList<Integer>();
    ArrayList<Integer> runs_e = new ArrayList<Integer>();
    
    int N = scanner.nextInt();
    
    while( counter < N )
    {    
      counter += 1;
      
      runs_w.add( scanner.nextInt() );
    }
    
    counter = 0;
    
    while( counter < N )
    {    
      counter += 1;
      
      runs_e.add( scanner.nextInt() );
    }
    int day = 0;
   
    for( int i = 1; i <= N; i++ )
    {
      int total_w = 0;
      int total_e = 0;
      for( int j = 0; j <  i; j++ )
      {
        total_w += runs_w.get( j ).intValue();
        total_e += runs_e.get( j ).intValue();
      }        
      if( total_w == total_e )
        day = i;
    }
    System.out.println( day );
  }
}
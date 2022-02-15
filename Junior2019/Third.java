import java.util.*;
import java.io.*;

public class Third
{
  public ArrayList<Integer> formula( ArrayList<String> uncompressed )
  {
    ArrayList<Integer> stops = new ArrayList<Integer>();
    ArrayList<String> symbols = new ArrayList<String>();
    
    stops.add( 0 );
    symbols.add( uncompressed.get( 0 ) );
    
    int counter = 1;
    
    for( int i = 0; i < uncompressed.size(); i++ )
    {
      int x = stops.get( stops.size() - 1 ).intValue();
      if( uncompressed.get( i ).equals( uncompressed.get( x ) ) )
      {
        counter += 1;
      }
      else
      {
        stops.add( counter - 1 );
        counter = 0;
        symbols.add( uncompressed.get( i ) );
      }
    }
    stops.add( counter + 1 );
    stops.remove(0);
    
    uncompressed.clear();
    for( int j = 0; j < symbols.size(); j++ )
      uncompressed.add( symbols.get( j ) );
    
    return stops;
  }
  public static void main( String args[] )throws IOException
  {
    Scanner scanner = new Scanner( System.in );
    
    Third code = new Third();
    
    int N = scanner.nextInt();
    
    for( int i = 0; i < N; i++ )
    {
      ArrayList<String> returned = new ArrayList<String>();
      
      String input = scanner.next();
      for( int j = 0; j < input.length(); j++ )
        returned.add( Character.toString( input.charAt( j ) ) );
      
      ArrayList<Integer> stops = code.formula( returned );
      
      for( int l = 0; l < stops.size(); l++ )
        System.out.print( stops.get( l ) + returned.get( l )  );
      
      System.out.print( "\n" );  
        
    }
  }
}

import java.util.*;
 
import java.io.*;

public class Fourth_Formula
{  
  public int formula( ArrayList<Integer> temps )
  {
    ArrayList<Integer> gaps = new ArrayList<Integer>();
    
    ArrayList<Integer> pattern = new ArrayList<Integer>();
    
    for( int i = 2; i < temps.size(); i++ )
      gaps.add( temps.get(i) - temps.get(i-1) );
    
    for( int j = 0; j < gaps.size(); j++ )        
    {
      if( gaps.get( j ) == gaps.get( 0 ) )
      {
        for( int k = 0; k < j; k++ )
        {
          pattern.add( gaps.get( k ) );
        }
      }
    }
  }
      
  
  public static void main( String args[] )throws IOException
  {
    ArrayList< Integer > list = new ArrayList<>();
  }
    
}

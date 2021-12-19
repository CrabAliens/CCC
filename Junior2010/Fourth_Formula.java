
import java.util.*;
 
import java.io.*;

public class Fourth_Formula
{  
  public int formula( ArrayList<Integer> temps )
  {
    ArrayList<Integer> gaps = new ArrayList<Integer>();
    
    ArrayList<Integer> pattern = new ArrayList<Integer>();
    
    boolean check = true;
    
    for( int i = 1; i < temps.size(); i++ )
      gaps.add( temps.get(i) - temps.get(i-1) );
    System.out.println( gaps );
    for( int j = 1; j < gaps.size(); j++ )
    {
      if( gaps.get(j) == gaps.get(0) )
      {
        pattern.addAll( gaps.subList( 0, j ) );
        
        for( int k = pattern.size(); k < gaps.size(); k++ )
        {
          if( gaps.get(k) != gaps.get(k % pattern.size()))
            break;
        }      
      }
    }
    return gaps.size();
  }
      
  
  public static void main( String args[] )throws IOException
  {
    ArrayList< Integer > list = new ArrayList<>();
    
    System.out.println( "Input your list" );
      
    Scanner scanner = new Scanner( System.in );
      
    int size = scanner.nextInt();
      
    for( int m = 1; m <= size; m++ )
      list.add( scanner.nextInt() );
      
    System.out.println( list );
    
    Fourth_Formula code = new Fourth_Formula();
    
    System.out.println( code.formula( list ) );
  }
    
}

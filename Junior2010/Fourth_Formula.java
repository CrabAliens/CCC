
import java.util.*;
 
import java.io.*;

public class Fourth_Formula
{  
  public int formula( ArrayList<Integer> temps )
  {
    ArrayList<Integer> gaps = new ArrayList<Integer>();
    
    ArrayList<Integer> pattern = new ArrayList<Integer>();
    
    boolean check = true;
    
    for( int i = 2; i < temps.size(); i++ )
      gaps.add( temps.get(i) - temps.get(i-1) );
    
    for( int j = 1; j < gaps.size(); j++ )
    {
      if( gaps.get(j) == gaps.get(0) )
      {
        pattern.addAll( gaps.subList( 0, j - 1 ) );
        
        for( int l = 0; l <= gaps.size() - 3; l = l + 3 )
        {  
          check = true;
          if( gaps.subList(j + l, j + l + pattern.size() - 1 ) != pattern )
          {
            check = false;
            break;
          }
        }
        if( check = true )
        {
          for( int k = 0; k <= gaps.size() % pattern.size(); k++ )
          {
            if( gaps.subList( gaps.size() - pattern.size(), gaps.size() - pattern.size() + ( gaps.size() % pattern.size() ) ) == gaps.subList( 0, gaps.size() % pattern.size() ) )
            {
              return pattern.size();
            }
          }
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

import java.util.*;
import java.io.*;

public class Main
{
  public int formula( ArrayList<Integer> players )
  {
    int stars = 0;
    
    for( int i = 0; i < players.size() - 1; i += 2 )
    {
      if( ( players.get( i ).intValue() * 5 ) - ( players.get( i + 1 ).intValue() * 3 ) > 40 )
        stars++;
    }
    return stars;
  }
  public static void main( String [] args )throws Exception
  {
    Scanner scanner = new Scanner( System.in );
   
    Main code = new Main();
    
    ArrayList<Integer> people = new ArrayList<Integer>();
    
    int N = scanner.nextInt();
    for( int n = 0; n < N * 2; n++ )
      people.add( scanner.nextInt() );
    
    if( code.formula( people ) == ( people.size()/2 ) )
      System.out.println( code.formula( people ) + "+" );
    else
      System.out.println( code.formula( people ) );
  }
}
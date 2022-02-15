import java.util.*;
import java.io.*;

public class Third
{
  public ArrayList<Integer> drops = new ArrayList<Integer>();
  
  public String formula( ArrayList<Integer> map )
  {
    int leftmost_x = 100000;
    int rightmost_x = 0;
    int upmost_y = 0;
    int downmost_y = 100000;
    
    for( int i = 0; i < drops.size() - 1; i += 2 )
    {
      if( map.get( i ) < leftmost_x )
        leftmost_x = map.get( i );
      if( map.get( i ) > rightmost_x )
        rightmost_x = map.get( i );
    }
    for( int i = 1; i < drops.size(); i += 2 )
    {
      if( map.get( i ) > upmost_y )
        upmost_y = map.get( i );
      if( map.get( i ) < downmost_y )
        downmost_y = map.get( i );
    }
    return Integer.toString( leftmost_x - 1 ) + "," + Integer.toString( downmost_y - 1 ) + "\n" + Integer.toString( rightmost_x + 1 ) + "," + Integer.toString( upmost_y + 1 );
  }
  public static void main( String args[] )throws IOException
  {
    Scanner scanner = new Scanner( System.in );
    
    Third code = new Third();
    
    int N = scanner.nextInt();
    
    String[] trash = new String[N * 2];
      
    ArrayList<String> better_trash = new ArrayList<String>();
    
    for( int c = 0; c < N * 2; c += 2 )
    {
      String[] useless = scanner.next().split( "," );
      trash[c] = useless[0];
      trash[c + 1] = useless[1];
    }
    for( int t = 0; t < N * 2; t++ )
      code.drops.add( Integer.parseInt( trash[ t ] ) );
    
    System.out.println( code.formula( code.drops ) );
  }
}
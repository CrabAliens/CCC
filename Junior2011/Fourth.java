import java.util.*;

import java.io.*;

public class Fourth
{
  ArrayList<Integer> map = new ArrayList<Integer>();
  boolean end = false;
  
  public void addMap( int x, int y )
  {
    map.add( x );
    map.add( y );
  }
  
  public int move_and_check( int l_r, int u_d, int amount, ArrayList<Integer> map )
  {
    int past_map_size = map.size();
    for( int i = 1; i <= amount; i++ )
    {
      map.add( map.get( map.size() - 2 ) + ( 1 * l_r ) );
      map.add( map.get( map.size() - 2 ) + ( 1 * u_d ) );
    }
    if( l_r == 1 || l_r == -1 )
    {
      for( int j = 0; j < map.size() - 2; j += 2 )
      {
        if( map.get( j ) == map.get( map.size() - 2 ) && map.get( j + 1 ) == map.get( map.size() - 1 ) )
          return -1;
      }
      return 1;
    }
    else
    {
      for( int j = 0; j < map.size() - 2; j += 2 )
      {
        if( map.get( j ) == map.get( map.size() - 2 ) && map.get( j + 1 ) == map.get( map.size() - 1 ) )
          return -1;
      }
      return 1;
    }
  }
  public String formula( ArrayList<Integer> map, String dir, int amount )
  {
    int result = 100;
    if( dir.equals( "l" ) )
      result = move_and_check( -1, 0, amount, map );
    else if( dir.equals( "r" ) )
      result = move_and_check( 1, 0, amount, map );
    else if( dir.equals( "u" ) )
      result = move_and_check( 0, 1, amount, map );
    else
      result = move_and_check( 0, -1, amount, map );
    if( result == -1 )
    {
      end = true;
      return ( Integer.toString( map.get( map.size() - 2 ) ) + "  " + Integer.toString( map.get( map.size() - 1 ) ) + "  " + "DANGER" );
    }
    else if( result == 1 )
      return ( Integer.toString( map.get( map.size() - 2 ) ) + "  " + Integer.toString( map.get( map.size() - 1 ) ) + "  " + "safe" );
    else
      return "WRONG";
  }
         
  
  public static void main( String args[] )throws IOException
  {
    Fourth code = new Fourth();
    
    code.addMap( 0, -1 );
    
    code.formula( code.map, "d", 2 );
    code.formula( code.map, "r", 3 );
    code.formula( code.map, "d", 2 );
    code.formula( code.map, "r", 2 );
    code.formula( code.map, "u", 2 );
    code.formula( code.map, "r", 2 );
    code.formula( code.map, "d", 4 );
    code.formula( code.map, "l", 8 );
    code.formula( code.map, "u", 2 );
    
    Scanner scanner = new Scanner( System.in );
          
    while( code.end == false )
      System.out.println( code.formula( code.map, scanner.next(), scanner.nextInt() ));
  }
  
}
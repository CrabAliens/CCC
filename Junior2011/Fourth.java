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
  
  public int move_and_check( int l_r, int u_d, int amount )
  {
    int past_map_size = map.size();
    int goal_x = map.get( past_map_size - 2 ) + ( amount * l_r );
    int goal_y = map.get( past_map_size - 1 ) + ( amount * u_d );
    
    for( int i = 0; i < amount; i++ )
    {
      map.add( map.get( map.size() - 2 ) + ( 1 * l_r ) );
      map.add( map.get( map.size() - 2 ) + ( 1 * u_d ) );
    }
    if( l_r == 1 || l_r == -1 )
    {
      int a = 0;
      if( l_r == -1 && amount == 1 )
        a = 1;
      for( int c = map.size() - ( amount * 2 ) - 2; c < map.size() - 1; c += 2 )
      {  
        for( int j = 0; j < map.size() - ( amount * 2 ) - 2; j += 2 )
        {          
          if( j == 856 && c == 862 )
            a = 2;
          if( map.get( j ).intValue() == map.get( c ).intValue() && map.get( j + 1 ).intValue() == map.get( c + 1 ).intValue() )
            return -1;
        }
      }
      return 1;
    }
    else
    {
      for( int c = map.size() - ( amount * 2 ) - 1; c < map.size(); c += 2 )
      {  
        for( int j = 1; j < map.size() - ( amount * 2 ) - 1; j += 2 )
        {
          if( map.get( j ).intValue() == map.get( c ).intValue() && map.get( j - 1 ).intValue() == map.get( c - 1 ).intValue() )
            return -1;
        }
      }
      return 1;
    }
  }
  public String formula( String dir, int amount )
  {
    int result = 100;
    if( dir.equals( "l" ) )
      result = move_and_check( -1, 0, amount );
    else if( dir.equals( "r" ) )
      result = move_and_check( 1, 0, amount );
    else if( dir.equals( "u" ) )
      result = move_and_check( 0, 1, amount );
    else if( dir.equals( "d" ) )
      result = move_and_check( 0, -1, amount );
    else
      result = -2;
    if( result == -1 )
    {
      end = true;
      return ( Integer.toString( map.get( map.size() - 2 ) ) + "  " + Integer.toString( map.get( map.size() - 1 ) ) + "  " + "DANGER" );
    }
    else if( result == 1 )
      return ( Integer.toString( map.get( map.size() - 2 ) ) + "  " + Integer.toString( map.get( map.size() - 1 ) ) + "  " + "safe" );
    else if( result == -2 )
    {
      end = true;
      return "";
    }
    return "WRONG";
  }
         
  
  public static void main( String args[] )throws IOException
  {
    Fourth code = new Fourth();
    
    code.addMap( 0, -1 );
    
    code.formula( "d", 2 );
    code.formula( "r", 3 );
    code.formula( "d", 2 );
    code.formula( "r", 2 );
    code.formula( "u", 2 );
    code.formula( "r", 2 );
    code.formula( "d", 4 );
    code.formula( "l", 8 );
    code.formula( "u", 2 );
    
    Scanner scanner = new Scanner( System.in );
          
    while( code.end == false )
    {
      String direction = scanner.next(); 
      int steps = scanner.nextInt();
      
      System.out.println( code.formula( direction, steps ));
    }
  }
  
}
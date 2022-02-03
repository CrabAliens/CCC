import java.util.*;

import java.io.*;

public class Fourth
{
  ArrayList<Integer> map = new ArrayList<Integer>();
  
  public boolean end = false;
  
  public void addMap( int x, int y )
  {
    map.add( x );
    map.add( y );
  }
  
  public String formula( String dir, int amount )
  {
    if( dir.equals( "l" ) )
    {
      map.add( map.get( map.size() - 2 ) + amount );
      map.add( map.get( map.size() - 1 ) );
    }
    for( int i = 0; i < map.size() - 2; i = i + 2 )
    {
      if( map.get( i ) == map.get( map.size() - 2 ) )
      {
        end = true;
        return ( Integer.toString( map.get( map.size() - 2 ) ) + ", " + Integer.toString( map.get( map.size() - 1 ) ) + " DANGER" );
      }
      else
      {
          end = false;
          return ( Integer.toString( map.get( map.size() - 2 ) ) + ", " + Integer.toString( map.get( map.size() - 1 ) ) + " safe" );
      }
    }
    if( dir.equals( "r" ) )
    {
      System.out.println( amount );
      System.out.println( map.get( map.size() - 2 ));      
      map.add( map.get( map.size() - 2 ) - amount );
      map.add( map.get( map.size() - 1 ) );
    }
    for( int i = 0; i < map.size() - 2; i = i + 2 )
    {
      if( map.get( i ) == map.get( map.size() - 2 ) )
      {
        end = true;
        return ( Integer.toString( map.get( map.size() - 2 ) ) + ", " + Integer.toString( map.get( map.size() - 1 ) ) + " DANGER" );
      }
      else
      {
          end = false;
          return ( Integer.toString( map.get( map.size() - 2 ) ) + ", " + Integer.toString( map.get( map.size() - 1 ) ) + " safe" );
      }
    }
    if( dir.equals( "u" ) )
    {
      map.add( map.get( map.size() - 2 ) );
      map.add( map.get( map.size() - 1 ) + amount );
    }
    for( int i = 1; i < map.size() - 1; i = i + 2 )
    {
      if( map.get( i ) == map.get( map.size() - 1 ) )
      {
        end = true;
        return ( Integer.toString( map.get( map.size() - 2 ) ) + ", " + Integer.toString( map.get( map.size() - 1 ) ) + " DANGER" );
      }
      else
      {
          end = false;
          return ( Integer.toString( map.get( map.size() - 2 ) ) + ", " + Integer.toString( map.get( map.size() - 1 ) ) + " safe" );
      }
    }
    if( dir.equals( "d" ) )
    {
      map.add( map.get( map.size() - 2 ) );
      map.add( map.get( map.size() - 1 ) - amount );
    }
    for( int i = 1; i < map.size() - 1; i = i + 2 )
    {
      if( map.get( i ) == map.get( map.size() - 1 ) )
      {
        end = true;
        return ( Integer.toString( map.get( map.size() - 2 ) ) + ", " + Integer.toString( map.get( map.size() - 1 ) ) + " DANGER" );
      }
      else
      {
          end = false;
          return ( Integer.toString( map.get( map.size() - 2 ) ) + ", " + Integer.toString( map.get( map.size() - 1 ) ) + " safe" );
      }
    }
    
    return "booboobiiibiiiiiiiiibaaaaa";
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
      System.out.println( code.formula( scanner.next(), scanner.nextInt() ));
  }
  
}
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
      for( int i = 1; i <= amount; i++ )
      {
        map.add( map.get( map.size() - 2 ) + i );
        map.add( map.get( map.size() - 1 ) );
      }
      for( int j = 0; j < ( map.size() - 2 ); j = j + 2 )
      {
        if( map.get( j ) == map.get( map.size() - 2 ) )
        {
          end = true;
          return ( Integer.toString( map.get( map.size() - 2 ) ) + ", " + Integer.toString( map.get( map.size() - 1 ) ) + " DANGER" );
        }
        else
          return ( Integer.toString( map.get( map.size() - 2 ) ) + ", " + Integer.toString( map.get( map.size() - 1 ) ) + " safe" );
      }
    }

    if( dir.equals( "r" ) )
    {
      for( int i = 1; i <= amount; i++ )
      {
        map.add( map.get( map.size() - 2 ) - i );
        map.add( map.get( map.size() - 1 ) );
      }
      for( int j = 0; j < ( map.size() - 2 ); j = j + 2 )
      {
        if( map.get( j ) == map.get( map.size() - 2 ) )
        {
          end = true;
          return ( Integer.toString( map.get( map.size() - 2 ) ) + ", " + Integer.toString( map.get( map.size() - 1 ) ) + " DANGER" );
        }
        else
          return ( Integer.toString( map.get( map.size() - 2 ) ) + ", " + Integer.toString( map.get( map.size() - 1 ) ) + " safe" );
      }
    }

    if( dir.equals( "u" ) )
    {
      for( int i = 1; i <= amount; i++ )
      {
        map.add( map.get( map.size() - 2 ) );
        map.add( map.get( map.size() - 1 ) + i );
      }
      for( int j = 1; j < ( map.size() - 2 ); j = j + 2 )
      {
        if( map.get( j ) == map.get( map.size() - 2 ) )
        {
          end = true;
          return ( Integer.toString( map.get( map.size() - 2 ) ) + ", " + Integer.toString( map.get( map.size() - 1 ) ) + " DANGER" );
        }
        else
          return ( Integer.toString( map.get( map.size() - 2 ) ) + ", " + Integer.toString( map.get( map.size() - 1 ) ) + " safe" );
      }
    }
    
    if( dir.equals( "d" ) )
    {
      for( int i = 1; i <= amount; i++ )
      {
        map.add( map.get( map.size() - 2 ) );
        map.add( map.get( map.size() - 1 ) - i );
      }
      for( int j = 1; j < ( map.size() - 2 ); j = j + 2 )
      {
        if( map.get( j ) == map.get( map.size() - 2 ) )
        {
          end = true;
          return ( Integer.toString( map.get( map.size() - 2 ) ) + ", " + Integer.toString( map.get( map.size() - 1 ) ) + " DANGER" );
        }
        else
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
          
    if( code.end == false )
      System.out.println( code.formula( scanner.next(), scanner.nextInt() ));
  }
  
}
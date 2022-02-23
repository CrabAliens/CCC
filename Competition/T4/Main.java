import java.util.*;
import java.io.*;

public class Main{
  ArrayList<String[]> together = new ArrayList<String[]>();
  ArrayList<String[]> apart = new ArrayList<String[]>();
  ArrayList<String[]> groups = new ArrayList<String[]>();
  
  public boolean checkInGroups( String[] group ){
    for( int i = 0; i < groups.size(); i++ ){
      for( int j = 0; j < 3; j++ ){
        if( groups.get( i )[ j ].equals( group[0] ) ){
          if( groups.get( i )[ 0 ].equals( group[1] ) || groups.get( i )[ 1 ].equals( group[1] ) || groups.get( i )[ 2 ].equals( group[1] ) )
            return true;
        }
        if( groups.get( i )[ j ].equals( group[1] ) ){
          if( groups.get( i )[ 0 ].equals( group[0] ) || groups.get( i )[ 1 ].equals( group[0] ) || groups.get( i )[ 2 ].equals( group[0] ) )
            return true;
        }
        else
          return false;
      }
    }
    return false;
  }
  
  public int formula()
  {
    int count = 0;
    for( int i = 0; i < together.size(); i++ ){
      boolean aort = checkInGroups( together.get( i ) );
      if( !aort )
        count++;
    }
    for( int j = 0; j < apart.size(); j++ ){
      boolean aort = checkInGroups( apart.get( j ) );
      if( aort )
        count++;
    }
    return count;
  }
  public static void main( String [] args )throws Exception{
  Scanner scanner = new Scanner( System.in );
  Main code = new Main();
  
  int tp = scanner.nextInt();
  for( int i = 0; i < tp; i++ )
    code.together.add( new String[]{ scanner.next(), scanner.next() } );
  
  int ap = scanner.nextInt();
  for( int i = 0; i < ap; i++ )
    code.apart.add( new String[]{ scanner.next(), scanner.next() } );
  
  int g = scanner.nextInt();
  for( int i = 0; i < g; i++ )
    code.groups.add( new String[]{ scanner.next(), scanner.next(), scanner.next() } );
  
  System.out.println( code.formula() );
  }
}
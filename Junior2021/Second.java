import java.util.*;

import java.io.*;

public class Second
{
  ArrayList<Integer> bid_list = new ArrayList<Integer>();
  ArrayList<String> people_list = new ArrayList<String>();
  
  public void formula( String name, int bid )
  {
    bid_list.add( bid );
    people_list.add( name );
  }
  public static void main( String args[] )throws IOException 
  {
    Scanner scanner = new Scanner( System.in );
    
    Second code = new Second();
    
    while( true )
    {
      int bids = scanner.nextInt();
      
      for( int i = 0; i < bids; i++ )
      {
        code.formula( scanner.next(), scanner.nextInt() );
      }
      
      int winner = 0;
      
      for( int j = 0; j < code.bid_list.size(); j++ )
      {
        if( code.bid_list.get( j ).intValue() > code.bid_list.get( winner ).intValue() )
          winner = j;
      }
      System.out.println( code.people_list.get( winner ) );
    }    
  }
}
    
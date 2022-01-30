import java.util.*;
  
import java.io.*;

public class Fourth
{
  public String formula( String direction, int amount, ArrayList<Integer> map, boolean end )
  {     
    System.out.println( direction );
    
    if( direction == "l" )
    {
      for( int i = 0; i < map.size(); i = i + 2 )
      {
        if( map.get(( map.size() - 2 )) - amount <= map.get(i) )
          return (String)(( map.get(( map.size() - 2 )) - amount) + " " + map.get(( map.size() - 1 )) + " DANGER");
        else
        {
          map.add(( map.get(( map.size() - 2 )) - amount));
          map.add( map.get(( map.size() - 1 )));
          return (String)(( map.get(( map.size() - 2 )) - amount) + " " + map.get(( map.size() - 1 )) + " safe");
        }
      }
    }
    if( direction == "r" )
    {
      System.out.println("Yup!");
      for( int i = 0; i < map.size(); i = i + 2 )
      {
        if( map.get(( map.size() - 2 )) + amount <= map.get(i) )
          return (String)((map.get(( map.size() - 2 )) + amount) + " " + map.get(( map.size() - 1 )) + " DANGER");
        else
        {
          map.add(( map.get(( map.size() - 2 )) + amount));
          map.add( map.get(( map.size() - 1 )));
          return (String)((map.get(( map.size() - 2 )) + amount) + " " + map.get(( map.size() - 1 )) + " safe");
        }
      }
    }
    if( direction == "u" )
    {
      for( int i = 1; i < map.size(); i = i + 2 )
      {
        if( map.get(( map.size() - 1 )) + amount <= map.get(i) )
        {
          end = true;
          return (String)( map.get(( map.size() - 2 )) + " " + (map.get(( map.size() - 1 )) + amount) + " DANGER");
        }
        else
        {
          map.add( map.get(( map.size() - 2 )));
          map.add((map.get(( map.size() - 1 )) + amount));
          return (String)( map.get( ( map.size() - 2 )) + " " + (map.get(( map.size() - 1 )) + amount) + " safe");
        }
      }
    }
    if( direction == "d" )
    {
      for( int i = 1; i < map.size(); i = i + 2 )
      {
        if( map.get(( map.size() - 1 )) - amount <= map.get(i) )
          return (String)( map.get( ( map.size() - 2 )) + " " + (map.get(( map.size() - 1 )) - amount) + " DANGER");
        else
        {
          map.add( map.get((map.size() - 2 )));
          map.add((map.get(( map.size() - 1 )) - amount));
          return (String)( map.get( ( map.size() - 2 )) + " " + (map.get(( map.size() - 1 )) - amount) + " safe");
        }
      }
    }
    return "hahahehehihihohohuhu";
  }
  public static void main( String args[] )throws IOException
  {
    ArrayList<Integer> map = new ArrayList<Integer>();
    
    Scanner scanner = new Scanner( System.in );
    
    Fourth code = new Fourth();
    
    boolean end = false;
    
    map.add(0);
    map.add(-1);
    
    code.formula( "d", 2, map, end );
    code.formula( "r", 3, map, end );
    code.formula( "d", 2, map, end );
    code.formula( "r", 2, map, end );
    code.formula( "u", 2, map, end );
    code.formula( "r", 2, map, end );
    code.formula( "d", 4, map, end );
    code.formula( "l", 8, map, end );
    code.formula( "u", 2, map, end );
    
    while( end == false )
    {
      String dir = scanner.next();
      
      int amount = scanner.nextInt();
      
      System.out.println( code.formula( dir, amount, map, end ));
    }    
  } 
}
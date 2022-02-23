import java.util.*;
import java.io.*;

public class Main
{
  public String formula( ArrayList<String> input )
  {
    String output = "";
    
    int ntr = 0;
    int size = input.size();
    for( int i = 0; i < size; i++ )
    {
      if( input.get( i ).equals( "+" ) )
      {
        for( int j = ntr; j < i; j++ )
          output = output.concat( input.get( j ) );   
        
        output = output.concat( " tighten " );
        int counter = i + 1;
        while( ( counter ) < input.size() )
        {
          if( input.get( counter ).equals( "1" ) || input.get( counter ).equals( "2" ) || input.get( counter ).equals( "3" ) || input.get( counter ).equals( "4" ) || input.get( counter ).equals( "5" ) || input.get( counter ).equals( "6" ) || input.get( counter ).equals( "7" ) || input.get( counter ).equals( "8" ) || input.get( counter ).equals( "9" ) )
          {
            output = output.concat( input.get( counter ) );
            counter += 1;
          }
          else
            break;
        }
        output = output.concat( "\n" );
        ntr = counter;
      }
      else if( input.get( i ).equals( "-" ) )
      {
        for( int j = ntr; j < i; j++ )
          output = output.concat( input.get( j ) );   
        
        output = output.concat( " loosen " );
        int counter = i + 1;
        while( ( counter ) < input.size() )
        {
          if( input.get( counter ).equals( "1" ) || input.get( counter ).equals( "2" ) || input.get( counter ).equals( "3" ) || input.get( counter ).equals( "4" ) || input.get( counter ).equals( "5" ) || input.get( counter ).equals( "6" ) || input.get( counter ).equals( "7" ) || input.get( counter ).equals( "8" ) || input.get( counter ).equals( "9" ) )
          {
            output = output.concat( input.get( counter ) );
            counter += 1;
          }
          else
            break;
        }
        output = output.concat( "\n" );
        ntr = counter;
      }
    }
    return output;
  }
  public static void main( String [] args )throws Exception
  {
    Scanner scanner = new Scanner( System.in );
   
    Main code = new Main();    
    
    ArrayList<String> inputs = new ArrayList<String>();
    String true_input = scanner.next();
    
    for( int n = 0; n < true_input.length(); n++ )
    {
      String input = "" + ( true_input.charAt( n ) );
      inputs.add( input );
    }
    System.out.println( code.formula( inputs ) );
  }
}
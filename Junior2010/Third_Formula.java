
import java.util.*;
 
import java.io.*;

public class Third_Formula
{  

  public int formula( int command, int X, int Y, int n )
  {
    switch( command )
    {
      case 1: X = n;
              break;
      case 3: X += Y;
              break;
      case 4: X *= Y;
              break;
      case 5: X -= Y;
              break;
      case 6: X = ( int )( X/Y );
              break;
    }
    return X;
  }
  public static void main( String args[] )throws IOException
  {
    Scanner scanner = new Scanner( System.in );
    
    boolean end = false;
    
    int command;
    int n = 0;
    int A = 0;
    int B = 0;
    int X = 0;
    int Y = 0;
    int result = 0;
    
    String second = "";
    String third = "";
    
    while( end == false )
    {
      System.out.println( "Input your code" );
      
      command = Integer.parseInt( scanner.next() );
      
      if( command == 7 )
        end = true;
      else
      {
        second = scanner.next();
        
        if( second.equals("A") )
          X = A;
        else if( second.equals("B") )
          X = B;

        if( command == 1 || command == 3 || command == 4 || command == 5 || command == 6 )
        {
          third = scanner.next();
          
          if( third.equals("A") )
            Y = A;
          else if( third.equals("B") )
            Y = B;
          else   
            n = Integer.parseInt( third );
        }
        else
        {
          if( second.equals("A") )
            System.out.println( A );
          else
            System.out.println( B );
        }
      }
      
      Third_Formula formula = new Third_Formula();
      
      result = formula.formula( command, X, Y, n );
            
      if( second.equals("A") )
        A = result;
      else if( second.equals("B") )
        B = result;
        
      scanner.nextLine();
      
    }
    
  }
}
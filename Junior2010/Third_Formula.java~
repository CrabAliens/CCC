
import java.util.*;
 
import java.io.*;

public class Third_Formula
{  

  public void formula( int command, int X, int Y, int n, boolean end )
  {
    switch( command )
    {
      case 1: X = n;
              break;
      case 2: System.out.println( X );
              break;
      case 3: X += Y;
              break;
      case 4: X *= Y;
              break;
      case 5: X -= Y;
              break;
      case 6: X = ( int )( X/Y );
              break;
      case 7: end = true;
              break;
    }
  }
  public static void main( String args[] )throws IOException
  {
    Scanner scanner = new Scanner( System.in );
    
    boolean end = false;
    
    int command;
    int n = 0;
    int X = 0;
    int Y = 0;

    String third;
    
    while( end == false )
    {
      int A = X;
      int B = Y;
      System.out.println( "Input your code" );
      
      command = Integer.parseInt( scanner.next() );
      
      if( scanner.next().equals("A") )
      {
        X = A;
      }
      else
      {
        X = B;
      }
      
      third = scanner.next();
      
      if( third.equals("A") )
      {
        Y = A;
      }
      else if( third.equals("B") )
      {
        Y = B;
      }
      else
      {    
        n = Integer.parseInt( third );
      }
      
      Third_Formula formula = new Third_Formula();
      
      formula.formula( command, X, Y, n, end );
      
      scanner.nextLine();
      
    }
    
  }
}
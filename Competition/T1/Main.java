import java.util.*;
import java.io.*;

public class Main
{
  public int formula( int regular, int small )
  {
    return ( small * 3 ) + ( regular * 8 ) - 28;
  }
  public static void main( String [] args )throws Exception
  {
    Scanner scanner = new Scanner( System.in );
   
    Main code = new Main();
    
    System.out.println( code.formula( scanner.nextInt(), scanner.nextInt() ) );
  }
}
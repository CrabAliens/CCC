import java.util.*;
import java.io.*;

public class First
{
  public String formula( int a_3, int a_2, int a_1, int b_3, int b_2, int b_1 )
  {
    if( ( a_3 * 3 ) + ( a_2 * 2 ) + ( a_1 * 1 ) > ( b_3 * 3 ) + ( b_2 * 2 ) + ( b_1 * 1 ) )
      return "A";    
    else if( ( a_3 * 3 ) + ( a_2 * 2 ) + ( a_1 * 1 ) < ( b_3 * 3 ) + ( b_2 * 2 ) + ( b_1 * 1 ) )
      return "B";
    else
      return "T";
  }
  public static void main( String args[] )throws IOException
  {
    Scanner scanner = new Scanner( System.in );
    
    First code = new First();
    
    System.out.println( code.formula( scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt() ) );
  }
}
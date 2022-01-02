import java.util.*;
  
import java.io.*;

public class First
{
  public void formula( int antenna, int eyes )
  {
    if( antenna >= 3 && eyes <= 4 )
      System.out.println( "TroyMartian" );
    if( antenna <= 6 && eyes >= 2 )
      System.out.println( "VladSaturnian" );
    if( antenna <= 2 && eyes <= 3 )
      System.out.println( "GraemeMercurian" );
  }
  public static void main( String args[] )throws IOException
  {
    Scanner scanner = new Scanner( System.in );
    
    First code = new First();
    
    System.out.println("How many antenna?");                                    
    int antenna = scanner.nextInt();
    
    System.out.println("How many eyes?");                                    
    int eyes = scanner.nextInt();

    code.formula( antenna, eyes );
  }
}

import java.util.*;
import java.io.*;

public class Second
{
  public static void main( String args[] )throws IOException
  {
    Scanner scanner = new Scanner( System.in );
    
    Second code = new Second();
    
    int N = scanner.nextInt();
    
    for( int i = 0; i < N; i++ )
    {
      int M = scanner.nextInt();
      String symbol = scanner.next();
      for( int j = 0; j < M; j++ )
        System.out.print( symbol );
      System.out.print( "\n" );
    }
  }
}
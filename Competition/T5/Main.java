import java.util.*;
import java.io.*;

public class Main
{
  public int formula( int map_side, int[][] trees, int list_size )
  {
    for( int i = map_side; i > 0; i-- )
    {
      for( int j = 0; j < map_side - i + 1; j++ )
      {
        for( int m = 0; m < map_side - i + 1; m++ )
        {
          int right_top_corner_x = j + i ;
          int right_top_corner_y = m + i;
          int left_bottom_corner_x = j + 1;
          int left_bottom_corner_y = m + 1;
          
          boolean flag = false;
          
          for( int l = 0; l < list_size; l++ )
          {
            if( trees[l][0] <= right_top_corner_x && trees[l][1] <= right_top_corner_y && trees[l][0] >= left_bottom_corner_x && trees[l][1] >= left_bottom_corner_y  )
              flag = true;
          }
          if( flag == false )
            return i;
        }
      }
    }
    return 0;
  }
  public static void main( String [] args ) throws Exception
  {
    Scanner scanner = new Scanner( System.in );
    Main code = new Main();
    
    int side = scanner.nextInt();
    
    int counter = scanner.nextInt();
    int[][] trees = new int[ counter ][ 2 ];
    for( int i = 0; i < counter; i++ )
    {
      trees[i][0] = scanner.nextInt();
      trees[i][1] = scanner.nextInt();
    }
    System.out.println( code.formula( side, trees, counter ) );
  }
}
      
      
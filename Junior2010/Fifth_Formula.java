import java.util.*;
  
import java.io.*;


public class Fifth_Formula
{ 
  public int formula( int first_x, int first_y, int target_x, int target_y, int count )
  {
    if( first_x == target_x && first_y == target_y )
      return count;
    
    if( first_x <= 8 && first_y <= 8 && first_x > 0 && first_y > 0 && count < 6 )
    {
      count += 1;
      int temp = 100;
      int[] returns = new int[8];
      
      returns[0] = formula( first_x + 2, first_y + 1, target_x, target_y, count );
      returns[1] = formula( first_x + 2, first_y - 1, target_x, target_y, count );
      returns[2] = formula( first_x + 1, first_y + 2, target_x, target_y, count );
      returns[3] = formula( first_x + 1, first_y - 2, target_x, target_y, count );
      returns[4] = formula( first_x - 2, first_y + 1, target_x, target_y, count );
      returns[5] = formula( first_x - 2, first_y - 1, target_x, target_y, count );
      returns[6] = formula( first_x - 1, first_y + 2, target_x, target_y, count );
      returns[7] = formula( first_x - 1, first_y - 2, target_x, target_y, count );
      
      for( int i = 0; i < 8; i++ )
      {
        if( returns[i] < temp && returns[i] != -1 )
          temp = returns[i];
      }
      return temp;
    }     
    return -1;
  }
  public static void main( String args[] ) throws IOException
  {
    Scanner scanner = new Scanner( System.in );
    
    Fifth_Formula code = new Fifth_Formula();
    
    int steps = code.formula( scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), 0 );
    
    System.out.println( steps );
  }
}
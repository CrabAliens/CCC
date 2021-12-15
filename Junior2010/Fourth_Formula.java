
import java.util.*;
 
import java.io.*;

public class Fourth_Formula
{  
  public int formula( ArrayList<Integer> temps, int size )
  {
    int difference = temps.get(2) - temps.get(1);
    int space = 0;
    
    boolean repeat = false;
    
    for( int i = 0; i <= temps.size() - 3; i++ )
    {
      if( temps.get( i + 3 ) - temps.get( i + 2 ) = difference )
      {
        for( int j = 0; j <= temps.size() - i - 3; i++ )
        {
          if( temps.get( j + 3 ) - temps.get( j + 2 ) = difference )
            repeat = false;
          else
            repeat = true;     
        }
        if( repeat == true )
        {
          //???????????????????? :(    
      
    }
  }
  

  
  public static void main( String args[] )throws IOException
  {
    ArrayList< Integer > list = new ArrayList<>();
  }
    
}

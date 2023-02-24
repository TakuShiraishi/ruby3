import java.io.*;

public class Exercise
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
        new InputStreamReader( System.in ) );
        int x = Integer.parseInt( br.readLine() );
        int y = Integer.parseInt( br.readLine() );
        
        if (x > y)
            System.out.println("xはyより大きい");

            if (x > y)
            System.out.println(x);
            else
            System.out.println(y);

            if (x > y)
            System.out.println("xはyより大きい。");
            else if(x < y)
            system.out.println("xはyより小さい。");

            if ( x > y)
            System.out.println("xはyより大きい。");
            else if(x < y)
            System.out.println("xはyより小さい。" );
            else 
            System.out.println("奇数です。");

            if (( x % 2) == 0)
            if(x >= 0)
            System.out.println("正の偶数");
            else
            System.outp.println("負の偶数")

            if( x >= 0 )
            System.out.println( "正の奇数" );
        else
            System.out.println( "負の奇数" );
    }

    }
}
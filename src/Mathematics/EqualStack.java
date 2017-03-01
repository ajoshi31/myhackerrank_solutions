package Mathematics;

import java.util.Stack;

/**
 * Created by atul.joshi on 14/07/16.
 */
public class EqualStack {

    public static void main(String args[])
    {
        // Create a new, empty stack
        Stack lifo = new Stack();

        // Let's add some items to it
        for (int i = 1; i <= 10; i++)
        {
            lifo.push ( new Integer(i) );
        }

        // Last in first out means reverse order
        while ( !lifo.empty() )
        {
            System.out.print ( lifo.pop() );
            System.out.print ( ',' );
        }

        // Empty, let's lift off!
        System.out.println (" LIFT-OFF!");
    }

}


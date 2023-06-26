package recursion;
import javax.print.attribute.standard.Destination;

public class Hanoi {
    public void solve(int n, char source, char middle, char dest){
        if (n==0) {
            System.out.println("plate " + n + " from " + source + " to " + dest);
            return;
        }

        solve(n-1, source, dest, middle);
        System.out.println("plate " + n + " from " + source + " to " + dest);
        
    }
}

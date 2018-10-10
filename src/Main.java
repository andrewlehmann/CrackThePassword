/**
 * Created by Drew on 10/9/2018.
 */
public class Main
{
    public static void main(String[] args)
    {
        Solver solver = new Solver();

        long startTime = System.nanoTime();

        String result = solver.solve(1);

        long endTime = System.nanoTime();
        System.out.println("Execution time in milliseconds: " + ((endTime - startTime) / 1000000));

        System.out.println(result);

    }
}

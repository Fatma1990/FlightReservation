
    import java.util.Scanner;

    public class gresory {
        public static void main(String[] args) {
            double appleKg, orangeKg, tomatoKg, cherryKg;
            double appleF = 1.24, orangeF = 4.7, tomatoF = 3.22, cherryF = 1.90 ;
            double appleT, orangeT, tomatoT, cherryT, sum ;

            Scanner input = new Scanner(System.in);
            System.out.print("how many appels?");
            appleKg = input.nextDouble();
            appleT = appleF * appleKg ;

            System.out.print("how many orange?");
            orangeKg = input.nextDouble();
            orangeT = orangeF * orangeKg;

            System.out.print("how many tomato?");
            tomatoKg = input.nextDouble();
            tomatoT = tomatoF * tomatoKg;

            System.out.print("how many cherries?");
            cherryKg = input.nextDouble();
            cherryT = cherryKg * cherryF;



           sum = appleT + orangeT + tomatoT + cherryT ;
            System.out.print("sum:");
            System.out.println(sum);
        }
    }


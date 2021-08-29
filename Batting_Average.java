public class Batting_Average {
    public static void main(String[] args) {

        // { avg= totalruns/(innings-notout) }

        float T_runs = 250;
        int innings = 7;
        int not_out = 2;

        float avg = T_runs / innings-not_out;

        System.out.println("the batting average is =" + avg);
    }
}

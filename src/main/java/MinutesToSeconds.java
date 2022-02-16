public class MinutesToSeconds {

    public static long changeMinutesToSeconds(long minutes){
        if((minutes < 0)){
            System.out.println("Invalid value");
            return -1;
        }
        long seconds = minutes * 60;
        System.out.println(minutes + " min = " + seconds + " seconds");
        return seconds;


    }
}

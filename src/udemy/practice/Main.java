package udemy.practice;


// Exercise for Section 4.60

public class Main {

    public static void main(String[] args) {
        String testOutput= getDurationString(100, 30);
        System.out.println(testOutput);

        testOutput= getDurationString(5);
        System.out.println(testOutput);

    }

    // using Method Overloading
    public static String getDurationString(int minutes, int seconds) {
        if(minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;

            String hoursString = hours + "h ";
            if(hours < 10) {
                hoursString = "0" + hoursString;
            }

            String minutesString = remainingMinutes + "m ";
            if(remainingMinutes < 10) {
                minutesString = "0" + minutesString;
            }

            String secondsString = seconds + "s ";
            if(seconds < 10) {
                secondsString = "0" + secondsString;
            }

            return hoursString + minutesString + secondsString;
        } else {
            return "Invalid Value";
        }
    }

    public static String getDurationString(int seconds) {
        if(seconds >= 0) {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        } else {
            return "Invalid Value";
        }
    }
}

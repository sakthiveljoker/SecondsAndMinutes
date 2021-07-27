public class SecondsAndMinutes {
//    Create a method called getDurationString with two parameters, first parameter minutes and 2nd parameter seconds.
//
//    You should validate that the first parameter minutes is >= 0.
//
//    You should validate that the 2nd parameter seconds is >= 0 and <= 59.
//
//    The method should return gInvalid valueh in the method if either of the above are not true.
//
//    If the parameters are valid then calculate how many hours minutes and seconds equal
//    the minutes and seconds passed to this method and return that value as string in format
//    gXXh YYm ZZsh where XX represents a number of hours, YY the minutes and ZZ the seconds.
//
//    Create a 2nd method of the same name but with only one parameter seconds.
//
//    Validate that it is >= 0, and return gInvalid valueh if it is not true.
//
//    If it is valid, then calculate how many minutes are in the seconds
//    value and then call the other overloaded method passing the correct minutes and seconds
//    calculated so that it can calculate correctly.
//
//    Call both methods to print values to the console.

    public static void main(String[] args) {
        System.out.println(getDurationString(61,58));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(long minutes,long seconds) {
        if((minutes < 0) || ((seconds < 0) || (seconds >= 59))) {
            return "Invalid value";
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours +"h " +remainingMinutes+"m " +seconds+"s";
    }

    public static String getDurationString(long seconds) {
        if(seconds < 0) {
            return "Invalid Value";
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDurationString(minutes,remainingSeconds);
    }

}

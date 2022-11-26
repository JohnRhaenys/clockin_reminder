package com.example.clockinreminder;

public class TimeManager {
    public static Time convertSecondsToTime(int seconds) {
        int hours = (seconds / 60) / 60;
        int minutes = (seconds / 60) % 60;
        return new Time(hours, minutes);
    }

    public static void runLunchTimer(Time lunchStart) {
        Time endLunchTime = lunchStart.plus(new Time(1, 12));

        // TODO - Start a job to remind me of clocking in after lunch
    }
}

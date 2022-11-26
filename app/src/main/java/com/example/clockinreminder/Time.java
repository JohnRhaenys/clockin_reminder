package com.example.clockinreminder;

import androidx.annotation.NonNull;

public class Time {
    private final int hours;
    private final int minutes;
    private final int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = 0;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    // Adds the current time to another time, returning the total result in Time
    public Time plus(Time time) {
        int seconds = getTotalSeconds() + time.getTotalSeconds();
        return TimeManager.convertSecondsToTime(seconds);
    }

    // Subtracts the current time from another time, returning the total result in Time
    public Time minus(Time time) {
        int seconds = getTotalSeconds() - time.getTotalSeconds();
        return TimeManager.convertSecondsToTime(seconds);
    }

    public int getTotalSeconds() {
        return this.hours * 3600 + this.minutes * 60 + this.seconds;
    }

    @NonNull
    @Override
    public String toString() {
        return "Time{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }
}
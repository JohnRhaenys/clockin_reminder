package com.example.clockinreminder;

import android.os.Bundle;
import android.service.notification.StatusBarNotification;

import java.util.Objects;

public class NotificationManager {
    public static void notificationReceived(StatusBarNotification sbn) {
        // We only accept gmail notifications
        if (sbn.getPackageName().equals("com.google.android.gm"))
        {
            // TODO - Add another check for tangerino
            Bundle extras = sbn.getNotification().extras;
            String receiver = extras.getString("android.subText");
            String sender = extras.getString("android.title");
            String subject = Objects.requireNonNull(extras.getCharSequence("android.text")).toString();
            String content = Objects.requireNonNull(extras.getCharSequence("android.bigText")).toString();

            System.out.println("RECEIVER " + receiver);
            System.out.println("SENDER " +sender);
            System.out.println("SUBJECT " +subject);
            System.out.println("CONTENT " +content);

            int hours = 0; // TODO - get the hour from the email body
            int minutes = 0; // TODO - get the minutes from the email body
            TimeManager.runLunchTimer(new Time(hours, minutes));
        }
    }
}

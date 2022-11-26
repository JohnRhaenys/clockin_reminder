package com.example.clockinreminder;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;

public class NotificationService extends NotificationListenerService {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onNotificationPosted(StatusBarNotification sbn)
    {
        NotificationManager.notificationReceived(sbn);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
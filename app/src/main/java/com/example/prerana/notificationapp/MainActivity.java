package com.example.prerana.notificationapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.prerana.notificationapp.createchannel.CreateChannel;

public class MainActivity extends AppCompatActivity {

    private NotificationManagerCompat notificationManagerCompat;

    private Button btnnotification_one, btnnotification_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notificationManagerCompat = NotificationManagerCompat.from(this);
        CreateChannel channel = new CreateChannel(this);
        channel.createChannel();

        btnnotification_one = findViewById(R.id.notification_one);
        btnnotification_two = findViewById(R.id.notification_two);

        btnnotification_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DisplayNotification();

            }
        });

        btnnotification_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DisplayNotification2();
            }
        });

    }

    private void DisplayNotification2() {

        Notification notification = new NotificationCompat.Builder(this, CreateChannel.CHANNEL_2)
                .setSmallIcon(R.drawable.ic_message_black_24dp)
                .setContentTitle("Message")
                .setContentText("Message is here!.")
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .build();

        notificationManagerCompat.notify(2,notification);
    }

    private void DisplayNotification() {

        Notification notification = new NotificationCompat.Builder(this,CreateChannel.CHANNEL_1)

                .setSmallIcon(R.drawable.ic_call_black_24dp)
                .setContentTitle("First call")
                .setContentText("Sangita, Tasmiya, Ishika called Prerana")
                .setCategory(NotificationCompat.CATEGORY_CALL)
                .build();

        notificationManagerCompat.notify(1, notification);
    }
}

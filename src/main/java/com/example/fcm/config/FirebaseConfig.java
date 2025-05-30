package com.example.fcm.config;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@Configuration
public class FirebaseConfig {
    @PostConstruct
    public void init() throws IOException{
        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(getCredentailFileInputStream()))
                .build();

        FirebaseApp.initializeApp(options);
    }

    @Bean
    public static FileInputStream getCredentailFileInputStream() throws FileNotFoundException {
        return new FileInputStream("src/main/resources/fir-testproject-5dd98-firebase-adminsdk-fbsvc-c7f40c68fb.json");
    }
}

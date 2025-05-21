package com.lucashdez.awp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class DesktopLauncher extends Application {

    @Override
    public void start(Stage stage) {
        new Thread(() -> AwpApplication.main(new String[]{})).start(); // Start Spring Boot

        WebView webView = new WebView();
        webView.getEngine().load("http://localhost:8080");

        Scene scene = new Scene(webView, 1024, 768);
        stage.setScene(scene);
        stage.setTitle("My Music Player");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


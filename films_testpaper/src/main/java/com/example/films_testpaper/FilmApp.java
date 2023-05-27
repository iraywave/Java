package com.example.films_testpaper;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import java.io.IOException;



import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class FilmApp extends Application {

        private ConfigurableApplicationContext applicationContext;
        private static Scene initScene;

        @Override
        public void init() {
            String[] args = getParameters().getRaw().toArray(new String[0]);
    
            this.applicationContext = new SpringApplicationBuilder()
                    .sources(SpringApp.class)
                    .run(args);
        }

        @Override
        public void start(Stage initStage) throws Exception {
            FXMLLoader loader = new FXMLLoader(FilmApp.class.getResource("init.fxml"));
            initScene = new Scene(loader.load(), 640, 480);
            initStage.setScene(initScene);
            initStage.show();
        }

        static void setRoot(String path) throws IOException {
            FXMLLoader loader = new FXMLLoader(FilmApp.class.getResource(path+".fxml"));
            initScene.setRoot(loader.load());
        }
    
    

        @Override
        public void stop() {
            this.applicationContext.close();
            Platform.exit();
        }  
}

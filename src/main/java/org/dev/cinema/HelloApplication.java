package org.dev.cinema;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.dev.cinema.model.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Usuario usuario1 = new Usuario(null,"Daniel C. Silva","daniel@gmail.com");
        Usuario usuario2 = new Usuario(null,"Miguel C. Silva","miguel@gmail.com");
        Usuario usuario3 = new Usuario(null,"Vitoria C. Silva","vitoria@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CinemaPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(usuario1);
        em.persist(usuario2);
        em.persist(usuario3);
        em.getTransaction().commit();


        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
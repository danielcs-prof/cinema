module org.dev.cinema {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    requires static lombok;
    requires java.persistence;
    requires java.sql;
    requires org.postgresql.jdbc;
    requires org.hibernate.orm.core;


    opens org.dev.cinema to javafx.fxml;
    opens org.dev.cinema.model;
    exports org.dev.cinema;
}

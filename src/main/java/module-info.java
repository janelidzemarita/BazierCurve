module com.kiu.numericalanalysis.baziercurve {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.kiu.numericalanalysis.baziercurve to javafx.fxml;
    exports com.kiu.numericalanalysis.baziercurve;
}
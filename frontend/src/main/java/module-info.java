module dev.parthenodevs.bugboard.frontend {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens dev.parthenodevs.bugboard.frontend to javafx.fxml;
    exports dev.parthenodevs.bugboard.frontend;
}
module com.slycer.tparchitectureapplicatives {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.datatransfer;
    requires java.desktop;


    opens com.slycer.tparchitectureapplicatives to javafx.fxml;
    exports com.slycer.tparchitectureapplicatives;
    exports com.slycer.tparchitectureapplicatives.Controller;
    opens com.slycer.tparchitectureapplicatives.Controller to javafx.fxml;
}
module io.dbc.github.tegra {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.logging.log4j;

    opens io.dbc.github.tegra to javafx.fxml;
    exports io.dbc.github.tegra;
}
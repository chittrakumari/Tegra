module io.dbc.github.tegra {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.dbc.github.tegra to javafx.fxml;
    exports io.dbc.github.tegra;
}
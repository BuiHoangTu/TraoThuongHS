package cnpm.traothuonghs.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.sql.SQLException;

import cnpm.traothuonghs.services.local.HocSinhService;
import cnpm.traothuonghs.services.local.PhanThuongService;

public class TrangChinhController extends BaseLeftController{
    public Label lblHocSinhNum;
    public Label lblPhanThuongTraoNum;
    public Label lblPhanThuongConNum;

    @FXML
    private void initialize() throws SQLException {
        lblHocSinhNum.setText(String.valueOf(HocSinhService.getSoHocSinh()));
        lblPhanThuongTraoNum.setText(String.valueOf(PhanThuongService.getVoDaPhat()));
        lblPhanThuongConNum.setText(String.valueOf(PhanThuongService.getVoChuaPhat()));
    }
}

package frm_ThongKe;

import cnn.Connect_Db;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import model.HoaDonDAO;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class JFame_ThongKeHoaDon {

    private Connect_Db connectDb;
    private HoaDonDAO hoaDonDAO;

    public JFame_ThongKeHoaDon() {
        connectDb = new Connect_Db();
        hoaDonDAO = new HoaDonDAO();
    }

    public ChartPanel createChartPanel() {
        DefaultCategoryDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        return chartPanel;
    }

    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        String query = "SELECT N.TEN_NGUOI_DUNG AS NguoiPhuTrach, SUM(HD.THANH_TIEN) AS TongThanhTien "
                + "FROM Hoa_Don HD "
                + "INNER JOIN Thong_Tin_Nguoi_Dung N ON HD.NGUOI_PHU_TRACH = N.MA_NGUOI_DUNG "
                + "GROUP BY N.TEN_NGUOI_DUNG";

        try (Connection conn = connectDb.connectDB(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                String nguoiPhuTrach = rs.getString("NguoiPhuTrach");
                float tongThanhTien = rs.getFloat("TongThanhTien");
                dataset.addValue(tongThanhTien, "Doanh thu", nguoiPhuTrach);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return dataset;
    }

    private JFreeChart createChart(DefaultCategoryDataset dataset) {
        JFreeChart chart = ChartFactory.createBarChart(
                "Thống kê hóa đơn",
                "Người phụ trách",
                "Doanh thu",
                dataset,
                PlotOrientation.VERTICAL,
                false,
                true,
                false
        );
        return chart;
    }

}


package reportviewing;


import config.dbConnector;
import java.awt.Container;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.*;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;




public class ReportView extends JFrame
{
    public ReportView(String fileName) throws SQLException
    {
        this(fileName, null);
    }
    public ReportView(String fileName, HashMap para) throws SQLException
    {
        super("Joshua Espanillo)"); // Report Title

        Connection con = null;

        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost/posv2", "root", "");

            
            JasperPrint print = JasperFillManager.fillReport(fileName, para, con);
            JRViewer viewer = new JRViewer(print);
            Container c = getContentPane();
            c.add(viewer);            
        } 
        catch (JRException jRException)
        {
            System.out.println(jRException);
        }
        setBounds(2, 2, 900, 700);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    void print() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

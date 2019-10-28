
package modelbd3;

import java.sql.Connection;
import java.sql.ResultSet;

public interface ConectorBD {
    public Connection getConection();
    public void cerrar();
    public ResultSet execute(String query);
}

import java.sql.ResulSet;

public class TestConection {
	static ConectorOracle con = new ConectorOracle("localhost",1521,"portafolio","portafolio","portafolio");
	
	public static void main (String... args){
		oracle();
	}

	private static void oracle(){
            try {
                String text ="<table>";
                ResultSet result = conU.execute("select * from ap_paso_banco");
                while (result.next()) {       
                    text += "<td>" + result.getString("folio_paso") + "</td>";
                }
                text += "</table>";
		System.out.println(text);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}

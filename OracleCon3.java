import java.sql.*;
class OracleCon{
public static void main(String[] args)
{
try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
//System.out.println("Passed 1");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
//system.out.println("Passed 2");
Statement stmt=con.createStatement();
String sql="delete sample where sno=50"; 
			stmt.executeUpdate(sql);
		ResultSet rs=stmt.executeQuery("select * from sample");
//System.out.println("{Passed 3");
		while(rs.next())
System.out.println(rs.getInt(1)+" "+rs.getString(2));
con.close();
}
catch(Exception e){
System.out.println(e);
}
}
}

<%@page import="helper.*"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>


<%
    if(request.getParameter("key")!=""){
String value = request.getParameter("key");

try{
Connection con = ConnectionProvider.getConnection();

PreparedStatement pst = con.prepareStatement("select * from song where musicName like ?");
pst.setString(1,"%"+value+"%");

ResultSet rst = pst.executeQuery();
while(rst.next()){

String ans = rst.getString("musicName");    
%>
<li class="list-group-item" style="cursor: pointer;" id="rst">
    <%=ans%>
</li>
<%
    }
}catch(Exception e){
e.printStackTrace();
}
}
%>


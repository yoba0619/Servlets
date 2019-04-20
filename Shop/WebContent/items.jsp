<%@page import="java.util.*, com.microsoft.shop.domain.Item" %>
<html>
<head>
	<title>List of items</title>
</head>
<body>

<%
List<Item> items = (List<Item>)request.getAttribute("items");
%>

<form name="itemForm" method="post" >
<select>
<%
for(Item item: items){
%>
<option><%=item.getName() + " " + item.getPrice()%></option>
<%
}
%>

</select>
<input type="hidden" name="page" value="items">
	
</form>
</body>

</html>
<html>
	<head>
		<title>Hello World</title>
	</head>

	<body>
		<h3> JSP program to print "Hello World" 10 times</h3>

		<%
			String str = "Hello World";
			for (int i = 0; i < 10; i++) {
				out.print("<p>" + str + "</p>");
			}
		%>

	</body>
</html>
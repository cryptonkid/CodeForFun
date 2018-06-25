<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Confirmation Page</title>
</head>
<body>
 Customer name is ${customer.firstName} ${customer.secondName}
 <br><br>
 Free passes brought ${customer.freePasses}
 <br><br>
 postal code: ${customer.postalCode}
 <br><br>
 coursecode: ${customer.courseCode}
</body>
</html>

<!--  form tags willnot work unless the below line is added  -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
	Student Form
</head>
<body>
<h2>Enter Your Name</h2>
<!-- Here "student" is defined in showForm -->
	<form:form action="processForm" modelAttribute="student"> 
		First Name:<form:input path="firstName"/>
		<br><br>
		Second Name:<form:input path="secondName"/>
		<br><br>
		<input type="submit" value="Submit"/> 
	</form:form>
</body>
</html>
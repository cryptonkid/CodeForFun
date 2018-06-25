<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title><h2>Customer Registration Form</h2></title>
<style>
.error {
	color: red
}
</style>
</head>
<body>
	<i>Fill the form.Asterisk (*) is means required</i>
	<form:form action="processCustomer" modelAttribute="customer">
		<br>
		<br>
	FirstName:<form:input path="firstName" />
	LastName:<form:input path="secondName" />
		<form:errors path="secondName" cssClass="error"></form:errors>
		<br>
		<br>
	freePasses:<form:input path="freePasses" />
		<form:errors path="freePasses" cssClass="error"></form:errors>
		<br>
		<br>
	PostalCode:<form:input path="postalCode" />
		<form:errors path="postalCode" cssClass="error"></form:errors>
		<br>
		<br>
	CourseCode:<form:input path="courseCode" />
		<form:errors path="courseCode" cssClass="error"></form:errors>
		<br>
		<br>
	TopCourseCode:<form:input path="topCourseCode" />
		<form:errors path="topCourseCode" cssClass="error"></form:errors>
		<br>
		<br>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>
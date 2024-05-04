<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Fruity Loops</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<main>
		<h1>Fruit Store</h1>
		<table>
			<thead>
                <tr>
                    <th><b>Name</b></th>
                    <th><b>Price</b></th>
                </tr>   
            </thead>
            <tbody>
				<c:forEach var="fruit" items="${fruitsFromController}">
					<tr>
						<td><c:out value="${fruit.name}"></c:out></td>
						<td><c:out value="${fruit.price}"></c:out></td>				
					</tr>
				</c:forEach>			 
            </tbody>			
		</table>
	</main>
</body>
</html>
<!--  -->
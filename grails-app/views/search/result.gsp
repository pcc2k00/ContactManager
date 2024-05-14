<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Search Results</title>
</head>
<body>
<div class="container">
    <h2>Search Results</h2>
    <g:each in="${result}" var="contact">
        <div class="panel panel-default">
            <div class="panel-heading">${contact.name}</div>
            <div class="panel-body">
                <p>Email: ${contact.email}</p>
                <p>Phone: ${contact.phone}</p>
            </div>
        </div>
    </g:each>
    <g:if test="${result?.isEmpty()}">
        <p>No contacts found matching your criteria.</p>
    </g:if>
    <g:link action="">Back to Search</g:link>
</div>
</body>
</html>

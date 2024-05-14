<!DOCTYPE html>
<html>
<head>
    <title>Search Contacts</title>
</head>
<body>
<h1>Search Contact</h1>
<g:form controller="search" action="result">
    <g:textField name="name" placeholder="Name"/>
    <g:textField name="email" placeholder="Email"/>
    <g:textField name="phoneNumber" placeholder="Phone Number"/>
    <g:submitButton name="Search"/>
</g:form>
</body>
</html>

%{--<%@ page contentType="text/html;charset=UTF-8" %>--}%
%{--<html>--}%
%{--<head>--}%
%{--    <meta name="layout" content="main"/>--}%
%{--    <title>Search Contacts</title>--}%
%{--</head>--}%
%{--<body>--}%
%{--<div class="container">--}%
%{--    <h2>Search Contacts</h2>--}%
%{--    <g:if test="${flash.message}">--}%
%{--        <div class="alert alert-info">${flash.message}</div>--}%
%{--    </g:if>--}%
%{--    <form action="${createLink(controller: 'contact', action: 'search')}" method="GET" class="form-horizontal">--}%
%{--        <div class="form-group">--}%
%{--            <label for="name">Name</label>--}%
%{--            <input type="text" class="form-control" name="name" id="name" placeholder="Enter part of name"/>--}%
%{--        </div>--}%
%{--        <div class="form-group">--}%
%{--            <label for="email">Email</label>--}%
%{--            <input type="text" class="form-control" name="email" id="email" placeholder="Enter part of email"/>--}%
%{--        </div>--}%
%{--        <div class="form-group">--}%
%{--            <label for="phone">Phone</label>--}%
%{--            <input type="text" class="form-control" name="phone" id="phone" placeholder="Enter part of phone number"/>--}%
%{--        </div>--}%
%{--        <button type="submit" class="btn btn-primary">Search</button>--}%
%{--    </form>--}%
%{--</div>--}%
%{--</body>--}%
%{--</html>--}%


<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main" />
    <title>Search Contacts</title>
</head>
<body>
<a href="#search-contact" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
<div class="nav" role="navigation">
    <ul>
        <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
        <li><g:link class="search active" controller="search" action="index"><g:message code="search.label" /></g:link></li>
    </ul>
</div>
<div id="search-contact" class="content scaffold-search" role="main">
    <h1>Search Contact</h1>
    <g:form controller="search" action="result">
        <fieldset class="form">
            <div class="form-group">
                <g:textField name="name" placeholder="Name" class="form-control"/>
            </div>
            <div class="form-group">
                <g:textField name="email" placeholder="Email" class="form-control"/>
            </div>
            <div class="form-group">
                <g:textField name="phone" placeholder="Phone Number" class="form-control"/>
            </div>
            <div class="form-group">
                <g:submitButton name="search" class="btn btn-primary" value="Search"/>
            </div>
        </fieldset>
    </g:form>
</div>
</body>
</html>

%{--<!DOCTYPE html>--}%
%{--<html>--}%
%{--<head>--}%
%{--    <title>Search Contacts</title>--}%
%{--</head>--}%
%{--<body>--}%
%{--<h1>Search Contact</h1>--}%
%{--<g:form controller="search" action="result">--}%
%{--    <g:textField name="name" placeholder="Name"/>--}%
%{--    <g:textField name="email" placeholder="Email"/>--}%
%{--    <g:textField name="phone" placeholder="Phone Number"/>--}%
%{--    <g:submitButton name="Search"/>--}%
%{--</g:form>--}%
%{--</body>--}%
%{--</html>--}%

%{--<%@ page contentType="text/html;charset=UTF-8" %>--}%
%{--<html>--}%
%{--<head>--}%
%{--    <meta name="layout" content="main" />--}%
%{--    <title>Search Contacts</title>--}%
%{--</head>--}%
%{--<body>--}%
%{--<a href="#search-contact" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>--}%
%{--<div class="nav" role="navigation">--}%
%{--    <ul>--}%
%{--        <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>--}%
%{--        <li><g:link class="list" action="search"><g:message code="default.list.label" args="[entityName]" /></g:link></li>--}%
%{--    </ul>--}%
%{--</div>--}%
%{--<div class="container">--}%
%{--    <h2>Search Contacts</h2>--}%
%{--    <g:if test="${flash.message}">--}%
%{--        <div class="alert alert-info">${flash.message}</div>--}%
%{--    </g:if>--}%
%{--    <form action="${createLink(controller: 'search', action: 'search')}" method="GET" class="form-horizontal">--}%
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


<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title><g:message code="default.searchResults.label" default="Search Results" /></title>
</head>
<body>
<a href="#search-results" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
<div class="nav" role="navigation">
    <ul>
        <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
        <li><g:link class="search active" controller="search" action="index"><g:message code="search.label" /></g:link></li>
    </ul>
</div>
<div id="search-results" class="content scaffold-search" role="main">
    <h1><g:message code="default.searchResults.label" default="Search Results" /></h1>
    <g:if test="${flash.message}">
        <div class="message" role="status">${flash.message}</div>
    </g:if>
    <g:each in="${result}" var="contact">
        <div class="panel panel-default">
            <div class="panel-heading">${contact.name}</div>
            <div class="panel-body">
                <p>Email: ${contact.email}</p>
                <p>Phone: ${contact.phone}</p>
                <p>Address: ${contact.address}</p>
            </div>
            <br/>
        </div>
    </g:each>
    <g:if test="${result?.isEmpty()}">
        <p>No contacts found matching your criteria.</p>
    </g:if>
    <g:link action="index" class="btn btn-default">Back to Search</g:link>
</div>
</body>
</html>

%{--<%@ page contentType="text/html;charset=UTF-8" %>--}%
%{--<html>--}%
%{--<head>--}%
%{--    <meta name="layout" content="main"/>--}%
%{--    <title>Search Results</title>--}%
%{--</head>--}%
%{--<body>--}%
%{--<div class="container">--}%
%{--    <h2>Search Results</h2>--}%
%{--    <g:each in="${result}" var="contact">--}%
%{--        <div class="panel panel-default">--}%
%{--            <div class="panel-heading">${contact.name}</div>--}%
%{--            <div class="panel-body">--}%
%{--                <p>Email: ${contact.email}</p>--}%
%{--                <p>Phone: ${contact.phone}</p>--}%
%{--                <p>Address: ${contact.address}</p>--}%
%{--            </div>--}%
%{--        </div>--}%
%{--    </g:each>--}%
%{--    <g:if test="${result?.isEmpty()}">--}%
%{--        <p>No contacts found matching your criteria.</p>--}%
%{--    </g:if>--}%
%{--    <g:link action="">Back to Search</g:link>--}%
%{--</div>--}%
%{--</body>--}%
%{--</html>--}%

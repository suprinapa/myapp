<%--
  Created by IntelliJ IDEA.
  User: supri
  Date: 4/17/2022
  Time: 4:43 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Create Club Member</title>
</head>

<body>
<div class="card">
    <div class="card-header">
        <g:message code="club" args="['Create']"/>
    </div>
    <div class="card-body">
        <g:form controller="club" action="createMember">

        %{--Partial Templating--}%
            <g:render template="form"/>
            <div class="form-action-panel">
                <g:submitButton class="btn btn-primary" name="createMember" value="${g.message(code: "createMember")}"/>
                <g:link controller="club" action="index" class="btn btn-primary"><g:message code="cancel"/></g:link>
            </div>
        </g:form>
    </div>
</div>
</body>
</html>
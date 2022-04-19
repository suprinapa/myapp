<div class="form-group">
    <label><g:message code="id"/>*</label>
    <g:textField name="id" class="form-control" value="${response?.id}" placeholder="Please Enter Club id"/>
</div>

<div class="form-group">
    <label><g:message code="ClubName"/>*</label>
    <g:textField name="clubName" class="form-control" value="${response?.clubName}" placeholder="Please Enter your Name"/>
</div>

<div class="form-group">
    <label><g:message code="city"/></label>
    <g:textField name="city" class="form-control" value="${response?.city}" placeholder="Please Enter Club City"/>
</div>
<div class="form-group">
    <label><g:message code="establishedDate"/></label>
    <g:textField name="establishedDate" class="form-control" value="${response?.establishedDate}" placeholder="Please Enter Club Established Date"/>
</div>
<div class="form-group">
    <label><g:message code="noOfOwners"/></label>
    <g:textField name="noOfOwners" class="form-control" value="${response?.noOfOwners}" placeholder="Please Enter the Club Owners"/>
</div>



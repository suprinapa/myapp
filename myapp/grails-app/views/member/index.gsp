<meta name="layout" content="main"/>

<div class="card">
    <div class="card-header">
        %{--Actions--}%
        <span class="float-right">

            %{--Create and Reload Panel--}%
            <div class="btn-group">
                <g:link controller="member" action="create" class="btn btn-success"><g:message code="create"/></g:link>
                <g:link controller="member" action="index" class="btn btn-primary"><g:message code="reload"/></g:link>
            </div>
        </span>
    </div>

    %{--Table Panel--}%
    <div class="card-body">
        <table class="table table-bordered">
            <thead class="thead-dark">
            <tr>
                <g:sortableColumn property="id" title="${g.message(code: "id")}"/>
                <g:sortableColumn property="name" title="${g.message(code: "name")}"/>
                <g:sortableColumn property="address" title="${g.message(code: "address")}"/>
                <th class="action-row"><g:message code="action"/></th>
            </tr>
            </thead>
            <tbody>
            <g:each in="${memberList}" var="info">
                <tr>
                    <td>${info?.id}</td>
                    <td>${info?.name}</td>
                    <td>${info?.address}</td>

                    %{--Table Actions --}%
                    <td>
                        <div class="btn-group">
                            <g:link controller="member" action="update" class="btn btn-secondary" id="${info.id}"><i class="fas fa-edit"></i></g:link>
                            <g:link controller="member" action="delete" id="${info.id}" class="btn btn-secondary delete-confirmation"><i class="fas fa-trash"></i></g:link>
                        </div>
                    </td>
                </tr>
            </g:each>
            </tbody>
        </table>
    </div>
</div>

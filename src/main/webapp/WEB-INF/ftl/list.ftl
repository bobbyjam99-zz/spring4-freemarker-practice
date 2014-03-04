<!DOCTYPE html>
<html>
<head>
    <title>FreeMarker Spring MVC Practice</title>
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css">
</head>
<body>
<div class="jumbotron">
    <h2>FreeMarker Spring MVC Practice</h2>
</div>

<div class="col-md-6 col-md-offset-1">
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Firstname</th>
            <th>Lastname</th>
        </tr>
        </thead>
        <tbody>
        <#list model["userList"] as user>
        <tr>
            <td>${user.firstname}</td>
            <td>${user.lastname}</td>
        </tr>
        </#list>
        </tbody>
    </table>
</div>
</body>
</html>
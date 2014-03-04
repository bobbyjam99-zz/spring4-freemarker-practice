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

<form name="user" class="form-horizontal" action="add.do" method="post">
    <div class="form-group">
        <label class="col-sm-2 control-label">Add User</label>
    </div>
    <div class="form-group">
        <label for="firstname" class="col-sm-2 control-label">Firstname</label>

        <div class="col-sm-5">
            <input type="text" class="form-control" name="firstname" placeholder="Please Input Firestname">
        </div>
    </div>
    <div class="form-group">
        <label for="lastname" class="col-sm-2 control-label">Lastname</label>

        <div class="col-sm-5">
            <input type="text" class="form-control" name="lastname" placeholder="Please Input Lastname">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <input type="submit" class="btn btn-lg btn-primary" value="   Save   "/>
        </div>
    </div>
</form>
</body>
</html>
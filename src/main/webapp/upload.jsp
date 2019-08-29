<%-- 
    Document   : upload
    Created on : 28 août 2019, 21:41:33
    Author     : valery
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>File Uploading using Java</title>
    </head>
    <body>
        <form method="post" action="${ pageContext.request.contextPath}/UploadPicture"
              encType="multipart/form-data">
            <input type="file" name="file" value="select images..."/>
            <input type="submit" value="start upload"/>
        </form>
    </body>
</html>

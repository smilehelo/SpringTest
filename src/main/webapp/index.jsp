<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>  
<head>  
<meta charset="UTF-8">  
    <link href="../resources/css/common.css" rel="stylesheet" />  
    <script src="../resources/js/jquery-2.1.4.js"></script>  
      
</head>  
  
<body>  
<h2>File Upload</h2>  
    <form method="post" enctype="multipart/form-data">  
        选择要上传的文件：
        <input type="file" name="upload" size="60" /><br/>  
        <br/> <!-- <input type="submit" value="开始上传" /> -->  
    </form>  
      
    <input type="button" value="上传吧" onclick="upload()"/>  
</body>  
  
<script>  
    function upload(){  
        $("form").attr('action', "http://localhost:8080/SpringTest/upload/upload");  
        $("form").submit();  
    }  
</script>  
  
</html>  
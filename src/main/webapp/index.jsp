<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>  
<head>  
<meta charset="UTF-8">  
</head>  
  
<body>  
<h2>File Upload</h2>  
    <form method="post" enctype="multipart/form-data" action="upload/upload">  
        选择要上传的文件：<br/> 
         <input type="file" name="upload" /><br/> 
         <input type="file" name="upload" /><br/>
         <input type="file" name="upload" /><br/>  
         <input type="submit" value="上传吧"/>   
    </form>  
      
   
</body>  
  
<!-- <script>  
    function upload(){  
        $("form").attr('action', "http://localhost:8080/SpringTest/upload/upload");  
        $("form").submit();  
    }  
</script>   -->
  
</html>  
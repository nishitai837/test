<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
名前とパスワードを入力して下さい。
<from method="post" action="WelcomeServlet">
<input type="text" name="username">
<input type="password" name="password">
<input type="submit" name="送信">
</from>
</body>
</html>
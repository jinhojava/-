<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>save</title>
    <style>
        .centered {
            text-align: center;
            margin-top: 100px;
        }
    </style>
</head>

<body>
<div class="centered">
    <form action="/board/save" method="post">
        <input type="text" name="boardWriter" placeholder="작성자">
        <input type="text" name="boardPass" placeholder="비밀번호">
        <input type="text" name="boardTitle" placeholder="제목">
        <textarea name="boardContents" cols="30" rows="10" placeholder="내용을 입력하세요" required></textarea>
        <input type="submit" value="작성">
    </form>
    </div>
</body>
</html>
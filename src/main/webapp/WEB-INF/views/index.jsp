<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
    <style>
        .centered {
            text-align: center;
            margin-top: 100px; /* 내용을 페이지 상단에서 어느 정도 떨어뜨릴지 여부를 결정 */
        }
    </style>
</head>
<body>
<div class="centered">
    <h2>Simple Board</h2>
    <a href="/board/save">글작성</a>
    <a href="/board/">글목록</a>
    <a href="/board/paging">페이징 목록</a>
</div>
</body>
</html>
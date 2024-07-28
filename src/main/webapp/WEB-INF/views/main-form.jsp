<%@ page import="hello.postBoard.post.PostRepository" %>
<%@ page import="hello.postBoard.post.Post" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    PostRepository postRepository = PostRepository.getInstance();
    List<Post> postList = postRepository.findAll();
%>



<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <th>title</th>
    <th>content</th>
    <th>revise</th>
    </thead>
    <tbody>
    <%
        for (Post post : postList) {
            out.write(" <tr>");
            out.write(" <td>" + post.getTitle() + "</td>");
            out.write(" <td>" + post.getContent() + "</td>");
    %>
    </tbody>
</table>
<a href = "http://localhost:8080/new-form">회원가입</a>
<a href = "http://localhost:8080/post-form">등록</a>
</body>
</html>
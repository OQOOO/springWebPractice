<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style>
		body {
			margin:0px;
			min-height: 100vh;
		}
		
		header {
			text-align:center;
			width: 100%;
			height: 100px;
			background: skyblue;
		}
		header h1{margin:0px;}
		
		#mainContainer {
			width: 100%;
			min-width: 1000px;
			display: flex;
			flex-direction: column;
			align-items: center;
			justify-content: center;
		}
		
		footer {
			witdh: 100%;
			height: 100px;
			background-color: skyblue;
			text-align: center;
		}
		#infoTypeBox {
		display: grid;
	  	text-align: center;
		grid-template-columns: 
		100px 10px 
		500px 10px
		100px 30px 
		50px 10px 
		190px;
		grid-template-rows: 30px;
	}
	.post {
		display: grid;
	  	text-align: center;
		grid-template-columns: 
		100px 10px 
		500px 10px
		100px 30px 
		50px 10px 
		190px;
		grid-template-rows: 60px;
	}
	
	.post div {
		border-bottom: solid 1px gray;
		padding-top: 15px;
		padding-bottom: 5px;
	}
	#infoTypeBox div {
		-border: solid 1px;
	}
	.midLine {
	width:1000px;
	border:1px solid gray;
}
	</style>
</head>
<body>
	<header>
		<h1>Board</h1>
	</header>
	
	<div id="mainContainer">
				<div id="infoTypeBox">
			<div>No</div>
			<div></div>
			<div style="text-align: left;">제목</div>
			<div></div>
			<div>작성자</div>
			<div></div>
			<div>조회</div>
			<div></div>
			<div>작성시간</div>
		</div>
		
		<div class="midLine"></div>
		<c:forEach  var="post" items="${postList}">
			<div class="post">
				<div class="postNum">
					${post.postId}
				</div>
				<div></div>	
				<div class="title" style="text-align: left;">
					<a style="text-decoration: none; color: black;" href="${pageContext.request.contextPath }/pages/toPost.do?seq=${post.postId}"> ${post.title}</a>
				</div>
				<div></div>
				<div>
					${post.userId}
				</div>
				<div></div>
				<div>
					${post.views}
				</div>
				<div></div>

				<div class="time">
					${post.createTime}
				</div>

				
			</div>
		</c:forEach>
		
	</div>
	
	<footer>
		<h3>footer</h3>
	</footer>

	<img src="/image/qu.jpg" alt="이미지">
</body>
</html>
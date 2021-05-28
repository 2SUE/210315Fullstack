<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="/res/css/boardList.css">

<table>
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>글쓴이</th>
		<th>작성일시</th>
	</tr>
	
	<c:forEach items="${requestScope.list}" var="i">
		<tr class="record" onclick="moveToDetail(${i.iboard})">
			<td>${i.iboard}</td>
			<td>
				<c:choose>
					<c:when test="${param.searchType eq 1 || param.searchType eq 2}">
						${i.title.replace(param.searchText, '<mark>' += param.searchText += '</mark>')}
					</c:when>
					<c:otherwise>
						${i.title}	
					</c:otherwise>	
				</c:choose>
			</td>
			
			<c:choose>		
				<%-- if 프로필 이미지가 없으면 기본 이미지 --%>
				<c:when test="${empty i.profileImg}">
					<c:set var="img" value="/res/img/noProfile.jpg"></c:set>
				</c:when>
				
				<%-- else 프로필 이미지가 있으면 해당 이미지 --%>
				<c:otherwise>
					<c:set var="img" value="/res/img/user/${i.iuser}/${i.profileImg}"/>
				</c:otherwise>
			</c:choose>
			
			<td>
				<c:choose>
					<c:when test="${param.searchType eq 4}">
						${i.writerNm.replace(param.searchText, '<mark>' += param.searchText += '</mark>')}
					</c:when>
					<c:otherwise>
						${i.writerNm}	
						<img src="${img}" class="profileImg">
					</c:otherwise>
				</c:choose>
			</td>
			<td>${i.regdt}</td>
		</tr>
	</c:forEach>
</table>

<div>
	<!-- begin ~ end 값을 var에 담음 -->
	<!-- c:choose : if문, else문 사용 가능 -->
	<c:forEach begin="1" end="${requestScope.pagingCnt}" var="page">
		<c:choose>							   <%-- 1번 a tag 비활성화 --%>
			<c:when test="${page eq param.cPage || (empty param.cPage && page eq 1)}">
				<span class="colorRed">${page}</span>
			</c:when>
			
			<c:otherwise>
				<span><a href="list?cPage=${page}&searchType=${param.searchType}&searchText=${param.searchText}">${page}</a></span>
			</c:otherwise>
		</c:choose>
	</c:forEach>
</div>


<div>
	<form action="list" method="get">
		<div>
			<select name="searchType">
				<option value="1" ${param.searchType == 1? 'selected' : ''}>제목+내용</option>
				<option value="2" ${param.searchType == 2? 'selected' : ''}>제목</option>
				<option value="3" ${param.searchType == 3? 'selected' : ''}>내용</option>
				<option value="4" ${param.searchType == 4? 'selected' : ''}>글쓴이</option>
			</select>
			<input type="search" name="searchText" value="${param.searchText}">
			<input type="submit" value="검색">
		</div>
	</form>
</div>

<script src="/res/js/boardList.js"></script>
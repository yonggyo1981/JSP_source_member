<%@ page contentType="text/html; charset=utf-8" %>
<h1>회원 가입!</h1>
<form method="post" action="insert">
	<dl>
		<dt>아이디</dt>
		<dd>
			<input type="text" name="memId">
		</dd>
	</dl>
	<dl>
		<dt>비밀번호</dt>
		<dd>
			<input type="password" name="memPw">
		</dd>
	</dl>
	<dl>
		<dt>회원명</dt>
		<dd>
			<input type="text" name="memNm">
		</dd>
	</dl>
	<input type="submit" value="회원가입">
</form>
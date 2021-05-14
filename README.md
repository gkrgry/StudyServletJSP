# 서블릿 및 jsp 공부

## 5월 14일

## 5월 13일
오라클 설치

## 5월 11일
##### 한글처리
post 방식: 각 서블릿 jsp 마다 request.setCharacterEncoding("utf-8") 추가
```
서블릿은 doGet, doPost메소드 안에 추가
request.setCharacterEncoding("utf-8");
response.setContentType("text/html; utf-8")
jsp 맨첫줄에 <% request.setCharacterEncoding("utf-8"); %> 추가
```
get 방식: server.xml에 <Connector URIEncoding="utf-8" /> 추가
```
60번째 줄에  URIEncoding="UTF-8"  추가<Connector connectionTimeout="20000" port="8090" protocol="HTTP/1.1" redirectPort="8443"/> 

<Connector URIEncoding="UTF-8" connectionTimeout="20000" port="8090" protocol="HTTP/1.1" redirectPort="8443"/>
```

##### Filter
post 방식이 모든 서블릿,jsp에 코드 추가하기엔 귀찮아 지니 대체 하는법
필터라는 클래스를 따로 만들어야한다.
```
request.setCharacterEncoding("utf-8");
```
위에 코드를 doFilter 메소드안에 집어넣고


wew.xml 에 추가
```
<filter>
  		<filter-name>tempFilter</filter-name>
  		<filter-class>com.daelim.session.TempFilter</filter-class>
  	</filter>
  	<filter-mapping>
  		<filter-name>tempFilter</filter-name>
  		<url-pattern>/*</url-pattern>
  	</filter-mapping>
```
com.daelim.session.TempFilter 란 파일을 모든 파일에 적용하겠다라는 뜻
## 4월 29일
##### Session
session이란? 서버랑 클라이언트를 유지시키는 방법중 하나이지만 쿠키랑 다르게 서버에서 활용한다.


## 4월 26일
##### cookie
cookie란 클라이언트와 서버의 연결을 유지시키는 방법중 하나이다. 쿠키 부스러기 처럼 흔적을 남겨서 쿠키라는 이름을 가지게 되었다. <br>
http 방식은 한번 요청과 응답을 하고나면 끊기기 때문에 서버 1개 클라이언트 여러개 상태로 연결되어 있어 클라이언트들이 효율적으로 연결을 끊어서 클라이언트에 쿠키로 저장해 기존에 데이터를 보관하는 것이다.
쿠키는 보안에 취약 Why? 클라이언트에 저장되기 때문에 개인이 보안하기 때문 <br>
```
Cookie[] cookies = requset.getCookies() //쿠키를 가져올려면 필수;
```


## 4월 23일
##### Servlet 데이터 공유
JSP 와 비슷하게 config , context 를 배움
1page 에서 getServletContext().setAttribute()로 저장하고 2page getAttribute()로 불러올떄 널값이 자꾸 나와서 왜그런가 고민하고 있었는데 2page에서만 실행하고 있어서 그런거 였다 1page를 들리고 2page를 실행하니 해결!!

##### jsp 내장 객체
config 객체 : 해당 servlet에서만 데이터를 공유하는 방법 <br>
web.xml ex)<init-param><param-name></param-name><param-value>admin</param-value></init-param> 에서 getInitParameter() 헤서 jsp로 가져오는것 String adminId = config.getInitParameter("");
application 객체 : 어플리케이션 전체에 데이터를 공유하는 방법 <br>
<context-param><param-name>imgDir</param-name><param-value>/upload/img</param-value></context-param>


## 4월 20일
##### jsp 스크립트
servlet 자바 파일로 바로 컴파일 되어 클래스파일로 변경 하지만 jsp는 톰캣을 통해 jsp파일이 java파일로 변경되고 다음 컴파일 된다<br>
jsp 지시어: <% page 속성="속성 값" 페이지 기본 설정%> , <% incloud file="파일명" 외부 파일 가져오기%> <br>
<% taglib uri="uir" prefix="네임스페이스 명"%>
##### jsp 태그
jsp 안에서 <%! %> 안에 선언된건 전역변수 <% %> 는 그냥 지역 변수 


## 4월 18일
##### Servlet 생명주기
@PostConstruct -> init() -> service , doGet() -> destroy() -> @PreDestroy 보통 service보다 doGet 대부분 <br>
init() 실행할때 한번 doGet()을 호출되면 여러번 destroy() 끝날때 한번 (ex DB연결 종료) <br>
error : build path src 파일로 인데 나는 src 파일이름으로 안되있어서 변경하여 해결
##### form 데이터 처리
웹 브라우저에서 html form 테그 로 부터 유저 데이터를 request 객체로 묶어 서버가 받는다<br>
form method = "get" 이면 doGet() 메소드가 받고 method="post"면 doPost()로 받으며 doGet()이 defalut이다. <br>
get 메소드는 url에 노출되어 웹서버로 전송 즉 보안이 약함 post 메소드는 매핑 정보만 노출하여 보안에 강함 <br>
그럼 왜 post 메소드만 쓰지 않을까??

## 4월 15일 Servlet 맵핑, github error
servlet 맵핑 : 서블릿을 구분하기 위해 path를 간단하게 원하는데로 만드는것 <br>
맵핑을 하는 이유는 보안에 취약하고 복잡한 url을 간결하게 바꿀수 있어서
웹을 만들때 jsp와 servlet을 섞어서 만드는게 좋음 jsp 는 view servlet 컨트롤러 모델 등 으로 주로 만듬<br>
web.xml 파일에서 맵핑중 잘못하면 톰켓서버가 시작하지 않는 오류가 있음(failed to start) <br>
에러가 뜬 이유 : servlet-mapping > url-pattern 안에 '/'를 쓰지 않아 에러가 뜸 <br>
<br>
httpServlet 클래스가 중요하다!! <br>
requset , response : doGet , doPost 메소드안에 2가지 변수를 이용해 만들것 
github 커밋 에러 해서 아주 간단한 서블릿 파일만 만들어서 아예 원래 프로젝트 지우고 다시 clone 해서 시작

## 4월 12일
tomcat 10 버전을 다운그래이드 하는 김에 원래 demo 프로젝트 삭제 및 현재 StudyServletJSP 프로젝트로 변경 <br>
버전 9로 다운그래이드 중 인텔리제이 에러로 인해 이클립스로 ide 변경 <br>
IDE 변경한 에러는 인텔리 제이에서 서블릿 매핑 중 서블릿 파일에 @WebServlet() 매핑이  에러로 인해 안되서 <br> javax.servlet.annotation이 cannot find symbol 이라 에러가 뜸

## 4월 11일
웹 컨테이너 구조 <br>
현재 Servlet 구동인 안됨 main 디렉토리안에 .java 파일이 .class 로 안변하여서 그러는것 같음 

Servlet은 java 파일을 이용해서 jsp와 같은 동작을 한다 

<br>jsp 파일을 통해 request(요청)을 하면 웹 컨테이너(톰켓)이 알아서 자바 코드를 확인해 .class 파일을 실행하고 html 파일로 response(응답)한다. <br>
*.jsp --> tomcat --> *.html<br>
C:\tomcat10\work\Catalina\localhost\ROOT\org\apache\jsp<br>
안에 .java , .class 파일 확인

## 4월 06일
인프런 통해 서블릿과 jsp 관련 공부 시작 오늘은 웹 프로그래밍에 관한 간단한 이론<br>
프로토콜(Protocol)<br>
통신을 하기위한 규약으로 http,ftp,smtp,pop등이 있다<br>
http: 글과 택스트와 그림이 하이퍼링크로 통신하는거
<br>ftp: 파일로 통신, smtp,pop:메일 관련 통신
<br><br>
ip: 택배 시킬때 보면 도로명 주소 ex)**시 @@구 ##로 <br>port : 상세 주소 ex)동 호수
<br> http://www.google.com:80/index.html
<br> 프로토콜://ip주소:포트번호/경로

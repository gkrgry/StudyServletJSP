# 서블릿 및 jsp 공부
## 4월 12일
tomcat 10 버전을 다운그래이드 하는 김에 원래 demo 프로젝트 삭제 및 현재 StudyServletJSP 프로젝트로 변경 <br>
버전 9로 다운그래이드 중 인텔리제이 에러로 인해 이클립스로 ide 변경 <br>
IDE 변경한 에러는 인텔리 제이에서 서블릿 매핑 중 서블릿 파일에 @WebServlet() 매핑이  에러로 인해 안되서 javax.servlet.annotation이 cannot find symbol 이라 에러가 뜸

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

# 서블릿 및 jsp 공부
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

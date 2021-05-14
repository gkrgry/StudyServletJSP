# ���� �� jsp ����

## 5�� 14��

## 5�� 13��
����Ŭ ��ġ

## 5�� 11��
##### �ѱ�ó��
post ���: �� ���� jsp ���� request.setCharacterEncoding("utf-8") �߰�
```
������ doGet, doPost�޼ҵ� �ȿ� �߰�
request.setCharacterEncoding("utf-8");
response.setContentType("text/html; utf-8")
jsp ��ù�ٿ� <% request.setCharacterEncoding("utf-8"); %> �߰�
```
get ���: server.xml�� <Connector URIEncoding="utf-8" /> �߰�
```
60��° �ٿ�  URIEncoding="UTF-8"  �߰�<Connector connectionTimeout="20000" port="8090" protocol="HTTP/1.1" redirectPort="8443"/> 

<Connector URIEncoding="UTF-8" connectionTimeout="20000" port="8090" protocol="HTTP/1.1" redirectPort="8443"/>
```

##### Filter
post ����� ��� ����,jsp�� �ڵ� �߰��ϱ⿣ ������ ���� ��ü �ϴ¹�
���Ͷ�� Ŭ������ ���� �������Ѵ�.
```
request.setCharacterEncoding("utf-8");
```
���� �ڵ带 doFilter �޼ҵ�ȿ� ����ְ�


wew.xml �� �߰�
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
com.daelim.session.TempFilter �� ������ ��� ���Ͽ� �����ϰڴٶ�� ��
## 4�� 29��
##### Session
session�̶�? ������ Ŭ���̾�Ʈ�� ������Ű�� ����� �ϳ������� ��Ű�� �ٸ��� �������� Ȱ���Ѵ�.


## 4�� 26��
##### cookie
cookie�� Ŭ���̾�Ʈ�� ������ ������ ������Ű�� ����� �ϳ��̴�. ��Ű �ν����� ó�� ������ ���ܼ� ��Ű��� �̸��� ������ �Ǿ���. <br>
http ����� �ѹ� ��û�� ������ �ϰ��� ����� ������ ���� 1�� Ŭ���̾�Ʈ ������ ���·� ����Ǿ� �־� Ŭ���̾�Ʈ���� ȿ�������� ������ ��� Ŭ���̾�Ʈ�� ��Ű�� ������ ������ �����͸� �����ϴ� ���̴�.
��Ű�� ���ȿ� ��� Why? Ŭ���̾�Ʈ�� ����Ǳ� ������ ������ �����ϱ� ���� <br>
```
Cookie[] cookies = requset.getCookies() //��Ű�� �����÷��� �ʼ�;
```


## 4�� 23��
##### Servlet ������ ����
JSP �� ����ϰ� config , context �� ���
1page ���� getServletContext().setAttribute()�� �����ϰ� 2page getAttribute()�� �ҷ��Ë� �ΰ��� �ڲ� ���ͼ� �ֱ׷��� ����ϰ� �־��µ� 2page������ �����ϰ� �־ �׷��� ���� 1page�� �鸮�� 2page�� �����ϴ� �ذ�!!

##### jsp ���� ��ü
config ��ü : �ش� servlet������ �����͸� �����ϴ� ��� <br>
web.xml ex)<init-param><param-name></param-name><param-value>admin</param-value></init-param> ���� getInitParameter() �켭 jsp�� �������°� String adminId = config.getInitParameter("");
application ��ü : ���ø����̼� ��ü�� �����͸� �����ϴ� ��� <br>
<context-param><param-name>imgDir</param-name><param-value>/upload/img</param-value></context-param>


## 4�� 20��
##### jsp ��ũ��Ʈ
servlet �ڹ� ���Ϸ� �ٷ� ������ �Ǿ� Ŭ�������Ϸ� ���� ������ jsp�� ��Ĺ�� ���� jsp������ java���Ϸ� ����ǰ� ���� ������ �ȴ�<br>
jsp ���þ�: <% page �Ӽ�="�Ӽ� ��" ������ �⺻ ����%> , <% incloud file="���ϸ�" �ܺ� ���� ��������%> <br>
<% taglib uri="uir" prefix="���ӽ����̽� ��"%>
##### jsp �±�
jsp �ȿ��� <%! %> �ȿ� ����Ȱ� �������� <% %> �� �׳� ���� ���� 


## 4�� 18��
##### Servlet �����ֱ�
@PostConstruct -> init() -> service , doGet() -> destroy() -> @PreDestroy ���� service���� doGet ��κ� <br>
init() �����Ҷ� �ѹ� doGet()�� ȣ��Ǹ� ������ destroy() ������ �ѹ� (ex DB���� ����) <br>
error : build path src ���Ϸ� �ε� ���� src �����̸����� �ȵ��־ �����Ͽ� �ذ�
##### form ������ ó��
�� ���������� html form �ױ� �� ���� ���� �����͸� request ��ü�� ���� ������ �޴´�<br>
form method = "get" �̸� doGet() �޼ҵ尡 �ް� method="post"�� doPost()�� ������ doGet()�� defalut�̴�. <br>
get �޼ҵ�� url�� ����Ǿ� �������� ���� �� ������ ���� post �޼ҵ�� ���� ������ �����Ͽ� ���ȿ� ���� <br>
�׷� �� post �޼ҵ常 ���� ������??

## 4�� 15�� Servlet ����, github error
servlet ���� : ������ �����ϱ� ���� path�� �����ϰ� ���ϴµ��� ����°� <br>
������ �ϴ� ������ ���ȿ� ����ϰ� ������ url�� �����ϰ� �ٲܼ� �־
���� ���鶧 jsp�� servlet�� ��� ����°� ���� jsp �� view servlet ��Ʈ�ѷ� �� �� ���� �ַ� ����<br>
web.xml ���Ͽ��� ������ �߸��ϸ� ���ϼ����� �������� �ʴ� ������ ����(failed to start) <br>
������ �� ���� : servlet-mapping > url-pattern �ȿ� '/'�� ���� �ʾ� ������ �� <br>
<br>
httpServlet Ŭ������ �߿��ϴ�!! <br>
requset , response : doGet , doPost �޼ҵ�ȿ� 2���� ������ �̿��� ����� 
github Ŀ�� ���� �ؼ� ���� ������ ���� ���ϸ� ���� �ƿ� ���� ������Ʈ ����� �ٽ� clone �ؼ� ����

## 4�� 12��
tomcat 10 ������ �ٿ�׷��̵� �ϴ� �迡 ���� demo ������Ʈ ���� �� ���� StudyServletJSP ������Ʈ�� ���� <br>
���� 9�� �ٿ�׷��̵� �� ���ڸ����� ������ ���� ��Ŭ������ ide ���� <br>
IDE ������ ������ ���ڸ� ���̿��� ���� ���� �� ���� ���Ͽ� @WebServlet() ������  ������ ���� �ȵǼ� <br> javax.servlet.annotation�� cannot find symbol �̶� ������ ��

## 4�� 11��
�� �����̳� ���� <br>
���� Servlet ������ �ȵ� main ���丮�ȿ� .java ������ .class �� �Ⱥ��Ͽ��� �׷��°� ���� 

Servlet�� java ������ �̿��ؼ� jsp�� ���� ������ �Ѵ� 

<br>jsp ������ ���� request(��û)�� �ϸ� �� �����̳�(����)�� �˾Ƽ� �ڹ� �ڵ带 Ȯ���� .class ������ �����ϰ� html ���Ϸ� response(����)�Ѵ�. <br>
*.jsp --> tomcat --> *.html<br>
C:\tomcat10\work\Catalina\localhost\ROOT\org\apache\jsp<br>
�ȿ� .java , .class ���� Ȯ��

## 4�� 06��
������ ���� ������ jsp ���� ���� ���� ������ �� ���α׷��ֿ� ���� ������ �̷�<br>
��������(Protocol)<br>
����� �ϱ����� �Ծ����� http,ftp,smtp,pop���� �ִ�<br>
http: �۰� �ý�Ʈ�� �׸��� �����۸�ũ�� ����ϴ°�
<br>ftp: ���Ϸ� ���, smtp,pop:���� ���� ���
<br><br>
ip: �ù� ��ų�� ���� ���θ� �ּ� ex)**�� @@�� ##�� <br>port : �� �ּ� ex)�� ȣ��
<br> http://www.google.com:80/index.html
<br> ��������://ip�ּ�:��Ʈ��ȣ/���

# ���� �� jsp ����
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

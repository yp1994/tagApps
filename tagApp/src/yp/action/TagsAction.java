package yp.action;
 

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

 
import com.opensymphony.xwork2.ActionSupport;

 

public class TagsAction extends ActionSupport{
	  
 public String execute() throws Exception
{
	 HttpServletRequest request=ServletActionContext.getRequest();
	 String name=request.getParameter("name");
  	 System.out.println(name);
  	 HttpSession session=request.getSession();
      String bir=(String) session.getAttribute("birthday");// ҳ�����õ�ʱ��
   	 System.out.println(bir);
   	 Date date=new Date(); //���ڵ�ʱ��
   	 DateFormat format=new SimpleDateFormat("yyyy-MM-dd"); 
    String time=format.format(date);
   	 System.out.println(time);
   	long s = new SimpleDateFormat("yyyy-MM-dd").parse(bir).getTime();//��������
   	long s1=new SimpleDateFormat("yyyy-MM-dd").parse(time).getTime();
   	int age1=  (int) (s1-s);
   	int year=age1/(365*24*60*60);
   	int day=age1/(24*60*60);
   	 System.out.println(age1);
   	 System.out.println("�������ꣿ"+year);
   	 System.out.println("�������죿"+day);
   	 session.setAttribute("year", year);
   	 session.setAttribute("day", day);
	return SUCCESS;
 	
}
}

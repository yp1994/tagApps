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
      String bir=(String) session.getAttribute("birthday");// 页面所得的时间
   	 System.out.println(bir);
   	 Date date=new Date(); //现在的时间
   	 DateFormat format=new SimpleDateFormat("yyyy-MM-dd"); 
    String time=format.format(date);
   	 System.out.println(time);
   	long s = new SimpleDateFormat("yyyy-MM-dd").parse(bir).getTime();//所得秒数
   	long s1=new SimpleDateFormat("yyyy-MM-dd").parse(time).getTime();
   	int age1=  (int) (s1-s);
   	int year=age1/(365*24*60*60);
   	int day=age1/(24*60*60);
   	 System.out.println(age1);
   	 System.out.println("相差多少年？"+year);
   	 System.out.println("相差多少天？"+day);
   	 session.setAttribute("year", year);
   	 session.setAttribute("day", day);
	return SUCCESS;
 	
}
}

package Chapter2;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class CountingFactorizer implements Servlet {
	//java.util.concurrent.atomic���а�����һЩԭ�ӱ����࣬����ʵ������ֵ�Ͷ��������ϵ�ԭ��״̬ת����
	//AtomicLongȷ�����ж�״̬�ķ��ʶ���ԭ���Եġ�
	private final AtomicLong count = new AtomicLong(0);
	
	

	public Long getCount() {
		return count.get();
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		count.incrementAndGet();
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}

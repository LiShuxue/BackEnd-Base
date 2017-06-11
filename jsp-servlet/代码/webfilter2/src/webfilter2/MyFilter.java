package webfilter2;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.jsp.jstl.core.Config;

public class MyFilter implements Filter {
	
	private String characterEncoding;
	private boolean enabled;
	
	@Override
	public void destroy() {
		characterEncoding = null;

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("------filter------");
		System.out.println(enabled);
		if(enabled && characterEncoding!=null) {
			request.setCharacterEncoding(characterEncoding);
			response.setCharacterEncoding(characterEncoding);
		}
		chain.doFilter(request, response);

	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		System.out.println("≥ı ºªØ");
		characterEncoding = config.getInitParameter("characterEncoding");
		String enable = config.getInitParameter("enable");
		enabled = "true".equalsIgnoreCase(enable.trim()) || "1".equalsIgnoreCase(enable.trim());

	}

}

package com.pantherbuddy.web.authorization;

import java.io.IOException;

import javax.faces.application.ResourceHandler;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(filterName = "AuthFilter", urlPatterns = { "*.jsf" })
public class AuthFilter implements Filter {

	@Override
	public void destroy() {
		// Empty

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;

		HttpSession session = request.getSession(false);

		String user = (session != null) ? (String) session
				.getAttribute("username") : null;
				String loginURL = request.getContextPath() + "/login.jsf";
				boolean loginRequest = request.getRequestURI().startsWith(loginURL);
				boolean resourceRequest = request.getRequestURI().startsWith(
						request.getContextPath() + ResourceHandler.RESOURCE_IDENTIFIER);

				if (user != null || loginRequest) {
					if (!resourceRequest) {
						// Skip JSF resources (CSS/JS/Images/etc)
						response.setHeader("Cache-Control",
								"no-cache, no-store, must-revalidate"); // HTTP 1.1.
						response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
						response.setDateHeader("Expires", 0); // Proxies.
					}
					arg2.doFilter(request, response);
				} else {
					response.sendRedirect(request.getContextPath()
							+ "/login.jsf?faces-redirect=true");
				}

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// Empty
	}

}

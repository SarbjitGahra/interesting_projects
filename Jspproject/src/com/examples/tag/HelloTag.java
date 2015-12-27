package com.examples.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class HelloTag extends SimpleTagSupport {
 @Override
public void doTag() throws JspException, IOException {
	// TODO Auto-generated method stub
	super.doTag();
	JspWriter out =getJspContext().getOut();
	out.println("<h1> Welcome from the custom tag </h1>");
	
}
}

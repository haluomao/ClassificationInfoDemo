package com.student.registration.controller;

import java.io.File;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

@Component("uploadController")
@RequestMapping("{\\.*}/upload.do")  //请求url配置
@Scope("prototype")
public class UploadController implements ServletContextAware{
	
	private ServletContext servletContext;

	@Override
	public void setServletContext(ServletContext context) {
		// TODO Auto-generated method stub
		this.servletContext = context;
	}
	
	@RequestMapping(value="", method = RequestMethod.POST) //默认调用该方法，只有post方法才能调用该方法
	public String handleUploadData(String name, @RequestParam("file") CommonsMultipartFile file){
		if(!file.isEmpty()) //if file is not null
		{
			String path = this.servletContext.getRealPath("/UploadFiles/");
			System.out.println(path);
			String fileName = file.getOriginalFilename();
			String fileType = fileName.substring(fileName.lastIndexOf("."));
			System.out.println(fileType);
			File fileInfo = new File(path,fileName.substring(0, fileName.lastIndexOf(".")) + "_" + new Date().getTime() + fileType);
			try {
				file.getFileItem().write(fileInfo);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return "redirect:/jspFiles/upload_error.jsp";
			}
			
			return "redirect:/jspFiles/upload_success.jsp";
		}
		else
			return "redirect:/jspFiles/upload_error.jsp";
		
	}

}

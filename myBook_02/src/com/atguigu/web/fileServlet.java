package com.atguigu.web;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class fileServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //学习 cookie
        Cookie cookie=new Cookie("key1","value158");
        cookie.setMaxAge(-1);
        response.addCookie(cookie);

        //学习session
        HttpSession session = request.getSession();
        System.out.println(session.getId());
        System.out.println(session.isNew());

        System.out.println("文件上传学习:");
        request.setCharacterEncoding("UTF-8");
        if(ServletFileUpload.isMultipartContent(request)){
            System.out.println("进入");
            FileItemFactory fileItemFactory=new DiskFileItemFactory();
            ServletFileUpload servletFileUpload=new ServletFileUpload(fileItemFactory);
            try {
                List<FileItem> list = servletFileUpload.parseRequest(request);
                for (FileItem file:list) {
                    if(file.isFormField()){
                        System.out.println("name: "+file.getFieldName());
                        System.out.println("value: "+file.getString("UTF-8"));
                    }else {
                        System.out.println("表单名:"+file.getFieldName());
                        System.out.println("fileName："+file.getName());
                        file.write(new File("e:\\"+file.getName()));
                    }

                }

            } catch (FileUploadException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }


        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

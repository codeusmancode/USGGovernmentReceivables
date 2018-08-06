package com.usaparel.view;


import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


import java.awt.image.RenderedImage;

import java.io.FileOutputStream;

@WebServlet(name = "DocumentServlet", urlPatterns = { "/documentservlet" })
public class DocumentServlet extends HttpServlet {
    private static final String CONTENT_TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet; charset=utf-8";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String filename = request.getParameter("file_name").toString();
        String contentType = request.getParameter("content_type").toString();
        File file = new File(filename);
        
        response.setContentType(contentType);
        OutputStream out = response.getOutputStream();

        
        if (file.exists()) {
            FileInputStream input = null;
            try {
                input = new FileInputStream(file);
                BufferedInputStream bis = new BufferedInputStream(input);
                byte[] bytes = new byte[10240];
                while (bis.read(bytes, 0, 10240) != -1) {
                    out.write(bytes);
                }
                out.flush();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (out != null) {
                    out.close();
                }
                if (input != null) {
                    input.close();
                }

            }
        }

    }
}

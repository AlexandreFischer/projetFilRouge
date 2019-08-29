/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetFilRouge.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileItemFactory;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import projetFilRouge.spring.AutowireServlet;

/**
 *
 * @author valery
 */
@WebServlet(name = "UploadPictureServlet", urlPatterns = {"/UploadPicture"})
public class UploadPictureServlet extends AutowireServlet {

    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("upload.jsp").forward(req, resp); 
        
    }
    
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();

        if (!ServletFileUpload.isMultipartContent(req)) {
            out.println("Nothing to upload");
            return;
        }
        FileItemFactory itemfactory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(itemfactory);
        try {
            List<FileItem> items = upload.parseRequest((RequestContext) req);
            for (FileItem item : items) {

                String contentType = item.getContentType();
                if (!contentType.equals("image/png")) {
                    out.println("only png format image files supported");
                    continue;
                }
                File uploadDir = new File("/Users/valery/NetBeansProjects/_projetFilRouge/projetFilRouge/src/main/webapp/images");
                File file = File.createTempFile("img", ".png", uploadDir);
                item.write(file);

                out.println("File Saved Successfully");
            }
        } catch (FileUploadException e) {

            out.println("upload fail");
        } catch (Exception ex) {

            out.println("can't save");
        }

    }
    

}

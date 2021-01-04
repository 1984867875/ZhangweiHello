package com.crx.quanxian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;

@Controller
public class UploadController {
    @RequestMapping(value = "upload.do",method = {RequestMethod.POST})
    public String upload(@RequestParam("file") CommonsMultipartFile wenjian[], String zw, HttpServletRequest request) throws IOException {
       if(wenjian!=null&&wenjian.length>0){
           for(CommonsMultipartFile w:wenjian){
               long size = w.getSize();//字节大小
               if (size > 0) {
                   //上传的文件名
                   String filename = w.getOriginalFilename();//a.jpg
                   //文件扩展名包含.e
                   String subfix = filename.substring(filename.indexOf("."));
                   //得到文件上传的真实路径
                   String path = request.getSession().getServletContext().getRealPath("/files");
                   //File构造
                   File dir = new File(path);
                   dir.mkdirs();
                   //生成文件名
                   String prefix = new Date().getTime() + "";
                   //文件生成
                   String uploadFileName = prefix + subfix;
                   //上传
                   w.transferTo(new File(uploadFileName));
               }
           }

        }


           return "redirect:index.do";//<a href="${pageContextPath}/files/wenjianming"服务器上
    }
}

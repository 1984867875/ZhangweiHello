package com.crx.quanxian.controller;

import com.crx.quanxian.model.Res;
import com.crx.quanxian.service.ResourceService;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.naming.Name;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.spec.DSAPublicKeySpec;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("res")
public class ResourceController {
    @Autowired
    private ResourceService service;

    /**
     *  查看资源列表
     *
     * @param request
     * @return
     */
//res.view.do/1@PathVariable("a") Integer num
@RequestMapping(value = "view.do",method = {RequestMethod.GET})
    public String view(HttpServletRequest request){
    List<Res> list = service.view();
    request.setAttribute("list",list);
    return "/res/view";
}
/**
 * 保存资源
 */
@RequestMapping("save")
    public  String save(@RequestParam("logo") CommonsMultipartFile w, Res res ,HttpServletRequest request) throws IOException {
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
       //设置数据库地址
      res.setLogo("/files/"+uploadFileName);
    }
    service.save(res);
    return "redirect:res/view.do/1";

}

@RequestMapping("preSave.do")
    public String preSave(){
    return "/res/save";
}



}

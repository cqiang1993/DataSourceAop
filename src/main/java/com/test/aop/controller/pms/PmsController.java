package com.test.aop.controller.pms;

import com.test.aop.controller.base.ServiceFactory;
import com.test.aop.model.*;
import com.test.aop.utils.cs.UploadReportToCs;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.*;

@RestController
@RequestMapping(value = "/pms")
public class PmsController extends ServiceFactory {

    @RequestMapping("/getPmsProductList")
    public PageResultBean<PmsProduct> getPmsProductList(){
        List<PmsProduct> pmsProducts = pmsProductService.getPmsProductList();
        return new PageResultBean<PmsProduct>(pmsProducts,pmsProducts.size());
    }
    @RequestMapping("/getPmsProjectList")
    public List<PmsProject> getPmsProjectList(@RequestParam int root){
        return pmsProjectService.getPmsProjectList(root);
    }


    @RequestMapping("/getmodulelisttest")
    public Map<String,Object> testmloading1() {
        List<PmsProduct> pmsProducts = pmsProductService.getPmsProductList();
        List<PmsModule> pmsModules = pmsModuleService.getPmsModuleList();
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("products", pmsProducts);
        map.put("modules", pmsModules);
        return map;
    }

    @RequestMapping("/getProjectUser")
    public List<PmsUser> getProjectUser(@RequestParam int product_id){
        List<PmsUser> accounts = new ArrayList<PmsUser>();
        List<ProductUser> productUsers =productUserService.getProductUser(product_id);
        for(ProductUser pu:productUsers) {
            if(pu.getAccount99()==0) {
                PmsUser pmsUser = new PmsUser();
                pmsUser.setAccount("tqnd10007043");
                pmsUser.setRealname("线上问题统筹号");
                pmsUser.setAccount99(10007043);
                accounts.add(pmsUser);
            }else {
                accounts.add(pmsUserService.getPmsUserByAccount("tqnd"+pu.getAccount99()));
            }
        }
        return accounts;
    }
    @RequestMapping(value="uploadImage",method= {RequestMethod.POST})
    public Map<String,Object> uploadImage(@RequestParam("imgFile") MultipartFile image){
        Map<String,Object> map = new HashMap<String,Object>();
//		String imageUrl = new UploadReportToCs().doUploadCs("");
//		map.put("url", imageUrl);
        try {
            byte[] bs = image.getBytes();
            int stateInt = 1;
            if(bs.length>0) {
                String filePath = "./images";
                System.out.println("开始上传");
                File validateCodeFolder = new File(filePath);
                if (!validateCodeFolder.exists()) {
                    validateCodeFolder.mkdirs();
                }
                // 将字符串转换成二进制，用于显示图片
                // 将上面生成的图片格式字符串 imgStr，还原成图片显示
                String type = "."+image.getContentType().split("/")[1];
                String uuid = UUID.randomUUID().toString();
                String filename = uuid + type;
                InputStream in = new ByteArrayInputStream(bs);
                File file = new File(filePath, filename);// 可以是任何图片格式.jpg,.png等
                FileOutputStream fos = new FileOutputStream(file);
                byte[] b = new byte[1024];
                int nRead = 0;
                while ((nRead = in.read(b)) != -1) {
                    fos.write(b, 0, nRead);
                }
                fos.flush();
                fos.close();
                in.close();
                System.out.println(file.getAbsolutePath());
                System.out.println("上传成功");
                System.out.println(file.getAbsolutePath());
                String imageUrl = new UploadReportToCs().doUploadCs(file.getAbsolutePath());
                map.put("error", 0);
                map.put("url", imageUrl);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            map.put("error", 1);
            map.put("message", "图片上传失败");
        }
        return map;
    }
}

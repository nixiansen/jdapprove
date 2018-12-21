package com.zdd.risk.api;

import com.alibaba.fastjson.JSONObject;
import com.zdd.risk.bean.Certification;
import com.zdd.risk.bean.TempShuju;
import com.zdd.risk.dao.ICertificationDAO;
import com.zdd.risk.service.JingDongService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Created by ZWYnqj on 2018/12/20.
 */
@RestController
@RequestMapping("/risk/shujutest")
public class TempController {

    @Autowired
    private JingDongService jingDongService;

    @Autowired
    private ICertificationDAO certificationDAO;

    @ApiOperation("测试插入数据")
    @RequestMapping(value = "/insertrisktemp")
    public void insertrisktemp() {

        List<TempShuju> list = jingDongService.selectTemp();


        for (int i = 0; i < list.size(); i++) {
            JSONObject params = new JSONObject();


            TempShuju tempShuju = (TempShuju) list.get(i);
            if (tempShuju.getRemark().equals("数据丢失，手工插入！")) {
                if (tempShuju.getCertificationType().equals("2")) {
                    params.put("idCard", tempShuju.getIdcard());
                    params.put("mobile", tempShuju.getMobile());
                    params.put("certificationType", 2);
                    params.put("certificationItem", "{" +tempShuju.getCertificationItem().substring(23));
                    params.put("certificationResult",  tempShuju.getCertificationResult());
                    params.put("certificationLimit", new Date());
                    params.put("flag", 0);
                    params.put("remark", "数据丢失，手工插入！");
                    params.put("creatTime", new Date());
//                    System.out.println("certificationResult++++++++++++============================" + i + "{" + tempShuju.getCertificationItem().substring(23));

                    Certification record = params.toJavaObject(Certification.class);
                    certificationDAO.insert(record);
                } else {
                    params.put("idCard", tempShuju.getIdcard());
                    params.put("mobile", tempShuju.getMobile());
                    params.put("certificationType", 5);
                    params.put("certificationItem", "{" +tempShuju.getCertificationItem().substring(23));
                    params.put("certificationResult", "{\"duration\":" + tempShuju.getCertificationResult() + ",\"msg\":\"\"}");
                    params.put("certificationLimit", new Date());
                    params.put("flag", 0);
                    params.put("remark", "数据丢失，手工插入！");
                    params.put("creatTime", new Date());
//                    System.out.println("certificationResult++++++++++++============================" + i + "{" + tempShuju.getCertificationItem().substring(23));
//                    System.out.println("certificationResult++++++++++++============================" + i + "{\"duration\":" + tempShuju.getCertificationResult() + ",\"msg\":\"\"}");

                    Certification record = params.toJavaObject(Certification.class);
                    certificationDAO.insert(record);
                }
            } else {
                params.put("idCard", tempShuju.getIdcard());
                params.put("mobile", tempShuju.getMobile());
                params.put("certificationType", tempShuju.getCertificationType());
                params.put("certificationItem", "{\"idcard\":\"" + tempShuju.getIdcard() + "\",\"name\":\"" + tempShuju.getCertificationItem() + "\",\"mobile\":\"" + tempShuju.getMobile() + "\"}");
                params.put("certificationResult", tempShuju.getCertificationResult());
                params.put("certificationLimit", new Date());
                params.put("flag", 0);
                params.put("remark", "数据丢失，手工插入！");
                params.put("creatTime", new Date());
//                System.out.println("certificationResult++++++++++++============================" + i + "{\"duration\":" + tempShuju.getCertificationResult() + ",\"msg\":\"\"}");
//                System.out.println("=============================" + i + params.getString("certificationItem"));

                Certification record = params.toJavaObject(Certification.class);
                certificationDAO.insert(record);

            }
        }
        System.out.println("成功");
        System.out.println(list);

    }


}

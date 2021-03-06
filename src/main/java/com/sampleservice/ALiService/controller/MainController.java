package com.sampleservice.ALiService.controller;

import com.sampleservice.ALiService.utils.MBaseUtils;
import com.septemberhx.common.base.MResponse;
import com.septemberhx.mclient.annotation.MApiFunction;
import com.septemberhx.mclient.annotation.MRestApiType;
import com.septemberhx.mclient.base.MObject;
import org.springframework.web.bind.annotation.*;

/**
 * @author SeptemberHX
 * @version 0.1
 * @date 2019/11/25
 */
@RestController
public class MainController extends MObject {

    @ResponseBody
    @RequestMapping(value = "/pay", method = RequestMethod.POST)
    @MRestApiType
    @MApiFunction
    public MResponse payFunction(@RequestBody MResponse requestData) {
        MResponse result = new MResponse();
        result.set("msg", "/pay");

        if (requestData.get("interval") != null) {
            MBaseUtils.generateStringInKBSize(5, result, (int) requestData.get("interval"));
        }
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/market", method = RequestMethod.POST)
    @MRestApiType
    @MApiFunction
    public MResponse marketFunction(@RequestBody MResponse requestData) {
        MResponse result = new MResponse();
        result.set("msg", "/market");

        if (requestData.get("interval") != null) {
            MBaseUtils.generateStringInKBSize(300, result, (int) requestData.get("interval"));
        }
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/canteen", method = RequestMethod.POST)
    @MRestApiType
    @MApiFunction
    public MResponse canteenFunction(@RequestBody MResponse requestData) {
        MResponse result = new MResponse();
        result.set("msg", "/canteen");

        if (requestData.get("interval") != null) {
            MBaseUtils.generateStringInKBSize(200, result, (int) requestData.get("interval"));
        }
        return result;
    }
}

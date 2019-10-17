package com.example.projectwebapiqicai.controller;
import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiCallBackGetCallBackRequest;
import com.dingtalk.api.request.OapiDepartmentListRequest;
import com.dingtalk.api.request.OapiGettokenRequest;
import com.dingtalk.api.response.OapiCallBackGetCallBackResponse;
import com.dingtalk.api.response.OapiDepartmentListResponse;
import com.dingtalk.api.response.OapiGettokenResponse;
import com.taobao.api.ApiException;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    public static void main(String[] args) {
       /* DefaultDingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/gettoken");
        OapiGettokenRequest request = new OapiGettokenRequest();
        request.setAppkey("ding9uycjrbeclwpoljy");
        request.setAppsecret("EcRgnzZ1RzFpjUdpwuo_DO5UXm9WWmNy2APthukua0hQWxf5MF8ojZgfWd2VmEr8");
        request.setHttpMethod("GET");
        OapiGettokenResponse response = null;
        try {
            response = client.execute(request);
        } catch (ApiException e) {
            e.printStackTrace();
        }
        System.out.println(response.getAccessToken());*/
        String accessToken = "fba2cf8614b732c7b6f58b50f0f19190";
        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/department/list");
        OapiDepartmentListRequest request = new OapiDepartmentListRequest();
        request.setHttpMethod("GET");
        try {
            OapiDepartmentListResponse response = client.execute(request, accessToken);
            System.out.println(response.getErrmsg());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    public static Object getDepartment(){
        String accessToken = "fba2cf8614b732c7b6f58b50f0f19190";
        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/department/list");
        OapiDepartmentListRequest request = new OapiDepartmentListRequest();
        request.setHttpMethod("GET");
        try {
            OapiDepartmentListResponse response = client.execute(request, accessToken);
            return response.getErrmsg();
        } catch (ApiException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Object getData(){
        String accessToken = "fba2cf8614b732c7b6f58b50f0f19190";
        DingTalkClient  client = new DefaultDingTalkClient("https://oapi.dingtalk.com/call_back/get_call_back");
        OapiCallBackGetCallBackRequest request = new OapiCallBackGetCallBackRequest();
        request.setHttpMethod("GET");
        try {
            OapiCallBackGetCallBackResponse response = client.execute(request,accessToken);
            return response;
        } catch (ApiException e) {


        }
        return null;
    }
}

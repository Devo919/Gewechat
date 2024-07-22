package api.base;

import com.alibaba.fastjson2.JSONObject;
import util.OkhttpUtil;

/**
 * 个人模块
 */
public class PersonalApi {

    /**
     * 获取个人资料
     */
    public static JSONObject getProfile(String appId){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        return OkhttpUtil.postJSON("/personal/getProfile",param);
    }


    /**
     * 获取自己的二维码
     */
    public static JSONObject getQrCode(String appId){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        return OkhttpUtil.postJSON("/personal/getQrCode",param);
    }

    /**
     * 获取设备记录
     */
    public static JSONObject getSafetyInfo(String appId){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        return OkhttpUtil.postJSON("/personal/getSafetyInfo",param);
    }

    /**
     * 隐私设置
     */
    public static JSONObject privacySettings(String appId,Integer option,boolean open){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("option",option);
        param.put("open",open);
        return OkhttpUtil.postJSON("/personal/privacySettings",param);
    }

    /**
     * 修改个人信息
     */
    public static JSONObject updateProfile(String appId,String city,String country,String nickName,String province,String sex,String signature){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("city",city);
        param.put("country",country);
        param.put("nickName",nickName);
        param.put("province",province);
        param.put("sex",sex);
        param.put("signature",signature);
        return OkhttpUtil.postJSON("/personal/updateProfile",param);
    }

    /**
     * 修改头像
     */
    public static JSONObject updateHeadImg(String appId,String headImgUrl){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("headImgUrl",headImgUrl);
        return OkhttpUtil.postJSON("/personal/updateHeadImg",param);
    }

}

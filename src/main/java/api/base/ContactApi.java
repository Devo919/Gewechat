package api.base;

import com.alibaba.fastjson2.JSONObject;
import util.OkhttpUtil;

import java.util.Arrays;
import java.util.List;

/**
 * 联系人模块
 */
public class ContactApi {

    private static String appId = "wx_BTVoJ_o_r6DpxNCNiycFE";

    /**
     *
     * @param appId
     * @return
     */
    public static JSONObject a(String appId){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        return OkhttpUtil.postJSON("/login/checkOnline",param);
    }

    /**
     * 获取通讯录列表
     * @param appId
     * @return
     */
    public static JSONObject fetchContactsList(String appId){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        return OkhttpUtil.postJSON("/contacts/fetchContactsList",param);
    }

    /**
     * 获取群/好友简要信息
     * @param appId
     * @return
     */
    public static JSONObject getBriefInfo(String appId, List<String> wxids){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("wxids",wxids);
        return OkhttpUtil.postJSON("/contacts/getBriefInfo",param);
    }

    /**
     * 获取群/好友详细信息
     * @param appId
     * @return
     */
    public static JSONObject getDetailInfo(String appId, List<String> wxids){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("wxids",wxids);
        return OkhttpUtil.postJSON("/contacts/getDetailInfo",param);
    }

    /**
     * 搜索好友
     * @param appId
     * @return
     */
    public static JSONObject search(String appId,String contactsInfo){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("contactsInfo",contactsInfo);
        return OkhttpUtil.postJSON("/contacts/search",param);
    }

    /**
     * 添加联系人/同意添加好友
     * @param appId
     * @return
     */
    public static JSONObject search(String appId,Integer scene,Integer option,String v3, String v4,String content){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("scene",scene);
        param.put("option",option);
        param.put("v3",v3);
        param.put("v4",v4);
        param.put("content",content);
        return OkhttpUtil.postJSON("/contacts/addContacts",param);
    }

    /**
     * 删除好友
     * @param appId
     * @return
     */
    public static JSONObject deleteFriend(String appId,String wxid){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("wxid",wxid);
        return OkhttpUtil.postJSON("/contacts/deleteFriend",param);
    }

    /**
     * 设置好友仅聊天
     * @param appId
     * @return
     */
    public static JSONObject setFriendPermissions(String appId,String wxid,Boolean onlyChat){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("wxid",wxid);
        param.put("onlyChat",onlyChat);
        return OkhttpUtil.postJSON("/contacts/setFriendPermissions",param);
    }

    /**
     * 设置好友备注
     * @param appId
     * @return
     */
    public static JSONObject setFriendRemark(String appId,String wxid,String remark){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("wxid",wxid);
        param.put("onlyChat",remark);
        return OkhttpUtil.postJSON("/contacts/setFriendRemark",param);
    }

    /**
     * 获取手机通讯录
     * @param appId
     * @return
     */
    public static JSONObject getPhoneAddressList(String appId,List<String> phones){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("wxid",phones);
        return OkhttpUtil.postJSON("/contacts/getPhoneAddressList",param);
    }

    /**
     * 上传手机通讯录
     * @param appId
     * @return
     */
    public static JSONObject uploadPhoneAddressList(String appId,List<String> phones,Integer opType){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("wxid",phones);
        param.put("opType",opType);
        return OkhttpUtil.postJSON("/contacts/uploadPhoneAddressList",param);
    }

}

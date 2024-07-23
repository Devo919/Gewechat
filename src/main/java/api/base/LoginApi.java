package api.base;

import com.alibaba.fastjson2.JSONObject;
import util.OkhttpUtil;

/**
 * 登录模块
 */
public class LoginApi {


    /**
     * 获取tokenId 将tokenId 配置到OkhttpUtil 类中的token 属性
     *
     * @return
     */
    public static JSONObject getToken() {
        return OkhttpUtil.postJSON("/tools/getTokenId", new JSONObject());
    }

    /**
     * 设置微信消息的回调地址
     *
     * @return
     */
    public static JSONObject setCallback(String token,String callbackUrl) {
        JSONObject param = new JSONObject();
        param.put("token",token);
        param.put("callbackUrl",callbackUrl);
        return OkhttpUtil.postJSON("/tools/setCallback", param);
    }

    /**
     * 获取登录二维码
     *
     * @param appId   设备id 首次登录传空，后续登录传返回的appid
     * @return
     */
    public static JSONObject getQr(String appId) {
        JSONObject param = new JSONObject();
        param.put("appId", appId);
        return OkhttpUtil.postJSON("/login/getLoginQrCode", param);
    }

    /**
     * 确认登陆
     *
     * @param appId
     * @param uuid       取码返回的uuid
     * @param captchCode 登录验证码（跨省登录会出现此提示，使用同省代理ip能避免此问题，也能使账号更加稳定）
     * @return
     */
    public static JSONObject checkQr(String appId, String uuid, String captchCode) {
        JSONObject param = new JSONObject();
        param.put("appId", appId);
        param.put("uuid", uuid);
        param.put("captchCode", captchCode);
        return OkhttpUtil.postJSON("/login/checkLogin", param);
    }

    /**
     * 退出微信
     *
     * @param appId
     * @return
     */
    public static JSONObject logOut(String appId) {
        JSONObject param = new JSONObject();
        param.put("appId", appId);
        return OkhttpUtil.postJSON("/login/logout", param);
    }

    /**
     * 弹框登录
     *
     * @param appId
     * @return
     */
    public static JSONObject dialogLogin(String appId) {
        JSONObject param = new JSONObject();
        param.put("appId", appId);
        return OkhttpUtil.postJSON("/login/dialogLogin", param);
    }

    /**
     * 检查是否在线
     *
     * @param appId
     * @return
     */
    public static JSONObject checkOnline(String appId) {
        JSONObject param = new JSONObject();
        param.put("appId", appId);
        return OkhttpUtil.postJSON("/login/checkOnline", param);
    }

    /**
     * 退出
     *
     * @param appId
     * @return
     */
    public static JSONObject logout(String appId) {
        JSONObject param = new JSONObject();
        param.put("appId", appId);
        return OkhttpUtil.postJSON("/login/logout", param);
    }

}

package api.base;

import com.alibaba.fastjson2.JSONObject;
import util.OkhttpUtil;

import java.util.List;

/**
 * 标签模块
 */
public class LabelApi {

    /**
     * 添加标签
     */
    public static JSONObject add(String appId, String labelName) {
        JSONObject param = new JSONObject();
        param.put("appId", appId);
        param.put("labelName", labelName);
        return OkhttpUtil.postJSON("/label/add", param);
    }

    /**
     * 删除标签
     */
    public static JSONObject delete(String appId, String labelIds) {
        JSONObject param = new JSONObject();
        param.put("appId", appId);
        param.put("labelIds", labelIds);
        return OkhttpUtil.postJSON("/label/delete", param);
    }

    /**
     * 添加标签
     */
    public static JSONObject list(String appId) {
        JSONObject param = new JSONObject();
        param.put("appId", appId);
        return OkhttpUtil.postJSON("/label/list", param);
    }

    /**
     * 添加标签
     */
    public static JSONObject modifyMemberList(String appId, String labelIds, List<String> wxIds) {
        JSONObject param = new JSONObject();
        param.put("appId", appId);
        param.put("labelIds", labelIds);
        param.put("wxIds", wxIds);
        return OkhttpUtil.postJSON("/label/modifyMemberList", param);
    }

}

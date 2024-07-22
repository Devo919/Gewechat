package api.base;

import com.alibaba.fastjson2.JSONObject;
import util.OkhttpUtil;

/**
 * 消息模块
 */
public class MessageApi {

    /**
     * 发送文字消息
     */
    public static JSONObject postText(String appId, String toWxid, String content, String ats) {
        JSONObject param = new JSONObject();
        param.put("appId", appId);
        param.put("toWxid", toWxid);
        param.put("content", content);
        param.put("ats", ats);
        return OkhttpUtil.postJSON("/message/postText", param);
    }

    /**
     * 发送文件消息
     */
    public static JSONObject postFile(String appId, String toWxid, String fileUrl, String fileName) {
        JSONObject param = new JSONObject();
        param.put("appId", appId);
        param.put("toWxid", toWxid);
        param.put("fileUrl", fileUrl);
        param.put("fileName", fileName);
        return OkhttpUtil.postJSON("/message/postFile", param);
    }

    /**
     * 发送图片消息
     */
    public static JSONObject postImage(String appId, String toWxid, String imgUrl) {
        JSONObject param = new JSONObject();
        param.put("appId", appId);
        param.put("toWxid", toWxid);
        param.put("imgUrl", imgUrl);
        return OkhttpUtil.postJSON("/message/postImage", param);
    }

    /**
     * 发送语音消息
     */
    public static JSONObject postVoice(String appId, String toWxid, String voiceUrl, Integer voiceDuration) {
        JSONObject param = new JSONObject();
        param.put("appId", appId);
        param.put("toWxid", toWxid);
        param.put("voiceUrl", voiceUrl);
        param.put("voiceDuration", voiceDuration);
        return OkhttpUtil.postJSON("/message/postVoice", param);
    }

    /**
     * 发送视频消息
     */
    public static JSONObject postVideo(String appId, String toWxid, String videoUrl, String thumbUrl,Integer videoDuration) {
        JSONObject param = new JSONObject();
        param.put("appId", appId);
        param.put("toWxid", toWxid);
        param.put("videoUrl", videoUrl);
        param.put("thumbUrl", thumbUrl);
        param.put("videoDuration", videoDuration);
        return OkhttpUtil.postJSON("/message/postVideo", param);
    }

    /**
     * 发送链接消息
     */
    public static JSONObject postLink(String appId, String toWxid, String title, String desc, String linkUrl, String thumbUrl) {
        JSONObject param = new JSONObject();
        param.put("appId", appId);
        param.put("toWxid", toWxid);
        param.put("title", title);
        param.put("desc", desc);
        param.put("linkUrl", linkUrl);
        param.put("thumbUrl", thumbUrl);
        return OkhttpUtil.postJSON("/message/postLink", param);
    }

    /**
     * 发送名片消息
     */
    public static JSONObject postNameCard(String appId, String toWxid, String nickName, String nameCardWxid) {
        JSONObject param = new JSONObject();
        param.put("appId", appId);
        param.put("toWxid", toWxid);
        param.put("nickName", nickName);
        param.put("nameCardWxid", nameCardWxid);
        return OkhttpUtil.postJSON("/message/postNameCard", param);
    }

    /**
     * 发送emoji消息
     */
    public static JSONObject postEmoji(String appId, String toWxid, String emojiMd5, String emojiSize) {
        JSONObject param = new JSONObject();
        param.put("appId", appId);
        param.put("toWxid", toWxid);
        param.put("emojiMd5", emojiMd5);
        param.put("emojiSize", emojiSize);
        return OkhttpUtil.postJSON("/message/postEmoji", param);
    }

    /**
     * 发送appmsg消息
     */
    public static JSONObject postAppMsg(String appId, String toWxid, String appmsg) {
        JSONObject param = new JSONObject();
        param.put("appId", appId);
        param.put("toWxid", toWxid);
        param.put("appmsg", appmsg);
        return OkhttpUtil.postJSON("/message/postAppMsg", param);
    }

    /**
     * 发送小程序消息
     */
    public static JSONObject postMiniApp(String appId, String toWxid, String miniAppId, String displayName, String pagePath, String coverImgUrl, String title, String userName) {
        JSONObject param = new JSONObject();
        param.put("appId", appId);
        param.put("toWxid", toWxid);
        param.put("miniAppId", miniAppId);
        param.put("displayName", displayName);
        param.put("pagePath", pagePath);
        param.put("coverImgUrl", coverImgUrl);
        param.put("title", title);
        param.put("userName", userName);
        return OkhttpUtil.postJSON("/message/postMiniApp", param);
    }

    /**
     * 转发文件
     */
    public static JSONObject forwardFile(String appId, String toWxid, String xml) {
        JSONObject param = new JSONObject();
        param.put("appId", appId);
        param.put("toWxid", toWxid);
        param.put("xml", xml);
        return OkhttpUtil.postJSON("/message/forwardFile", param);
    }

    /**
     * 转发图片
     */
    public static JSONObject forwardImage(String appId, String toWxid, String xml) {
        JSONObject param = new JSONObject();
        param.put("appId", appId);
        param.put("toWxid", toWxid);
        param.put("xml", xml);
        return OkhttpUtil.postJSON("/message/forwardImage", param);
    }

    /**
     * 转发视频
     */
    public static JSONObject forwardVideo(String appId, String toWxid, String xml) {
        JSONObject param = new JSONObject();
        param.put("appId", appId);
        param.put("toWxid", toWxid);
        param.put("xml", xml);
        return OkhttpUtil.postJSON("/message/forwardVideo", param);
    }

    /**
     * 转发链接
     */
    public static JSONObject forwardUrl(String appId, String toWxid, String xml) {
        JSONObject param = new JSONObject();
        param.put("appId", appId);
        param.put("toWxid", toWxid);
        param.put("xml", xml);
        return OkhttpUtil.postJSON("/message/forwardUrl", param);
    }

    /**
     * 转发小程序
     */
    public static JSONObject forwardMiniApp(String appId, String toWxid, String xml, String coverImgUrl) {
        JSONObject param = new JSONObject();
        param.put("appId", appId);
        param.put("toWxid", toWxid);
        param.put("xml", xml);
        param.put("coverImgUrl", coverImgUrl);
        return OkhttpUtil.postJSON("/message/forwardMiniApp", param);
    }

    /**
     * 撤回消息
     */
    public static JSONObject revokeMsg(String appId, String toWxid, String msgId, String newMsgId,String createTime) {
        JSONObject param = new JSONObject();
        param.put("appId", appId);
        param.put("toWxid", toWxid);
        param.put("msgId", msgId);
        param.put("newMsgId", newMsgId);
        param.put("createTime", createTime);
        return OkhttpUtil.postJSON("/message/revokeMsg", param);
    }

}

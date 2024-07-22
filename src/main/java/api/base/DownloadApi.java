package api.base;

import com.alibaba.fastjson2.JSONObject;
import util.OkhttpUtil;

/**
 * 下载模块
 */
public class DownloadApi {

    /**
     * 下载图片
     */
    public static JSONObject downloadImage(String appId, String xml, Integer type){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("xml",xml);
        param.put("type",type);
        return OkhttpUtil.postJSON("/message/downloadImage",param);
    }

    /**
     * 下载语音
     */
    public static JSONObject downloadVoice(String appId, String xml, Long msgId){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("xml",xml);
        param.put("msgId",msgId);
        return OkhttpUtil.postJSON("/message/downloadVoice",param);
    }

    /**
     * 下载视频
     */
    public static JSONObject downloadVideo(String appId, String xml){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("xml",xml);
        return OkhttpUtil.postJSON("/message/downloadVideo",param);
    }

    /**
     * 下载emoji
     */
    public static JSONObject downloadEmojiMd5(String appId, String emojiMd5){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("emojiMd5",emojiMd5);
        return OkhttpUtil.postJSON("/message/downloadEmojiMd5",param);
    }
    /**
     * cdn下载
     */
    public static JSONObject downloadImage(String appId, String aesKey, String fileId, String type, String totalSize, String suffix){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("aesKey",aesKey);
        param.put("fileId",fileId);
        param.put("totalSize",totalSize);
        param.put("type",type);
        param.put("suffix",suffix);
        return OkhttpUtil.postJSON("/message/downloadCdn",param);
    }


}

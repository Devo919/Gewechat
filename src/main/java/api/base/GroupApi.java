package api.base;

import com.alibaba.fastjson2.JSONObject;
import util.OkhttpUtil;

import java.util.List;

/**
 * 群模块
 */
public class GroupApi {

    /**
     * 创建微信群
     * @param appId
     * @return
     */
    public static JSONObject createChatroom(String appId, List<String> wxids){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("wxid",wxids);
        return OkhttpUtil.postJSON("/group/createChatroom",param);
    }

    /**
     * 修改群名称
     * @param appId
     * @return
     */
    public static JSONObject modifyChatroomName(String appId, String chatroomName,String chatroomId){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("chatroomName",chatroomName);
        param.put("chatroomId",chatroomId);
        return OkhttpUtil.postJSON("/group/modifyChatroomName",param);
    }

    /**
     * 修改群备注
     * @param appId
     * @return
     */
    public static JSONObject modifyChatroomRemark(String appId, String chatroomRemark,String chatroomId){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("chatroomRemark",chatroomRemark);
        param.put("chatroomId",chatroomId);
        return OkhttpUtil.postJSON("/group/modifyChatroomRemark",param);
    }

    /**
     * 修改我在群内的昵称
     * @param appId
     * @return
     */
    public static JSONObject modifyChatroomNickNameForSelf(String appId, String nickName,String chatroomId){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("nickName",nickName);
        param.put("chatroomId",chatroomId);
        return OkhttpUtil.postJSON("/group/modifyChatroomNickNameForSelf",param);
    }

    /**
     * 邀请/添加 进群
     * @param appId
     * @return
     */
    public static JSONObject inviteMember(String appId, List<String> wxids,String chatroomId, String reason){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("wxids",wxids);
        param.put("reason",reason);
        param.put("chatroomId",chatroomId);
        return OkhttpUtil.postJSON("/group/inviteMember",param);
    }

    /**
     * 删除群成员
     * @param appId
     * @return
     */
    public static JSONObject removeMember(String appId, List<String> wxids,String chatroomId){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("wxids",wxids);
        param.put("chatroomId",chatroomId);
        return OkhttpUtil.postJSON("/group/removeMember",param);
    }

    /**
     * 退出群聊
     * @param appId
     * @return
     */
    public static JSONObject modifyChatroomName(String appId,String chatroomId){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("chatroomId",chatroomId);
        return OkhttpUtil.postJSON("/group/quitChatroom",param);
    }

    /**
     * 解散群聊
     * @param appId
     * @return
     */
    public static JSONObject disbandChatroom(String appId,String chatroomId){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("chatroomId",chatroomId);
        return OkhttpUtil.postJSON("/group/disbandChatroom",param);
    }

    /**
     * 获取群信息
     * @param appId
     * @return
     */
    public static JSONObject getChatroomInfo(String appId,String chatroomId){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("chatroomId",chatroomId);
        return OkhttpUtil.postJSON("/group/getChatroomInfo",param);
    }

    /**
     * 获取群成员列表
     * @param appId
     * @return
     */
    public static JSONObject getChatroomMemberList(String appId,String chatroomId){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("chatroomId",chatroomId);
        return OkhttpUtil.postJSON("/group/getChatroomMemberList",param);
    }

    /**
     * 获取群成员详情
     * @param appId
     * @return
     */
    public static JSONObject getChatroomMemberDetail(String appId,String chatroomId,List<String> memberWxids){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("memberWxids",memberWxids);
        param.put("chatroomId",chatroomId);
        return OkhttpUtil.postJSON("/group/getChatroomMemberDetail",param);
    }

    /**
     * 获取群公告
     * @param appId
     * @return
     */
    public static JSONObject getChatroomAnnouncement(String appId,String chatroomId){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("chatroomId",chatroomId);
        return OkhttpUtil.postJSON("/group/getChatroomAnnouncement",param);
    }

    /**
     * 设置群公告
     * @param appId
     * @return
     */
    public static JSONObject setChatroomAnnouncement(String appId,String chatroomId, String content){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("chatroomId",chatroomId);
        param.put("content",content);
        return OkhttpUtil.postJSON("/group/setChatroomAnnouncement",param);
    }

    /**
     * 同意进群
     * @param appId
     * @return
     */
    public static JSONObject agreeJoinRoom(String appId, String url){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("chatroomName",url);
        return OkhttpUtil.postJSON("/group/agreeJoinRoom",param);
    }

    /**
     * 添加群成员为好友
     * @param appId
     * @return
     */
    public static JSONObject addGroupMemberAsFriend(String appId, String memberWxid,String chatroomId,String content){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("memberWxid",memberWxid);
        param.put("content",content);
        param.put("chatroomId",chatroomId);
        return OkhttpUtil.postJSON("/group/addGroupMemberAsFriend",param);
    }

    /**
     * 获取群二维码
     * @param appId
     * @return
     */
    public static JSONObject getChatroomQrCode(String appId,String chatroomId){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("chatroomId",chatroomId);
        return OkhttpUtil.postJSON("/group/getChatroomQrCode",param);
    }

    /**
     * 群保存到通讯录
     * @param appId
     * @return
     */
    public static JSONObject saveContractList(String appId, Integer operType,String chatroomId){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("chatroomName",operType);
        param.put("chatroomId",chatroomId);
        return OkhttpUtil.postJSON("/group/saveContractList",param);
    }

    /**
     * 管理员操作
     * @param appId
     * @return
     */
    public static JSONObject adminOperate(String appId,String chatroomId,List<String> wxids,Integer operType){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("wxids",wxids);
        param.put("operType",operType);
        param.put("chatroomId",chatroomId);
        return OkhttpUtil.postJSON("/group/adminOperate",param);
    }

    /**
     * 聊天置顶
     * @param appId
     * @return
     */
    public static JSONObject pinChat(String appId, boolean top,String chatroomId){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("top",top);
        param.put("chatroomId",chatroomId);
        return OkhttpUtil.postJSON("/group/pinChat",param);
    }

    /**
     * 设置消息免打扰
     * @param appId
     * @return
     */
    public static JSONObject setMsgSilence(String appId, boolean silence,String chatroomId){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("silence",silence);
        param.put("chatroomId",chatroomId);
        return OkhttpUtil.postJSON("/group/setMsgSilence",param);
    }

    /**
     * 扫码进群
     * @param appId
     * @return
     */
    public static JSONObject joinRoomUsingQRCode(String appId, String qrUrl){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("qrUrl",qrUrl);
        return OkhttpUtil.postJSON("/group/joinRoomUsingQRCode",param);
    }

    /**
     * 确认进群申请
     * @param appId
     * @return
     */
    public static JSONObject roomAccessApplyCheckApprove(String appId, String newMsgId,String chatroomId, String msgContent){
        JSONObject param = new JSONObject();
        param.put("appId",appId);
        param.put("newMsgId",newMsgId);
        param.put("msgContent",msgContent);
        param.put("chatroomId",chatroomId);
        return OkhttpUtil.postJSON("/group/roomAccessApplyCheckApprove",param);
    }

}

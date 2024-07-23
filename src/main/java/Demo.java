import api.base.MessageApi;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Demo {


    /**
     * 群发测试
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        String appid = "";
        List<String> toWxids = Arrays.asList("39002402513@chatroom", "24099789585@chatroom", "52873617987@chatroom");
        for (String toWxid : toWxids) {
            MessageApi.postText(appid,toWxid,"test","");
            int i = new Random().nextInt(6);
            Thread.sleep(i*1000);
        }
    }

}

package com.rabbit.fsh.api.conf;

import org.cxytiandi.conf.client.annotation.ConfField;
import org.cxytiandi.conf.client.annotation.CxytianDiConf;

/**
 * @Author chentao
 * Date 2019/3/28
 * Description 基础配置信息
 **/
@CxytianDiConf(system = "rabbit-fsh-api")
public class BasicConf {

    @ConfField("IP黑名单，多个用逗号分隔")
    private String ipStr = "default";

    @ConfField("降级的服务ID，多个用逗号分隔")
    private String downGradeServiceStr = "default";

    @ConfField("灰度发布的服务信息，ip:port，多个用逗号分隔")
    private String grayPushServers = "default";

    @ConfField("灰度发布的用户ID信息，多个用逗号分隔")
    private String grayPushUsers = "default";

    @ConfField("API接口白名单，多个用逗号分隔")
    private String apiWhiteStr = "default";

    public String getIpStr() {
        return ipStr;
    }

    public void setIpStr(String ipStr) {
        this.ipStr = ipStr;
    }

    public String getDownGradeServiceStr() {
        return downGradeServiceStr;
    }

    public void setDownGradeServiceStr(String downGradeServiceStr) {
        this.downGradeServiceStr = downGradeServiceStr;
    }

    public String getGrayPushServers() {
        return grayPushServers;
    }

    public void setGrayPushServers(String grayPushServers) {
        this.grayPushServers = grayPushServers;
    }

    public String getGrayPushUsers() {
        return grayPushUsers;
    }

    public void setGrayPushUsers(String grayPushUsers) {
        this.grayPushUsers = grayPushUsers;
    }

    public String getApiWhiteStr() {
        return apiWhiteStr;
    }

    public void setApiWhiteStr(String apiWhiteStr) {
        this.apiWhiteStr = apiWhiteStr;
    }
}


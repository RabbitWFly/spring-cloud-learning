package com.rabbit.common.util;


import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @Author chentao
 * Date 2019/3/26
 * Description
 **/
public class NetUtils {

    /***
     *  true:already in using  false:not using
     * @param port
     */
    public static boolean isLoclePortUsing(int port){
        boolean flag = true;
        try {
            flag = isPortUsing("127.0.0.1", port);
        } catch (Exception e) {
        }
        return flag;
    }
    /***
     *  true:already in using  false:not using
     * @param host
     * @param port
     * @throws UnknownHostException
     */
    public static boolean isPortUsing(String host,int port) {
        boolean flag = false;
        try {
            InetAddress theAddress = InetAddress.getByName(host);
            Socket socket = new Socket(theAddress,port);
            flag = true;
        } catch (Exception e) {

        }
        return flag;
    }

}


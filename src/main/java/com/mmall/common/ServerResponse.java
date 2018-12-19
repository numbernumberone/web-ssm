package com.mmall.common;

import java.io.Serializable;


/**
 *
 *
 * 实现序列化接口
 *
 * */

public class ServerResponse<T> implements Serializable {

    private int status;
    private String msg;
    private T data;

    private ServerResponse(int status){
        this.status = status;
    }
    private ServerResponse(int status, T data){
        this.status = status;
        this.data = data;
    }
    private ServerResponse(int status, String msg){
        this.status = status;
        this.msg = msg;
    }
    public boolean isSuccess(){
        return this.status ==0;
    }

//    public static void main(String[] args) {
//        ServerResponse sr1 = new ServerResponse(1,new Object());
//        ServerResponse sr2 = new ServerResponse(1,"abc");
//        System.out.println("console");
//    }
}

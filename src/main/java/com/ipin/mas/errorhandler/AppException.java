package com.ipin.mas.errorhandler;

/**
 * Created by janze on 3/14/18.
 */
public class AppException extends Throwable{


    private String error;
    private int error_code;


    public AppException(int error_code, String error){
        this.error_code = error_code;
        this.error = error;
    }
    public String getError() {
        return error;
    }

    public int getError_code() {
        return error_code;
    }

    @Override
    public String toString() {
        return "{" +
                "error='" + error + '\'' +
                ", error_code=" + error_code +
                '}';
    }
}

package com.gjl.core.common;


import java.io.Serializable;
import java.util.Map;

/**
 * 结果对象
 *
 * @author gjl gjlping@163.com
 */
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编码
     */
    private int code;

    /**
     * 是否操作成功
     */
    private boolean success;

    /**
     * 提示信息
     */
    private String message;

    /**
     * 返回结果
     */
    private T result;

    public Result() {
        this(CommonConstant.ONE, null, null, null);
    }

    public Result(int code) {
        this(code, null, null, null);
    }

    public Result(int code, Map<String, String> params) {
        this(code, params, null, null);
    }

    public Result(int code, T result) {
        this(code, null, null, result);
    }

    public Result(int code, Map<String, String> params, T result) {
        this(code, params, null, result);
    }

    public Result(int code, String message, T result) {
        this(code, null, message, result);
    }

    public Result(boolean isSuccess, String message, T result) {
        this((isSuccess ? CommonConstant.ONE : CommonConstant.ZERO), null, message, result);
    }

    public Result(int code, Map<String, String> params, String message, T result) {
        this.setCode(code);
        //解析message如果包含_
        if(message != null){
            if(message.indexOf(CommonConstant.UNDERLINE) > -1){
                String [] messages = message.split(CommonConstant.UNDERLINE);
                this.code = Integer.valueOf(messages[0]);
                this.message = message.substring(message.indexOf(CommonConstant.UNDERLINE) + 1,message.length());
            }else{
                this.message = message;
            }
        }
        this.result = result;
    }

    /**
     * 新建结果对象
     *
     * @param isSuccess
     * @return
     */
    public static <T> Result<T> newResult(boolean isSuccess) {
        return new Result<T>(isSuccess, null, null);
    }

    /**
     * 新建结果对象
     *
     * @param code
     * @param result
     * @return
     */
    public static <T> Result<T> newResult(int code, T result) {
        return new Result<T>(code, result);
    }

    /**
     * 新建结果对象
     *
     * @param code
     * @param params
     * @return
     */
    public static <T> Result<T> newResult(int code, Map<String, String> params) {
        return new Result<T>(code, params, null);
    }

    /**
     * 新建结果对象
     *
     * @param code
     * @param params
     * @param result
     * @return
     */
    public static <T> Result<T> newResult(int code, Map<String, String> params, T result) {
        return new Result<T>(code, params, result);
    }

    /**
     * 新建结果对象
     *
     * @param code
     * @param message
     * @param result
     * @return
     */
    public static <T> Result<T> newResult(int code, String message, T result) {
        return new Result<T>(code, message, result);
    }

    /**
     * 新建结果对象
     *
     * @param isSuccess
     * @param message
     * @param result
     * @return
     */
    public static <T> Result<T> newResult(boolean isSuccess, String message, T result) {
        return new Result<T>(isSuccess, message, result);
    }

    /**
     * 新建成功结果对象
     *
     * @return
     */
    public static <T> Result<T> newSuccessResult() {
        return newResult(true, null, null);
    }

    /**
     * 新建成功结果对象
     *
     * @param result
     * @return
     */
    public static <T> Result<T> newSuccessResult(T result) {
        return newResult(true, null, result);
    }

    /**
     * 新建失败结果对象
     *
     * @return
     */
    public static <T> Result<T> newFailureResult() {
        return new Result<T>(CommonConstant.ZERO, null, null, null);
    }

    /**
     * 新建失败结果对象
     *
     * @param code
     * @return
     */
    public static <T> Result<T> newFailureResult(int code) {
        return new Result<T>(code, null, null, null);
    }

    /**
     * 新建失败结果对象
     *
     * @param code 编码
     * @param t    返回对象
     * @return
     */
    public static <T> Result<T> newFailureResult(int code, T t) {
        return new Result<>(code, null, null, t);
    }

    /**
     * 新建失败结果对象
     *
     * @param code    编码
     * @param message 提示信息
     * @param t       返回对象
     * @return
     */
    public static <T> Result<T> newFailureResult(int code, String message, T t) {
        return new Result<>(code, null, message, t);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
        this.success = CommonConstant.ONE == code;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean hasFail() {
        return !success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

}

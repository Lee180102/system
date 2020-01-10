package com.sys.system.vo;

/**
 * @author ：lijie
 * @date ：Created in 2020/1/9 10:52
 */
public class CommonResult<T> {

    private Long code;
    private String message;
    private T data;

    public CommonResult() {
    }

    public CommonResult(Long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }


    /**
     * @Description: 返回成功结果集
     * @Name: success
     * @Param: [data 获取的数据]
     * @create: 2020/1/9 14:36
     * @return: com.sys.system.vo.CommonResult<T>
     */ 
    public static <T> CommonResult<T> success(T data){
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMessage(),data);
    }


    /**
     * @Description: 返回成功结果
     * @Name: success
     * @Param: [data 获取的数据, message 提示信息]
     * @create: 2020/1/9 14:38
     * @return: com.sys.system.vo.CommonResult<T>
     */
    public static <T> CommonResult<T> success(T data,String message){
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(), message, data);
    }

    /**
     * @Description: 返回失败结果集
     * @Name: failed
     * @Param: [errorCode 错误码]
     * @create: 2020/1/9 14:40
     * @return: com.sys.system.vo.CommonResult<T>
     */
    public static <T> CommonResult<T> failed(IErrorCode errorCode) {
        return new CommonResult<T>(errorCode.getCode(), errorCode.getMessage(), null);
    }

    /**
     * @Description: 返回错误结果
     * @Name: failed
     * @Param: [message 错误提示信息]
     * @create: 2020/1/9 14:40
     * @return: com.sys.system.vo.CommonResult<T>
     */
    public static <T> CommonResult<T> failed(String message) {
        return new CommonResult<T>(ResultCode.FAILED.getCode(), message, null);
    }

    /**
     * @Description: 返回错误结果
     * @Name: failed
     * @Param: []
     * @create: 2020/1/9 14:41
     * @return: com.sys.system.vo.CommonResult<T>
     */ 
    public static <T> CommonResult<T> failed() {
        return failed(ResultCode.FAILED);
    }
    

    /**
     * @Description: 参数验证失败返回结果
     * @Name: validateFailed
     * @Param: [] 
     * @create: 2020/1/9 14:43
     * @return: com.sys.system.vo.CommonResult<T>
     */ 
    public static <T> CommonResult<T> validateFailed() {
        return failed(ResultCode.VALIDATE_FAILED);
    }

    /**
     * @Description: 参数印证失败返回结果
     * @Name: validateFailed
     * @Param: [message 提示信息]
     * @create: 2020/1/9 14:43
     * @return: com.sys.system.vo.CommonResult<T>
     */
    public static <T> CommonResult<T> validateFailed(String message) {
        return new CommonResult<T>(ResultCode.VALIDATE_FAILED.getCode(), message, null);
    }

    /**
     * @Description: 未登录返回结果
     * @Name: unauthorized
     * @Param: [data 获取数据]
     * @create: 2020/1/9 14:44
     * @return: com.sys.system.vo.CommonResult<T>
     */
    public static <T> CommonResult<T> unauthorized(T data) {
        return new CommonResult<T>(ResultCode.UNAUTHORIZED.getCode(), ResultCode.UNAUTHORIZED.getMessage(), data);
    }

    /**
     * @Description: 为授权返回结果集
     * @Name: forbidden
     * @Param: [data 获取的数据]
     * @create: 2020/1/9 14:45
     * @return: com.sys.system.vo.CommonResult<T>
     */
    public static <T> CommonResult<T> forbidden(T data) {
        return new CommonResult<T>(ResultCode.FORBIDDEN.getCode(), ResultCode.FORBIDDEN.getMessage(), data);
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }



}

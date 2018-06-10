package com.nimble.base.constants.responseCode;

/**
 * system error level response code
 * example ： TYPE_00_??
 * reference to Response interface comment
 */
public enum FrameResponseCode implements ResponseCodeInterface {

    // ************* 00 *************
    ERR_00_FRAME_ERROR("底层框架错误！");






    // ******************************
    private String description;

    FrameResponseCode(String description) {
        this.description = description;
    }

    public String getCode(){
        return this.name();
    }

    public String getDescription() {
        return this.description;
    }

    public String toString(){
        return "[ " + this.getCode() + " ] : " + this.getDescription();
    }
}

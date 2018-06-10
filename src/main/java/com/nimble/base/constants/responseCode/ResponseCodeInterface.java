package com.nimble.base.constants.responseCode;

/**
 * ResponseCode interface
 * example ： TYPE_CLASSIFY_??
 * [TYPE]
 * *  ERR
 * *  MSG
 * [CLASSIFY]
 * *  00 : system
 * *  01 : user
 */
public interface ResponseCodeInterface {

    String getCode();

    String getDescription();

}

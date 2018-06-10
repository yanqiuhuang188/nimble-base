package com.nimble.common.constants;
import com.nimble.base.constants.responseCode.FrameResponseCode;
import com.nimble.base.exception.BaseException;
import org.junit.Test;

public class ResponseCodeTest {
    @Test
    public void getCode() throws Exception {
        try {
            throw new BaseException(FrameResponseCode.ERR_00_FRAME_ERROR, null);
        }catch (Exception ex){
            ex.printStackTrace();
        }
}

    @Test
    public void getDescription() throws Exception {
    }

}
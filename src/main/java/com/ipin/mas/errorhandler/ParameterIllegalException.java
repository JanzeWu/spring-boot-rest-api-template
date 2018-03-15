package com.ipin.mas.errorhandler;

import com.ipin.mas.consts.ErrorCode;

/**
 * Created by janze on 3/15/18.
 */
public class ParameterIllegalException extends AppException {

    public ParameterIllegalException(){
        super(ErrorCode.PARAM_ILLEGAL.getCode(), ErrorCode.PARAM_ILLEGAL.getDescription());
    }
}

package com.ipin.mas.errorhandler;

import com.ipin.mas.consts.ErrorCode;

/**
 * Created by janze on 3/15/18.
 */
public class ParameterMissingException extends AppException {

    public ParameterMissingException(){
        super(ErrorCode.PARAM_REQUIRE.getCode(), ErrorCode.PARAM_REQUIRE.getDescription());
    }

}

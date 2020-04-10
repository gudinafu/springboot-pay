package com.imooc.handler;


import com.imooc.config.ProjectUrlConfig;
import com.imooc.exception.ResponseBankException;
import com.imooc.exception.SellException;
import com.imooc.exception.SellerAuthorizeException;
import com.imooc.utils.ResultVOUtil;
import com.imooc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;


@ControllerAdvice
public class SellExceptionHandler {

    @Autowired
    private ProjectUrlConfig projectUrlConfig;

    //拦截登录异常
    //http://pay.natapp4.cc/sell/wechat/qrAuthorize?returnUrl=http://pay.natapp4.cc/sell/seller/login
    @ExceptionHandler(value = SellerAuthorizeException.class)
    public ModelAndView handlerAuthorizeException() {
        return new ModelAndView("redirect:"
                .concat("https://open.weixin.qq.com/connect/qrconnect?appid=wx6ad144e54af67d87&redirect_uri=http://sell.springboot.cn/sell/qr/oTgZpwUxcOEvEAneCqy_2Ds3Do38&response_type=code&scope=snsapi_login&state=http://pay.natapp4.cc/sell/wechat/qrUserInfo"));
    }

    @ExceptionHandler(value = SellException.class)
    @ResponseBody
    public ResultVO handlerSellerException(SellException e) {
        return ResultVOUtil.error(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(value = ResponseBankException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public void handleResponseBankException() {

    }
}

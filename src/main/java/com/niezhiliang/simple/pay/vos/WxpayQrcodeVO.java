package com.niezhiliang.simple.pay.vos;

import com.github.binarywang.wxpay.bean.result.BaseWxPayResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author NieZhiLiang
 * @Email nzlsgg@163.com
 * @Date 2019/4/29 下午4:17
 */
@XStreamAlias("xml")
@Data
public class WxpayQrcodeVO extends BaseWxPayResult implements Serializable {

    /**
     * 预支付交易会话标识
     */
    @XStreamAlias("prepay_id")
    private String prepayId;

    /**
     * 交易类型
     */
    @XStreamAlias("trade_type")
    private String tradeType;

    /**
     * 二维码链接
     */
    @XStreamAlias("code_url")
    private String codeUrl;
}

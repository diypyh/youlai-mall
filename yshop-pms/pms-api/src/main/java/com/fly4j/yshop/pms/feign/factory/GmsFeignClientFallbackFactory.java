package com.fly4j.yshop.pms.feign.factory;

import com.fly4j.yshop.pms.feign.GmsFeignClient;
import feign.hystrix.FallbackFactory;

public class GmsFeignClientFallbackFactory implements FallbackFactory<GmsFeignClient> {


    @Override
    public GmsFeignClient create(Throwable throwable) {
        return new GmsFeignClient() {
        };
    }
}

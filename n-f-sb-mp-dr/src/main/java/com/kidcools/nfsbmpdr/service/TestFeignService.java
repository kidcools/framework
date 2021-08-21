package com.kidcools.nfsbmpdr.service;

import com.kldcools.common.util.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@FeignClient(name="n-f-sb-mp-dr2")
public interface TestFeignService {
    @RequestMapping("/feign/{msg}")
    public R test(@PathVariable("msg") String msg);
}

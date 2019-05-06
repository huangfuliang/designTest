package com.design.pattern.decoration;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: huangfuliang
 * @date: 2019/5/5.
 */
@Slf4j
public class FouthGradeSchoolReport extends SchoolReport {
    @Override
    public void report() {
        log.info("尊敬的家长：");
    }

    @Override
    public void sign(String name) {
        log.info("家长签名：" + name);
    }
}

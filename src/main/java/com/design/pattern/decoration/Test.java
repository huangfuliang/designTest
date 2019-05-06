package com.design.pattern.decoration;

/**
 * @author: huangfuliang
 * @date: 2019/5/5.
 */
public class Test {

    public static void main(String[] args) {
        SchoolReport sr = null;

        sr = new FouthGradeSchoolReport();

        sr = new HighScoreDecorator(sr);

        sr = new SortDescorator(sr);

        sr.report();

        sr.sign("张三");
    }
}

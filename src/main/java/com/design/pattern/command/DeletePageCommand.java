package com.design.pattern.command;

/**
 * @author: huangfuliang
 * @date: 2019/5/3.
 * 删除页面命令
 */
public class DeletePageCommand extends Command{

    void execute() {
        super.pageGroup.find();
        super.requirementGroup.delete();
        super.requirementGroup.plan();
    }
}

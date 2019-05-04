package com.design.pattern.command;

/**
 * @author: huangfuliang
 * @date: 2019/5/3.
 * 添加一个需求的命令
 */
public class AddRequirementCommand extends Command{


    void execute() {
        super.requirementGroup.find();
        super.requirementGroup.add();
        super.requirementGroup.plan();
    }
}

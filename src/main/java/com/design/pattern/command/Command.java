package com.design.pattern.command;

import sun.jvm.hotspot.debugger.Page;

/**
 * @author: huangfuliang
 * @date: 2019/5/3.
 */
public abstract class Command {

    RequirementGroup requirementGroup = new RequirementGroup();

    PageGroup pageGroup = new PageGroup();

    CodeGroup codeGroup = new CodeGroup();

    abstract void execute();

}

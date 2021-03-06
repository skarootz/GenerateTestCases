package com.intellij.generatetestcases.model;

import com.intellij.openapi.components.*;
import com.intellij.openapi.project.Project;
import com.intellij.util.xmlb.XmlSerializerUtil;

@State(
        name = "GenerateTestCasesSettings",
        storages = {
                @Storage(id = "other", file = "$WORKSPACE_FILE$")}
)
public class GenerateTestCasesSettings implements PersistentStateComponent<GenerateTestCasesSettings> { // TODO research about idea ProjectComponent interface


    public GenerateTestCasesSettings() {
        testFramework = "";
    }

    /**
     * Return an instance of GenerateTestCasesSettings which holds plugin preferences as testFramework
     *
     * @param project
     * @return
     */
    public static GenerateTestCasesSettings getInstance(Project project) {
        return project.getComponent(GenerateTestCasesSettings.class);
    }


    public String getTestFramework() {
        return testFramework;
    }

    public void setTestFramework(String testFramework) {
        this.testFramework = testFramework;
    }

    String testFramework;

    public GenerateTestCasesSettings getState() {
        return this;
    }

    public void loadState(GenerateTestCasesSettings state) {
        XmlSerializerUtil.copyBean(state, this);
    }


}

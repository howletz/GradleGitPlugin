package com.howletz.gradle.plugin.git

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * @author howletz
 * @date 2018/7/11
 * */
class GitPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        def gitShortCommitIdCmd = 'git rev-parse --short HEAD'
        def gitLongCommitIdCmd = 'git rev-parse HEAD'
        def gitBranchNameCmd = 'git symbolic-ref --short -q HEAD'
        project.extensions.add('gitCommitShortId', gitShortCommitIdCmd.execute().text.replaceAll('\n', '').replace('\r', ''))
        project.extensions.add('gitLongCommitId', gitLongCommitIdCmd.execute().text.replaceAll('\n', '').replace('\r', ''))
        project.extensions.add('gitBranchName', gitBranchNameCmd.execute().text.replaceAll('\n', '').replace('\r', ''))
    }
}

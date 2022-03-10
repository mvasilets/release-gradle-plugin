/*
 * This Groovy source file was generated by the Gradle 'init' task.
 */
package me.msvasilets.plugin

import me.msvasilets.plugin.tasks.CheckGitStatus
import me.msvasilets.plugin.tasks.CreateMajorRelease
import me.msvasilets.plugin.tasks.CreateMinorRelease
import me.msvasilets.plugin.tasks.ReleaseTask
import org.gradle.api.Project
import org.gradle.api.Plugin

/**
 * A simple 'hello world' plugin.
 */
class ReleaseGradlePluginPlugin implements Plugin<Project> {

    void apply(Project project) {

        project.tasks.register("checkGitStatus", CheckGitStatus) {
            setGroup("release")
        }

        project.tasks.register("createMinorRelease", CreateMinorRelease) {
            dependsOn("checkGitStatus")
            setGroup("release")
        }

        project.tasks.register("createMajorRelease", CreateMajorRelease) {
            dependsOn("checkGitStatus")
            setGroup("release")
        }
//
//        project.tasks.register("release", ReleaseTask) {
//            setGroup("release")
//            doFirst {
//                if (GitUtils.currentBranch == 'master') {
//                    dependsOn('createMajorRelease')
//                } else {
//                    dependsOn('createMinorRelease')
//                }
//            }
//        }
    }

}

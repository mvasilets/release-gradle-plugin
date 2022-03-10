package me.msvasilets.plugin.tasks

import me.msvasilets.plugin.GitUtils
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class ReleaseTask extends DefaultTask {

    @TaskAction
    def release() {

        if (GitUtils.currentBranch == 'master') {
            doLast {
                getProject().tasks.getByName('createMajorRelease')
            }
        } else {
            doLast {
                getProject().tasks.getByName('createMinorRelease')
            }
        }

    }

}

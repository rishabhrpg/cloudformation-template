package com.github.rishabhrpg.cloudformationtemplate.services

import com.intellij.openapi.project.Project
import com.github.rishabhrpg.cloudformationtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

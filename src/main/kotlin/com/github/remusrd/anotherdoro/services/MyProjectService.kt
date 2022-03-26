package com.github.remusrd.anotherdoro.services

import com.intellij.openapi.project.Project
import com.github.remusrd.anotherdoro.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

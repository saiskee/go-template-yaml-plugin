package com.github.saiskee.gotemplateyamlplugin.services

import com.intellij.openapi.project.Project
import com.github.saiskee.gotemplateyamlplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

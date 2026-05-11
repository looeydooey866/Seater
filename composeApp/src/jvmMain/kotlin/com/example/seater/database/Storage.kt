package com.example.seater.database

import com.example.seater.model.Project
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.io.File

val sep = File.separator

object DB{
    val path = System.getProperty("user.home")
    val appDir = "Seater"
    val dir = "$path$sep$appDir"
    val fileEx = ".json"
    val folder = File(dir)
    init{
        folder.mkdir()
    }

    fun getProjects(): List<Project>{
        return folder
            .listFiles()
            .filter{it.isFile}
            .map{
                Json.decodeFromString<Project>(it.readText())
            }
    }

    fun addProject(project: Project){
        val name = project.name
        val projectFile = File("$dir$sep$name$fileEx")
        projectFile.createNewFile()
        projectFile.writeText(Json.encodeToString(project))
    }

    fun renameProject(project: Project, newName: String){
        val name = project.name
        val oldProject = File("$dir$sep$name$fileEx")
        val newProject = File("$dir$sep$newName$fileEx")
        oldProject.renameTo(newProject)
    }

    fun updateProject(project: Project){
        val name = project.name
        val projectFile = File("$dir$sep$name$fileEx")
        projectFile.writeText(Json.encodeToString(project))
    }
}
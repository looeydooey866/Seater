package com.example.seater.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import cafe.adriel.voyager.core.model.ScreenModel
import cafe.adriel.voyager.core.screen.Screen
import com.example.seater.database.DB
import com.example.seater.mod
import com.example.seater.model.Classroom
import com.example.seater.model.Project

class HomeModel: ScreenModel{

}

class HomeScreen: Screen {
    @Composable
    override fun Content(){
        var projects by remember{mutableStateOf(emptyList<Project>())}
        Scaffold {
            Column {
                Button(
                    onClick = {
                        DB.addProject(Project(
                            "Project 304",
                            classroom = Classroom(
                                width = 100.0
                            )
                        ))
                        projects = DB.getProjects()
                    }
                ){
                    Text("New project")
                }
            }
            Text(projects.toString())
        }
    }
}
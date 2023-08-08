package org.cubewhy.gradle

import org.cubewhy.gradle.blocks.BlockMinecraft
import org.cubewhy.gradle.minecraft.pullDeps
import org.gradle.api.Plugin
import org.gradle.api.Project

class LunarPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.repositories.mavenCentral()

        // register blocks
        val blockMinecraft = project.extensions.create("minecraft", BlockMinecraft::class.java)
        project.afterEvaluate { it.pullDeps(blockMinecraft.version.get()) }

//        project.tasks.register("runClient").apply {
//            val version = blockMinecraft.version.get()
//            val baseDir = LunarDir.lunarDir.absolutePath + "/offline/multiver"
//            val texturesDir = LunarDir.lunarDir.absolutePath + "/textures"
//            val mcArgs = MinecraftArgs(blockMinecraft.runDir.get(), texturesDir, 600, 400)
//            val javaExec = System.getProperty("java.home") + "/bin/java"
//            val jvmArgs = blockMinecraft.jvmArgs.get()
//            val programArgs = blockMinecraft.gameArgs.get()
//            val agents = arrayOf(
//                JavaAgent(project.buildFile.absolutePath)
//            )
//            val args =
//                LunarClient.getArgs(
//                    version,
//                    "lunar",
//                    "master",
//                    baseDir,
//                    mcArgs,
//                    javaExec,
//                    jvmArgs,
//                    programArgs,
//                    agents,
//                    true
//                )
//            Runtime.getRuntime().exec(args) // start the game
//        }
    }
}
package org.cubewhy.gradle.blocks

import org.cubewhy.gradle.minecraft.MinecraftVersion
import org.gradle.api.provider.Property
import java.io.File

interface BlockMinecraft {
    val version: Property<MinecraftVersion>
    val runDir: Property<File>
    val jvmArgs: Property<Array<String>>
    val gameArgs: Property<Array<String>>
}
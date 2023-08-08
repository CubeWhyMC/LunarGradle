package org.cubewhy.gradle.utils

import kotlinx.serialization.json.Json
import java.io.File

object Constants {

    /**
     * Caches dir
     */
    val CACHE_DIR = File(System.getProperty("user.home"), ".cubewhy/caches/lunar-gradle")

    /**
     * The global JSON serializer
     */
    val JSON = Json { ignoreUnknownKeys = true }

    const val VERSION_MANIFEST = "https://launchermeta.mojang.com/mc/game/version_manifest_v2.json"
}
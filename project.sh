#!/bin/bash
# values
JVM_VERSION="${1:-17}" 
PROJECT_NAME="${2:-Template}"
jvm_version=$JVM_VERSION
project_name=$PROJECT_NAME
# edits made
find . -name "build.gradle.kts" -type f -print0 | xargs -0 sed -i "s/{JVM_VERSION}/${jvm_version}/g"
find . -name "game.config" -type f -print0 | xargs -0 sed -i "s/{project_name}/${project_name}/g"
mv template "$project_name"
find . -name "settings.gradle.kts" -type f -print0 | xargs -0 sed -i "s/template/${project_name}/g"
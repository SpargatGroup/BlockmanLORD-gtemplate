@echo off
setlocal
set "JVM_VERSION=17"
set "PROJECT_NAME=Template"
if not "%1"=="" set "JVM_VERSION=%1"
if not "%2"=="" set "PROJECT_NAME=%2"
for /r %%f in (build.gradle.kts) do (
    powershell -Command "(Get-Content '%%f') | ForEach-Object { $_ -replace '{JVM_VERSION}', '%JVM_VERSION%' } | Set-Content '%%f'"
)
for /r %%f in (game.config) do (
    powershell -Command "(Get-Content '%%f') | ForEach-Object { $_ -replace '{project_name}', '%PROJECT_NAME%' } | Set-Content '%%f'"
)
if exist template (
    ren template "%PROJECT_NAME%"
)
for /r %%f in (settings.gradle.kts) do (
    powershell -Command "(Get-Content '%%f') | ForEach-Object { $_ -replace 'template', '%PROJECT_NAME%' } | Set-Content '%%f'"
)
endlocal
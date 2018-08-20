@echo off
set base=%~dp0

set LIBS_PATH=%base\..\libs
set CONF_PATH=%base\..\conf
set CLASSES_PATH=%CONF_PATH%;%LIBS_PATH%

set file_suffix=%DATE:~-4%-%DATE:~4,2%-%DATE:~7,2%_%TIME:~0,2%-%TIME:~3,2%-%TIME:~6,2%
set file_suffix=%file_suffix: =0%
set file_suffix=%file_suffix:/=-%

set JAVA_OPTS=-server -Xmx2g -Xms2g -Xmn1g -XX:+UseParallelGC -XX:ParallelGCThreads=4 -XX:+UseParallelOldGC -XX:+PrintGCTimeStamps -XX:+PrintGCDetails -Xloggc:d:\dockermgr\gclogs\gc-%file_suffix%.log
java -Dfile.encoding=UTF-8 %JAVA_OPTS% -classpath %CLASSES_PATH% com.jdddata.dockermgr.DockerMgrApplication
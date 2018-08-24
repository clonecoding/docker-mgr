@echo off
set base=%~dp0

set LIBS_PATH=%base%\..\libs\*
set CONF_PATH=%base%\..\conf\
set CLASSES_PATH=%CONF_PATH%;%LIBS_PATH%


set JAVA_OPTS=-server -Xmx2g -Xms2g -Xmn1g -XX:+UseParallelGC -XX:ParallelGCThreads=4 -XX:+UseParallelOldGC -XX:+PrintGCTimeStamps -XX:+PrintGCDetails -Xloggc:E:\dockermgr\logs\gclogs\gc-%d{yyyy-MM-dd}.log.log
java -Dfile.encoding=UTF-8 %JAVA_OPTS% -classpath %CLASSES_PATH% com.jdddata.dockermgr.DockerMgrApplication
@pause
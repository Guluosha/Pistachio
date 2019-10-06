########
# Dockerfile for registration-center
# 1. Build with: docker image build -f .\registration-center-0.0.1.jar -t registration-center:0.0.1
# 2. Run with: docker run --name registration-center --hostname registration-center --rm -d -p 1024:1024
# MAINTAINER 单曲循环<1019844337@qq.com>（已经弃用，高版本使用Label指令来设置）
# There can only be one CMD instruction in a Dockerfile. If you list more than one CMD then only the last CMD will take effect.
# HEALTHCHECK OPTIONS CMD command，HEALTHCHECK使用方式（exit code：0，success；1，unhealthy；3，reserved，一般不要使用）
# RUN：在构建过程中会执行
# CMD：在容器启动时会执行，可以通过run命令要执行的容器中的命令覆盖
# ENTRYPOINT：在容器启动时会执行，不会被run命令的选项覆盖，但是会被--entrypoint覆盖
# ENTRYPOINT java -jar ${JarDir}/${ApplicationName}-${Version}.${FileType}
######## 解析器指令格式（换行符）：#escape=\，可以自定义，默认为“\”
ARG RegistryAddress=localhost:65535
FROM ${RegistryAddress}/openjdk:8
ENV ApplicationName=registration-center
ENV Version=0.0.1
ENV Port=1024
ENV FileType=jar
ENV FileDir=/build/jar/${ApplicationName}/

ADD ./${ApplicationName}-${Version}.${FileType} ${FileDir}
WORKDIR ${FileDir}

LABEL maintainer="单曲循环（1019844337@qq.com）"
LABEL application.name=${ApplicationName}
LABEL application.version=${Version}
LABEL application.description="服务注册中心"

RUN ls ${FileDir}
RUN java -version
EXPOSE ${Port}/tcp
ENTRYPOINT ["/bin/sh", "-c", "java -jar ${ApplicationName}-${Version}.${FileType}"]
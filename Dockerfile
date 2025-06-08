FROM dragonwell-registry.cn-hangzhou.cr.aliyuncs.com/dragonwell/dragonwell:17
# RUN addgroup -S spring && adduser -S spring -G spring
# USER spring:spring
ADD ./target/products-services.jar products-services.jar
ENTRYPOINT ["java","-jar","/products-services.jar"]

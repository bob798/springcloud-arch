FROM mritd/openjdk8

WORKDIR /javarun

ARG SPRING_PROFILE

ENV JAVA_OPTS "${JAVA_OPTS} ${CUSTOM_OPTS}"

COPY target/*.jar /javarun

CMD ["bash","-c","java ${JAVA_OPTS} -Dspring.profiles.active=${SPRING_PROFILE} -jar /javarun/*.jar"]
